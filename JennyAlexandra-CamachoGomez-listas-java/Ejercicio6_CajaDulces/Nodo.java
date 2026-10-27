
/**
* Problema: Carlitos fue a la tienda con su mama a comprar el mandado, y vio un estante con cajas de dulces, entonces Carlitos le pide a su mama que si le puede comprarle algunas cajas, su 
* mama dijo que si pero que solo agarrara cajas y que si agarraba una caja tenia que agarrar las que estában junto para que no se tarde en ver cual escoger, Carlitos acepta el trato y va a  * agarrarlos, como su mama solo le permitio llevarse cajas y que solo se podia llevar cajas que estuvieran juntas, entonces decide llevarse lo maximo de dulces posible, pero no sabe cuanto  * es el maximo de dulces que se puede llevar, entonces decides ayudarlo para saber la suma total de dulces que Carlitos se puede llevar
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/

public class Nodo {

    private int dulces; // cantidad de dulces que tiene esta caja
    private Nodo continuacion; // guarda la siguiente caja de la lista

    // al crear una caja guardamos sus dulces
    public Nodo(int dulces) {
        this.dulces = dulces;
        this.continuacion = null; // todavia no tiene otra caja conectada
    }

    // nos dice cuantos dulces tiene la caja actual
    public int getDulces() {
        return dulces;
    }

    // permite pasar a la siguiente caja
    public Nodo getContinuacion() {
        return continuacion;
    }

    // conecta esta caja con la que sigue
    public void setContinuacion(Nodo continuacion) {
        this.continuacion = continuacion;
    }
}
