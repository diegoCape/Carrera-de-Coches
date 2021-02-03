package Paquete;

import java.util.Scanner;

public class Menu {
	
	
	public static int pintaMenuJuego() {
		
		Scanner leer = new Scanner(System.in);
		
		int opcJuego = 0;
		
		System.out.println();
		System.out.println("**Menu Juego**");
		System.out.println("1. Acelerar");
		System.out.println("2. Frenar");
		System.out.println("3. Rearrancar");
		System.out.println();
		opcJuego = leer.nextInt();
		
		return opcJuego;
	}
	
	
	public static int pintaMenuCarrera() {
		
		Scanner leer = new Scanner(System.in);
		
		int opcCarrera = 0;
		
		System.out.println();
		System.out.println("*****Menu Carrera*****");
		System.out.println("1. Crear Nuevo Coche");
		System.out.println("2. Iniciar Carrera");
		System.out.println("3. Jugar");
		System.out.println("4. Salir Menú Carrera");
		System.out.println("**********************");
		System.out.println();
		opcCarrera = leer.nextInt();
		
		return opcCarrera;
	}
	
}
