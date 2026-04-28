package listas;

import java.util.HashSet;
import java.util.Set;

public class ListaUnicos {
    private Set<String> listaLibros = new HashSet<>();
    public void agregarLibro(String libro) {
        listaLibros.add(libro);
        System.out.println("Libro "+libro+ " agregado satisfactoriamente");
    }
    public void mostrarLibros() {
        System.out.println("Libros disponibles:");
        for (String libro : listaLibros) {
            System.out.println(libro);
        }
    }
    public  void verificarExistencia(String libro){
        if (listaLibros.contains(libro)){
            System.out.println("Libro: "+libro+" existe");
        }else {
            System.out.println("Libro no encontrado");
        }
    }

    public void mostrarNumeroLibros(){
        System.out.println("Tienes: "+listaLibros.size() +" libros");
    }
}
