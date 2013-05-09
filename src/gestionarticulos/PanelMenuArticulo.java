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
public class PanelMenuArticulo extends JPanel implements ActionListener{
    
    BotonMenuArticulo btnNuevo, btnListado, btnConsulta, btnBorrar;
    GestionArticulos jfGes;
    PanelArticuloNuevo jpArticuloNuevo;
    PanelArticuloListado jpArticuloListado;
    PanelArticuloConsulta jpArticuloConsulta;
    PanelArticuloBorrar jpArticuloBorrar;
    JLabel lblTitulo;
    JPanel jpTitulo, jpCentro;
    
    
    PanelMenuArticulo(GestionArticulos jfCentro){
        super();
        this.jfGes=jfCentro;
        componentes();
    }
    
    void componentes(){
        setLayout(new BorderLayout());
        jpTitulo= new JPanel();
        jpCentro=new JPanel();
        
        jpCentro.setLayout(new GridLayout(0,2));
        btnNuevo = new BotonMenuArticulo("Nuevo");
        btnNuevo.addActionListener(this);
        jpCentro.add(btnNuevo);
        btnListado = new BotonMenuArticulo("Listado");
        btnListado.addActionListener(this);
        jpCentro.add(btnListado);
        btnConsulta = new BotonMenuArticulo("Consulta");
        btnConsulta.addActionListener(this);
        jpCentro.add(btnConsulta);
        btnBorrar = new BotonMenuArticulo("Borrar");
        btnBorrar.addActionListener(this);
        jpCentro.add(btnBorrar);

        lblTitulo = new JLabel("Articulos");
        jpTitulo.add(lblTitulo);
        jpTitulo.setBackground(new Color(72,84,154));
        
        add(jpTitulo,BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        
        
        
        if(boton.equals("Nuevo")){
            jpArticuloNuevo= new PanelArticuloNuevo();
            jfGes.getCentro().removeAll();
            jfGes.getCentro().add(jpArticuloNuevo, BorderLayout.CENTER);
            jfGes.getCentro().updateUI();
        }
        
        if(boton.equals("Listado")){
            jpArticuloListado = new PanelArticuloListado(jpArticuloNuevo.getAlmacen());
            jfGes.getCentro().removeAll();
            jfGes.getCentro().add(jpArticuloListado, BorderLayout.CENTER);
            jfGes.getCentro().updateUI();
        }
        
        if(boton.equals("Consulta")){
            jpArticuloConsulta = new PanelArticuloConsulta(jpArticuloNuevo.getAlmacen());
            jfGes.getCentro().removeAll();
            jfGes.getCentro().add(jpArticuloConsulta, BorderLayout.CENTER);
            jfGes.getCentro().updateUI();
        }
        if(boton.equals("Borrar")){
            jpArticuloBorrar = new PanelArticuloBorrar(jpArticuloNuevo.getAlmacen());
            jfGes.getCentro().removeAll();
            jfGes.getCentro().add(jpArticuloBorrar, BorderLayout.CENTER);
            jfGes.getCentro().updateUI();
        }
    }
    
}
