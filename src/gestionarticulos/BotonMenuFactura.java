
package gestionarticulos;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author MRWhite
 */
public class BotonMenuFactura extends JButton {
    
    final static Color colorFondo = new Color(138,149,212);
    final static Color colorTexto = new Color(255,255,255);
    
    BotonMenuFactura(String titulo){
        super(titulo);
        setBackground(colorFondo);
        setOpaque(true);
        setForeground(colorTexto);
    }
    
}
