package chapter1.task1_3;

/**
 * Napisz program, który wyświetla na ekranie komputer pierwiastek kwadratowy z wartości predefiniowanej PI
 * Należy przyjąć format wyświetlania pierwisatka kwadratowego ze stałęj PI z dokładnością do dwóch miejsc
 * po przecinku
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Math.PI);
        System.out.printf("Pierwiastek kwadratowy z PI z dokładnością do dwóch miejsc po przecinku wynosi: %.2f", Math.sqrt(Math.PI));
    }
}
