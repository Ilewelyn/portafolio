package datos.unidad1.genericos;

public class MainGenericos {

    public static void main(String[] args) {
        Producto<?>[] inventario = new Producto<?>[4];

        inventario[0] = new Libro("Java Basico", 299.99, 350);
        inventario[1] = new Electronico("Laptop ASUS", 15999.99, "2 anios");
        inventario[2] = new Libro("Patrones de Diseno", 499.50, 420);
        inventario[3] = new Electronico("Smartphone Samsung", 10999.00, "1 anio");

        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }
    }
}