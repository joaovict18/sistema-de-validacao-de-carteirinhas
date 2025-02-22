package entities;

import java.time.LocalDate;

public class Aluno {
	
	private String nome;
	private Carteirinha carteirinha;
	
	public Aluno() {
	}

	public Aluno(String nome, Carteirinha carteirinha) {
		this.nome = nome;
		this.carteirinha = carteirinha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carteirinha getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(Carteirinha carteirinha) {
		this.carteirinha = carteirinha;
	}
	
	public String toString() {
		String statusDaCarteirinha = LocalDate.now().isBefore(carteirinha.getDataDeVencimento()) ? "REGULAR" : "IRREGULAR";
		return "Aluno: " + nome + ", Instituição: " + carteirinha.getInstituicao() + ", Situação: " + statusDaCarteirinha;
	}
}
