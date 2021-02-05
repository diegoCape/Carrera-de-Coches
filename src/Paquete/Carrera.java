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
		boolean maquina = false;
		
		
		System.out.println("Introduce el Nombre del Piloto");
		nombrePiloto = leer.nextLine();
		
		System.out.println("Introduce el Dorsal del Piloto");
		dorsal = leer.nextInt();
		
		comprobarDorsal(dorsal);
		
		Coche coche = new Coche(nombrePiloto, dorsal, maquina);

		
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
			break;
			}
		}	
		
	}
	
	
	public void mostrarCochesCompitiendo() {
		int numCochesH = 0;
		int numCochesM = 0;

		for (int i = 0; i < 1; i++) {
			if (vCoches[i] != null) {
				numCochesH++;
			}else {
				numCochesM++;
			}
			
			System.out.println("Estan Participando en Esta Carrera: " + numCochesH + " Coches Humanos" 
			+ " Y: " + numCochesM + " Coches Maquina");
		}
	}

	public void mostrarCochesMarcha() {
		int numCochesMarchaH = 0;
		int numCochesMarchaM = 0;

		for (int i = 0; i < 1; i++) {
			if (vCoches[i].getEstadoCoche().equalsIgnoreCase("Marcha")) {
				numCochesMarchaH++;
			}else {
				numCochesMarchaM++;
			}
			
			System.out.println("Quedan: " + numCochesMarchaH + " Coches Humanos en Marcha en la Carrera"
			+ " Y: " + numCochesMarchaM + " Coches Maquina en Marcha");
		}
	}

	public void mostrarCochesTerminado() {
		int numCochesTerminadoH = 0;
		int numCochesTerminadoM = 0;

		for (int i = 0; i < 1; i++) {
			if (vCoches[i].getEstadoCoche().equalsIgnoreCase("Terminado")) {
				numCochesTerminadoH++;
			}else {
				numCochesTerminadoM++;
			}
			
			System.out.println("Actualmente hay: " + numCochesTerminadoH + " Coches Humanos que han Terminado la Carrera" 
			+ " Y: " + numCochesTerminadoM + " Coches Maquina que han Terminado");
		}
	}
	
	
	public void jugar() {
		
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		int opcJuego = 0; 
		int opcMaquina = 0;
		
		Coche c;
		
		do {
			
			for (int i = 0; i < vCoches.length; i++) {
				if (vCoches[i] != null) {
					c = vCoches[i];
					
					
					if (!c.isMaquina()) {
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
						
						
					}else {
						if (c.getEstadoCoche().equalsIgnoreCase("Accidentado")) {
							c.rearrancarCoche();
							
						}else {
							opcMaquina = r.nextInt(2);
							
							switch (opcMaquina) {
							case 0:
								c.acelerarCoche();
								break;

							case 1:
								c.frenarCoche();
								break;
							}
						}
					}
				}
				
			}
			
			mostrarCochesCompitiendo(); 
			mostrarCochesMarcha(); 
			mostrarCochesTerminado();
			carreraTerminada();
			
		}while (carreraTerminada() != true);
	}
	
	
	private boolean carreraTerminada() {
		
		for (int i = 0; i < vCoches.length; i++) {
			if ((vCoches[i].getEstadoCoche() != "Marcha") && (vCoches[i].getEstadoCoche() != "Parado")) {
				
				System.out.println("La Carrera ha Terminado");
				return true;
				
			}else {
				System.out.println("La Carrera Sigue en Marcha, aun no ha Terminado");
			}
			break;
		}
		
		return false;
	}
	
}
