package centralpet.modelo.dao.pet;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.ong.Ong_;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.entidade.usuario.Usuario_;
import centralpet.modelo.enumeracao.pet.especie.EspeciePet;
import centralpet.modelo.enumeracao.pet.porte.PortePet;
import centralpet.modelo.enumeracao.pet.sexo.SexoPet;
import centralpet.modelo.enumeracao.pet.status.StatusPet;
import centralpet.modelo.factory.conexao.ConexaoFactory;

public class PetDAOImpl implements PetDAO {

	private ConexaoFactory fabrica;
	
	public PetDAOImpl () {
		fabrica = new ConexaoFactory();
	}
	public void inserirPet(Pet pet) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(pet);

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

	
	public void deletarPet(Pet pet) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(pet);

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

	
	public void atualizarPet(Pet pet) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(pet);

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

	
	public List<Pet> recuperarTodosPets() {
		
		Session sessao = null;
		List<Pet> pets = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);

			criteria.select(raizPet);

			pets = sessao.createQuery(criteria).getResultList();

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
	
	public List<Pet> recuperarPetsOng(Ong ong) {
		
		Session sessao = null;
		List<Pet> petsOng = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);
			
			Join<Pet, Ong> juncaoOng = raizPet.join(Ong_.DOACOES);
			
			ParameterExpression<Long> idOng = construtor.parameter(Long.class);

			criteria.where(construtor.equal(juncaoOng.get(Ong_.ID), idOng));

			petsOng = sessao.createQuery(criteria).setParameter(idOng, ong.getId()).getResultList();

			sessao.getTransaction().commit();
			
			
		}   catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();

			}
		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
		return petsOng;
	}

	//Será que nao pasa outro parametro nesses metodos abaixo?	
	
	public List<Pet> recuperarPetsPorte(PortePet porte) {
		
		Session sessao = null;
		List<Pet> petsDessePorte = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);
			
			ParameterExpression<>  = construtor.parameter(.class);

			criteria.where(construtor.equal());

			petsOng = sessao.createQuery(criteria).setParameter().getResultList();

			sessao.getTransaction().commit();
			
			
		}   catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();

			}
		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
		return petsDessePorte;
	}

	
	public List<Pet> recuperarPetsSexo(SexoPet sexo) {
		
		Session sessao = null;
		List<Pet> petsDesseSexo = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);
			
			ParameterExpression<>  = construtor.parameter(.class);

			criteria.where(construtor.equal());

			petsOng = sessao.createQuery(criteria).setParameter().getResultList();

			sessao.getTransaction().commit();
			
			
		}   catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();

			}
		} finally {

			if (sessao != null) {
				sessao.close();
			}
		
		return petsDesseSexo;
	
		}
	}
	
	public List<Pet> recuperarPetsEspecie(EspeciePet especie) {
		
		Session sessao = null;
		List<Pet> petsDessaEspecie = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);
			
			ParameterExpression<>  = construtor.parameter(.class);

			criteria.where(construtor.equal());

			petsOng = sessao.createQuery(criteria).setParameter().getResultList();

			sessao.getTransaction().commit();
			
			
		}   catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();

			}
		} finally {

			if (sessao != null) {
				sessao.close();
			}
		
		return petsDessaEspecie;
	
		}
	}
	
	public List<Pet> recuperarPetsStatus(StatusPet status) {
		
		Session sessao = null;
		List<Pet> petsDesseStatus = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizPet = criteria.from(Pet.class);
			
			ParameterExpression<>  = construtor.parameter(.class);

			criteria.where(construtor.equal());

			petsOng = sessao.createQuery(criteria).setParameter().getResultList();

			sessao.getTransaction().commit();
			
			
		}   catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();

			}
		} finally {

			if (sessao != null) {
				sessao.close();
			}
		
		return petsDesseStatus;

		}

	}
}