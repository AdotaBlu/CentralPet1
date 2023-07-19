package centralpet.modelo.entidade.pet;

import java.io.Serializable;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.enumeracao.pet.especie.EspeciePet;
import centralpet.modelo.enumeracao.pet.porte.PortePet;
import centralpet.modelo.enumeracao.pet.sexo.SexoPet;
import centralpet.modelo.enumeracao.pet.status.StatusPet;

public class Pet implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private String vacinas;
	
	private String descricao;
	
	private byte idade;
	
	private Ong ong;
	
	private StatusPet statusPet;
	
	private PortePet portePet;
	
	private EspeciePet especiePet;
	
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
