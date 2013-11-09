/*
 * Archivo: Main.java 
 * Descripcion: Archivo de prueba. Prueba todas las
 * funcionalidades implementadas en forma ordenada y clara.
 * Autor: X (carnet) y Y (carnet). Grupo Z
 * Fecha:
 */

public class Main {



    public static void main(String args[]) {
    
    Edge p1 = new Edge("hey","bobo");
    
    Edge p2 = new Edge("hey","bobo");
    
    Node n1 = new Node("primero");
    Node n2 = new Node("segundo");
    
    if (!n2.equals(n1))
	System.out.println("Nodos dis");
    
    if (p2.equals(p1))
	System.out.println("iguales");
	
    System.out.println(n1);
    System.out.println(n2);
    
    MyList l1= new MyList(); 
    if (!l1.add(p1)) 
	System.out.println("1 dio peo");
	
    if (!l1.add(n1)) 
	System.out.println("2 dio peo");
	
    if (!l1.add(p2)) 
	System.out.println("3 dio peo");
	
    if (!l1.add(n2)) 
	System.out.println("4 dio peo");
	
    
    if (l1.contains(p1)) 
	System.out.println("tiene 1");
	
    if (l1.contains(p2)) 
	System.out.println("tiene 2");
    
    if (l1.contains(n1)) 
	System.out.println("tiene 3");
    
    if (l1.contains(n2)) 
	System.out.println("tiene 4");
    
    
    }

}