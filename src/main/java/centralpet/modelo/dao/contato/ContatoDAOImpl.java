package centralpet.modelo.dao.contato;

import java.util.List;

import org.hibernate.Session;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.factory.conexao.ConexaoFactory;

public class ContatoDAOImpl implements ContatoDAO{

	private ConexaoFactory fabrica;
	
	public ContatoDAOImpl () {
		fabrica = new ConexaoFactory();
	}
	
	public void inserirContato (Contato contato) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(contato);
			
			sessao.getTransaction().commit();
		
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
			
		} finally {
			
			if (sessao != null) {
				sessao.close();
			}
		}
		
	}


	public void deletarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}


	public void atualizarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}


	public List<Contato> recuperarTodosContatos() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Contato> recuperarContatoTutor(Tutor id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Contato> recuperarContatoOng(Ong id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
