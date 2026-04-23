import java.util.Stack;
import java.util.Scanner;

public class MetodosNavegador {

        public Stack<ObjetoPaginaWeb> LlenarPila(Stack<ObjetoPaginaWeb> p, Scanner sc) {
        System.out.println("--- Nueva Pagina ---");
        System.out.print("Ingrese URL: ");
        String url = sc.next();
        System.out.print("Ingrese Titulo: ");
        String titulo = sc.next();
        System.out.print("Ingrese Fecha: ");
        String fecha = sc.next();

        ObjetoPaginaWeb nueva = new ObjetoPaginaWeb(url, titulo, fecha);
        p.push(nueva);

        System.out.println("Pagina agregada al historial.");
        return p;
    }

    public Stack<ObjetoPaginaWeb> Retroceder(Stack<ObjetoPaginaWeb> p) {
        if (!p.isEmpty()) {
            ObjetoPaginaWeb eliminada = p.pop();
            System.out.println("Retrocediendo... Saliste de: " + eliminada.getTitulo());

            if (!p.isEmpty()) {
                System.out.println("Ahora estas en: " + p.peek().getTitulo());
            }
        } else {
            System.out.println("No hay paginas en el historial para retroceder.");
        }
        return p;
    }

    public void MostrarPila(Stack<ObjetoPaginaWeb> p) {
        if (p.isEmpty()) {
            System.out.println("Historial vacio.");
        } else {
            System.out.println("\n--- HISTORIAL (LIFO) ---");
            for (ObjetoPaginaWeb pag : p) {
                System.out.print("Titulo: " + pag.getTitulo());
                System.out.print(" | URL: " + pag.getUrl());
                System.out.println(" | Fecha: " + pag.getFechaAcceso());
            }
        }
    }
}