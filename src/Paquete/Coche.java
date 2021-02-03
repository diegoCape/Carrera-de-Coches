package Paquete;

import java.util.Random;

public class Coche {

	private String nombrePiloto;
	private int dorsal;
	private int distanciaCarrera;
	private String estadoCoche;
	private int potencia;
	private int velocidad;
	private int kmRecorridos;
	
	
	public Coche(String nombrePiloto, int dorsal) {
		
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.distanciaCarrera = distanciaCarrera;
		this.estadoCoche = "Parado";
		this.potencia = 50;
		this.velocidad = 0;
		this.kmRecorridos = 0;
	}

	
	public void arrancarCoche() {
		
		this.estadoCoche = "Marcha";
		System.out.println("Todos los Coches han Arrancado");
	}
	
	
	public void acelerarCoche() {
		
		Random r = new Random();
		int acelerar = 0;
		
		acelerar = r.nextInt(this.potencia+1);
		
		this.velocidad += acelerar;
		this.kmRecorridos += acelerar;
		
		if (this.velocidad >= 200) {
			
			System.out.println("El Coche ha Superado los 200 Km/h y se ha Accidentado");
			this.estadoCoche = "Accidentado";
			this.velocidad = 0;
		}
	}
	
	
	public void frenarCoche() {
		
		Random r = new Random();
		int frenar = 0;
		
		frenar = r.nextInt(this.potencia+1);
		
		this.velocidad -= frenar;
		this.kmRecorridos += frenar;
	}
	
	
	public void rearrancarCoche() {
		
		for (int i = 0; i < vCoches[i]; i++) {
			if ((this.estadoCoche.equalsIgnoreCase("Accidentado")) && (vCoches[i].getEstado!="Termiando")) {
				
				this.estadoCoche = "Marcha";
				this.velocidad = 0;
				System.out.println("El Coche se ha Reincorporado a la Carrera");
				
			}
		}
		
	}
	
	
	public void terminarCoche() {
		
		if (this.kmRecorridos >= this.distanciaCarrera) {
			
			this.estadoCoche = "Terminado";
			System.out.println("El Coche ha Llegado a la Meta y Acabado la Carrera");
		}
	}
	
	
	@Override
	public String toString() {
		return "Nombre del Piloto: " + nombrePiloto + " Dorsal: " + dorsal + " Estado Actual del Coche: " 
	+ estadoCoche + " Velocidad Actual del Coche: " + velocidad + " Km Recorridos: " + kmRecorridos;
	}


	public String getNombre() {
		return nombrePiloto;
	}

	public void setNombre(String nombre) {
		this.nombrePiloto = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEstadoCoche() {
		return estadoCoche;
	}

	public void setEstadoCoche(String estadoCoche) {
		this.estadoCoche = estadoCoche;
	}
	
	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	
}
