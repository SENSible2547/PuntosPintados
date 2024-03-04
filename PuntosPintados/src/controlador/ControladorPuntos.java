package controlador;

import modelo.Grafica;
import modelo.Punto;
import vista.CrearVentana;
import vista.VistaPuntos;

import javax.swing.*;

public class ControladorPuntos {
	
	public static void main(String[] args) {
        
        Punto A = new Punto(100, 100);
        Punto B = new Punto(200, 300);
        Punto C = new Punto(300, 100);
        Punto R = new Punto(250, 500); 

       
        Grafica grafica = new Grafica(A, B, C, R);

       
        grafica.generarPuntos(1000000); 

       
        VistaPuntos vista = new VistaPuntos(grafica.getPuntos());

        new CrearVentana("Grafica Puntos", vista);
    }

}
