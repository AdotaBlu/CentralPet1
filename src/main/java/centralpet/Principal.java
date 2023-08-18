package centralpet;

import java.time.LocalDate;

import centralpet.modelo.dao.endereco.EnderecoDAO;
import centralpet.modelo.dao.endereco.EnderecoDAOImpl;
import centralpet.modelo.dao.tutor.TutorDAO;
import centralpet.modelo.dao.tutor.TutorDAOImpl;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.enumeracao.genero.GeneroTutor;

public class Principal {

	public static void main(String[] args) {
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		TutorDAO tutorDAO = new TutorDAOImpl();
		
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
		
		String cpf = "12345678911";
		LocalDate dataNascimento = LocalDate.of(2004, 04, 02);
		GeneroTutor generoTutor = GeneroTutor.MASCULINO;
		String nome = "Jao";
		
		Tutor tutor = new Tutor();
		
		tutor.setNome(nome);
		tutor.setEndereco(endereco);
		tutor.setCpf(cpf);
		tutor.setDataNascimento(dataNascimento);
		tutor.setGeneroTutor(generoTutor);
		
		tutorDAO.inserirTutor(tutor);
		
		
	}
}
