package centralpet.modelo.dao.tutor;

import java.util.List;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;

public interface TutorDAO {

	void inserirTutor(Tutor tutor);

	void deletarTutor(Tutor tutor);

	void atualizarTutor(Tutor tutor);

	List<Tutor> recuperarTodosTutores();

	List<Tutor> recuperarTutor(Tutor id);
<<<<<<< HEAD
	
	List<Tutor> recuperarPetsFavoritados(Tutor pets);
=======

	List<Pet> recuperarPetsFavoritados(Tutor pets);
>>>>>>> 9d863b4bda202f80ae3d775ede36da2b0ad13953

}
