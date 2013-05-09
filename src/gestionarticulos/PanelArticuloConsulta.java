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
 * @author Administrador
 */
public class PanelArticuloConsulta extends JPanel implements ActionListener{
    private Color colorFondo = new Color(92,199,97); 
    JLabel lblBusqueda, lblCodigo;
    JTextField txtCodigo;
    JButton btnConsulta;
    Almacen almacen;
    
    
    PanelArticuloConsulta(Almacen almacen){
        super();
        this.almacen= almacen;
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(0,1));
        setBackground(colorFondo);
        componentes();
        
    }
    
    public void componentes(){
        
        lblCodigo= new JLabel("Codigo: ");
        add(lblCodigo);
        txtCodigo= new JTextField();
        add(txtCodigo);
        btnConsulta=new JButton("Consultar");
        btnConsulta.addActionListener(this);
        add(btnConsulta);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        int codigo;
        
        codigo=Integer.parseInt(txtCodigo.getText());

        if(boton.equals("Consultar")){
            lblBusqueda = new JLabel(almacen.buscaArticulo(codigo));
             add(lblBusqueda);
             updateUI();
            
        }
    }
    
}
