package centralpet.modelo.dao.endereco;

import java.util.List;

import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.tutor.Tutor;

public interface EnderecoDAO {

	void inserirEndereco(Endereco endereco);

	void deletarEndereco(Endereco endereco);

	void atualizarEndereco(Endereco endereco);
	
	List<Endereco> recuperarTodosEnderecos ();
	
	List<Endereco> recuperarEnderecoTutor (Tutor id);
	
	List<Endereco> recuperarEnderecoOng (Ong id);
}
