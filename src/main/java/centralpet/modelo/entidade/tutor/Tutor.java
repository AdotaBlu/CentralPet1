package centralpet.modelo.entidade.tutor;

import java.io.Serializable;
import java.time.LocalDate;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.usuario.Usuario;
import centralpet.modelo.enumeracao.genero.GeneroTutor;

public class Tutor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
	private GeneroTutor generoTutor;
	
	public Tutor () {}
	
	public Tutor (String nome, Endereco endereco, Contato contato, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco, contato);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}
	
	public Tutor (String nome, Endereco endereco, Contato contato, Long id, String cpf, LocalDate datanascimento, GeneroTutor generoTutor) {
		super(nome, endereco, contato);
		setId(id);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setGeneroTutor(generoTutor);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public GeneroTutor getGeneroTutor() {
		return generoTutor;
	}

	public void setGeneroTutor(GeneroTutor generoTutor) {
		this.generoTutor = generoTutor;
	}
	
	

}
