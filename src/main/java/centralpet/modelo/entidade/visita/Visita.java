package centralpet.modelo.entidade.visita;

import java.io.Serializable;
import java.time.LocalDateTime;

import centralpet.modelo.entidade.endereco.Endereco;
import centralpet.modelo.enumeracao.visita.status.StatusVisita;

public class Visita implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private LocalDateTime horarioVisita;
	
	private String observacaoVisita;
	
	private StatusVisita statusVisita;
	
	private Endereco endereco;

	public Visita(){}
	
	public Visita(LocalDateTime horarioVisita, String observacaoVisita, Endereco endereco, StatusVisita statusVisita){
		setHorarioVisita(horarioVisita);
		setObservacaoVisita(observacaoVisita);
		setEndereco(endereco);
		setStatusVisita(statusVisita);
	}
	
	public Visita(Long id, LocalDateTime horarioVisita, String observacaoVisita, Endereco endereco, StatusVisita statusVisita){
		setId(id);
		setHorarioVisita(horarioVisita);
		setObservacaoVisita(observacaoVisita);
		setEndereco(endereco);
		setStatusVisita(statusVisita);
	}
	
	public LocalDateTime getHorarioVisita() {
		return horarioVisita;
	}

	public void setHorarioVisita(LocalDateTime horarioVisita) {
		this.horarioVisita = horarioVisita;
	}

	public String getObservacaoVisita() {
		return observacaoVisita;
	}

	public void setObservacaoVisita(String observacaoVisita) {
		this.observacaoVisita = observacaoVisita;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusVisita getStatusVisita() {
		return statusVisita;
	}

	public void setStatusVisita(StatusVisita statusVisita) {
		this.statusVisita = statusVisita;
	}
	
	
}
