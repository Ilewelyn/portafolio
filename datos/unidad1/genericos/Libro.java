package datos.unidad1.genericos;

public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getNombre()
            + " | Precio: $" + getPrecio()
            + " | Paginas: " + getExtra());
    }
}