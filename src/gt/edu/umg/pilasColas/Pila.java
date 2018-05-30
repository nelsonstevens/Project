package gt.edu.umg.pilasColas;

public class Pila {
	private Nodo cima;

	Pila() {
		cima = null;
	}

	public boolean pilaVacia() {
		if (cima == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int dato) {
		Nodo nv = new Nodo(dato);
		nv.siguiente = cima;
		cima = nv;
	}

	public void quitar() {
		if (pilaVacia()) {
			System.out.println("La pila esta vacia.");
		} else {
			int aux = cima.dato;
			cima = cima.siguiente;
			System.out.println("El dato eliminado es: " + aux);
		}
	}

	public void listar() {
		if (pilaVacia()) {
			System.out.println("La pila se encuentra vacia");
		} else {
			Nodo t = null;
			while (t != null) {
				System.out.println(t.elemento);
				t = t.siguiente;
			}
		}
	}
}