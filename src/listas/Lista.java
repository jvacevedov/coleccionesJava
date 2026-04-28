package listas;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public List<String> listaTareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        listaTareas.add(tarea);
        System.out.println("Tarea "+tarea+ " agregada satisfactoriamente");
    }

    public void mostrarTareas() {
        System.out.println("Tareas");
        for (String tarea : listaTareas) {
            System.out.println(tarea);
        }
    }

    public  void marcarCompleta(String tarea){
        if (listaTareas.contains(tarea)){
            listaTareas.remove(tarea);
            System.out.println("Tarea: "+tarea+" Eliminada satisfactoriamente");
        }else {
            System.out.println("Tarea no encontrada, no ha sido eliminada");
        }
    }

    public void mostrarNumeroTareasPendientes(){
        System.out.println("Tienes: "+listaTareas.size() +" tareas pendientes");
    }
}
