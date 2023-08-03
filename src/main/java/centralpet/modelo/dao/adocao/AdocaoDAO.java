package centralpet.modelo.dao.adocao;

import java.util.List;

import centralpet.modelo.entidade.adocao.Adocao;

public interface AdocaoDAO {

	void inserirAdocao(Adocao adocao);
	
	void deletarAdocao(Adocao adocao);
	
	void atualizarAdocao(Adocao adocao);
	
	List<Adocao> recuperarTodasAdocoes();
	
	List<Adocao> recuperarAdocao(Adocao id);
	
	List<Adocao> recuperarAdocoesOng(Adocao ong);
	
	List<Adocao> recuperarAdocoesTutor(Adocao tutor);
	
}
