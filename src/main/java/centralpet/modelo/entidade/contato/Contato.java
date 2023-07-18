package centralpet.modelo.entidade.contato;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String email;
	
	private String telefone;
	
	public Contato () {}
	
	public Contato (String email, String telefone) {
		setEmail(email);
		setTelefone(telefone);
	}
	
	public Contato (Long id, String email, String telefone) {
		setId(id);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public Long getId () {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public String email () {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String telefone () {
		return telefone;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
}
