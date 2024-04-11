/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author tomas
 */
public class Pag5 {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicación");
        
        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);
        
        // Añadimos un objeto MiPanel al JFrame
        ventanaPrincipal.add(new MiPanel(Color.CYAN));
        
        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        
        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
