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
	
	Node n1 = new Node("pepe");
	Node n2 = new Node("uno");
	Node n3 = new Node("dos");
	
	MyList l1= new MyList(); 
	/*
	if (n2.equals(n1))
	    System.out.println("Nodos iguales");
	else
	    System.out.println("Nodos dis");
	
	if (p2.equals(p1))
	    System.out.println("Edges iguales");
	else
	    System.out.println("Edges dis");
	
	
	if (!l1.add(p1)) 
	    System.out.println("p1 dio peo");
	
	System.out.println(l1);
	    
	if (l1.remove(p1))
	    System.out.println("\nelimino p1\n");
	
	System.out.println(l1);
	System.out.println("head:" + l1.getHead());
	System.out.println("Tail:" + l1.getTail());
	System.out.println("Size:" + l1.getSize());
	*/
	if (!l1.add(n1)) 
	    System.out.println("n1 dio peo");
	    
	if (!l1.add(n2)) 
	    System.out.println("n2 dio peo");
	    
	if (!l1.add(p1)) 
	    System.out.println("p1 dio peo");

	if (!l1.add(p2)) 
	    System.out.println("p2 dio peo");
	    
	
	if (l1.contains(n1)) 
	    System.out.println("tiene n1\n");
	
	if (l1.contains(n2)) 
	    System.out.println("tiene n2\n");
	
	if (l1.contains(p1)) 
	    System.out.println("tiene p1\n");
	    
	if (l1.contains(p2)) 
	    System.out.println("tiene p2\n");
	    
	//LISTA 2!!
	MyList l2= new MyList();
	
	if (!l2.add(p1)) 
	    System.out.println("p1 dio peo");

	if (!l2.add(p2)) 
	    System.out.println("p2 dio peo");
	    
	if (!l2.add(n1)) 
	    System.out.println("n1 dio peo");
	
// 	int i=0;
// 	while (i<l1.getSize()){
	    System.out.println(l1);
// 	    i++;
// 	}
	
	if (!l1.add(p3)) 
	    System.out.println("n1 dio peo");
	
	System.out.println(l1);
	/* PRUEBA DE CONCATENACION */
// 	MyList l3= new MyList();
// 	System.out.println("\nPRUEBA DE CONCATENACION");
// 	l3 = l1.clone();
// 	l3 = l1.concatenate(l2);
// 	
// 	int i=0;
// 	while (i<l3.getSize()){
// 	    System.out.println("pos " + i + ": " + l3.get(i));
// 	    i++;
// 	}
// 	System.out.println("\n L3 \n: "+l3);
// 	System.out.println("head:" + l3.getHead());
// 	System.out.println("Tail:" + l3.getTail());
// 	
// 	if (l1.equals(l2)) System.out.println("l1 y l2 son iguales\n");
// 	
	DigraphTablaDeHash grafo = new DigraphTablaDeHash();
	
	if (grafo.add(n1)) System.out.println("metio n1\n");
	if (grafo.add(n2)) System.out.println("metio n2\n");
	if (grafo.add(n3)) System.out.println("metio n3\n");
	
	if (grafo.contains(n3.getId())) System.out.println("\ntiene n3!!!\n");
	
	if (grafo.add(p1)) System.out.println("metio edge p1\n");
	if (grafo.add(p2)) System.out.println("metio edge p2\n");
	if (grafo.add(p3)) System.out.println("metio edge p3\n");
	
	System.out.println("\n" + grafo + "\n");
	System.out.println("\n" + grafo + "\n");
	
	if (grafo.contains(p1.getSrc(),p1.getDst())) System.out.println("\ntiene "+ p1);
	
	
	if (!grafo.add(p1)) System.out.println("No metio edge "+ p1);
// 	if (grafo.add(p2)) System.out.println("metio edge "+ p2);
// 	if (grafo.remove(p2.getSrc(),p2.getDst())) System.out.println("elimino p1\n");
	System.out.println("\n" + grafo.getEdges() + "\n");
	
// 	if (grafo.remove(p1.getSrc())) System.out.println("elimino n1\n");

	System.out.println("\n NODOOOOOOS: \n" + grafo.getNodes() + "\n");
	System.out.println("\n EDGEEEEES: \n" + grafo.getEdges() + "\n");
	
	System.out.println("InDegree("+n1+"): "+grafo.getInDegree(n1.getId()));
	System.out.println("InDegree("+n2+"): "+grafo.getInDegree(n2.getId()));
	System.out.println("InDegree("+n3+"): "+grafo.getInDegree(n3.getId()));
	System.out.println("OutDegree("+n1+"): "+grafo.getOutDegree(n1.getId()));
	System.out.println("OutDegree("+n2+"): "+grafo.getOutDegree(n2.getId()));
	System.out.println("OutDegree("+n3+"): "+grafo.getOutDegree(n3.getId()));
	
	System.out.println("\n" + grafo + "\n");
	
	System.out.println("\n PRUEBA DE CLON! \n\n");
	
	DigraphTablaDeHash grafo2;
	grafo2 = (DigraphTablaDeHash) grafo.clone();
	
	if (grafo2.contains(n2.getId())) System.out.println("\ntiene n2!!!\n");
	System.out.println("\n" + grafo2 + "\n");
	System.out.println("\nOut D: " + grafo.getOutDegree(n1.getId()) + "\n");
	System.out.println("\nOut D: " + grafo.getOutDegree(n2.getId()) + "\n");
	System.out.println("\nOut D: " + grafo.getOutDegree(n3.getId()) + "\n");
	
	System.out.println("\nOut D: " + grafo2.getOutDegree(n1.getId()) + "\n");
	System.out.println("\nOut D: " + grafo2.getOutDegree(n2.getId()) + "\n");
	System.out.println("\nOut D: " + grafo2.getOutDegree(n3.getId()) + "\n");
	
	
	
    }//void main
    
}//class Main