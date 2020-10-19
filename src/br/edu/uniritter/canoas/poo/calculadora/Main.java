/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.canoas.poo.calculadora;

/**
 *
 * @author jean
 */
public class Main {
    public static void main(String[] args) {
        //Calculadora calc = new CalculadoraController();
        //calc.run();
        CalculadoraController.iniciaCalculadora("calculadora 1");
        CalculadoraView.titulo= "Aula de 08.04";
        //CalculadoraController.iniciaCalculadora("calculadora 2");
        //CalculadoraController.iniciaCalculadora("calculadora 3");
        //CalculadoraController.iniciaCalculadora("calculadora 4");
        CalculadoraController.inicializa();
        System.out.println("");
        System.out.println(CalculadoraController.calcula("345.0 + 56.7"));
    }
    
}
