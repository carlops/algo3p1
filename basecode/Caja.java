/**
 * Archivo: Caja.java
 * Descripcion: 
 * Autor: 
 * Fecha: 
 */
 
public class Caja<D> {

    private D datos;
    private Caja siguiente = null;
    
    public Caja(D d) {
	datos = d;
    }
    
    public setDato(D dato){
	datos = dato;
    }
    
    public D getDato(){
	return datos;
    }
    
    public setSig(Caja C){
	siguiente = C;
    }
    
    public Caja getSig(){
	return siguiente;
    }
    
    public boolean equals(Object o){
	if (!(o instanceof (Caja)))
	    return false;
	Caja c = (Caja) o;
	
	return (datos.equals(c.datos));  
    }
    
    public String toString() { 
	return "Caja: <" + datos + ">";  
    }

}