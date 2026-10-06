public class Ejercicios {

    public static void main(String[] args) {
        // ===== Ejercicio 1: Contar vocales =====
        String texto = "Recursividad en Java";
        int totalVocales = vocales(texto);
        System.out.println("La cadena es: \"" + texto + "\"");
        System.out.println("Número de vocales: " + totalVocales);

        System.out.println();

        // ===== Ejercicio 2: Potencia =====
        System.out.println(potencia(2, 10));
        System.out.println(potencia(5, 0));
        System.out.println(potencia(2, -2));
    }

    // ----- Método recursivo: contar vocales -----
    public static int vocales(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }

        char c = Character.toLowerCase(cadena.charAt(0));
        int esVocal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return esVocal + vocales(cadena.substring(1));
    }

    // ----- Método recursivo: potencia por exponenciación binaria -----
    public static double potencia(double base, int exp) {
        if (exp < 0) {
            return 1.0 / potencia(base, -exp);
        }

        if (exp == 0) {
            return 1.0;
        }

        if (exp % 2 == 0) {
            double mitad = potencia(base, exp / 2);
            return mitad * mitad;
        } else {
            return base * potencia(base, exp - 1);
        }
    }
}
