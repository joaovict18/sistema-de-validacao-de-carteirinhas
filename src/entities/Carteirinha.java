package entities;

import java.time.LocalDate;

public class Carteirinha {

	private String instituicao;
	private LocalDate dataDeVencimento;
	
	public Carteirinha() {
	}

	public Carteirinha(String instituicao, LocalDate dataDeVencimento) {
		this.instituicao = instituicao;
		this.dataDeVencimento = dataDeVencimento;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public LocalDate getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(LocalDate dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
}
