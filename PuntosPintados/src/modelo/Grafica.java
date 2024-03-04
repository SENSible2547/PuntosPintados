package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Grafica {
	
	private ArrayList<Punto> puntos;
	private Punto A, B, C;
	
	
	public Grafica(Punto A, Punto B, Punto C, Punto R) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.puntos = new ArrayList<>();
		this.puntos.add(A);
		this.puntos.add(B);
		this.puntos.add(C);
		this.puntos.add(R);
	}
	
	
	public Punto escogerPuntoRandom() {
		
		Random random = new Random();
		int eleccion = random.nextInt(3);
		
		if (eleccion == 0) {
			return A;
		}else if(eleccion == 1){
			return B; 
		}else {
			return C;
		}
	}
	
	public void calcularPuntoMedio() {
		
		Punto X = escogerPuntoRandom();
		Punto ultimoPunto = puntos.get(puntos.size() - 1);

        float mediaX = (X.getCoordenadaX() + ultimoPunto.getCoordenadaX()) / 2;
        float mediaY = (X.getCoordenadaY() + ultimoPunto.getCoordenadaY()) / 2;

        Punto puntoMedio = new Punto(mediaX, mediaY);
        puntos.add(puntoMedio);
		
	}
	
	public void generarPuntos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            calcularPuntoMedio();
        }
        
	}


	public ArrayList<Punto> getPuntos() {
		return puntos;
	}


	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}

}
