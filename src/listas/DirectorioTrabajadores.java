package listas;


import java.util.HashMap;
import java.util.Map;

public class DirectorioTrabajadores {
    public Map<String, Double> listaTrabajadores= new HashMap<>();

    public void agregarTrabajador(String nombre, Double salario){
        listaTrabajadores.put(nombre,salario);
        System.out.println(nombre+" Ha sido agregado satisfactoriamente");
    }

    public void mostrarTrabajadores(){
        System.out.println("Lista de trabajadores");
        listaTrabajadores.forEach((nombre, salario) ->
                System.out.println(nombre + ": $" + salario));
    }

    public void actualizarSalario(String nombre,Double nuevoSalario){
        if(listaTrabajadores.containsKey(nombre)){
            listaTrabajadores.put(nombre,nuevoSalario);
            System.out.println("Se ha actualizado el salario de "+ nombre+ " a" + nuevoSalario);
        } else {
            System.out.println("Trabajador no encontrado, puedes agregarlo con agregarTrabajador");
        }
    }
    public void calcularPromedio(){
        double acumulado=0;
        for(double salario : listaTrabajadores.values()){
            acumulado+=salario;
        }
        double promedio=acumulado/listaTrabajadores.size();
        System.out.println("El salario promedio es: "+promedio);
    }

}
