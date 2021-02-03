package Paquete;

public class Coche {

	private String nombre;
	private int dorsal;
	private String estadoCoche;
	private int potencia;
	private int velocidad;
	private int kmRecorridos;
	
	
	public Coche(String nombre, int dorsal, String estadoCoche, int velocidad, int potencia,
			int kmRecorridos) {
		
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.estadoCoche = "Parado";
		this.potencia = 50;
		this.velocidad = 0;
		this.kmRecorridos = 0;
	}

	
	public void arrancarCoches() {
		
		this.estadoCoche = "Marcha";
		System.out.println("Todos los Coches han Arrancado");
	}
	
	
	public void acelerarCoche() {
		
		
		
	}
	
	
	public void frenarCoche() {
		
		
		
		
	}
	
	
	public void accidentarCoche() {
		
		if (getVelocidad() >= 200) {
			
			System.out.println("El Coche ha Superado los 200 Km/h y se ha Accidentado");
			this.estadoCoche = "Accidentado";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
