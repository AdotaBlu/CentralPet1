package centralpet.modelo.dao.petsFavoritosTutor;

import java.util.List;

import org.hibernate.Session;

import centralpet.modelo.entidade.favorito.PetsFavoritosTutor;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.factory.conexao.ConexaoFactory;

public class PetsFavoritosTutorDAOImpl implements PetsFavoritosTutorDAO{

	private ConexaoFactory fabrica;

	public PetsFavoritosTutorDAOImpl() {

		fabrica = new ConexaoFactory();
	}
	
	public void inserirPetsFavoritados(PetsFavoritosTutor petFavoritado) {
		
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.save(petFavoritado);

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

	
	public void deletarPetsFavoritados(PetsFavoritosTutor petFavoritado) {
		
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.delete(petFavoritado);

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

	
	public void atualizarPetsFavoritados(PetsFavoritosTutor petFavoritado) {
		
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.update(petFavoritado);

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

	
	
	public List<PetsFavoritosTutor> petsFavoritadosTutor(Tutor tutor) {
		
		Session sessao = null;
		
		List<PetsFavoritosTutor> petsFavoritos = null;
		
		try {
		
			sessao = fabrica.getConexao().openSession();
			
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
		
		
		return petsFavoritos;
	}

	
	
}
