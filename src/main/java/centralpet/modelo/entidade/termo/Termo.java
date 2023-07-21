package centralpet.modelo.entidade.termo;

import java.io.Serializable;

import centralpet.modelo.entidade.ong.Ong;

public class Termo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Ong ongResponsavel;
	
	private String termo;
	
	public Termo () {}
	
	public Termo (Ong ongResponsavel, String termo) {
		setOngResponsavel(ongResponsavel);
		setTermo(termo);
	}
	
	public Termo (Long id, Ong ongResponsavel, String termo) {
		setOngResponsavel(ongResponsavel);
		setTermo(termo);
		setId(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ong getOngResponsavel() {
		return ongResponsavel;
	}

	public void setOngResponsavel(Ong ongResponsavel) {
		this.ongResponsavel = ongResponsavel;
	}

	public String getTermo() {
		return termo;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}
	
	
}
