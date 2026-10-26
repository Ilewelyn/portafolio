
/**
* Problema: Escribe un programa que lea una cadena (solo minúsculas, sin acentos, sin espacios, sin la "ñ") 
*de máximo 1000. Y el programa nos dirá cuantas veces aparece cada letra del alfabeto
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/
public class ListaSimple {

    private Nodo cabeza; //se guarda al primer nodo de la lista
	private int cantidad = 0; //el atributo empieza desde cero porque la lista esta vacia

    public void agregar(char letra) {
//crear nuevo nodo
        Nodo nuevo = new Nodo(letra);

	//si la cabeza es null entonces se asigna un nodo nuevo a la cabeza
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            while (actual.getContinuacion() != null) {
                actual = actual.getContinuacion();
            }
            actual.setContinuacion(nuevo);
        }
        cantidad++;
    }

    public int getCantidad() {
  	  return cantidad; //este metodo devuelve el numero de nodos registrados sin tener que recorrer toda la lista
	}

    public void mostrar() {

        Nodo actual = cabeza; //comienza el recorrido desde el primer nodo

        while (actual != null) { //commprueba que aun exista otro nodo
		System.out.print(actual.getLetra());
            actual = actual.getContinuacion(); //continua con el siguiente nodo
        }

    }

}

