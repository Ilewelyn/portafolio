package datos.practicos.ejercicio1;

public class Arreglos {

    static final int X = 5;

    // Fase 1: Unidimensional 

    // Tarea 1.1: Escribe un método en Java que devuelva el promedio de las temperaturas positivas y
	muestre en pantalla los índices donde la temperatura sea bajo cero.

    public static double promedioPositivasEImprimeNegativas(int[] temperaturas) {
        double suma = 0;
        int contadorPositivas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 0) {
                System.out.println("indice con temperatura bajo cero: " + i);
            } else if (temperaturas[i] > 0) {
                suma += temperaturas[i];
                contadorPositivas++;
            }
        }

        if (contadorPositivas == 0) {
            return 0;
        }
        return suma / contadorPositivas;
    }

    /*
     * Tarea 1.2:
     * ¿Por qué en Java un arreglo unidimensional no puede cambiar de tamaño en tiempo de ejecución? ¿Qué ocurre internamente 
     * en memoria cuando intentas acceder al índice temperaturas[8]?
     * Lo que es un en Java no puede cambiar de tamaño porque desde que se crea
     * se le asigna un espacio fijo para esa cantidad exacta de datos.
     * Si quisieramos más espacio, tendriamos que crear un arreglo nuevo más grande
     * y copiar los valores.
     * 
     * Si intentamos acceder a temperaturas[8] en un arreglo de 8 elementos (donde
     * las posiciones van de la 0 a la 7), Java detecta que nos estamos saliendo
     * del rango permitido y lanza la excepción ArrayIndexOutOfBoundsException,
     * lo que interrumpe el programa
     */


    // Fase 2: Bidimensional 

   // Tarea 2.1: Implementa un algoritmo que recorra la matriz y calcule:
   // 1. El total de stock por cada sucursal (suma por fila).
   // 2. La diagonal principal de la matriz.


    public static void analizarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            int total = 0;
            for (int col = 0; col < matriz[fila].length; col++) {
                total += matriz[fila][col];
            }
            System.out.println("Total sucursal " + fila + ": " + total);
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    /*
     * Tarea 2.2 (Pregunta conceptual): Explica en un comentario la diferencia en almacenamiento de
     * memoria de Java entre un arreglo bidimensional regular y un arreglo dentado (jagged array).
     * una matriz regular reserva el mismo número de columnas para todas 
     * las filas, lo que puede desperdiciar espacio si no ocupamos todas las casillas
     * 
     * Un arreglo dentado (jagged array) nos permite definir cada fila con un tamaño 
     * diferente segun lo que necesitemos, internamente, la matriz solo guarda las 
     * referencias a cada fila, asi que al darle a cada una su tamaño justo ahorramos 
     * memoria, aunque al recorrerla hay que tener mas cuidado porque las filas 
     * no miden lo mismo
     */


    // Fase 3: Tridimensional 

    // Tarea 3.1: Llena el arreglo tridimensional asignando el valor (Edificio + Piso + Pasillo + X) en cada
    // celda utilizando bucles for anidados.

    public static int[][][] llenarNave(int edificios, int pisos, int pasillos) {
        int[][][] nave = new int[edificios][pisos][pasillos];

        for (int e = 0; e < edificios; e++) {
            for (int p = 0; p < pisos; p++) {
                for (int pa = 0; pa < pasillos; pa++) {
                    nave[e][p][pa] = e + p + pa + X;
                }
            }
        }
        return nave;
    }

    // Tarea 3.2: Recorre el arreglo e imprime únicamente las coordenadas [e][p][p] donde el valor total
    // acumulado sea un número par

    public static void imprimirCoordenadasPares(int[][][] nave) {
        for (int e = 0; e < nave.length; e++) {
            for (int p = 0; p < nave[e].length; p++) {
                for (int pa = 0; pa < nave[e][p].length; pa++) {
                    if (p == pa && nave[e][p][pa] % 2 == 0) {
                        System.out.println("[" + e + "][" + p + "][" + pa + "] = " + nave[e][p][pa]);
                    }
                }
            }
        }
    }

    /*
     * Tarea 3.3 (Análisis crítico): Responde en el código: Si el sistema creciera a 100 edificios, 50 pisos
     * y 50 pasillos, ¿qué problemas de rendimiento o legibilidad genera el uso de arreglos de 3
     * dimensiones en comparación con la Programación Orientada a Objetos (p. ej., usar listas de objetos
     * Edificio)?
     * Trabajar con un arreglo 3D de 250,000 celdas se vuelve muy confuso porque 
     * dependemos solo de números e idices ([e][p][pa]) y es fácil equivocarse de orden 
     * al recorrerlo y el codigo se llena de bucles anidados dificiles de leer
     * pero si quisiéramos guardar mas datos (como el nombre del edificio o si el 
     * pasillo está en mantenimiento), un arreglo de enteros no lo permitiria
     * 
     * usar poo hace que el codigo sea mucho más 
     * claro y facil de mantener
     * Cada objeto guarda sus propios datos y metodos, 
     * podemos agregar o quitar elementos sin depender de tamaños fijos, y al leer 
     * el código entendemos directo que hace sin perdernos en tantos corchetes
     */


    // main
    public static void main(String[] args) {
        // Fase 1
        int[] temperaturas = {12, -3, 4, 8, -1, X, 15, 2};
        double promedio = promedioPositivasEImprimeNegativas(temperaturas);
        System.out.println("Promedio de temperaturas positivas: " + promedio);

        System.out.println();

        // Fase 2
        int[][] matriz = {
            {10, 20, 15, 5},
            {8, X + 5, 12, 30},
            {25, 14, 0, 18},
            {2, 9, 11, 40}
        };
        analizarMatriz(matriz);

        System.out.println();

        // Fase 3
        int[][][] nave = llenarNave(2, 3, 3);
        imprimirCoordenadasPares(nave);
    }
}