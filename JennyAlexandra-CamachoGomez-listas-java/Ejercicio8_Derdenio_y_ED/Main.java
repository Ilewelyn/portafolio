/**
* Problema:En la primera línea, un número entero positivo, , la cantidad de números que tiene en cada lista ordenada. En la segunda línea, números ordenados de menor a mayor: la primer     
* lista. En la tercera línea, números ordenados de menor a mayor: la segunda lista.
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();

        // se lee la cantidad de numeros de cada lista
        int N = entrada.nextInt();

        // lad dos listas se agregan a una sola lista doble, que se encarga de mantener el orden descendente
        for (int i = 0; i < N * 2; i++) {
            lista.insertar(entrada.nextInt());
        }

        lista.mostrar();
        entrada.close();
    }
}
