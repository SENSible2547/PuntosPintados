package vista;

import javax.swing.*;

public class CrearVentana extends JFrame {

    public CrearVentana(String title, VistaPuntos vista) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(vista);
        setSize(400, 400);
        setVisible(true);
    }
}

