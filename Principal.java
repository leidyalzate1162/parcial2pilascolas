import java.util.Stack;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosNavegador m = new MetodosNavegador();
        Validaciones v = new Validaciones();

        Stack<ObjetoPaginaWeb> historial = new Stack<>();
        boolean seguir = true;

        while (seguir) {
            System.out.println("\n--- NAVEGADOR WEB ---");
            System.out.println("1) Visitar nueva pagina");
            System.out.println("2) Retroceder (Atras)");
            System.out.println("3) Ver historial actual");
            System.out.println("4) Salir");
            System.out.print("Seleccione opcion: ");

            int opt = v.ValidarRango(1, 4, sc);

            switch (opt) {
                case 1:
                    historial = m.LlenarPila(historial, sc);
                    break;
                case 2:
                    historial = m.Retroceder(historial); 
                    break;
                case 3:
                    m.MostrarPila(historial); 
                    break;
                case 4:
                    seguir = false;
                    System.out.println("Navegador cerrado.");
                    break;
            }
        }
    }
} 
    

