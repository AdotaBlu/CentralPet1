package centralpet.modelo.entidade.tutor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Table;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.enumeracao.genero.GeneroTutor;

@Entity
@Table(name = "tutor")
public class Tutor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tutor")
	private Long id;
	
	@Column(name = "cpf_tutor", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "dataNascimento", nullable = false, unique = false)
	private LocalDate dataNascimento;
	
	@Column(name = "generoTutor", nullable = false, unique = false)
	private GeneroTutor generoTutor;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "tutor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pet> petsAdotados = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "pets_favoritos_tutor", joinColumns = @JoinColumn(name = "id_tutor"), inverseJoinColumns = @JoinColumn(name = "id_pet"))
	private List<Pet> petsFavoritados = new ArrayList<>();
	
	public Tutor () {}
	
	public Tutor (String nome, Endereco endereco, Contato contato, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco, contato);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}
	
	public Tutor (String nome, Endereco endereco, Contato contato, Long id, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco, contato);
		setId(id);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public List<Pet> getPetsAdotados() {
		return petsAdotados;
	}
	
	public void adotarPet (Pet pet) {
		this.petsAdotados.add(pet);
	}
	
	public void devolverPet (Pet pet) {
		this.petsAdotados.remove(pet);
	}
	
	public List<Pet> getPetsFavoritados() {
		return petsFavoritados;
	}
	
	public void favoritarPet (Pet pet) {
		this.petsFavoritados.add(pet);
	}
	
	public void desFavoritarPet (Pet pet) {
		this.petsFavoritados.remove(pet);
	}
	
}
