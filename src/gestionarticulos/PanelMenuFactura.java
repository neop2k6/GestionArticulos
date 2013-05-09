/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author MRWhite
 */
public class PanelMenuFactura extends JPanel implements ActionListener{
    
    BotonMenuFactura btnNuevo, btnListado, btnConsulta, btnBorrar;
    GestionArticulos jfGes;
    PanelFacturaNuevo jpFacturaNuevo;
    JLabel lblTitulo;
    JPanel jpTitulo, jpCentro;
    
    PanelMenuFactura(GestionArticulos jfCentro){
        super();
        this.jfGes=jfCentro;
        componentes();
    }
    
    void componentes(){
        setLayout(new BorderLayout());
        jpTitulo= new JPanel();
        jpCentro=new JPanel();
        
        jpCentro.setLayout(new GridLayout(0,2));
        btnNuevo = new BotonMenuFactura("Nuevo");
        btnNuevo.addActionListener(this);
        jpCentro.add(btnNuevo);
        btnListado = new BotonMenuFactura("Listado");
        btnListado.addActionListener(this);
        jpCentro.add(btnListado);
        btnConsulta = new BotonMenuFactura("Consulta");
        jpCentro.add(btnConsulta);
        btnBorrar = new BotonMenuFactura("Borrar");
        jpCentro.add(btnBorrar);

        lblTitulo = new JLabel("Facturas");
        jpTitulo.add(lblTitulo);
        jpTitulo.setBackground(new Color(138,149,212));
        
        add(jpTitulo,BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        if(boton.equals("Nuevo")){                                           
      
            jpFacturaNuevo= new PanelFacturaNuevo();
            jfGes.getCentro().removeAll();
            jfGes.getCentro().add(jpFacturaNuevo, BorderLayout.CENTER);
            jfGes.getCentro().updateUI();
            
        }
    }
    
}
