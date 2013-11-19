/*
 * Archivo: Main.java 
 * Descripcion: Archivo de prueba. Prueba todas las
 * funcionalidades implementadas en forma ordenada y clara.
 * Autor: Alejandro Guevara (09-10971) y Carlo Polisano (09-10672). Grupo 10
 * Fecha: 18/11/2013
 */

public class Main {


    public Main() {
    }
    private Digraph llenarGrafo(int maxN){
	Digraph d1 = new DigraphTablaDeHash();
	// Se agregan maxN Vertices al grafo
	for (int i = 0; i < maxN; i++) {
	    Node n = new Node("Nodo_"+i);
	    d1.add(n);
	}
// 	System.out.println("AGREGANDO EDGES... \n");

	//Se agregan cada 2 vertices maxN/2 aristas
	for (int i = 0; i < maxN; i += 2) {
	    Node ns1 = new Node("Nodo_"+i);

	    for (int j = 1; j < maxN; j += 2) {
		Node ns2 = new Node("Nodo_"+j);
		Edge a = new Edge(ns1.getId(), ns2.getId());
		
// 		System.out.println("AGREGANDO: "+ a);

		boolean b2 = d1.add((Edge) a.clone());
	     }
	 }
	 return d1;
    }//Fin de llenarGrafo
    
    
    public static void main(String args[]) {
		Main m = new Main();
		int numNodos = 10;
		String Ingreso; 
		
		System.out.println("\n\nMain PRUEBA! \n");
		System.out.println("Se agregaran \n"+numNodos+" Nodos\n"+
				      numNodos/2+" Aristas por cada 2 Nodos");
			
			
		System.out.println("Ingrese el numero de vertices "+
		                    "a agregar: \n");
		Digraph d1 = m.llenarGrafo(numNodos);
	 	System.out.println("Imprimiendo...");
	 	System.out.println("\n" + d1 + "\n");
	 	
		System.out.println("Probando Eliminar Nodo");
		Node n= new Node("Nodo_0");
	 	System.out.println("Se Eliminara: "+n);
		if (d1.remove(n.getId())) System.out.println("Elimino "+n);
	 		 	
	 	System.out.println("Imprimiendo...");
	 	System.out.println("\n" + d1 + "\n");
      
		System.out.println("Probando Eliminar Edge");
		Edge e = new Edge("Nodo_2","Nodo_9");
	 	System.out.println("Se Eliminara: "+e);
		if (d1.remove(e.getSrc(),e.getDst())) System.out.println("Elimino "+e);
		
	 	System.out.println("Imprimiendo...");
	 	System.out.println("\n" + d1 + "\n");
		
		n= new Node("Nodo_2");
		System.out.println("\nProbando getSucs con: "+n);
		System.out.println("\n"+ d1.getSucs(n.getId())+"\n");
		
		System.out.println("\nProbando getPreds con: "+n);
		System.out.println("\n"+ d1.getPreds(n.getId())+"\n");
		
		System.out.println("\nProbando getInDegree de: "+n);
		System.out.println("\n"+ d1.getInDegree(n.getId()) +"\n");
		
		System.out.println("\nProbando getOutDegree de: "+n);
		System.out.println("\n"+ d1.getOutDegree(n.getId()) +"\n");
		
		System.out.println("\nProbando getNodes");
		System.out.println("\n"+ d1.getNodes() +"\n");
		
		System.out.println("\nProbando getEdges");
		System.out.println("\n"+ d1.getEdges() +"\n");

		System.out.println("\nProbando clone, clona el grafo creado"+
					"en uno nuevo");
		Digraph d2 =(Digraph) d1.clone();
		System.out.println("Imprimiendo...");
	 	System.out.println("\n" + d2 + "\n");

	 
	
    }//void main
    
}//class Main