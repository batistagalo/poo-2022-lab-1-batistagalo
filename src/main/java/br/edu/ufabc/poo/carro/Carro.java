package br.edu.ufabc.poo.carro;
public class Carro {
	private int potencia;
	private int vMaxima;
	private int velocidade;
	
	// Construtor
	public Carro(int potencia, int vMaxima) {
		this.potencia = potencia;
		this.vMaxima = vMaxima;
	}
	
	// Classes
	public int getVelocidade() {
		return velocidade;
	}
	
	public void frear() {
		velocidade = velocidade/2;
	}
	
	public void acelerar() {
		velocidade += potencia;
		if (velocidade > vMaxima) {
			velocidade = vMaxima;
		}
	}
}
