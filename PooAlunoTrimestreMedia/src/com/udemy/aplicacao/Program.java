package com.udemy.aplicacao;

import com.udemy.aluno.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.nome =  sc. nextLine();
        student.trimestre1 = sc.nextDouble();
        student.trimestre2 = sc.nextDouble();
        student.trimestre3 = sc.nextDouble();
        if (student.somaTrimestre() < 60) {
            System.out.println("Reprovado");
            System.out.println("Faltaram : " + student.pontoFinal() + " pontos.");
            
        } else {
            System.out.println("Aprovado!");
        }



    }
}
