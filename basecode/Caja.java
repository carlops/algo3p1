/**
 * Archivo: Caja.java
 * Descripcion: 
 * Autor: 
 * Fecha: 
 */

     public class Caja<E>{
	private E data;
	private Caja siguiente;
	
	public Caja() {
	    data = null;
	    siguiente=null;
	}

	public void setDato(E datos){
	    data = datos;
	}
	
	public E getDato(){
	    return data;
	}
	
	public void  setSig(Caja C){
	    this.siguiente = C;
	}
	
	public Caja getSig(){
	    return this.siguiente;
	}
	
	public boolean equals(Object o){
	    if (!(o instanceof Caja))
		return false;
	    Caja c = (Caja) o;
	    
	    return (this.data.equals(c.data));  
	}
	
	public String toString() { 
	    return "Caja: <" + this.data + ">";  
	}

}