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
public class PanelMenuCliente extends JPanel implements ActionListener{
    
    BotonMenuCliente btnNuevo, btnListado, btnConsulta, btnBorrar;
    GestionArticulos jfCentro;
    PanelClienteNuevo jpClienteNuevo;
    PanelClienteListado jpClienteListado;
    PanelClienteConsulta jpClienteConsulta;
    PanelClienteBorrar jpClienteBorrar;
    JLabel lblTitulo;
    JPanel jpTitulo, jpCentro;
    Clientes clientes;
    
    
    PanelMenuCliente(GestionArticulos jfCentro){
        super();
        this.jfCentro=jfCentro;
        componentes();
    }
    
    void componentes(){
        setLayout(new BorderLayout());
        jpTitulo= new JPanel();
        jpCentro=new JPanel();
        
        jpCentro.setLayout(new GridLayout(0,2));
        btnNuevo = new BotonMenuCliente("Nuevo");
        btnNuevo.addActionListener(this);
        jpCentro.add(btnNuevo);
        btnListado = new BotonMenuCliente("Listado");
        btnListado.addActionListener(this);
        jpCentro.add(btnListado);
        btnConsulta = new BotonMenuCliente("Consulta");
        btnConsulta.addActionListener(this);
        jpCentro.add(btnConsulta);
        btnBorrar = new BotonMenuCliente("Borrar");
        btnBorrar.addActionListener(this);
        jpCentro.add(btnBorrar);

        lblTitulo = new JLabel("Clientes");
        jpTitulo.add(lblTitulo);
        jpTitulo.setBackground(new Color(86,102,196));
        
        add(jpTitulo,BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();

        if(boton.equals("Nuevo")){                                           
            jpClienteNuevo= new PanelClienteNuevo();
            jfCentro.getCentro().removeAll();
            jfCentro.getCentro().add(jpClienteNuevo, BorderLayout.CENTER);
            jfCentro.getCentro().updateUI();
        }
        
        if(boton.equals("Listado")){                                           
            jpClienteListado= new PanelClienteListado(jpClienteNuevo.getClientes());
            jfCentro.getCentro().removeAll();
            jfCentro.getCentro().add(jpClienteListado, BorderLayout.CENTER);
            jfCentro.getCentro().updateUI();
        }
     
        if(boton.equals("Consulta")){                                           
            jpClienteConsulta= new PanelClienteConsulta(jpClienteNuevo.getClientes());
            jfCentro.getCentro().removeAll();
            jfCentro.getCentro().add(jpClienteConsulta, BorderLayout.CENTER);
            jfCentro.getCentro().updateUI();
        }
        if(boton.equals("Borrar")){                                           
            jpClienteBorrar= new PanelClienteBorrar(jpClienteNuevo.getClientes());
            jfCentro.getCentro().removeAll();
            jfCentro.getCentro().add(jpClienteBorrar, BorderLayout.CENTER);
            jfCentro.getCentro().updateUI();
        }
        
    }
    
}
