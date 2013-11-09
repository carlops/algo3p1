/**
 * Clase que implementa la interfaz List
 * Esta es una clase parametrizada con tipo (clase) E; i.e., la
 * lista contiene elementos de tipo E.
 */
public class MyList<E> implements List<E>{

    /*
     * Modelo de representacion: lista enlazada.
     *
     */
    private int size;
    public Caja Primero;
    
    /*
     * Constructor
     */
    public MyList() {
	this.size = 0;
	this.Primero=null;
    }

    /**
     * Agrega un elemento al principio de la lista.
     */
    public boolean add(E element) {
      Caja Aux = new Caja();
      if (Aux==null)
	  return false;
      Aux.data=element;

      if(this.size==0){
	  this.Primero = Aux;
      } else{
	  Aux.siguiente=this.Primero;
	  this.Primero = Aux;
      }
      this.size++;
      return true;
// 	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Elimina todos los elementos de la lista. La lista queda
     * como recien creada.
     */
    public void clear(){
	this.Primero=null;
	this.size=0;
    }

    /**
     * Determina si el elemento dado esta en la lista.
     */
    public boolean contains(Object element){
	ListIterator<E> iter = iterator();

        while (iter.hasNext()) {
	    System.out.println("hola");
            if (iter.next().equals(element))
		return true;
        } 

        return false;
    }

    /**
     * Determina si la lista dada es igual a la lista.
     */
    public boolean equals(Object o){
	MyList list;

	if (!(o instanceof MyList))
	    return false;

	list = (MyList) o;
	
	return true;
// 	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Determina si la lista es vacia.
     */
    public boolean isEmpty(){
	return size == 0;
    }

    /**
     * Retorna el elemento en la posicion pos,
     * 0 <= pos < this.getSize()
     */
    public E get(int pos){
	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Elimina el elemento que esta en la posicion pos de la lista. Si
     * la lista cambia, retorna true, sino retorna false.  
     *
     * Utilizar esta operacion puede hacer invalido los iteradores
     * sobre this
     */

    public boolean remove(int pos){
  	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Elimina el elemento dado de la lista. Si la lista cambia,
     * retorna true, sino retorna false.
     */
    public boolean remove(E element){
	throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna el numero de elementos en la lista
     */
    public int getSize(){
	return size;
    }

    /**
     * Devuelve un iterador sobre la lista.
     */
    public ListIterator<E> iterator() {
	
	return new MyListIterator(this);
// 	throw new UnsupportedOperationException("Not supported yet.");
    }
}

// End List.
