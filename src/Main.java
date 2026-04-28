import listas.DirectorioTrabajadores;
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

        System.out.println("*".repeat(20));
        System.out.println("3. Directorio de Trabajadores con Salarios (HashMap)");
        DirectorioTrabajadores directorioDeTrabajadoresConSalario = new DirectorioTrabajadores();
        directorioDeTrabajadoresConSalario.agregarTrabajador("Manuel",2000000.0);
        directorioDeTrabajadoresConSalario.agregarTrabajador("Lucas",2500000.0);
        directorioDeTrabajadoresConSalario.mostrarTrabajadores();
        directorioDeTrabajadoresConSalario.actualizarSalario("Lucas",2300000.0);
        directorioDeTrabajadoresConSalario.actualizarSalario("Jessica", 5500000000.0);
        directorioDeTrabajadoresConSalario.calcularPromedio();
    }
}
