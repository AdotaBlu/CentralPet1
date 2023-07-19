package centralpet.modelo.entidade.usuario;

import java.io.Serializable;
import java.time.LocalDate;


import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;

public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private Endereco endereco;
	
	private Contato contato;
	
	private LocalDate dataCadastro;
	
	private LocalDate dataAlteracaoCadastro;

	public Usuario () {}
	
	public Usuario (String nome, Endereco endereco, Contato contato) {
		setNome(nome);
		setEndereco(endereco);
		setContato(contato);
		setDataCadastro(dataCadastro);
		setDataAlteracaoCadastro(dataAlteracaoCadastro);
	}
	
	public Usuario (Long id, String nome, Endereco endereco, Contato contato) {
		setId(id);
		setNome(nome);
		setEndereco(endereco);
		setContato(contato);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public LocalDate getDataCadastro () {
		return dataCadastro;
	}
	
	public void setDataCadastro (LocalDate dataCadastro) {
		dataCadastro = LocalDate.now();
		this.dataCadastro = dataCadastro;
	}
	
	public LocalDate getDataAlteracaoCadastro () {
		return dataAlteracaoCadastro;
	}
	
	public void setDataAlteracaoCadastro (LocalDate dataAlteracaoCadastro) {
		dataAlteracaoCadastro = LocalDate.now();
		this.dataAlteracaoCadastro = dataAlteracaoCadastro;
	} 
	
	
}
