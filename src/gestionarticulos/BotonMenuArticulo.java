
package gestionarticulos;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author MRWhite
 */
public class BotonMenuArticulo extends JButton {
    
    final static Color colorFondo = new Color(72,84,154);
    final static Color colorTexto = new Color(255,255,255);
    
    BotonMenuArticulo(String titulo){
        super(titulo);
        setBackground(colorFondo);
        setOpaque(true);
        setForeground(colorTexto);
    }
    
}
