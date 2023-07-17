package centralpet.modelo.entidade.endereco;

import java.io.Serializable;

public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String logradouro;
	
	private short numero;
	
	private String bairro;
	
	private String cep;
	
	private String pontoReferencia;
	
	public Endereco () {}
	
	public Endereco (String logradouro, short numero, String bairro, String cep, String pontoReferencia) {
		setLogradouro(logradouro);
		setNumero(numero);
		setBairro(bairro);
		setCep(cep);
		setPontoReferencia(pontoReferencia);
	}
	
	public Endereco (Long id, String logradouro, short numero, String bairro, String cep, String pontoReferencia) {
		setId(id);
		setLogradouro(logradouro);
		setNumero(numero);
		setBairro(bairro);
		setCep(cep);
		setPontoReferencia(pontoReferencia);
	}

	public Long getId () {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public String getLogradouro () {
		return logradouro;
	}
	
	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}
	
	public short getNumero () {
		return numero;
	}
	
	public void setNumero (short numero) {
		this.numero = numero;
	} 
	
	public String getBairro () {
		return bairro;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep () {
		return cep;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public String getPontoReferencia () {
		return pontoReferencia;
	}
	
	public void setPontoReferencia (String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
}


