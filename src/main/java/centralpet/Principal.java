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
		
		Tutor tutor = new Tutor();
		
		String nome = "Joao";
		
		String cpf = "12345678911";
		LocalDate datanascimento = LocalDate.of(2000, 2, 1);
		GeneroTutor generoTutor = GeneroTutor.MASCULINO;
		LocalDate dataCadastro = LocalDate.now();
		
		tutor.setNome(nome);
		tutor.setEndereco(endereco);
		tutor.setDataCadastro(dataCadastro);
		tutor.setCpf(cpf);
		tutor.setDataNascimento(datanascimento);
		tutor.setGeneroTutor(generoTutor);
		
		tutorDAO.inserirTutor(tutor);
		
		
		
	}
}
