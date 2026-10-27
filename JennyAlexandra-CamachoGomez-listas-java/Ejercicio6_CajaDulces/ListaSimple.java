/**
* Problema: Carlitos fue a la tienda con su mama a comprar el mandado, y vio un estante con cajas de dulces, entonces Carlitos le pide a su mama que si le puede comprarle algunas cajas, su 
* mama dijo que si pero que solo agarrara cajas y que si agarraba una caja tenia que agarrar las que estában junto para que no se tarde en ver cual escoger, Carlitos acepta el trato y va a  * agarrarlos, como su mama solo le permitio llevarse cajas y que solo se podia llevar cajas que estuvieran juntas, entonces decide llevarse lo maximo de dulces posible, pero no sabe cuanto  * es el maximo de dulces que se puede llevar, entonces decides ayudarlo para saber la suma total de dulces que Carlitos se puede llevar
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/

public class ListaSimple {

    private Nodo cabeza; // aqui empieza la lista
    private Nodo ultimo; // apunta a la ultima caja para agregar mas rapido
    private int cantidad = 0; // cuenta cuantas cajas se han agregado

 public void agregar(int dulces) {
    Nodo nuevo = new Nodo(dulces); // creamos una caja nueva

    // si es la primera caja, sera el inicio de la lista
    if (cabeza == null) {
        cabeza = nuevo;
        ultimo = nuevo;
    } else {
        // conectamos la ultima caja con la nueva
        ultimo.setContinuacion(nuevo);
        ultimo = nuevo;
    }

    cantidad++; // contamos la caja que se agrego
}
public int sumaMaxima(int K) {
    Nodo actual = cabeza;
    int suma = 0;
    int mayor;

    // sumamos las primeras K cajas
    for (int i = 0; i < K; i++) {
        suma += actual.getDulces();
        actual = actual.getContinuacion();
    }

    mayor = suma;

    // regresamos al inicio para revisar los grupos que siguen
    actual = cabeza;

    // avanzamos hasta la primera caja que sale del grupo inicial
    for (int i = 0; i < K; i++) {
        actual = actual.getContinuacion();
    }

    // movemos el grupo una caja a la vez
    for (int i = K; i < cantidad; i++) {
        // buscamos la caja que sale del grupo
        Nodo sale = cabeza;

        for (int j = 0; j < i - K; j++) {
            sale = sale.getContinuacion();
        }

        // quitamos la caja anterior y agregamos la nueva
        suma = suma - sale.getDulces() + actual.getDulces();

        if (suma > mayor) {
            mayor = suma;
        }

        actual = actual.getContinuacion();
    }

    return mayor;
	}
}
