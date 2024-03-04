package vista;

import modelo.Punto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VistaPuntos extends JPanel {
	
	private ArrayList<Punto> puntos;

    public VistaPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarPuntos(g);
    }
    
    private void dibujarPuntos(Graphics g) {
        for (Punto punto : puntos) {
            g.fillOval((int) punto.getCoordenadaX(), (int) punto.getCoordenadaY(), 5, 5);
        }
    }
    
    public void setPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
        repaint();
    }
    

}
