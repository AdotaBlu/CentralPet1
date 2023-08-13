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

	// Precisa mesmo recuperar todas as ONGS? Em que tela?
//	List<Ong> recuperarTodasOngs();

	Ong recuperarOng(Usuario usuario);

	/*
	 * Mudar para List<Usuario> recuperarOngNome(Ong nome) (igual na implementação
	 * do DAO)? 
	 * Mesma coisa com a lista de baixo
	 */
	List<Ong> recuperarOngNome(Usuario nome);

	List<Ong> recuperarOngBairro(Endereco bairro);

	// Não teria uma lista de pets também?
	
	List<Ong> recuperarOngPet(Pet pets);

}
