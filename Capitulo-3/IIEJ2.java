/*
 *Víctor Valverde Olmedo Ejercicio 2
 Conversor euros a pesetas
 */
import java.util.Scanner;

public class IIEJ2 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce el número de euros");
            int num_uno = s.nextInt();
            int multiplicacion = num_uno * 166;
            System.out.println("El resultado son " + multiplicacion + "  pesetas");
        }

    }
}
