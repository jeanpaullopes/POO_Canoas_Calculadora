package br.edu.uniritter.canoas.poo.calculadora;

public abstract class Operacao {
	protected char simbolo;
	protected int qtdOperadores;

	public abstract float calcular(float op1, float op2);
	public abstract float calcular(float op1);

	public char getSimbolo() {
		return this.simbolo;
	}

}
