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
			return true; // Recorrio toda la lista y son iguales
		}
		return false;//tamano diferentes, listas distintas
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
     * Elimina el elemento que esta en la posicion pos de la lista. Si
     * la lista cambia, retorna true, sino retorna false.  
     *
     * Utilizar esta operacion puede hacer invalido los iteradores
     * sobre this
     */
    public boolean remove(int pos){
		if (size<pos) return false;
		ListIterator<E> iter = iterator();
		int i=0; 
		
		while (iter.hasNext() && i<pos+1) {
			iter.next();
			i++;
		}
		iter.unlink();
		return true;
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
				if (size>0) size--;
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

    /**
     * Devuelve un iterador sobre la lista.
     */
    public ListIterator<E> iterator() {
		return new MyListIterator(this);
    }
    
    
       /** ----------- Funciones Adicionales ------------ 
        * Funciones adicionales a las requeridas por implementar
        */
	
       /**
	* Copia todos los elementos de la lista this en una nueva y
	* la retorna
	*/
	public MyList<E> clone(){
		if (this.getHead()==null)//lista a clonar no es nula
			return this;
			
		// Ciclo clonador
		MyList<E> aux = new MyList();
		Caja cajaAux=null;
		ListIterator<E> iter = iterator();
		
		while (iter.hasNext()) {
			aux.add((E)(iter.next()));
		}
		return aux;
	}
    
       /**
	* concatena dos listas, retorna l1 + this (sin repeticiones)
	* y lo retorna en una lista nueva
	*/
	
	public void concatenate(MyList<E> l1){
		Caja cajaAux = new Caja();
		cajaAux= l1.getHead();
		while (cajaAux!=null){
			this.add((E)cajaAux.getDato());
			cajaAux=cajaAux.getSig();
		}
    }
    
	/**
	* Retorna la representacion lista a imprimir en un String
	*/
	@Override
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
	* Retorna busca y el elemento de la clave proporsionada,
	* si no lo encuentra retorna null
	*/
	@SuppressWarnings("unchecked")
	public E getElem(Object elemento){
		ListIterator<E> iter = iterator(); 
		E aux=null;
		
	while (iter.hasNext()){
			aux= iter.next();
			if (elemento.equals(aux)){
				return aux;
			}
	}
		return null;
    }
    
    /** ------------ Fin de Funciones Adicionales ------------ */
    
}// End List.
