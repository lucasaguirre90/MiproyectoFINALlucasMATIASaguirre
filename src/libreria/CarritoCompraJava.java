package libreria;

import java.util.list;


class CarritoCompra {
	
	private Arraylist<ItemCarrito>items;
	
	public CarritoCompra() {
		this.items = new Arraylist<ItemCarrito>();
	}

    public void agregarItem(Itemcarrito ic) {
        this.items.add(ic);    	
    }
    public void quitarItem(ItemCarrito ic) {
    	
    }



    public void mostrarCarrito() {
    	if(items.isEmpty())
           System.out.println("No hay productos en el carrito");
    	else {
            for(ItemCarrito i: items) {
            	i.mostrarItem();
            }
            
        }
    }
    
   public double getPrecioTotal() {
	   double total = 0;
	   if(items.isEmpty())
		   System.out.println("No Hay productos en el carrito");
	   else {
		   for(ItemCarrito i: items) {
			   total = total +i.precioItem();
			  
		   }
	   }
       return total; 
   }