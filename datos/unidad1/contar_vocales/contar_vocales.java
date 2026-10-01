package datos.unidad1.contar_vocales;

public class contar_vocales {
    public static void main(String[] args) {
        String texto = "Recursividad en Java";
        int totalVocales = vocales(texto); // llamamos al método recursivo
        System.out.println("La cadena es: \"" + texto + "\"");
        System.out.println("Número de vocales: " + totalVocales);
    }

    // 2. Método recursivo
    public static int vocales(String cadena) {
        // Caso base: cadena vacía
        if (cadena.isEmpty()) {
            return 0;
        }
        // Primer carácter
        char c = Character.toLowerCase(cadena.charAt(0));
        // Verificar si es vocal
        int esVocal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        // Llamada recursiva con el resto de la cadena (sin el primer carácter)
        return esVocal + vocales(cadena.substring(1));
    }
}


//Ejercicio 1 ---------------------- POTENCIA ------------
public class Potencia {

    public static double potencia(double base, int exp) {
        // Caso base: cualquier número elevado a 0 es 1
        if (exp == 0) {
            return 1.0;
        }
        // Exponente negativo: base^-n = 1 / base^n
        // (se usa -(exp + 1) para evitar desbordamiento con Integer.MIN_VALUE)
        if (exp < 0) {
            return 1.0 / (base * potencia(base, -(exp + 1)));
        }
        // Exponente par: b^n = (b^(n/2))^2
        if (exp % 2 == 0) {
            double mitad = potencia(base, exp / 2);
            return mitad * mitad;
        }
        // Exponente impar: b^n = b * b^(n-1)
        return base * potencia(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println("potencia(2, 10) = " + potencia(2, 10));   // 1024.0
        System.out.println("potencia(5, 0) = " + potencia(5, 0));     // 1.0
        System.out.println("potencia(2, -2) = " + potencia(2, -2));   // 0.25
    }
}
