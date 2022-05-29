package com.udemy.aluno;

public class Student {

    public String nome;
    public double trimestre1;
    public double trimestre2;
    public double trimestre3;

    public Student() {
    }

    public double somaTrimestre() {
        return trimestre1 + trimestre2 + trimestre3;
    }

    public double pontoFinal() {
        if(somaTrimestre() < 60) {
            return 60 - somaTrimestre();
        }
        else {
            return 0.0;
        }
    }
}
