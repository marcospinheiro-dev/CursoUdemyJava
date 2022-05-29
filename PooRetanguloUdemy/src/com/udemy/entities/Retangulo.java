package com.udemy.entities;

public class Retangulo {

    public double base;
    public double altura;

    public double area() {
        return base * altura;
    }

    public double perimeter() {
        return 2 * (base + altura);
    }

    public double diagonal() {
        return Math.sqrt(base*base + altura*altura);
    }

}
