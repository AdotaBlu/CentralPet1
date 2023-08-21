package centralpet;

import java.time.LocalDate;

import centralpet.modelo.dao.adocao.AdocaoDAO;
import centralpet.modelo.dao.adocao.AdocaoDAOImpl;
import centralpet.modelo.dao.contato.ContatoDAO;
import centralpet.modelo.dao.contato.ContatoDAOImpl;
import centralpet.modelo.dao.endereco.EnderecoDAO;
import centralpet.modelo.dao.endereco.EnderecoDAOImpl;
import centralpet.modelo.dao.ong.OngDAO;
import centralpet.modelo.dao.ong.OngDAOImpl;
import centralpet.modelo.dao.pet.PetDAO;
import centralpet.modelo.dao.pet.PetDAOImpl;
import centralpet.modelo.dao.termo.TermoDAO;
import centralpet.modelo.dao.termo.TermoDAOImpl;
import centralpet.modelo.dao.tutor.TutorDAO;
import centralpet.modelo.dao.tutor.TutorDAOImpl;
import centralpet.modelo.entidade.adocao.Adocao;
import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.termo.Termo;
import centralpet.modelo.entidade.tutor.Tutor;
import centralpet.modelo.enumeracao.adocao.StatusAdocao;
import centralpet.modelo.enumeracao.genero.GeneroTutor;
import centralpet.modelo.enumeracao.pet.especie.EspeciePet;
import centralpet.modelo.enumeracao.pet.porte.PortePet;
import centralpet.modelo.enumeracao.pet.sexo.SexoPet;
import centralpet.modelo.enumeracao.pet.status.StatusPet;

public class Principal {

	public static void main(String[] args) {
		
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		TutorDAO tutorDAO = new TutorDAOImpl();
		ContatoDAO contatoDAO = new ContatoDAOImpl();
		OngDAO ongDAO = new OngDAOImpl();
		PetDAO petDAO = new PetDAOImpl();
		TermoDAO termoDAO = new TermoDAOImpl();
		AdocaoDAO adocaoDAO = new AdocaoDAOImpl();
		
		String logradouro = "rua XV setembro";
		short numero = 356;
		String bairro = "Centro";
		String cep = "12345221";
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		
		enderecoDAO.inserirEndereco(endereco);
		
		Endereco endereco2 = new Endereco();
		
		String logradouro2 = "rua II setembro";
		short numero2 = 358;
		String bairro2 = "Centro";
		String cep2 = "12345222";
		
		endereco2.setLogradouro(logradouro2);
		endereco2.setNumero(numero2);
		endereco2.setBairro(bairro2);
		endereco2.setCep(cep2);
		
		enderecoDAO.inserirEndereco(endereco2);
		
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
		
		Contato contato = new Contato();
		
		String email = "aa@aa.com";
		String telefone = "47123456789";
		
		contato.setEmail(email);
		contato.setTelefone(telefone);
		contato.setUsuario(tutor);
		
		contatoDAO.inserirContato(contato);
		
		Ong ong = new Ong();
		
		String nomeOng = "Ong Shippuden";
		LocalDate dataCadastro2 = LocalDate.now();
		String cnpj = "12345678911234";
		
		ong.setNome(nomeOng);
		ong.setEndereco(endereco2);
		ong.setCnpj(cnpj);
		ong.setDataCadastro(dataCadastro2);
		
		ongDAO.inserirOng(ong);
		
		Pet pet = new Pet();
		
		String nomePet = "Java";
		String vacinas = "Raiva";
		String descricao = "Fofo, amigavel e companheiro";
		Byte idade = 4;
		StatusPet statusPet = StatusPet.DISPONIVEL;
		PortePet portePet = PortePet.PEQUENO;
		EspeciePet especiePet = EspeciePet.CACHORRO;
		SexoPet sexoPet = SexoPet.FEMEA;
		
		pet.setNome(nomePet);
		pet.setVacinas(vacinas);
		pet.setDescricao(descricao);
		pet.setIdade((byte) 0);
		pet.setOng(ong);
		pet.setStatusPet(statusPet);
		pet.setPortePet(portePet);
		pet.setEspeciePet(especiePet);
		pet.setSexoPet(sexoPet);
		
		petDAO.inserirPet(pet);
		
		Termo termo = new Termo();
		
		String termoOng = "TERMO RESPONSAVEL";
		
		termo.setOngResponsavel(ong);
		termo.setTermo(termoOng);
		
		termoDAO.inserirTermo(termo);
		
		Adocao adocao = new Adocao();
		
		StatusAdocao statusAdocao = StatusAdocao.PENDENTE;
		LocalDate dataAdocao = LocalDate.of(2023, 8, 20);
		
		adocao.setPet(pet);
		adocao.setOng(ong);
		adocao.setTutor(tutor);
		adocao.setTermo(termo);
		adocao.setStatusAdocao(statusAdocao);
		adocao.setDataAdocao(dataAdocao);
		
		adocaoDAO.inserirAdocao(adocao);
		
	}
}
