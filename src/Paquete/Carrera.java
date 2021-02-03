package Paquete;

import java.util.Random;
import java.util.Scanner;

public class Carrera {

	private Coche vCoches[];
	private int distanciaCarrera;
	private String nombreCarrera;
	
	
	public Carrera(int distanciaCarrera, String nombreCarrera) {
		
		vCoches = new Coche[5];
		this.distanciaCarrera = distanciaCarrera;
		this.nombreCarrera = nombreCarrera;
	}
	
	
	public void crearNuevoCoche() {
		
		Random r = new Random();
		Scanner leer = new Scanner(System.in);
		
		String nombrePiloto = "";
		int dorsal = 0;
		
		
		System.out.println("Introduce el Nombre del Piloto");
		nombrePiloto = leer.nextLine();
		
		System.out.println("Introduce el Dorsal del Piloto");
		dorsal = leer.nextInt();
		
		
		Coche coche = new Coche(nombrePiloto, dorsal);

		
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] == null) {
				vCoches[i] = coche;
				break;
			}
		}
		
	}
	
	
	public boolean comprobarDorsal(int dorsal) {
		
		for (Coche coche : vCoches) {
			if (coche!= null && coche.getDorsal()==dorsal) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public void iniciarCarrera() {
		
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] != null) {
			vCoches[i].arrancarCoche();
			}
		}	
		
	}
	
	
	public void jugar() {
		
		Scanner leer = new Scanner(System.in);
		int opcJuego = 0; 
		
		Coche c;
		
		do {
			
			for (int i = 0; i < vCoches.length; i++) {
				if (vCoches[i] != null) {
					c = vCoches[i];
					opcJuego = Menu.pintaMenuJuego();
					
					switch (opcJuego) {
					
					case 1:
						
						c.acelerarCoche();
						
						break;

					case 2:
						
						c.frenarCoche();
						
						break;

					case 3:
						
						c.rearrancarCoche();
						
						break;
					}
				}
			}
			
		} while(carreraTerminada());
		
	}


	private boolean carreraTerminada() {
		
		for (int i = 0; i < vCoches.length; i++) {
			if ((vCoches[i].getEstadoCoche() == "Terminado") && (vCoches[i].getEstadoCoche() == "Accidentado")) {
				
				System.out.println("La Carrera ha Terminado");
				return true;
			}
		}
		
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
