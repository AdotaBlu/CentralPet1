package centralpet.modelo.dao.contato;

import java.util.List;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.tutor.Tutor;

public interface ContatoDAO {

	void inserirContato(Contato contato);
	
	void deletarContato(Contato contato);
	
	void atualizarContato(Contato contato);
	
	List<Contato> recuperarTodosContatos ();
	
	List<Contato> recuperarContatoTutor (Tutor id);
	
	List<Contato> recuperarContatoOng (Ong id);
}
