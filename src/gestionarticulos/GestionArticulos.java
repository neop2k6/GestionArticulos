package gestionarticulos;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author MRWhite
 */
public final class GestionArticulos extends JFrame {
    
    PanelMenu menu;
    JPanel centro=new JPanel();
    PanelMenuArticulo jpArticulo;
    PanelMenuCliente jpCliente;
    PanelMenuFactura jpFactura;
    PanelLogo jpLogo;
    
    GestionArticulos(){
        
        super ("Proyecto © Copyright Sergio Martin Gallego");  //Titulo de la ventana
        setSize(700,400);
        componentes();
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    void componentes(){
        setLayout(new BorderLayout());
        menu = new PanelMenu();
        
        add(menu, BorderLayout.NORTH);
        
        jpArticulo = new PanelMenuArticulo(this);
        menu.add(jpArticulo);
        jpCliente = new PanelMenuCliente(this);
        menu.add(jpCliente);
        jpFactura = new PanelMenuFactura(this);
        menu.add(jpFactura);
        jpLogo = new PanelLogo();
        centro.add(jpLogo);
        add(centro,BorderLayout.CENTER);
        
        
    }
    
    public JPanel getCentro(){
            return centro;
        } 
    
    public static void main(String[] args) {
        GestionArticulos g= new GestionArticulos();        

    }
}
