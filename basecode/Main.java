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
	
	Edge p3 = new Edge("dos","uno");
	
	Edge p4 = new Edge("uno","pepe");
	
	Node n1 = new Node("pepe");
	Node n2 = new Node("uno");
	Node n3 = new Node("dos");
	
	
// 	if (n2.equals(n1))
// 	    System.out.println("Nodos iguales");
// 	else
// 	    System.out.println("Nodos dis");
// 	
// 	if (p2.equals(p1))
// 	    System.out.println("Edges iguales");
// 	else
// 	    System.out.println("Edges dis");
// 	
// 	MyList l1= new MyList(); 
// 	
// 	if (!l1.add(p1)) 
// 	    System.out.println("p1 dio peo");
// 	
// 	System.out.println(l1);
// 	    
// 	if (l1.remove(p1))
// 	    System.out.println("\nelimino p1\n");
// 	
// 	System.out.println(l1);
// 	System.out.println("head:" + l1.getHead());
// 	System.out.println("Tail:" + l1.getTail());
// 	System.out.println("Size:" + l1.getSize());
// 	
// // 	if (!l1.add(p1)) 
// // 	    System.out.println("p1 dio peo");
// 
// 	if (!l1.add(p2)) 
// 	    System.out.println("p2 dio peo");
// 	    
// 	if (!l1.add(n1)) 
// 	    System.out.println("n1 dio peo");
// 	    
// 	if (!l1.add(n2)) 
// 	    System.out.println("n2 dio peo");
// 	    
// 	
// 	if (l1.contains(p1)) 
// 	    System.out.println("tiene p1\n");
// 	    
// 	if (l1.contains(p2)) 
// 	    System.out.println("tiene p2\n");
// 	
// 	if (l1.contains(n1)) 
// 	    System.out.println("tiene n1\n");
// 	
// 	if (l1.contains(n2)) 
// 	    System.out.println("tiene n2\n");
// 	    
// 	//LISTA 2!!
// 	MyList l2= new MyList();
// 	
// 	if (!l2.add(p1)) 
// 	    System.out.println("p1 dio peo");
// 
// 	if (!l2.add(p2)) 
// 	    System.out.println("p2 dio peo");
// 	    
// 	if (!l2.add(n1)) 
// 	    System.out.println("n1 dio peo");
// 	
// // 	int i=0;
// // 	while (i<l1.getSize()){
// 	    System.out.println(l1);
// // 	    i++;
// // 	}
// 	
// 	if (!l1.add(p3)) 
// 	    System.out.println("n1 dio peo");
// 	
// 	System.out.println(l1);
// // 	PRUEBA DE CONCATENACION
// 	MyList l3= new MyList();
// 	System.out.println("\nPRUEBA DE CONCATENACION");
// // // 	l3 = l1.clone();
// 	System.out.println("\n L1 \n: "+l1);
// 	System.out.println("\n L2 \n: "+l2);
// 
// 
// 	l3 = l1.concatenate(l2);
// // 	
// // // 	int i=0;
// // // 	while (i<l3.getSize()){
// // // 	    System.out.println("pos " + i + ": " + l3.get(i));
// // // 	    i++;
// // // 	}
// 	System.out.println("\n L3 \n: "+l3);
// 	System.out.println("head:" + l3.getHead());
// 	System.out.println("Tail:" + l3.getTail());
// 	
// 	System.out.println("\n AHORA OTRA VEZ CON L2 \n: "+l2);
// 
// 	l3 = l3.concatenate(l2);
// 	System.out.println("\n L3 \n: "+l3);
// 	System.out.println("head:" + l3.getHead());
// 	System.out.println("Tail:" + l3.getTail());
// 	
// 	
// 	if (l1.equals(l2)) System.out.println("l1 y l2 son iguales\n");
	
	DigraphTablaDeHash grafo = new DigraphTablaDeHash();
	
	if (grafo.add(n1)) System.out.println("metio n1\n");
	if (grafo.add(n2)) System.out.println("metio n2\n");
	if (grafo.add(n3)) System.out.println("metio n3\n");
	
// 	if (grafo.contains(n3.getId())) System.out.println("Tiene a \n"+n3);
	
// 	if (grafo.add(p1)) System.out.println("metio edge "+ p1);
// 	System.out.println("\n" + grafo + "\n");
	
// 	if (grafo.contains(p1.getSrc(),p1.getDst())) System.out.println("\ntiene "+ p1);
// 	
	
	if (!grafo.add(p1)) System.out.println("No metio edge "+ p1);
	if (!grafo.add(p2)) System.out.println("No metio edge "+ p2);
	if (!grafo.add(p3)) System.out.println("No metio edge "+ p3);
	
// 	if (grafo.remove(p2.getSrc(),p2.getDst())) System.out.println("elimino p1\n");
	

	
	
	
// 	System.out.println("\n PRUEBA DE CLON! \n\n");
		
	DigraphTablaDeHash grafo2 = new DigraphTablaDeHash();
	grafo2 = (DigraphTablaDeHash) grafo.clone();

	if (grafo.add(p4)) System.out.println("metio edge "+ p4);
	
	System.out.println("\nGrafo1: " + grafo + "\n");
// 	if (grafo2.contains(n3.getId())) System.out.println("\ntiene n3!!!\n");
	System.out.println("\nGrafo2: " + grafo2 + "\n");
// 	System.out.println("\nEDges GRAFO2:!! \n" + grafo2.getEdges() + "\n");

// 	System.out.println("\nNODOOOOS GRAFO:!! \n" + grafo.getNodes() + "\n");
// 	System.out.println("\n EDGES GRAFO1: \n" + grafo.getEdges() + "\n");
// 	System.out.println("\n EDGES GRAFO1: \n" + grafo.getEdges() + "\n");
// 	System.out.println("\n EDGES GRAFO1: \n" + grafo.getEdges() + "\n");
	
// 	System.out.println("InDegree("+n1+"): "+grafo.getInDegree(n1.getId()));
// 	System.out.println("InDegree("+n2+"): "+grafo.getInDegree(n2.getId()));
// 	System.out.println("InDegree("+n3+"): "+grafo.getInDegree(n3.getId()));
// 	System.out.println("OutDegree("+n1+"): "+grafo.getOutDegree(n1.getId()));
// 	System.out.println("OutDegree("+n2+"): "+grafo.getOutDegree(n2.getId()));
// 	System.out.println("OutDegree("+n3+"): "+grafo.getOutDegree(n3.getId())+"\n\n\n");
// 	
// 	System.out.println("InDegree("+n1+"): "+grafo2.getInDegree(n1.getId()));
// 	System.out.println("InDegree("+n2+"): "+grafo2.getInDegree(n2.getId()));
// 	System.out.println("InDegree("+n3+"): "+grafo2.getInDegree(n3.getId()));
// 	System.out.println("OutDegree("+n1+"): "+grafo2.getOutDegree(n1.getId()));
// 	System.out.println("OutDegree("+n2+"): "+grafo2.getOutDegree(n2.getId()));
// 	System.out.println("OutDegree("+n3+"): "+grafo2.getOutDegree(n3.getId()));
	
	int maxN = 1000;
	DigraphTablaDeHash d1 = new DigraphTablaDeHash();
	for (int i = 0; i < maxN; i++) {
	    Node n = new Node("Nodo_"+i);
	    d1.add(n);
	}
	System.out.println("AGREGANDO EDGES... \n");

	for (int i = 0; i < maxN; i += 2) {
	    Node ns1 = new Node("Nodo_"+i);

	    for (int j = 1; j < maxN; j += 2) {
		Node ns2 = new Node("Nodo_"+j);
		Edge a = new Edge(ns1.getId(), ns2.getId());
		
		System.out.println("AGREGANDO: "+ a);

		boolean b2 = d1.add((Edge) a.clone());
	     }
	 }
	 	System.out.println("Imprimiendo... \n");

	 
	 	System.out.println("\n" + d1 + "\n");
	Node m= new Node("Nodo_0");
	System.out.println("Tiene a \n"+ m);
	if (d1.contains(m.getId())) System.out.println("\ntiene!!!\n"+m);
	if (d1.remove(m.getId())) System.out.println("elimino \n"+ m);
// 	System.out.println("\n" + d1 + "\n");

	 
	
    }//void main
    
}//class Main