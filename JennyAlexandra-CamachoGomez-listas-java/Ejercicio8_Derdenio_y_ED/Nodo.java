/**
* Problema:En la primera línea, un número entero positivo, , la cantidad de números que tiene en cada lista ordenada. En la segunda línea, números ordenados de menor a mayor: la primer     
* lista. En la tercera línea, números ordenados de menor a mayor: la segunda lista.
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/


public class Nodo {
    int n;
    Nodo ant, sig;

    // Cada nodo guarda un numero y las conexiones con
    // el nodo anterior y el siguiente.
    public Nodo(int n) {
        this.n = n;
        this.ant = null;
        this.sig = null;
    }
}
