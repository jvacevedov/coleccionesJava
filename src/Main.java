import listas.Lista;
import listas.ListaUnicos;

public class Main {
    public static void main(String[] args) {
        System.out.println("TALLER JAVA 8 – COLECCIONES");
        System.out.println("*".repeat(20));
        System.out.println("1. Lista de Tareas (ArrayList)");

        Lista listaDeTareas = new Lista();
        listaDeTareas.agregarTarea("Actualizar CV");
        listaDeTareas.agregarTarea("Realizar 35 ejercicios en Java");
        listaDeTareas.mostrarTareas();
        listaDeTareas.marcarCompleta("Actualizar CV");
        listaDeTareas.marcarCompleta("Otra cosa");
        listaDeTareas.mostrarNumeroTareasPendientes();

        System.out.println("*".repeat(20));
        System.out.println("2. Biblioteca de Libros Únicos (HashSet)");
        ListaUnicos listaDeLibros = new ListaUnicos();
        listaDeLibros.agregarLibro("Harry Potter");
        listaDeLibros.agregarLibro("Hunger Games");
        listaDeLibros.mostrarLibros();
        listaDeLibros.verificarExistencia("Harry Potter");
        listaDeLibros.verificarExistencia("Cien años de soledad");
        listaDeLibros.mostrarNumeroLibros();




    }
}
