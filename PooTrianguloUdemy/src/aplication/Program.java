/*
 Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguin fómula: (abaixo no código)
 */

package aplication;
import entities.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //double xA, xB, xC, yA, yB, yC; // Usar sem POO

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com os lados dos triângulos X: ");
        //xA = sc.nextDouble(); // Usar sem POO
        //xB = sc.nextDouble(); // Usar sem POO
        //xC = sc.nextDouble(); // Usar sem POO
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os lados dos triângulos Y: ");
        //yA = sc.nextDouble(); // Usar sem POO
        //yB = sc.nextDouble(); // Usar sem POO
        //yC = sc.nextDouble(); // Usar sem POO
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //double p = (xA + xB + xC) / 2.0; // Usar sem POO
        //double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); // Usar sem POO

        //double p = (x.a + x.b + x.c) / 2.0;
        //double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        // = (yA + yB + yC) / 2.0; // Usar sem POO
        //double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // Usar sem POO

        //p = (y.a + y.b + y.a) / 2.0;
        //double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triângulo X área: %.4f%n", areaX);
        System.out.printf("Triângulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área do triângulo X é maior");
        } else {
            System.out.println("Área do triângulo Y é maior");
        }
        sc.close();
    }

}