package centralpet.modelo.entidade.recolhimento;

import java.io.Serializable;
import java.time.LocalDateTime;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;

public class Recolhimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private LocalDateTime dataRecolhimento;

	private String observacaoRecolhimento;

	private Ong ong;

	private Tutor tutor;

	private Pet pet;

	public Recolhimento() {
	}

	public Recolhimento(Long id, LocalDateTime dataRecolhimento, String observacaoRecolhimento, Ong ong, Tutor tutor,
			Pet pet) {

		setId(id);

		setDataRecolhimento(dataRecolhimento);

		setObservacaoRecolhimento(observacaoRecolhimento);

		setOng(ong);

		setTutor(tutor);

		setPet(pet);

	}

	public Recolhimento(LocalDateTime dataRecolhimento, String observacaoRecolhimento, Ong ong, Tutor tutor, Pet pet) {

		setDataRecolhimento(dataRecolhimento);

		setObservacaoRecolhimento(observacaoRecolhimento);

		setOng(ong);

		setTutor(tutor);

		setPet(pet);

	}

	public long getId() {

		return id;

	}

	public void setId(long id) {

		this.id = id;

	}

	public LocalDateTime getDataRecolhimento() {

		return dataRecolhimento;

	}

	public void setDataRecolhimento(LocalDateTime dataRecolhimento) {

		this.dataRecolhimento = dataRecolhimento;

	}

	public String getObservacaoRecolhimento() {

		return observacaoRecolhimento;

	}

	public void setObservacaoRecolhimento(String observacaoRecolhimento) {

		this.observacaoRecolhimento = observacaoRecolhimento;

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

	public Pet getPet() {

		return pet;

	}

	public void setPet(Pet pet) {

		this.pet = pet;

	}

}