import java.util.Scanner;

public class Validaciones {

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero valido:");
            sc.next();
        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, Scanner sc) {
        int numero = ValidarEntero(sc);

        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de: " + n1 + " hasta " + n2);
            numero = ValidarEntero(sc);
        }
        return numero;
    }
}

