package centralpet.modelo.dao.usuario;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.factory.conexao.ConexaoFactory;

public class UsuarioDAOImpl implements UsuarioDAO {

private ConexaoFactory fabrica;
	
	public UsuarioDAOImpl () {
		fabrica = new ConexaoFactory();
	}
	
	public void inserirUsuario(Usuario usuario) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(usuario);
			
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


	public void deletarUsuario(Usuario usuario) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(usuario);
			
			sessao.getTransaction().commit();
		
		} catch(Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
			
		} finally {
			
			if(sessao != null) {
				sessao.close();
			}
		}
	}


	public void atualizarUsuario(Usuario usuario) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.update(usuario);
			
			sessao.getTransaction().commit();
			
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
		
		} finally {
			
			if(sessao != null) {
				sessao.close();
			}
		}
	}
	
	public String recuperarEmailUsuario(Contato contato) {
		
		Session sessao = null;
		String email = null;
		
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			
			CriteriaQuery<Contato> criteria = construtor.createQuery(Contato.class);
			Root<Contato> raizContato = criteria.from(Contato.class);
			
			criteria.select(raizContato.get("email_contato"));
			
			
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
				
			}
		} finally {
			
			if(sessao != null) {
				sessao.close();
			}
		}
		return email;
	}
	
	public List<Usuario> recuperarTodosUsuarios() {
		
		Session sessao = null;
		List<Usuario> usuarios = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			
			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizUsuario = criteria.from(Usuario.class);
			
			criteria.select(raizUsuario);
			
			usuarios = sessao.createQuery(criteria).getResultList();
			
			sessao.getTransaction().commit();
		
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
				
			}
		} finally {
			
			if(sessao != null) {
				sessao.close();
			}
		}
		
		return usuarios;
		
	}
	
}
