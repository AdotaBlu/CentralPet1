package centralpet.modelo.entidade.ong;

import java.io.Serializable;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.entidade.usuario.Usuario;

public class Ong extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String cnpj;
	
	public Ong () {}
	
	public Ong (String nome, Endereco endereco, Contato contato, String cnpj) {
		super(nome, endereco, contato);
		setCnpj(cnpj);
	}
	
	public Ong (String nome, Endereco endereco, Contato contato, Long id, String cnpj) {
		super(nome, endereco, contato);
		setId(id);
		setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
	 this.id = id;
	}
	
	
}