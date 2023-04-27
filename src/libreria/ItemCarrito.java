
package libreria;

public class ItemCarrito {
    Producto producto;
    int cantidad;
    boolean copiaFisica;
    
    
    
    
    
    
    
    public double precioItem() {
    	if (producto instanceof libro) {
    		if (copiaFisica) {
    			return producto.getPrecio() * 1.18 * cantidad;
    		} else {
    			return producto.getPrecio() * 1.08 * cantidad;
    		}
    		}
    	}   else {
    		  if (copiaFisica) {
    			  return producto.getPrecio() * 1.22 * cantidad;
    		  } else {
    			  return producto.getPrecio() * 1.22 * cantidad;
    		  }
    	
    	}
    }
    

    public ItemCarrito(Producto producto, int cantidad) {
    	
    	this.producto = producto;
    	this.cantidad = canitdad;
    	
    }
    
    public void mostrarItem() {
    	System.out.println("Producto: " + producto.getNombre() + " - cantidad: " + cantidad);
    	try {
    		System.out.println("Subtotal: " + precio());
    	} catch (NoHayStockException e) {
    		System.out.prinln("No hay stock del producto");
    	}
    	System.out.println("-----------------------------------------------------------");
     }
    
    	}

