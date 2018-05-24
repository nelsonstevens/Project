package gt.edu.umg.pilasColas;

public class Pila {
	private Nodo cima;
	Pila(){
		cima = null;
	}
	public boolean pilaVacia() {
		if(cima == null) {
			return true;
		}else {
			return false;
		}
	}
	public void insert (int dato ){
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	public void quitar () {
		if(pilaVacia()) {
			System.out.println("La pila esta vacia.");
		}else {
			int aux = cima.dato;
			cima = cima.siguiente;
			System.out.println("El dato eliminado es: " + aux);
		}
	}
}