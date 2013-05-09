
package gestionarticulos;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author alum
 */
public class PanelLogo extends JPanel{
    ImageIcon imagen = new ImageIcon("LogoLoudLer.png"); 
    JLabel img = new JLabel(imagen);
    final static Color colorFondo = new Color(56,131,165);
    
    PanelLogo(){
        //super();
        img.setIcon(imagen); 
        img.setSize(120, 156); 
        img.setVisible(true); 
        add(img);
        setBackground(colorFondo);
    }
    
}
