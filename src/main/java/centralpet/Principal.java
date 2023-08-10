package centralpet;

import centralpet.modelo.dao.contato.ContatoDAO;
import centralpet.modelo.dao.contato.ContatoDAOImpl;
import centralpet.modelo.dao.endereco.EnderecoDAO;
import centralpet.modelo.dao.endereco.EnderecoDAOImpl;
import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;

public class Principal {

	public static void main(String[] args) {
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		
		String logradouro = "rua emilio tallmann";
		short numero = 1755;
		String bairro = "Progresso";
		String cep = "89026001";
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		
		enderecoDAO.inserirEndereco(endereco);
		
		
	}
}
