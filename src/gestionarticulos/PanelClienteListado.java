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
public class PanelClienteListado extends JPanel{
    LabelCliente[] lblListado;
    LabelCliente lblCabecera;
    GestionArticulos jfGes;
    
    private Color colorFondo = new Color(170,45,72); 
    
    
    PanelClienteListado(Clientes clientes){
        super();
        setPreferredSize(new Dimension(400, 250));
        setLayout(new GridLayout(0,1));
        setBackground(colorFondo);
        lblCabecera = new LabelCliente("NIF Nombre Telefono Descuento");
        add(lblCabecera);
        
        
        lblListado = new LabelCliente[clientes.nCliente];        
        for(int i=0;i<clientes.nCliente;i++){
            lblListado[i] = new LabelCliente(clientes.getCliente(i));
            add(lblListado[i]);
        }
        

    }
    
    
    
}
