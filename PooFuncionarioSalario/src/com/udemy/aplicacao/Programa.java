/*
Program que mostre o salário do funcionário menos a taxa q representa o imposto e mostre na tela,
depois acrescentar um aumento de salário em cima do bruto e mostrar novamente
 */

package com.udemy.aplicacao;

import com.udemy.empresa.Funcionario;

public class Programa {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Marcos");
        funcionario.setSalrioBruto(6000d);
        funcionario.setTaxa(1000d);
        System.out.println("Salário do funcionário: " + funcionario.toString());
        funcionario.incrementarSalario(10d);
        funcionario.setPorcentagem(10d);
        System.out.println("Aumento no salário de : " + funcionario.getPorcentagem() + "%");
        System.out.println("Salário do funcionário: " + funcionario.toString());

    }
}
