package centralpet.modelo.entidade.favorito;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;

@Entity
@Table(name="pets_favoritos_tutor")
public class PetsFavoritosTutor {

	@EmbeddedId
	private PetsFavoritosTutorId id = new PetsFavoritosTutorId();
	
	@ManyToOne
	@MapsId("tutorId")
	private Tutor tutor;
	
	@ManyToOne
	@MapsId("petId")
	private Pet pet;
	
	public PetsFavoritosTutor() {}

	public PetsFavoritosTutor(Tutor tutor, Pet pet) {
		setTutor(tutor);
		setPet(pet);
	}
	
	public PetsFavoritosTutor(PetsFavoritosTutorId id,Tutor tutor, Pet pet) {
		setId(id);
		setTutor(tutor);
		setPet(pet);
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

	public PetsFavoritosTutorId getId() {
		return id;
	}

	public void setId(PetsFavoritosTutorId id) {
		this.id = id;
	}
	
	
	
}
