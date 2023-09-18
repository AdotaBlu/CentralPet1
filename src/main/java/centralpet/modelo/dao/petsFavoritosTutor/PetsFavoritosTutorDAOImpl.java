package centralpet.modelo.dao.petsFavoritosTutor;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.sql.Select;

import centralpet.modelo.entidade.favorito.PetsFavoritosTutor;
import centralpet.modelo.entidade.favorito.PetsFavoritosTutor_;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.entidade.tutor.Tutor_;
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
			sessao.beginTransaction();
			
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			
			CriteriaQuery<PetsFavoritosTutor> criteria = construtor.createQuery(PetsFavoritosTutor.class);
			
			Root<PetsFavoritosTutor> raizFavaritos = criteria.from(PetsFavoritosTutor.class);
			
			Join<PetsFavoritosTutor, Tutor> juncaoTutor = raizFavaritos.join("id_usuario");
			
			criteria.select(raizFavaritos);
			
			criteria.where(construtor.equal(raizFavaritos.get(PetsFavoritosTutor_.tutor), juncaoTutor.get(Tutor_.id)));
			
			petsFavoritos = sessao.createQuery(criteria).getResultList();
			
			
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
