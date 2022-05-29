package com.udemy.aplication;

import com.udemy.entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a base e a altura : ");
        retangulo.base = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println("Base: " + retangulo.base + ", Altura: " + retangulo.altura);
        System.out.println("O valor da área é : " + retangulo.area());
        System.out.println("O valor do perímetro é " + retangulo.perimeter());
        System.out.println("O valor da diagonal é : " + retangulo.diagonal());



        sc.close();

    }
}
