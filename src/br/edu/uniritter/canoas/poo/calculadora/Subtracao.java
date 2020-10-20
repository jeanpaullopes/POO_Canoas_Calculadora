package br.edu.uniritter.canoas.poo.calculadora;

public class Subtracao extends Operacao {
    public Subtracao() {
        this.simbolo = '-';
        this.qtdOperadores = 2;
    }
    @Override
    public float calcular(float op1, float op2) {
        return op1 - op2;
    }

    @Override
    public float calcular(float op1) {
        return 0;
    }
}
