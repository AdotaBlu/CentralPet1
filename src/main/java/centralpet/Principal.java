package centralpet;

import centralpet.modelo.dao.contato.ContatoDAO;
import centralpet.modelo.dao.contato.ContatoDAOImpl;
import centralpet.modelo.entidade.contato.Contato;

public class Principal {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAOImpl();
		
		String email = "erikaal@gmail.com";
		String telefone = "4794222932";
		
		Contato contato = new Contato();
		
		contato.setEmail(email);
		contato.setTelefone(telefone);
		
		contatoDAO.inserirContato(contato);
		
		
	}
}
