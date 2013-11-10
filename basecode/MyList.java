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
    private Caja Primero;
    
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
      Aux.setDato(element);

      if(size==0){
	  Primero = Aux;
      } else{
	  Aux.setSig(Primero);
	  Primero = Aux;
      }
      size++;
      return true;
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
	int i=0; E aux;
	
        while (iter.hasNext()) {
	    aux=iter.next();
	    System.out.println(i+" "+aux);i++;
            if (aux.equals(element))
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

///////////////////// HAY QUE ARREGLAR ESTE GET ////////////////////////////
    /**
     * Retorna el elemento en la posicion pos,
     * 0 <= pos < this.getSize()
     */
    public Caja get(int pos){
	if (pos==0) return  Primero;
	return Primero;
// 	throw new UnsupportedOperationException("Not supported yet.");
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
    }
}

// 	throw new UnsupportedOperationException("Not supported yet.");
// End List.
