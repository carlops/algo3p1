/*
 * Archivo: Main.java 
 * Descripcion: Archivo de prueba. Prueba todas las
 * funcionalidades implementadas en forma ordenada y clara.
 * Autor: X (carnet) y Y (carnet). Grupo Z
 * Fecha:
 */

public class Main {



    public static void main(String args[]) {
	
	Edge p1 = new Edge("pepe","uno");
	
	Edge p2 = new Edge("pepe","dos");
	
	Node n1 = new Node("Nprimero");
	Node n2 = new Node("Nsegundo");
	
	if (n2.equals(n1))
	    System.out.println("Nodos iguales");
	else
	    System.out.println("Nodos dis");
	
	if (p2.equals(p1))
	    System.out.println("Edges iguales");
	else
	    System.out.println("Edges dis");
	
	MyList l1= new MyList(); 
	
	if (!l1.add(p1)) 
	    System.out.println("p1 dio peo");

	if (!l1.add(p2)) 
	    System.out.println("p2 dio peo");
	    
	if (!l1.add(n1)) 
	    System.out.println("n1 dio peo");
	    
	if (!l1.add(n2)) 
	    System.out.println("n2 dio peo");
	    
	
	if (l1.contains(p1)) 
	    System.out.println("tiene p1\n");
	    
	if (l1.contains(p2)) 
	    System.out.println("tiene p2\n");
	
	if (l1.contains(n1)) 
	    System.out.println("tiene n1\n");
	
	if (l1.contains(n2)) 
	    System.out.println("tiene n2\n");
	
	int i=0;
	while (i<l1.getSize()){
	    System.out.println("pos " + i + ": " + l1.get(i));
	    i++;
	}
	
	if (l1.remove(p1))
	    System.out.println("\nelimino p1\n");
	
	i=0;
	while (i<l1.getSize()){
	    System.out.println("pos " + i + ": " + l1.get(i));
	    i++;
	}
	System.out.println("head:" + l1.getHead());
	
	System.out.println("Tail:" + l1.getTail());
    }
    
}