/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author alum
 */
public class PanelArticuloListado extends JPanel{
    JLabel[] lblListado;
    JLabel lblCabecera;
    GestionArticulos jfGes;
    
    private Color colorFondo = new Color(92,199,97); 
    
    
    PanelArticuloListado(Almacen almacen){
        super();
        setPreferredSize(new Dimension(400, 250));
        setLayout(new GridLayout(0,1));
        setBackground(colorFondo);
        lblCabecera = new JLabel("Codigo Descripcion  Precio  Stock ");
        add(lblCabecera);
        
        
        lblListado = new JLabel[almacen.nArticulos];        
        for(int i=0;i<almacen.nArticulos;i++){
            lblListado[i] = new JLabel(almacen.getArticulo(i));
            add(lblListado[i]);
        }
        

    }
    
    
    
}
