/**
 * Archivo: Node.java
 * Descripcion: Clase que almacena la informacion de un vertice
 * Autor: Eduardo Blanco
 * Fecha: Sep 2010
 */

public class Node {

    // Se asume que el id es unico
    private String id = null;

    public Node(String i){
	id = new String(i);
    }

    /**
     * Retorna una nueva arista que es copia de this.
     */
    @Override
    protected Object clone() {
		return new Node(id);
    }

    /**
     * Indica si la arista de entrada es igual a this.
     */
	public boolean equals(Object o) {
		Node d;
		
		if (!(o instanceof Node))
			return false;
		d = (Node) o;
		return d.id.equalsIgnoreCase(id);
    }

    /**
     * Retorna la representacion en String de la arista.
     */
    @Override
    public String toString() {
		return new String(id);
    }
    
    public String getId(){
		return id;
    }
    
}

// End Node.java
