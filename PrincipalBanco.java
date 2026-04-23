
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincipalBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosBanco m = new MetodosBanco();

        Queue<ObjetoCliente> filaEspera = new LinkedList<>();
        Queue<ObjetoCliente> historialAtendidos = new LinkedList<>();

        int turnosGenerados = 1;
        boolean activo = true;

        while (activo) {
            System.out.println("\n--- BANCO CENTRAL - TURNOS ---");
            System.out.println("1) Llegada de cliente");
            System.out.println("2) Atender cliente");
            System.out.println("3) Ver siguiente cliente");
            System.out.println("4) Ver cola actual");
            System.out.println("5) Mostrar turnos");
            System.out.println("6) Salir");
            System.out.print("Seleccione: ");

            int opt = m.ValidarRango(1, 6, sc);

            switch (opt) {
                case 1:
                    filaEspera = m.Encolar(filaEspera, sc, turnosGenerados);
                    turnosGenerados++;
                    break;

                case 2:
                    ObjetoCliente atendido = m.Atender(filaEspera, historialAtendidos);
                    if (atendido != null) {
                        System.out.println("Atendiendo a: " + atendido.getNombre() +
                                " (Turno " + atendido.getId() + ")");
                    } else {
                        System.out.println("No hay clientes en espera.");
                    }
                    break;

                case 3:
                    ObjetoCliente siguiente = m.VerSiguiente(filaEspera);
                    if (siguiente != null) {
                        System.out.println("Siguiente en fila: " + siguiente.getNombre());
                    } else {
                        System.out.println("Cola vacia.");
                    }
                    break;

                case 4:
                    m.MostrarCola(filaEspera, "CLIENTES EN ESPERA");
                    break;

                case 5:
                    m.MostrarCola(historialAtendidos, "TURNOS ATENDIDOS");
                    m.MostrarCola(filaEspera, "TURNOS PENDIENTES");
                    break;

                case 6:
                    activo = false;
                    System.out.println("Sistema cerrado.");
                    break;
            }
        }
    }
}
