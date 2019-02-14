package chapter1.task1_1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Napisz program, który oblicza pole prostokąta. Wartość boków a i b wprowadzamy z klawiatury
 * W programie należy przyjąć, że zmienne a, b oraz pole są typu double(rzeczywistego)
 */
public class Main
{
    public static void main(String[] args)
    {
        double a, b, pole;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Program obicza pole prostokąta z podanych boków.");
        System.out.print("Podaj długośc boku a: ");
        a = scaner.nextDouble();
        System.out.print("Podaj długośc boku b: ");
        b = scaner.nextDouble();
        pole = a*b;
        System.out.println("Pole prostokąta o bokach "+ a + " i " + b + " wynosi: " + pole);
    }
}
