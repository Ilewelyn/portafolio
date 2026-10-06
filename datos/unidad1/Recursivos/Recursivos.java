package Recursivos;
public class Recursivos {

    // Invertir una cadena
    public static String invertir(String s) {
        if (s.length() <= 1) {
            return s;
        }
        // El unico caracter va enfrente, y se invierte el resto pero ya sin su ultimo caracter

        return s.charAt(s.length() - 1) + invertir(s.substring(0, s.length() - 1));
    }

    // Contar ocurrencias de un caracter

    public static int contar(String s, char c) {
        // caso base es cero }

        if (s.isEmpty()) {
            return 0;
        }
 
        int esIgual = (s.charAt(0) == c) ? 1 : 0;
        return esIgual + contar(s.substring(1), c);
    }

    // Potencia con exponentes positivos y negativos

    public static double potencia(double base, int exp) {
        if (exp < 0) {
            return 1.0 / potencia(base, -exp);
        }
        if (exp == 0) {
            return 1.0;
        }
        return base * potencia(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(invertir("hola"));        // aloh
        System.out.println(contar("Madagascar", 'a'));    // 3
        System.out.println(potencia(2, -8));           // 256.0
        System.out.println(potencia(2, -2));          // 0.25
    }
}


