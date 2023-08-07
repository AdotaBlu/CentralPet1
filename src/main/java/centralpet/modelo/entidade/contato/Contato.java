package centralpet.modelo.entidade.contato;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Long id;
	
	@Column(name = "email_contato", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "telefone_contato", length = 11, nullable = false, unique = true)
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
