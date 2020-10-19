package br.edu.uniritter.canoas.poo.calculadora;

public class Potencia extends Operacao{

	public Potencia() {
		simbolo = '^';
		qtdOperadores =2;
	}
	@Override
	public float calcular(float op1, float op2) {
		float ret = op1;
		for (int i = 2; i <= op2; i++) {
			ret = ret * op1;
		}
		return ret;
	}

	@Override
	public float calcular(float op1) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
