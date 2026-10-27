/**
* Problema:En la primera línea, un número entero positivo, , la cantidad de números que tiene en cada lista ordenada. En la segunda línea, números ordenados de menor a mayor: la primer     
* lista. En la tercera línea, números ordenados de menor a mayor: la segunda lista.
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/


public class ListaDoble {
    private Nodo cabeza;

    // inserta el numero en su posicion para mantener la lista ordenada de mayor a menor
    public void insertar(int n) {
        Nodo nuevo = new Nodo(n);

        // si la lista esta vacia o el numero es mayor que el primero se coloca al inicio
        if (cabeza == null || n > cabeza.n) {
            nuevo.sig = cabeza;

            if (cabeza != null) {
                cabeza.ant = nuevo;
            }

            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            // en este apartado se bbusca donde debe quedar el nuevo numero
            while (actual.sig != null && actual.sig.n >= n) {
                actual = actual.sig;
            }

            nuevo.sig = actual.sig;
            nuevo.ant = actual;

            if (actual.sig != null) {
                actual.sig.ant = nuevo;
            }

            actual.sig = nuevo;
        }
    }

    // recorre la lista desde el inicio e imprime los numeros separados por espacios
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.n);

            if (actual.sig != null) {
                System.out.print(" ");
            }

            actual = actual.sig;
        }

        System.out.println();
    }
}
