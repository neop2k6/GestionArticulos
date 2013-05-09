/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author MRWhite
 */
public class LabelCliente extends JLabel{
    
    final static Color colorTexto = new Color(255,255,255);
    
    LabelCliente(String titulo){
        super(titulo);
        setForeground(colorTexto);
        
    }
    
}
