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
		predecesores= new MyList();
		sucesores= new MyList();
	}
	
	public InfoNodo(E n) {
		actual = n;
		predecesores=new MyList();
		sucesores=new MyList();
	}
	
	public void setDato(E datos){
	    actual = datos;
	}
	
	public E getDato(){
	    return actual;
	}
	
	public boolean addPre(Edge C){
	    return this.predecesores.add(C);
	}
	
	public MyList<Edge> getPre(){
		return this.predecesores;
	}
	
	public void setPre(MyList<Edge> lista){
		predecesores=lista;
	}
	
	public int getPreSize(){
		return predecesores.getSize();
	}
	
	public boolean addSuc(Edge C){
	    return this.sucesores.add(C);
	}
	
	public MyList<Edge> getSuc(){
		return this.sucesores;
	}
	
	public void setSuc(MyList<Edge> lista){
		sucesores=lista;
	}
	
	public int getSucSize(){
		return sucesores.getSize();
	}
	
	public boolean removeSuc(Edge C){
		return sucesores.remove(C);
		
	}
	
	public boolean removePre(Edge C){
		return predecesores.remove(C);
		
	}
	
	public boolean equals(Object o){
	    if (!(o instanceof InfoNodo))
			return false;
	    InfoNodo c = (InfoNodo) o;
// 	    System.out.println("\nequals de infonodo, comp "+actual+" con "+c.getDato());
	    return (this.actual.equals(c.getDato()));  
	}
	
	public boolean containsPre(Edge C){
		return this.predecesores.contains(C);
	}
	public boolean containsSuc(Edge C){
		return this.sucesores.contains(C);
	}
	
	public InfoNodo clone(){
		InfoNodo aux = new InfoNodo();
		aux.setSuc(this.sucesores.clone());
		aux.setPre(this.predecesores.clone());
		aux.setDato((E) ((Node)actual).clone());
		return aux;
	}
	
	
	@Override
	public String toString() { 
	    return "InfoNodo: <" + this.actual + ">";
	}

}