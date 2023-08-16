package centralpet.modelo.dao.tutor;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.entidade.tutor.Tutor_;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.entidade.usuario.Usuario_;
import centralpet.modelo.factory.conexao.ConexaoFactory;

//Classe TutorDAOImpl implementa a classe TutorDAO
public class TutorDAOImpl implements TutorDAO {

	// Define a classe ConexaoFactory cujo é responsável pela conexão com o BD

	private ConexaoFactory fabrica;

	// Cria o construtor

	public TutorDAOImpl() {

		// Define o método fabrica

		fabrica = new ConexaoFactory();

	}

	// Método de inserir tutor

	public void inserirTutor(Tutor tutor) {

		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.save(tutor);

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

	// Método de deletar tutor

	public void deletarTutor(Tutor tutor) {
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.delete(tutor);

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

	// Método de atualizar tutor

	public void atualizarTutor(Tutor tutor) {

		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			sessao.update(tutor);

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

	// Método de recuperar todos tutor a partir do ID

	public Tutor recuperarTutor(Usuario usuario) {

		org.hibernate.Session sessao = null;

		Tutor tutor = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Tutor> criteria = construtor.createQuery(Tutor.class);

			Root<Tutor> raizTutor = criteria.from(Tutor.class);
			Join<Tutor, Usuario> juncaoUsuario = raizTutor.join(Usuario_.ID);

			// Só para comparar com o equals
			ParameterExpression<Long> idUsuario = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoUsuario.get(Usuario_.ID), idUsuario));

			tutor = sessao.createQuery(criteria).setParameter(idUsuario, usuario.getId()).getSingleResult();

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

		return tutor;

	}

	public List<Pet> recuperarPetsFavoritados(Tutor tutor) {
		org.hibernate.Session sessao = null;

		List<Pet> pets = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);

			Root<Pet> raizTutor = criteria.from(Pet.class);

			Join<Pet, Tutor> juncaoPets = raizTutor.join(Tutor_.PETS_FAVORITADOS);

			ParameterExpression<Long> idTutor = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoPets.get(Tutor_.ID), idTutor));

			pets = sessao.createQuery(criteria).setParameter(idTutor, tutor.getId()).getResultList();

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

		return pets;

	}

}