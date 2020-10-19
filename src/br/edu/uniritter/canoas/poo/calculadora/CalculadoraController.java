package br.edu.uniritter.canoas.poo.calculadora;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jean
 */
public class CalculadoraController {
	private float op1,op2;
	private String operacao;
	private static Map<String,Operacao> operacoes;

	public CalculadoraController() {
		this.operacoes = new HashMap();
		this.operacoes.put("+",new Soma());
		this.operacoes.put("^",new Potencia());
		//this.operacoes[2] = new Soma();
		//this.operacoes[3] = new Soma();
	}
	public CalculadoraController(Map<String,Operacao> operacoes) {
		this.operacoes = operacoes;
	}


	private void escolheOperacao() {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("escolha operação ( + - * / ^ ) ");
		this.operacao = scan.next();
	}

	private void entrada1() {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Informe operador 1:");
		this.op1 = scan.nextInt();
	}
	private void entrada2() {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Informe operador 2:");
		this.op2 = scan.nextInt();
	}


	private String descreverOperacao() {
		return (this.op1+" "+this.operacao+ " "+this.op2+ " = ");
	}

	public void run() {
		while(true) {
			this.entrada1();
			this.escolheOperacao();
			this.entrada2();

			System.out.println(this.descreverOperacao()
					+this.operacoes.get(this.operacao).calcular(op1, op2)
			);
		}


	}

	public static void inicializa() {
		CalculadoraController.operacoes = new HashMap();
		CalculadoraController.operacoes.put("+",new Soma());
		CalculadoraController.operacoes.put("^",new Potencia());
		CalculadoraController.operacoes.put("!",new Fatorial());
	}
	public static void iniciaCalculadora(String nome) {
		inicializa();
		CalculadoraView cv = new CalculadoraView();
		for (String op : CalculadoraController.operacoes.keySet()) {
			cv.addOperacao(op);
		}
		//cv.setTitle(nome);
		cv.setVisible(true);

	}

	public static String calcula(String calc) {
		float resp;
		System.out.println("===>");
		System.out.println(calc);
		String[] split = calc.split(" ");
		String op1 = split[0];
		String operacao = split[1];
		Operacao objOperacao = CalculadoraController.operacoes.get(operacao);

		float fop1 = Float.parseFloat(op1);
		if (objOperacao.qtdOperadores == 1) {
			resp = objOperacao.calcular(fop1);

		} else {
			String op2 = split[2];
			float fop2 = Float.parseFloat(op2);
			resp = objOperacao.calcular(fop1, fop2);
		}
		System.out.println(resp);

		return resp + "";


	}

}