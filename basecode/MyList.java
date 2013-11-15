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
    private Caja Head;
    private Caja Tail;
    
    /*
     * Constructor
     */
    public MyList() {
		size = 0;
		Head=null;
		Tail=null;
    }

    /**
     * Devuelve el primer elemento de la lista.
     */
    public Caja getHead(){
		return Head;
    }
    
    /**
     * Cambia el primer elemento de la lista.
     */
    public void setHead(Caja primera){
		Head=primera;
    }
    
    public Caja getTail(){
		return Tail;
    }
    
    public void setTail(Caja ultima){
		Tail=ultima;
    }

    /**
     * Agrega un elemento al final de la lista.
     */
    public boolean add(E element) {
		Caja aux = new Caja();
		if (aux==null)
			return false;
	  
		aux.setDato(element);
		if(size==0){
			Head = aux;
		} else{
			Tail.setSig(aux);
			aux.setAnt(Tail);
		}
		Tail = aux;
		size++;
		return true;
	}
    
    /**
     * Elimina todos los elementos de la lista. La lista queda
     * como recien creada.
     */
    public void clear(){
		Head=null;
		Tail=null;
		size=0;
    }
	
   /**
	* Determina si el elemento dado esta en la lista.
	*/
	public boolean contains(Object element){
		ListIterator<E> iter = iterator();
		
		while (iter.hasNext()) {
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
		
		if (this.size == list.size){
			ListIterator<E> iter = iterator();
			while (iter.hasNext()){
				if (!list.contains(iter.next())) 
					return false;
			}
		}
		return true;
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
		ListIterator<E> iter = iterator();
		int i=0; 
		E aux=null;
		
		while (iter.hasNext() && i<pos+1) {
			aux=iter.next();
			i++;
		}
 
        if (i<pos+1) 
			return null;
		return aux;
    }
    
    /**
     * Retorna el elemento de la clave proporsionada,
     */
     @SuppressWarnings("unchecked")
	public E getElem(Object elemento){
		ListIterator<E> iter = iterator(); 
		E aux=null;
		
// 		System.out.println("\n Lo que estoy buscando:" + elemento );
        while (iter.hasNext()){
			aux= iter.next();
// 			System.out.println("\n GetElem:" + aux );
			if (elemento.equals(aux)){
// 				System.out.println("\n Lo encontreeeeeeeeeeeeeeeeeeeeeeeee");
				return aux;
			}
        }
//         System.out.println("\n No encontre nada en getElem");
		return null;
    }
    
   /**
	*
	*concatena dos listas, retorna l1 + l2
	*/
	
    public MyList<E> concatenate(MyList<E> l1,MyList<E> l2){
		
		if (l1.getHead()==null) return l2;
		if (l2.getHead()==null) return l1;
		l1.add((E)l2.getHead().getDato());
		l1.setTail(l2.getTail());
		return l1;
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
		ListIterator<E> iter = iterator();
		while (iter.hasNext()) {
			if (iter.next().equals(element)) {
				iter.unlink();
				size--;
				return true;
			}
        } 
        return false;
    }

    /**
     * Retorna el numero de elementos en la lista
     */
    public int getSize(){
		return size;
    }
    
	public String toString() {
		ListIterator<E> iter = iterator();
		String ret;
		ret="Lista:\n";
		while (iter.hasNext()) {
			ret+="\t"+iter.next()+"\n";
		}
		return ret;
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
