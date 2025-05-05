package ec.edu.ups.est.poo;

import java.awt.*;
import ec.edu.ups.est.poo.ventana.MiVentana;

public class Main {
    public static void main(String[] args) {
        /* INSTANCIA DE LA CLASE FRAME
        Frame miVentana = new Frame();
        miVentana.setSize(1200,600);
        miVentana.setTitle("Mi ventana de ejemplo");
        miVentana.setVisible(true);
        */


        MiVentana v1 = new MiVentana();

        MiVentana v2 = new MiVentana("Ventana2");
        v2.setLocationRelativeTo(null);

        MiVentana v3 = new MiVentana("Ventana3", 400, 200, 20, 50);
        FlowLayout posicionamientoSecuencial = new FlowLayout();

        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        Button buttonD = new Button("D");
        Panel miPanel = new Panel();
        Panel miPanel2 = new Panel();
        miPanel.setLayout(posicionamientoSecuencial);

        miPanel.add(buttonA);
        miPanel.add(buttonB);
        miPanel2.add(buttonC);
        miPanel2.add(buttonD);
        v3.setLayout(new BorderLayout());
        Panel panelIzquierdo = new Panel();
        panelIzquierdo.setBackground(Color.RED);

        Panel panelDerecho = new Panel();
        panelDerecho.setBackground(Color.BLUE);
        panelDerecho.setLayout(BorderLayout.WEST);


        v3.add(panelDerecho);
        v3.add(panelIzquierdo);


        int cont = 10;
        for (int i = 0; i < cont ; i++) {
            panelDerecho.setBackground(Color.RED);
            panelIzquierdo.setBackground(Color.BLUE);
        }


        v2.add(miPanel);
        miPanel.add(buttonA);
        miPanel.add(buttonB);
        miPanel.add(buttonC);
        miPanel.add(buttonD);









    }
}