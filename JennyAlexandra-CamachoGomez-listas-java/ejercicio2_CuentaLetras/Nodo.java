
/**
* Problema: Escribe un programa que lea una cadena (solo minúsculas, sin acentos, sin espacios, sin la "ñ") 
*de máximo 1000. Y el programa nos dirá cuantas veces aparece cada letra del alfabeto
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/

public class Nodo{
	//declaramos los atributos del nodo
	private char letra;
	private Nodo continuacion;

	//se agrega el constructor 
	public Nodo(char letra){ //recibe una letra por cada nodo
		this.letra = letra; //aqui guarda en el atributo del objeto la letra que ya fue recibida
		this.continuacion = null; //indica que el nodo no esta conectado con el otro
	}

	//agregamos los metodos getters y setters

	//permite consultar letra
	public char getLetra(){
		return letra;
	}

	//consulta el siguiente nodo
	public Nodo getContinuacion() {
		return continuacion;
	}

	//establece la continuacion del siguiente nodo
	public void setContinuacion(Nodo continuacion){
		this.continuacion = continuacion;
	}
}
