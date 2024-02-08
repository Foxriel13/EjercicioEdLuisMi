package Ejercicio02;

public class Main {

	public static void main(String[] args) {
	        ListaCompra listaCompra = new ListaCompra();
	       
	        listaCompra.agregarProducto(new Producto("Leche",2));;
	        listaCompra.agregarProducto(new Producto("Pan", 2));
	        listaCompra.agregarProducto(new Producto("Huevos", 12));
	        
	    
	        listaCompra.verLista();
	        
	       
	        listaCompra.tacharProducto(new Producto("Pan", 2));

	   
	        listaCompra.verLista();
	    }

}
