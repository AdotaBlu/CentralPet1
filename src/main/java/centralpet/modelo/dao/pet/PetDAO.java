package centralpet.modelo.dao.pet;

import java.util.List;

import centralpet.modelo.entidade.pet.Pet;

public interface PetDAO {

	void inserirPet(Pet pet);
	
	void deletarPet(Pet pet);
	
	void atualizarPet(Pet pet);
	
	List<Pet> recuperarTodosPets();
	
	List<Pet> recuperarPet(Pet id);
	
	List<Pet> recuperarPetsOng(Pet ong);
	
	List<Pet> recuperarPetsPorte(Pet porte);
	
	List<Pet> recuperarPetsSexo(Pet sexo);
	
	List<Pet> recuperarPetsEspecie(Pet especie);
	
	List<Pet> recuperarPetsStatus(Pet status);
}
