/**
 * Interfaz que define el comportamiento de un arbol
 * 
 * Esta es una clase parametrizada con tipo (clase) E; i.e., el
 * arbol contiene elementos de tipo E.
 */
public interface Tree<E> {

    /**
     * Agrega un elemento al arbol.
     */
    public boolean add(E element);
    
    /**
     * Elimina todos los elementos del arbol. El arbol queda
     * como recien creado.
     */
    public void clear();

    /**
     * Determina si el elemento dado esta en el arbol.
     */
    public boolean contains(Object element);

    /**
     * Determina si el arbol dado o es igual a el arbol this.
     */
    public boolean equals(Object o);

    /**
     * Determina si el arbol es vacio.
     */
    public boolean isEmpty();

    /**
     * Elimina el elemento dado del arbol. Si el arbol cambia,
     * retorna true, sino retorna false.
     */
    public boolean remove(E element);

    /**
     * Retorna el numero de elementos en el arbol
     */
    public int getSize();

    /**
     * Devuelve un iterador sobre el arbol.
     */
    public ListIterator<E> iterator();


}
