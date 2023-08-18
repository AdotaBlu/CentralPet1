package centralpet.modelo.dao.pet;

import java.util.List;

import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.enumeracao.pet.especie.EspeciePet;
import centralpet.modelo.enumeracao.pet.porte.PortePet;
import centralpet.modelo.enumeracao.pet.sexo.SexoPet;
import centralpet.modelo.enumeracao.pet.status.StatusPet;

public interface PetDAO {

	void inserirPet(Pet pet);
	
	void deletarPet(Pet pet);
	
	void atualizarPet(Pet pet);
	
	List<Pet> recuperarTodosPets();
	
	List<Pet> recuperarPetsOng(Ong ong);
	
	List<Pet> recuperarPetsPorte(PortePet porte);
	
	List<Pet> recuperarPetsSexo(SexoPet sexo);
	
	List<Pet> recuperarPetsEspecie(EspeciePet especie);
	
	List<Pet> recuperarPetsStatus(StatusPet status);
}
