/**
* Problema: Carlitos fue a la tienda con su mama a comprar el mandado, y vio un estante con cajas de dulces, entonces Carlitos le pide a su mama que si le puede comprarle algunas cajas, su 
* mama dijo que si pero que solo agarrara cajas y que si agarraba una caja tenia que agarrar las que estában junto para que no se tarde en ver cual escoger, Carlitos acepta el trato y va a  * agarrarlos, como su mama solo le permitio llevarse cajas y que solo se podia llevar cajas que estuvieran juntas, entonces decide llevarse lo maximo de dulces posible, pero no sabe cuanto  * es el maximo de dulces que se puede llevar, entonces decides ayudarlo para saber la suma total de dulces que Carlitos se puede llevar
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // leemos cuantas cajas hay y cuantas puede llevar Carlitos
        int N = entrada.nextInt();
        int K = entrada.nextInt();

        ListaSimple cajas = new ListaSimple(); // creamos la lista de cajas

        // guardamos los dulces de cada caja en la lista
        for (int i = 0; i < N; i++) {
            int cantidadDulces = entrada.nextInt();
            cajas.agregar(cantidadDulces);
        }

        // mostramos la mayor cantidad de dulces que puede llevar
        System.out.println(cajas.sumaMaxima(K));

        entrada.close(); // cerramos la entrada de datos
    }
}
