/**
* Problema: Escribe un programa que lea una cadena (solo minúsculas, sin acentos, sin espacios, sin la "ñ") 
*de máximo 1000. Y el programa nos dirá cuantas veces aparece cada letra del alfabeto
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.next(); //entrada.next optienes la palabra que escribas

        ListaSimple lista = new ListaSimple();

        for (int i = 0; i < palabra.length(); i++) { //aqui es donde indica cuantas letras tiene una palabra
            lista.agregar(palabra.charAt(i)); //palabra.charAt(i)extrae una letra segun su posicion
        }

        lista.mostrar();
        System.out.println();

        System.out.println("Cantidad de letras: " + lista.getCantidad());

        entrada.close();
    }
}
