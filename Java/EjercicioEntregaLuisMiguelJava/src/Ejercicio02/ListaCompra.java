package Ejercicio02;

import java.util.ArrayList;

public class ListaCompra {
	private ArrayList<Producto> productos;

    public ListaCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 100) {
            productos.add(producto);
            System.out.println("Producto '" + producto.getNombre() + "' agregado a la lista.");
        } else {
            System.out.println("No se pueden agregar más productos. La lista está llena.");
        }
    }

    public void tacharProducto(Producto producto) {
        productos.remove(producto);
        System.out.println("Producto '" + producto.getNombre() + "' tachado de la lista.");
    }

    public void verLista() {
        if (productos.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de Compra:");
            for (Producto p : productos) {
                System.out.println("- " + p.getNombre() + " (" + p.getCantidad() + ")");
            }
        }
    }

}
