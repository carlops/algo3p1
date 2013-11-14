/**
 * Archivo: InfoNodo.java
 * Descripcion: 
 * Autor: 
 * Fecha: 
 */

public class InfoNodo<E>{
	private E actual;
	private MyList<Edge> predecesores;
	private MyList<Edge> sucesores;
	
	public InfoNodo() {
		actual = null;
		predecesores=null;
		sucesores=null;
	}
	
	public InfoNodo(E n) {
		actual = n;
		predecesores=null;
		sucesores=null;
	}
	
	public void setDato(E datos){
	    actual = datos;
	}
	
	public E getDato(){
	    return actual;
	}
	
	public void addPre(Edge C){
	    this.predecesores.add(C);
	}
	
	public void addSuc(Edge C){
	    this.sucesores.add(C);
	}
	
	public MyList<Edge> getPre(){
		return this.predecesores;
	}
	
	public MyList<Edge> getSuc(){
		return this.sucesores;
	}
	
	public boolean equals(Object o){
	    if (!(o instanceof InfoNodo))
			return false;
	    InfoNodo c = (InfoNodo) o;
	    
	    return (this.actual.equals(c.getDato()));  
	}
	
	@Override
	public String toString() { 
	    return "InfoNodo: <" + this.actual + ">";
	}

}