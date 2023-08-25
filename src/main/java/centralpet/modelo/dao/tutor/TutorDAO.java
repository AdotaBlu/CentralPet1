package centralpet.modelo.dao.tutor;

import java.util.List;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;

public interface TutorDAO {

	void inserirTutor(Tutor tutor);

	void deletarTutor(Tutor tutor);

	void atualizarTutor(Tutor tutor);

	List<Tutor> recuperarTodosTutores();

	List<Long> recuperarPetsFavoritados(Tutor pets);

}
