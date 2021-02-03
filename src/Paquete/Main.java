package Paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		String nombreCarrera = "";
		int distanciaCarrera = 0;
		int opcCarrera = 0;

		
		System.out.println("Dime el Nombre de la Carrera");
		nombreCarrera = leer.nextLine();

		System.out.println("Dime la Distancia, Longitud(Km) de la Carrera");
		distanciaCarrera = leer.nextInt();
		
		
		Carrera car = new Carrera(distanciaCarrera, nombreCarrera);
		
		
		do {
			opcCarrera = Menu.pintaMenuCarrera();
			
			switch (opcCarrera) {
			
			
			case 1:
				
				car.crearNuevoCoche();
				
				break;

				
			case 2:
				
				car.iniciarCarrera();
				
				break;
				
				
			case 3:
				
				car.jugar();
				
				break;
				
				
			case 4:
				
				System.out.println("Menú Carrera Finalizado");
				
				break;
			}
			
		} while(opcCarrera != 4);
		
		
		
	}
}
