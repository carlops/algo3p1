/**
 * Archivo: Caja.java
 * Descripcion: 
 * Autor: 
 * Fecha: 
 */

     public class Caja<E>{
	E data;
	Caja siguiente;
	
	public Caja() {
	    this.data = null;
	    this.siguiente=null;
	}
    }
// public class Caja<D> {
// 
//     private D datos;
//     private Caja siguiente;
//     
//     public Caja(D datos) {
// 	this.datos = datos;
// 	this.siguiente=null;
//     }
//     
//     public void setDato(D datos){
// 	this.datos = datos;
//     }
//     
//     public D getDato(){
// 	return this.datos;
//     }
//     
//     public void  setSig(Caja C){
// 	this.siguiente = C;
//     }
//     
//     public Caja getSig(){
// 	return this.siguiente;
//     }
//     
//     public boolean equals(Object o){
// 	if (!(o instanceof Caja))
// 	    return false;
// 	Caja c = (Caja) o;
// 	
// 	return (this.datos.equals(c.datos));  
//     }
//     
//     public String toString() { 
// 	return "Caja: <" + this.datos + ">";  
//     }
// 
// }