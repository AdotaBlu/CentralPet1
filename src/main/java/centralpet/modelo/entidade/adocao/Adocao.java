package centralpet.modelo.entidade.adocao;

import java.io.Serializable;
import java.time.LocalDate;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.termo.Termo;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.enumeracao.adocao.StatusAdocao;

public class Adocao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Pet pet;
	
	private Ong ong;
	
	private Tutor tutor;
	
	private Termo termo;
	
	private StatusAdocao statusAdocao;
	
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
