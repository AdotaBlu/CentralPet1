package centralpet.modelo.dao.tutor;

import java.util.List;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.entidade.usuario.Usuario;

public interface TutorDAO {

	void inserirTutor(Tutor tutor);

	void deletarTutor(Tutor tutor);

	void atualizarTutor(Tutor tutor);

	Tutor recuperarTutor(Usuario usuario);

	List<Pet> recuperarPetsFavoritados(Tutor pets);

}
