package libreria;

import java.time.localdate;

public class producto implements MiInterface{
	private String nombre;
	private String descripcion;
	provate localDate fechaAlta;
	private Double precio;
	private static final Double minPrecio =	 0.1;
	
	
	public Producto(String nombre, String descripcion, integer pesoKg, Double precio) {
		this.nombre = nombre;
		this.descriptcion = descripcion;
		this.fechaAlta = localDate.now();
		this.pesoKg = pesoKg;
		this.precio = precio;
	}

 public Producto (String nombre) {
	 this.nombre =;
	 this.fechaAlta = localDate.now();
	 this.precio = minPrecio;
 }

 public String getDescripcion() {
	 return this.descripcion;
 }
 
 public void setDescripcion(String descripcion) {
	 return this.descripcion;
 }
 
 public void setDescripcion(String descripcion) {
	 this.descripcion = descripcion;
	 }
 



}