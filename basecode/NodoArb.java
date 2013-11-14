/**
 * Archivo: NodoArb.java
 * Descripcion: Nodo Utilizado en Arboles Binarios de Busqueda 
 * Autor: 
 * Fecha: 
 */

	public class NodoArb<E>{
	private E elemento;
	private MyList<E> predecesores;
	private MyList<E> sucesores;
	private NodoArb izquierda;
	private NodoArb derecha;
	
	public NodoArb() {
		elemento=null;
		predecesores=null;
		sucesores=null;
		izquierda=null;
		derecha=null;
	}

	public void setDato(E datos){
		elemento=datos;
	}
	
	public E getDato(){
		return elemento;
	}
	
	public void  setIzq(NodoArb C){
		this.izquierda = C;
	}
	
	public NodoArb getIzq(){
		return this.izquierda;
	}
	
	public void setDer(NodoArb C){
		this.derecha = C;
	}
	
	public NodoArb getDer(){
		return this.derecha;
	}
	
	public boolean equals(Object o){
		if (!(o instanceof NodoArb))
			return false;
		NodoArb c = (NodoArb) o;
		
		return (this.elemento.equals(c.elemento)); 
	}
	
	@Override
	public String toString() { 
	    return "Nodo: <" + this.data + ">";  
	}

}