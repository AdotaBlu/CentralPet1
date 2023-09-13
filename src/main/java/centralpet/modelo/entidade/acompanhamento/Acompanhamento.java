package centralpet.modelo.entidade.acompanhamento;

import java.time.LocalDate;

import centralpet.modelo.entidade.adocao.Adocao;
import centralpet.modelo.entidade.ong.Ong;
import centralpet.modelo.entidade.pet.Pet;
import centralpet.modelo.entidade.tutor.Tutor;

public class Acompanhamento {

	private Long id;
	private byte video;
	private byte foto;
	private String observacao;
	private LocalDate dataEnvioVideo;
	private LocalDate dataEnvioFoto;
	private Ong ong;
	private Tutor tutor;
	private Pet pet;
	private Adocao adocao;

	public Acompanhamento() {
	}

	// Utilizado quando manda as informações para o banco
	public Acompanhamento(byte video, byte foto, String observacao, LocalDate dataEnvioVideo, LocalDate dataEnvioFoto) {
		setVideo(video);
		setFoto(foto);
		setObservacao(observacao);
		setDataEnvioVideo(dataEnvioVideo);
		setDataEnvioFoto(dataEnvioFoto);
		setOng(ong);
		setTutor(tutor);
		setPet(pet);
		setAdocao(adocao);
	}

	// Utilizado quando recebe as informações para o banco
	public Acompanhamento(Long id, byte video, byte foto, String observacao, LocalDate dataEnvioVideo,
			LocalDate dataEnvioFoto) {
		setId(id);
		setVideo(video);
		setFoto(foto);
		setObservacao(observacao);
		setDataEnvioVideo(dataEnvioVideo);
		setDataEnvioFoto(dataEnvioFoto);
		setOng(ong);
		setTutor(tutor);
		setPet(pet);
		setAdocao(adocao);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte getVideo() {
		return video;
	}

	public void setVideo(byte video) {
		this.video = video;
	}

	public byte getFoto() {
		return foto;
	}

	public void setFoto(byte foto) {
		this.foto = foto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LocalDate getDataEnvioVideo() {
		return dataEnvioVideo;
	}

	public void setDataEnvioVideo(LocalDate dataEnvioVideo) {
		this.dataEnvioVideo = dataEnvioVideo;
	}

	public LocalDate getDataEnvioFoto() {
		return dataEnvioFoto;
	}

	public void setDataEnvioFoto(LocalDate dataEnvioFoto) {
		this.dataEnvioFoto = dataEnvioFoto;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Adocao getAdocao() {
		return adocao;
	}

	public void setAdocao(Adocao adocao) {
		this.adocao = adocao;
	}
}
