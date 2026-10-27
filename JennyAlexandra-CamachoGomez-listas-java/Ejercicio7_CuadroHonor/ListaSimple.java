/**
* Problema:Dados los nombres y promedios de 1 <=1000 <=N alumnos, imprime el cuadro de honor (En el cuadro solo pueden estar las personas que obtienen 9.5 o más)
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/


public class ListaSimple {
    private Nodo cabeza;

    // ingresa cada nombre en su posicion alfabetica
    public void agregar(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        // si la lista esta vacia o el nombre va primero el nuevo nodo se convierte en la cabeza
        if (cabeza == null ||
            nombre.compareToIgnoreCase(cabeza.getNombre()) < 0) {
            nuevo.setContinuacion(cabeza);
            cabeza = nuevo;
        } else {
            // en esta parte se trta de buscar el lugar donde debe ir el nuevo nombre
            Nodo actual = cabeza;
            while (actual.getContinuacion() != null &&
                   nombre.compareToIgnoreCase(
                       actual.getContinuacion().getNombre()) >= 0) {
                actual = actual.getContinuacion();
            }

            nuevo.setContinuacion(actual.getContinuacion());
            actual.setContinuacion(nuevo);
        }
    }

    // Agrega un promedio en la posicion indicada para que coincida con el nombre del alumno en la otra lista.
    public void agregarEn(int posicion, String promedio) {
        Nodo nuevo = new Nodo(promedio);

        if (posicion == 0) {
            nuevo.setContinuacion(cabeza);
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getContinuacion();
            }
            nuevo.setContinuacion(actual.getContinuacion());
            actual.setContinuacion(nuevo);
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
