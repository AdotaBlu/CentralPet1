package centralpet.modelo.entidade.pendencia;

import java.time.LocalDate;

import centralpet.modelo.entidade.acompanhamento.Acompanhamento;
import centralpet.modelo.enumeracao.pendencia.StatusPendencia;

public class Pendencia {

	private long id;
	private LocalDate dataPendencia;
	private String motivo;
	private String observacao;
	private Acompanhamento acompanhamento;
	private StatusPendencia statusPendencia;

	public Pendencia() {
	}

	public Pendencia(LocalDate dataPendencia, String motivo, String observacao, Acompanhamento acompanhamento,
			StatusPendencia statusPendencia) {
		setDataPendencia(dataPendencia);
		setMotivo(motivo);
		setObservacao(observacao);
		setAcompanhamento(acompanhamento);
		setStatusPendencia(statusPendencia);

	}

	public Pendencia(long id, LocalDate dataPendencia, String motivo, String observacao, Acompanhamento acompanhamento,
			StatusPendencia statusPendencia) {
		setId(id);
		setDataPendencia(dataPendencia);
		setMotivo(motivo);
		setObservacao(observacao);
		setAcompanhamento(acompanhamento);
		setStatusPendencia(statusPendencia);

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDataPendencia() {
		return dataPendencia;
	}

	public void setDataPendencia(LocalDate dataPendencia) {
		this.dataPendencia = dataPendencia;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Acompanhamento getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(Acompanhamento acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public StatusPendencia getStatusPendencia() {
		return statusPendencia;
	}

	public void setStatusPendencia(StatusPendencia statusPendencia) {
		this.statusPendencia = statusPendencia;
	}

}
