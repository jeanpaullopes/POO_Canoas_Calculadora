package br.edu.uniritter.canoas.poo.calculadora;

public class Fatorial extends Operacao{

	public Fatorial() {
		simbolo = '!';
		qtdOperadores = 1;
	}
	@Override
	public float calcular(float op1, float op2) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public float calcular(float op1) {
		return 9999;
	}

}
