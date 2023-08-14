package centralpet.modelo.dao.termo;

import java.util.List;

import centralpet.modelo.entidade.termo.Termo;

public interface TermoDAO {

	void inserirTermo(Termo termo);

	void deletarTermo(Termo termo);

	void atualizarTermo(Termo termo);

	List<Termo> recuperarTermo(Termo id);

	List<Termo> recuperarTermosOng(Termo ong);

}
