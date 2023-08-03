package centralpet.modelo.dao.ong;

import java.util.List;

import centralpet.modelo.entidade.ong.Ong;

public interface OngDAO {

	void inserirOng(Ong ong);
	
	void deletarOng(Ong ong);
	
	void atualizarOng(Ong ong);
	
	List<Ong> recuperarTodasONgs();
	
	List<Ong> recuperarOng(Ong id);
	
	List<Ong> recuperarOngNome(Ong nome);
	
	List<Ong> recuperarOngBairro(Ong bairro);
	
}
