package centralpet.modelo.entidade.tutor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import centralpet.modelo.entidade.adocao.Adocao;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.favorito.PetsFavoritosTutor;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.enumeracao.genero.GeneroTutor;

@Entity
@Table(name = "tutor")
public class Tutor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "cpf_tutor", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "data_nascimento_tutor", nullable = false, unique = false)
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "genero_tutor", nullable = false, unique = false)
	private GeneroTutor generoTutor;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Adocao> adocoes = new ArrayList<>();
	
	//@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	//@JoinTable(name = "pets_favoritos_tutor", joinColumns = @JoinColumn(name = "id_tutor"), inverseJoinColumns = @JoinColumn(name = "id_pet"))
	//private List<Pet> petsFavoritados = new ArrayList<>();
	
	public Tutor () {}
	
	public Tutor (String nome, Endereco endereco, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}
	
	public Tutor (String nome, Endereco endereco, Long id, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco);
		setId(id);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public GeneroTutor getGeneroTutor() {
		return generoTutor;
	}

	public void setGeneroTutor(GeneroTutor generoTutor) {
		this.generoTutor = generoTutor;
	}
	
	public List<Adocao> getAdocoes() {
		return adocoes;
	}
	
	public void adocaoFeita (Adocao adocao) {
		this.adocoes.add(adocao);
	}
	
	public void adocaoDesfeita (Adocao adocao) {
		this.adocoes.remove(adocao);
	}
	
	/*
	 * public List<Pet> getPetsFavoritados() { return petsFavoritados; }
	 * 
	 * public void favoritarPet (Pet pet) { this.petsFavoritados.add(pet); }
	 * 
	 * public void desFavoritarPet (Pet pet) { this.petsFavoritados.remove(pet); }
	 */
	
}
