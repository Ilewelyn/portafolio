/**
* Problema:Dados los nombres y promedios de 1 <=1000 <=N alumnos, imprime el cuadro de honor (En el cuadro solo pueden estar las personas que obtienen 9.5 o más)
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/



public class Nodo {
    private String nombre;
    private Nodo continuacion;

    // cada nodo guarda un dato y una referencia al siguiente nodo
    // al principio el nodo no esta conectado con ningun otro
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.continuacion = null;
    }

    // estos metodos permiten consultar el dato y avanzar por la lista sin acceder directamente a sus atributos privados
    public String getNombre() {
        return nombre;
    }

    public Nodo getContinuacion() {
        return continuacion;
    }

    // con este metodo conectamos el nodo actual con el siguiente
    public void setContinuacion(Nodo continuacion) {
        this.continuacion = continuacion;
    }
}
