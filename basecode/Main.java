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
    Node n2 = new Node("primero");
    
    if (!n2.equals(n1))
	System.out.println("Nodos dis");
    
    if (p2.equals(p1))
	System.out.println("iguales");
	
    System.out.println(n1);
    System.out.println(n2);
    }

}