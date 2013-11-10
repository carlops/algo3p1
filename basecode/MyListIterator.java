//     import MyList.java;
public class MyListIterator<E> implements ListIterator<E> {
    
    
    private MyList<E> elemento;
    private Caja actual;
    
    // Bob
    public MyListIterator(MyList<E> lista){
	this.elemento=lista;
	this.actual=elemento.get(0);
    }
    
    /**
     * Comprueba que exista un proximo elemento.
     */
    public boolean hasNext(){
	return (this.actual!=null);
    }

    /**
     * Devuelve el elemento asociado y avanza el iterador.
     */
    public E next(){
	E temp=(E) this.actual.getDato();
	this.actual=this.actual.getSig();
	return temp;
    }

    /**
     * Remueve de la lista el ultimo elemento retornado por next()
     */
    public void unlink(){
// 	(this.actual.siguiente)
// 	if (anterior!=null)
// 	    anterior.setSig(elemento.getSig());
// 	    elemento.setSig(null);
    }
}