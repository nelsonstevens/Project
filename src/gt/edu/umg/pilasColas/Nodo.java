package gt.edu.umg.pilasColas;

public class Nodo {
	int dato;
	Nodo siguiente;
	Venta elemento;

	public Nodo(Venta dato) {
		siguiente = null;
		elemento = dato;
	}

	public Nodo(int dato) {
		int elemento;
		siguiente = null;
		elemento = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Venta getElemento() {
		return elemento;
	}

	public void setElemento(Venta elemento) {
		this.elemento = elemento;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}
}