
package gestionarticulos;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author MRWhite
 */
public class BotonMenuCliente extends JButton {
    
    final static Color colorFondo = new Color(86,102,196);
    final static Color colorTexto = new Color(255,255,255);
    
    BotonMenuCliente(String titulo){
        super(titulo);
        setBackground(colorFondo);
        setOpaque(true);
        setForeground(colorTexto);
    }
    
}