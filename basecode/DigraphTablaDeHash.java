/**
* Clase concreta de DiGraph
* Uds debe seleccionar elmodelo de representacion que mejor
* satisfaga las restriciones establecidas
*/
public class DigraphTablaDeHash<E> extends Digraph{
	
	private MyList<E> tabla[]; 
	private static int TAM = 201;
	
   /**
	* Construye un grafo vacio.
	*/
	@SuppressWarnings("unchecked")
	public DigraphTablaDeHash() {
		super();
		this.tabla = new MyList[TAM];
		for (int i=0; i<TAM; i++) {
			this.tabla[i]= new MyList<E>(); // E ES InfoNodo!!
		}
	}
	
   /**
	* Agrega la arista dada al grafo. Si los vertices de la arista
	* no existen o el grafo tiene una arista entre dichos vertices,
	* retorna false. Si se agrega la nueva arista, retorna true.
	* 
	* Complejidad: O(p + q), p << | V | y q << | E |
	*/
	public boolean add(Edge e){
		int hsuc, hpre;
		InfoNodo pre, suc;
		
		hsuc = (e.getSrc().hashCode()) % TAM ;
		if (hsuc<0) hsuc=-hsuc;
		hpre = (e.getDst().hashCode()) % TAM ;
		if (hpre<0) hpre=-hpre;
		
		Node fuente =new Node(e.getSrc());
		InfoNodo aux = new InfoNodo(fuente);
		suc=(InfoNodo) this.tabla[hsuc].getElem(aux);
		if (suc==null)
			return false;
		
		Node destino =new Node(e.getDst());
		InfoNodo aux2 = new InfoNodo(destino);
		pre=(InfoNodo) this.tabla[hpre].getElem(aux2);
		if (pre==null)
			return false;
		
		// Agredando en Sucesores
		if (!suc.addSuc(e)){
			System.out.println("\n Error agregando "+ e.getDst() + 
			" como sucesor de " + e.getSrc());
			return false;
		}
		// Agredando en Predecesores
		if (!pre.addPre(e)){
			System.out.println("\n Error agregando "+ e.getSrc() + 
			" como sucesor de " + e.getDst());
			return false;//MOSCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		}
		numEdges++;
		return true;
		
	}

   /**
	* Agrega el nodo n. Si el vertice ya existe, retorna false. Si
	* se agrega el nodo, retorna true.
	*
	* Complejidad: O(p), p << | V |
	*/
	public boolean add(Node n){
		E aux = (E) new InfoNodo(n);
		if (this.contains(n.getId()))
			return false;
		int h = (n.getId().hashCode()) % TAM;
		if (h<0) h=-h;
		System.out.println("HASH:"+ h);
		this.tabla[h].add(aux);
		numVertices++;
		return true;
	}

   /**
	* Elimina los nodos y aristas del grafo.
	* 
	* Complejidad: O(1)
	*/
	public void clear(){
		for (int i=0; i<TAM; i++) {
			this.tabla[i]= null;
		}
	}

   /**
	* Retorna un nuevo grafo que es una copia del grafo actual.
	* 
	* Complejidad: O(|V| + |E|)
	*/
	public Object clone(){
		throw new UnsupportedOperationException("Not supported yet.");
	}

   /**
	* Chequa que el grafo contiene una arista (src, dst).
	* 
	* Complejidad: O(p), p << | E |
	*/
	public boolean contains(String src, String dst){
		int hsuc = (src.hashCode()) % TAM ;
		if (hsuc<0) hsuc=-hsuc;
		
		Edge arista= new Edge(src,dst); 
		Node fuente =new Node(src);
		InfoNodo aux = new InfoNodo(fuente);
		InfoNodo aux2 = (InfoNodo) this.tabla[hsuc].getElem(aux);
		return aux2.containsSuc(arista);
	}

   /**
	* Chequa que el grafo contiene una nodo con id nod
	*
	* Complejidad: O(p), p << | V |
	*/
	public boolean contains(String nod) {
		int h;
		Node n = new Node(nod);
		E aux = (E) new InfoNodo(n);
		h = (n.getId().hashCode()) % TAM ;
		if (h<0) h=-h;
		if (this.tabla[h].contains(aux))
			return true;
		else 
			return false;
	}

   /**
	* Retorna la arista del grafo que conecta a los vertices
	* src y dst. Si no existe dicha arista, retorna null.
	* 
	*  Complejidad: O(p), p << | E |
	*/
	public Edge get(String src, String dst){
	throw new UnsupportedOperationException("Not supported yet.");
	}

   /**
	* Retorna todas las aristas del grafo
	*
	* Complejidad: O(???)
	*/
	public List<Edge> getEdges(){
		MyList <Edge> todosLados= new MyList();
		for (int i=0; i<TAM; i++) {
			Caja aux=this.tabla[i].getHead();
			while (aux!=null) {
				System.out.println("Estoy en: " + aux);
				InfoNodo aux2 = (InfoNodo) aux.getDato();
				if (aux2.getSuc()!=null)
					System.out.println("Entre en: " + aux2.getSuc());
					todosLados.concatenate(todosLados,(MyList<Edge>) aux2.getSuc());
				aux=aux.getSig();
			}
		}
		return todosLados;
	}
	
   /**
	* Retorna el nodo con id nod. Si no existe dicho nodo, 
	* retorna null.
	*
	* Complejidad: O(p), p << |V|
	*/
	public Node get(String nod){
		int h= (nod.hashCode()) % TAM;
		Caja aux = (Caja) this.tabla[h].getElem(nod);
		
		return ((Node) aux.getDato());
		
	}

   /** 
	* Retorna todos los nodos del grafo.
	*
	* Complejidad: O(???)
	*/
	public List<Node> getNodes(){
		List <Node> todosNodos= new MyList();
		for (int i=0; i<TAM; i++) {
			Caja aux=this.tabla[i].getHead();
			while (aux!=null) {
				InfoNodo aux2 = (InfoNodo) aux.getDato();
				todosNodos.add( (Node) aux2.getDato());
				aux=aux.getSig();
			}
		}
		return todosNodos;
	}

   /**
	* Retorna el numero de aristas en el grafo.
	*
	* Complejidad: O(1)
	*/
	public int getNumEdges() {
		return numEdges;
	}

   /**
	* Retorna el numero de vertices en el grafo.
	* 
	* Complejidad: O(1)
	*/
	public int getNumVertices() {
		return numVertices;
	}

   /**
	* Retorna la lista de lados que tienen al vertice dado como
	* destino. Si el vertice no existe, retorna null.
	* 
	* Complejidad: O(p), p << | E |
	*/
	public List<Edge> getInEdges(String node){
		int h = (node.hashCode()) % TAM ;
		if (h<0) h=-h;
		
		Node fuente =new Node(node);
		InfoNodo aux = new InfoNodo(fuente);
		InfoNodo suc=(InfoNodo) this.tabla[h].getElem(aux);
		if (suc==null)
			return null;
		return suc.getPre();
		
	}

   /**
	* Retorna los predecesores del nodo con id node
	* 
	* Complejidad: O(p), p << | E |
	*/
	@SuppressWarnings("unchecked")
	public List<Node> getPreds(String node){
		if (!contains(node))
			return null;

		List<Edge> inEdges = getInEdges(node);

		if (inEdges == null)
			return null;

		ListIterator<Edge> li = inEdges.iterator();
		List<Node> preds = (List<Node>) new MyList();

		while (li.hasNext()) {
			Edge e = li.next();
			String sid = e.getSrc();
			preds.add(this.get(sid));
		}
		return preds;
	}

	/**
	* Retorna la lista de lados que tienen al vertice dado como
	* origen. Si el vertice no existe, retorna null.
	*
	* Complejidad: O(p), p << | E |
	*/
	public   List<Edge> getOutEdges(String node){
	throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	* Retorna los sucesores del nodo con id node
	*
	* Complejidad: O(p), p << | E |
	*/
	@SuppressWarnings("unchecked")
	public  List<Node> getSucs(String node){
	if (!contains(node))
		return null;

	List<Edge> outEdges = getOutEdges(node);

	if (outEdges == null)
		return null;

	ListIterator<Edge> li = outEdges.iterator();
	List<Node> sucs = new MyList();

	while (li.hasNext()) {
		Edge e = li.next();
		String sid = e.getDst();

		sucs.add(this.get(sid));
	}
		
	return sucs;
	}

	/**
	* Retorna el in-degree del vertice dado. Si el
	* vertice no existe, retorna -1.
	*
	* Complejidad: O(p), p << | E |
	*/
	public int getInDegree(String node)  {
		int h = (node.hashCode()) % TAM ;
		if (h<0) h=-h;
		
		Node nodo =new Node(node);
		InfoNodo aux = new InfoNodo(nodo);
		InfoNodo aux2 = (InfoNodo) this.tabla[h].getElem(aux);
		return aux2.getPreSize();
		
	}
	/**
	* Retorna el out-degree del vertice dado. Si el
	* vertice no existe, retorna -1.
	*
	* Complejidad: O(p), p << | E |
	*/
	public int getOutDegree(String node) {
		int h = (node.hashCode()) % TAM ;
		if (h<0) h=-h;
		
		Node nodo =new Node(node);
		InfoNodo aux = new InfoNodo(nodo);
		InfoNodo aux2 = (InfoNodo) this.tabla[h].getElem(aux);
		return aux2.getSucSize();
	}

	/**
	* Remueve la arista del grafo que conecta a los vertices src y
	* dst. Si el grafo no cambia, retorna false. Si el grafo cambia,
	* retorna true.
	* 
	* Complejidad: O(p), p << | E |
	*/
	public   boolean remove(String src, String dst){
		Edge arista= new Edge(src,dst); 
		
		int hsuc = (src.hashCode()) % TAM ;
		if (hsuc<0) hsuc=-hsuc;
		
		Node fuente =new Node(src);
		InfoNodo aux = new InfoNodo(fuente);
		InfoNodo suc=(InfoNodo) this.tabla[hsuc].getElem(aux);
		if (suc==null)
			return false;
		if (!suc.removeSuc(arista))
			return false;
		
		int hpre = (dst.hashCode()) % TAM ;
		if (hpre<0) hpre=-hpre;
		
		Node destino =new Node(dst);
		InfoNodo aux2 = new InfoNodo(destino);
		InfoNodo pre=(InfoNodo) this.tabla[hpre].getElem(aux2);
		if (pre==null)
			return false;  ////////////mosca
		if (!pre.removePre(arista))
			return false; //////////MOSCAAAAAAAAAAAAAAA
		
		numEdges--;
		return true;
	}

	/**
	* Remueve el nodo del grafo con id nod. Si el grafo no cambia,
	* retorna false. Si el grafo cambia, retorna true.
	*
	* Complejidad: O(p), p << | V |
	*/
	public   boolean remove(String nod){
	throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	* Construye una representacion en String del grafo.
	*/
	public String toString() {
		String ret = numVertices + ":" + numEdges +"\n";

	
	/*
	for (int i=0; i<TAM; i++) {
		if (this.tabla[i].getHead()!=null){
			System.out.println("pos " + i + ": " + this.tabla[i]);
		}
	}*/
	    
	ListIterator<Node> nods = getNodes().iterator();

	while (nods.hasNext()) {
		Node n = nods.next();
		ret += "\n" + n.toString();
	}       
// 
// 	ListIterator<Edge> edgs = getEdges().iterator();
// 
// 	while (edgs.hasNext()) {
// 		Edge e = edgs.next();
// 		ret += "\n" + e.toString();
// 	}       

		return ret;
	}
}

// End Digraph.java
