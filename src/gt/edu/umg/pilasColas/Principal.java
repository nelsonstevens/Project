package gt.edu.umg.pilasColas;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		menu();
	}	
	
	public static void menu() {
		int num = 0; int dato;
		Pila pl = new Pila();
		Scanner sc = new Scanner(System.in);
		System.out.println("--MENU--");
		System.out.println("1. Ingresar datos");
		System.out.println("2. Quitar datos");
		System.out.println("3. Salir");
		String input = sc.nextLine();
		switch(input) {
		case "1":
			System.out.println("Cuantos datos desea ingresar: ");
			num = sc.nextInt();
			for(int i = 0; i<num; i++) {
				System.out.println("Ingrese el dato " + (i+1));
				dato = sc.nextInt();
				pl.insert(dato);
			}
			pl.quitar();
			break;
		case "2":
			System.out.println("Que dato desea quitar.");
			pl.quitar();
			break;
		case "3":
			break;
		}
	}
}