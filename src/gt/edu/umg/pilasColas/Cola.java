package gt.edu.umg.pilasColas;

import java.util.Scanner;

public class Cola {
	final Scanner sc = new Scanner(System.in);
	final Scanner tl = new Scanner(System.in);
	private Nodo raiz, cima;

	public Cola() {
		raiz = null;
		cima = null;
	}

	public boolean colaVacia() {
		if (raiz == null)
			return true;
		else {
			return false;
		}
	}

	public void insertar() {
		Venta vt = new Venta();
		do {	
			System.out.println("Ingrese las placas del vehiculo: ");
			vt.setPlaca(sc.nextLine());
			System.out.println("Eliga el tipo de Combustible: ");
			vt.setTipoCombustible(sc.nextLine());
			System.out.println("Ingrese la cantidad: ");
			vt.setCantidad(sc.nextFloat());
			Nodo nv = new Nodo(vt);
			nv.siguiente = null;
			if (colaVacia()) {
				raiz = nv;
				cima = nv;
			} else {
				cima.siguiente = nv;
				cima = nv;
			}
			System.out.println("Quiere seguir? s/n");
			
		}while(tl.equals("s") || tl.equals("S"));
	}

	public Venta quitar() {
		if (colaVacia()) {
			System.out.println("Cola Vacia");
			return null;
		}
		Venta aux = raiz.elemento;
		if (raiz == cima) {
			raiz = null;
			cima = null;
		} else {
			raiz = raiz.siguiente;
		}
		System.out.println("El dato eliminado es: " + aux);
		return aux;
	}

	public void listar() {
		Nodo t = raiz;
		while (t != null) {
			System.out.println(t.elemento);
			t = t.siguiente;
		}
	}
}