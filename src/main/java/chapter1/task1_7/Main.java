package chapter1.task1_7;

import java.util.Scanner;

/**
 * Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y wprowadzonych z klawiarury.
 * W programoe należy założyć, że zmienne x i y są typu float (rzeczywistego). Dla zmiennych x, y, suma, roznica
 * iloczyn i iloraz należy przyjąć format ich wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku
 */
public class Main
{
    public static void main(String[] args)
    {
        float x, y, suma, rozniza, iloczyn, iloraz;
        Scanner in = new Scanner(System.in);
        System.out.println("Program oblicza sume, róznice, iloczyn i iloraz z podanuch dwóch liczb");
        System.out.print("Podaj liczbę x :");
        x = in.nextFloat();
        System.out.print("Podaj liczbę y :");
        y = in.nextFloat();
        suma = x + y;
        rozniza = x - y;
        iloczyn = x * y;
        iloraz = x/y;
        System.out.printf("Suma liczb %.2f i %.2f wynosi %.2f \n", x, y , suma);
        System.out.printf("Róznica liczb (x-y) %.2f i %.2f wynosi %.2f \n", x, y, rozniza);
        System.out.printf("Iloczyn liczb %.2f i %.2f wynosi %.2f \n", x, y, iloczyn);
        System.out.printf("Iloraz liczb (x/y) %.2f i %.2f wynosi %.2f", x, y, iloraz);
    }
}
