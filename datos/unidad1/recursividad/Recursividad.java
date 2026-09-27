package datos.unidad1.recursividad;

public class Recursividad {

    public static void saludo(int total, String nombre) {
        if (total <= 0) {
            return;
        } else {
            System.out.println("Hola " + nombre);
            saludo(total - 1, nombre);
        }
    }

    public static void cuentaRegresiva(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.print(n + " ");
            cuentaRegresiva(n - 1);
        }
    }



    public static int sumaRecursividad(int[] datos, int longitud) {
		// si ya no quedan elementos por sumar, la suma es 0
        if (longitud <= 0) {
            return 0;
        } else {
 		// Toma el elemento en la posición actual 
        	// y le suma el resultado de la llamada recursiva con un elemento menos
		return datos[longitud - 1] + sumaRecursividad(datos, longitud - 1);
            
        }
    }

    public static void main(String[] a) {
        //saludo(10, "Ale");
        //cuentaRegresiva(10);

        int[] numeros = {15,6};

        System.out.println("Suma: " + sumaRecursividad(numeros, numeros.length));
    }
}

