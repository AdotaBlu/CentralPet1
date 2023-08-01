package centralpet.modelo.entidade.usuario;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Table;

import centralpet.modelo.entidade.contato.Contato;
import centralpet.modelo.entidade.endereco.Endereco;

@Entity
@Table(name = "usuario")

public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;

	@Column(name = "nome", length = 45, nullable = false, unique = false)
	private String nome;

	@Column(name = "endereco", nullable = false, unique = false)
	@OneToMany(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@Column(name = "contato", nullable = false, unique = false)
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_contato")
	private Contato contato;

	@Column(name = "dataCadastro", nullable = false, unique = false)
	private LocalDate dataCadastro;

	@Column(name = "dataCadastro", nullable = true, unique = false)
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
