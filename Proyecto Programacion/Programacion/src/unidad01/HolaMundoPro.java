package unidad01;

import java.util.Scanner;

public class HolaMundoPro {

	public static void main(String[] args) {
		// metodo main
				Scanner scan = new Scanner(System.in);
				System.out.print("Introduce tu nombre:");
				String nombre = scan.nextLine();
				// Cuando el usuario no mete ningún nombre, el valor que guarda es una cadena
				// vacía, es decir, ""
				// Versión con operador ternario
				nombre = "".equals(nombre) ? "amigo" : nombre;
				System.out.println("Hola " + nombre + "!");
				scan.close(); 
	
	
	}

}
