package centralpet.modelo.dao.ong;

import java.util.List;

import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.usuario.Usuario;

public interface OngDAO {

	void inserirOng(Ong ong);

	void deletarOng(Ong ong);

	void atualizarOng(Ong ong);

	List<Ong> recuperarTodasOngs();

	Ong recuperarOng(Usuario usuario);

	List<Usuario> recuperarOngNome(Ong nome);

	List<Endereco> recuperarOngBairro(Ong bairro);

	List<Pet> recuperarOngPet(Ong pets);

}
