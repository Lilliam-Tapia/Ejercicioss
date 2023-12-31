import java.util.concurrent.ThreadLocalRandom;

public class Espectador {
	private String nombre;
	private int edad;
	private int dinero;
	
	public Espectador(){	
        this.nombre = "Danilo";
		this.edad = ThreadLocalRandom.current().nextInt(4, 90);
		this.dinero = ThreadLocalRandom.current().nextInt(100,150);
	}

	public int getEdad(){
		return edad;}
	public int getDinero(){
		return dinero;}

	@Override
	public String toString() {
		return "Espectador [nombre: " + nombre + ", edad: " + edad + ", dinero: " + dinero + " ]";
	}	
}