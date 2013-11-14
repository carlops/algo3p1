/**
* Clase que implementa la interfaz TreeIterator.
* Es una interface parametrizada con tipo (clase) E.
*/

public class MyTreeIterator<E> implements TreeIterator<E>{

	private MyTree<E> elemento;
	private NodoArb actual;
	
	/**
	* Comprueba que exista un proximo elemento a la izquierda.
	*/
	public boolean hasLeft(){
		return (actual.getIzq()!=null);
	}
	
	/**
	* Comprueba que exista un proximo elemento a la derecha.
	*/
	public boolean hasRight(){
		return (actual.getDer()!=null);
	}
	
	/**
	* Devuelve el elemento asociado y avanza el iterador
	* a la izquierda.
	*/
	public E nextLeft(){
		actual=actual.getIzq();
// return actual.id;
	}

	/**
	* Devuelve el elemento asociado y avanza el iterador
	* a la derecha.
	*/
	public E nextRight();

	/**
	* Remueve del arbol el ultimo elemento retornado por next()
	*/
	public void unlink();
}

// End TreeIterator.