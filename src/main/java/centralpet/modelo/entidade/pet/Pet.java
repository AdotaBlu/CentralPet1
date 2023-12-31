package centralpet.modelo.entidade.pet;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.enumeracao.pet.especie.EspeciePet;
import centralpet.modelo.enumeracao.pet.porte.PortePet;
import centralpet.modelo.enumeracao.pet.sexo.SexoPet;
import centralpet.modelo.enumeracao.pet.status.StatusPet;

@Entity
@Table(name = "pet")
public class Pet implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pet")
	private Long id;
	
	@Column(name = "nome_pet", length = 45, nullable = false, unique = false)
	private String nome;
	
	@Column(name = "vacinas_pet", length = 45, nullable = false, unique = false)
	private String vacinas;
	
	@Column(name = "descricao_pet", length = 60, nullable = false, unique = false)
	private String descricao;
	
	@Column(name = "idade_pet", nullable = false, unique = false)
	private byte idade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ong", nullable = false)
	private Ong ong;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status_pet", nullable = false, unique = false)
	private StatusPet statusPet;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "porte_pet", nullable = false, unique = false)
	private PortePet portePet;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "especie_pet", nullable = false, unique = false)
	private EspeciePet especiePet;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "sexo_pet", nullable = false, unique = false)
	private SexoPet sexoPet;
	
	public Pet () {}
	
	public Pet (String nome, String vacinas, String descricao, byte idade, Ong ong, StatusPet statusPet, PortePet portePet, EspeciePet especiePet, SexoPet sexoPet) {
		setNome(nome);
		setVacinas(vacinas);
		setDescricao(descricao);
		setIdade(idade);
		setOng(ong);
		setStatusPet(statusPet);
		setPortePet(portePet);
		setEspeciePet(especiePet);
		setSexoPet(sexoPet);
	}

	public Pet (Long id, String nome, String vacinas, String descricao, byte idade, Ong ong, StatusPet statusPet, PortePet portePet, EspeciePet especiePet, SexoPet sexoPet) {
		setId(id);
		setNome(nome);
		setVacinas(vacinas);
		setDescricao(descricao);
		setIdade(idade);
		setOng(ong);
		setStatusPet(statusPet);
		setPortePet(portePet);
		setEspeciePet(especiePet);
		setSexoPet(sexoPet);
	}
	
	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVacinas() {
		return vacinas;
	}

	public void setVacinas(String vacinas) {
		this.vacinas = vacinas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public StatusPet getStatusPet() {
		return statusPet;
	}

	public void setStatusPet(StatusPet statusPet) {
		this.statusPet = statusPet;
	}

	public PortePet getPortePet() {
		return portePet;
	}

	public void setPortePet(PortePet portePet) {
		this.portePet = portePet;
	}

	public EspeciePet getEspeciePet() {
		return especiePet;
	}

	public void setEspeciePet(EspeciePet especiePet) {
		this.especiePet = especiePet;
	}

	public SexoPet getSexoPet() {
		return sexoPet;
	}

	public void setSexoPet(SexoPet sexoPet) {
		this.sexoPet = sexoPet;
	}

}
