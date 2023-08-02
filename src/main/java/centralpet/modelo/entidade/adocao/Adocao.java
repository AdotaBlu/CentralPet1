package centralpet.modelo.entidade.adocao;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Table;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.termo.Termo;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.enumeracao.adocao.StatusAdocao;

@Entity
@Table(name = "adocao")
public class Adocao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_adocao")
	private Long id;
	
	@Column(name = "pet_adocao", nullable = false, unique = false)
	//1 pet pode ter apenas uma adoção e 1 adoção apenas 1 pet?
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_pet")
	private Pet pet;
	
	@Column(name = "ong_adocao", nullable = false, unique = false)
	@OneToMany(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_ong")
	private Ong ong;
	
	@Column(name = "tutor_adocao", nullable = false, unique = false)
	@OneToMany(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_tutor")
	private Tutor tutor;
	
	@Column(name = "termo_adocao", nullable = false, unique = false)
	@OneToMany(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_termo")
	private Termo termo;
	
	@Column(name = "status_adocao", nullable = false, unique = false)
	private StatusAdocao statusAdocao;
	
	@Column(name = "data_adocao", nullable = false, unique = false)
	private LocalDate dataAdocao;
	
	public Adocao () {}
	
	public Adocao (Pet pet, Ong ong, Tutor tutor, Termo termo, StatusAdocao statusAdocao, LocalDate dataAdocao) {
		setPet(pet);
		setOng(ong);
		setTutor(tutor);
		setTermo(termo);
		setStatusAdocao(statusAdocao);
		setDataAdocao(dataAdocao);
	}
	
	public Adocao (Long id, Pet pet, Ong ong, Tutor tutor, Termo termo, StatusAdocao statusAdocao, LocalDate dataAdocao) {
		setId(id);
		setPet(pet);
		setOng(ong);
		setTutor(tutor);
		setTermo(termo);
		setStatusAdocao(statusAdocao);
		setDataAdocao(dataAdocao);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Termo getTermo() {
		return termo;
	}

	public void setTermo(Termo termo) {
		this.termo = termo;
	}

	public StatusAdocao getStatusAdocao() {
		return statusAdocao;
	}

	public void setStatusAdocao(StatusAdocao statusAdocao) {
		this.statusAdocao = statusAdocao;
	}

	public LocalDate getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(LocalDate dataAdocao) {
		dataAdocao = LocalDate.now();
		this.dataAdocao = dataAdocao;
	}
	
}
