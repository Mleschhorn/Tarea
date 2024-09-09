package Carreras;
import java.util.ArrayList;
public class Formula1 {
	private escuderia[] escuderias;
	private ArrayList<sesion> sesiones;
	
	public Formula1(escuderia[] escuderias, ArrayList<sesion> sesiones) {
		
		this.escuderias = escuderias;
		this.sesiones = sesiones;
	}

	public escuderia[] getEscuderias() {
		return escuderias;
	}

	public void setEscuderias(escuderia[] escuderias) {
		this.escuderias = escuderias;
	}

	public ArrayList<sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(ArrayList<sesion> sesiones) {
		this.sesiones = sesiones;
	}
	
	
}
