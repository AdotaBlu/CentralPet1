package centralpet.modelo.dao.tutor;

import java.util.List;

import centralpet.modelo.entidade.tutor.Tutor;

public interface TutorDAO {

	void inserirTutor(Tutor tutor);
	
	void deletarTutor(Tutor tutor);
	
	void atualizarTutor(Tutor tutor);
	
	List<Tutor> recuperarTodosTutores();
	
	List<Tutor> recuperarTutor(Tutor id);
	
	List<Tutor> recuperarTutorCPF(Tutor cpf);
	
	List<Tutor> recuperarTutorEmail(Tutor email);
	
	List<Tutor> recuperarTutorNome(Tutor nome);

}