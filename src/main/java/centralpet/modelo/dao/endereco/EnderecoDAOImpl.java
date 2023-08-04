package centralpet.modelo.dao.endereco;

import java.util.List;

import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.factory.conexao.ConexaoFactory;

//Classe EnderecoDAOImpl implementa a classe EnderecoDAO
public class EnderecoDAOImpl implements EnderecoDAO {

	// Define a classe ConexaoFactory cujo é responsável pela conexão com o BD
	private ConexaoFactory fabrica;

	// Cria o construtor
	public EnderecoDAOImpl() {
		// Define o método fabrica
		fabrica = new ConexaoFactory();
	}

	// Método de inserir endereço
	public void inserirEndereco(Endereco endereco) {

	}

	// Método de deletar endereço
	public void deletarEndereco(Endereco endereco) {

	}

	// Método de atualizar endereço
	public void atualizarEndereco(Endereco endereco) {

	}

	// Método de recuperar todos endereços
	public List<Endereco> recuperarTodosEnderecos() {
		return null;
	}

	// Método de recuperar endereço do tutor
	public List<Endereco> recuperarEnderecoTutor(Tutor id) {
		return null;
	}

	// Método de recuperar endereco ong
	public List<Endereco> recuperarEnderecoOng(Ong id) {
		return null;
	}

}
