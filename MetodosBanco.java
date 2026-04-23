
import java.util.Queue;
import java.util.Scanner;

public class MetodosBanco {

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
            System.out.println("Error. Rango valido: " + n1 + " a " + n2);
            numero = ValidarEntero(sc);
        }
        return numero;
    }
   
    public Queue<ObjetoCliente> Encolar(Queue<ObjetoCliente> c, Scanner sc, int contador) {
        System.out.print("Nombre del cliente: ");
        String nom = sc.next();
        System.out.print("Tipo de servicio: ");
        String serv = sc.next();
        System.out.print("Hora de llegada: ");
        String hora = sc.next();

        ObjetoCliente nuevo = new ObjetoCliente(contador, nom, serv, hora, false);
        c.offer(nuevo);

        System.out.println("Cliente registrado. Turno #" + contador);
        return c;
    }

        public ObjetoCliente Atender(Queue<ObjetoCliente> pendientes, Queue<ObjetoCliente> atendidos) {
        if (!pendientes.isEmpty()) {
            ObjetoCliente actual = pendientes.poll();
            actual.setAtendido(true);
            atendidos.offer(actual);
            return actual; 
        } else {
            return null;
        }
    }

    public ObjetoCliente VerSiguiente(Queue<ObjetoCliente> c) {
        if (!c.isEmpty()) {
            return c.peek(); 
        } else {
            return null;
        }
    }

    public void MostrarCola(Queue<ObjetoCliente> c, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        if (c.isEmpty()) {
            System.out.println("Sin registros.");
        } else {
            for (ObjetoCliente cli : c) {
                System.out.println("Turno: " + cli.getId() +
                        " | Cliente: " + cli.getNombre() +
                        " | Servicio: " + cli.getTipoServicio());
            }
        }
    }
}

