package centralpet.modelo.entidade.ong;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import centralpet.modelo.entidade.adocao.Adocao;
import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.termo.Termo;
import centralpet.modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "ong")
public class Ong extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ong")
	private Long id;
	
	@Column(name = "cnpj_ong", length = 14, nullable = false, unique = true)
	private String cnpj;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pet> pets = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Termo> termos = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Adocao> doacoes = new ArrayList<>();
	
	public Ong () {}
	
	public Ong (String nome, Endereco endereco, Contato contato, String cnpj) {
		super(nome, endereco, contato);
		setCnpj(cnpj);
	}
	
	public Ong (String nome, Endereco endereco, Contato contato, Long id, String cnpj) {
		super(nome, endereco, contato);
		setId(id);
		setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
	 this.id = id;
	}
	
	public List<Pet> getPets () {
		return pets;
	}
	
	public void adicionarPet (Pet pet) {
		this.pets.add(pet);
	}
	
	public void removerPet (Pet pet) {
		this.pets.remove(pet);
	}
	
	public List<Termo> getTermos () {
		return termos;
	}
	
	public void adicionarTermo (Termo termo) {
		this.termos.add(termo);
	}
	
	public void removerTermo (Termo termo) {
		this.termos.remove(termo);
	}

	public List<Adocao> getDoacoes() {
		return doacoes;
	}

	public void adicionarDoacao(Adocao doacao) {
		this.doacoes.add(doacao);
	}
	
	public void removerDoacao(Adocao doacao) {
		this.doacoes.remove(doacao);
	}
	
	
}
