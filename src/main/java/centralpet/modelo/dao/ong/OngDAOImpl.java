package centralpet.modelo.dao.ong;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.endereco.Endereco_;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.ong.Ong_;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.entidade.usuario.Usuario_;
import centralpet.modelo.factory.conexao.ConexaoFactory;

public class OngDAOImpl implements OngDAO {

	private ConexaoFactory fabrica;

	public OngDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirOng(Ong ong) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			sessao.save(ong);
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

	public void deletarOng(Ong ong) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			sessao.delete(ong);
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

	public void atualizarOng(Ong ong) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			sessao.update(ong);
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

	public Ong recuperarOng(Usuario usuario) {

		Session sessao = null;

		Ong ong = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Ong> criteria = construtor.createQuery(Ong.class);

			Root<Ong> raizOng = criteria.from(Ong.class);
			Join<Ong, Usuario> juncaoUsuario = raizOng.join(Usuario_.ID);

			// Só para comparar com o equals
			ParameterExpression<Long> idUsuario = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoUsuario.get(Usuario_.ID), idUsuario));

			ong = sessao.createQuery(criteria).setParameter(idUsuario, usuario.getId()).getSingleResult();

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

		return ong;

	}

	// Checar os parâmetros de comparação (equals)
	public List<Usuario> recuperarOngNome(Ong nome) {

		org.hibernate.Session sessao = null;

		List<Usuario> nomes = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);

			Root<Ong> raizOng = criteria.from(Ong.class);

			Join<Ong, Usuario> juncaoNomes = raizOng.join(Ong_.NOME);

			ParameterExpression<Long> idOng = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoNomes.get(Ong_.ID), idOng));

			nomes = sessao.createQuery(criteria).setParameter(idOng, nome.getId()).getResultList();

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

		return nomes;

	}

	public List<Endereco> recuperarOngBairro(Ong bairro) {

		org.hibernate.Session sessao = null;

		List<Endereco> bairros = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Endereco> criteria = construtor.createQuery(Endereco.class);

			Root<Ong> raizOng = criteria.from(Ong.class);

			Join<Ong, Endereco> juncaoBairros = raizOng.join(Endereco_.BAIRRO);

			ParameterExpression<Long> idOng = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoBairros.get(Ong_.ID), idOng));

			bairros = sessao.createQuery(criteria).setParameter(idOng, bairro.getId()).getResultList();

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

		return bairros;

	}

	public List<Pet> recuperarOngPet(Ong pet) {

		org.hibernate.Session sessao = null;

		List<Pet> pets = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);

			Root<Ong> raizOng = criteria.from(Ong.class);

			Join<Ong, Pet> juncaoBairros = raizOng.join(Ong_.PETS);

			ParameterExpression<Long> idOng = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoBairros.get(Ong_.ID), idOng));

			pets = sessao.createQuery(criteria).setParameter(idOng, pet.getId()).getResultList();

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

	// Método de recuperar todas as Ongs

	public List<Ong> recuperarTodasOngs() {

		org.hibernate.Session sessao = null;

		List<Ong> ongs = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Ong> criteria = construtor.createQuery(Ong.class);

			Root<Ong> raizOng = criteria.from(Ong.class);

			criteria.select(raizOng);

			ongs = sessao.createQuery(criteria).getResultList();

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

		return ongs;

	}

}
