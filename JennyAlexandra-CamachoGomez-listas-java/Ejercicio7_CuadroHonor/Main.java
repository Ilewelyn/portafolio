/**
* Problema:Dados los nombres y promedios de 1 <=1000 <=N alumnos, imprime el cuadro de honor (En el cuadro solo pueden estar las personas que obtienen 9.5 o más)
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 26/10/2026
* Descripción: Resuelve el problema usando una lista simple propia
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaSimple nombres = new ListaSimple();
        ListaSimple promedios = new ListaSimple();

        int N = entrada.nextInt();
        entrada.nextLine();

        // leemos cada alumno y guardamos solamente a quienes tienen un promedio de 9.5 o mayor
        for (int i = 0; i < N; i++) {
            String nombre = entrada.nextLine();
            double promedio = Double.parseDouble(entrada.nextLine());

            if (promedio >= 9.5) {
                // contamos donde se insertara el nombre ordenado
                int posicion = 0;
                Nodo actual = nombres.getCabeza();

                while (actual != null &&
                       nombre.compareToIgnoreCase(actual.getNombre()) >= 0) {
                    posicion++;
                    actual = actual.getContinuacion();
                }

                nombres.agregar(nombre);
                promedios.agregarEn(posicion, String.valueOf(promedio));
            }
        }

        // mostramos los nombres que quedaron ordenados alfabeticamente
        Nodo actual = nombres.getCabeza();
        while (actual != null) {
            System.out.println(actual.getNombre());
            actual = actual.getContinuacion();
        }

        entrada.close();
    }
}
