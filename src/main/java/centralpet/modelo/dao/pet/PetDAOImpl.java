package centralpet.modelo.dao.pet;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;
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

	
	public List<Pet> recuperarPet(Pet id) {
		
		Session sessao = null;
		Pet pet = null;
		
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pet> criteria = construtor.createQuery(Pet.class);
			Root<Pet> raizContato = criteria.from(Pet.class);
			
			
		}
		return null;
	}

	
	public List<Pet> recuperarPetsOng(Pet ong) {
		
		return null;
	}

	
	public List<Pet> recuperarPetsPorte(Pet porte) {
		
		return null;
	}

	
	public List<Pet> recuperarPetsSexo(Pet sexo) {
		
		return null;
	}

	
	public List<Pet> recuperarPetsEspecie(Pet especie) {
		
		return null;
	}

	
	public List<Pet> recuperarPetsStatus(Pet status) {
		
		return null;
	}

}
