package br.edu.uniritter.canoas.poo.calculadora;

public class Soma extends Operacao {

	public Soma() {
		simbolo = '+';
		qtdOperadores = 2;
	}
	@Override
	public float calcular(float op1, float op2) {
		return op1 + op2;
	}
	public float calcular(float op1) {
		return 0;
	}

}
