package chapter1.task1_4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Napisz program, który oblicza objętość kuli o promieniu r. Wartość promienia wprowadzamy z klawiatury.
 * W programie należy przyjąć, że zmienne promień r i objętość, są typu double ( rzeczywistego).Dla tych
 * zmiennych należy przyjąc format wyświetlania na ekranie z dokładnością do 2 miejsc po przecinku
 */
public class Main
{
    public static void main(String[] args)
    {
        double r, objetosc;
        Scanner in = new Scanner(System.in);
        System.out.println("Program oblicza objętość kuli z podanego promienia");
        System.out.print("Podaj  promień kuli, r = ");
        r = in.nextDouble();
        objetosc = (4*Math.PI*r*r*r)/3;
        System.out.printf("Objętośc kuli o promieniu %.2f wynosi %.2f", r, objetosc);
    }
}
