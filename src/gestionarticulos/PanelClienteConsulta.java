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
public class PanelClienteConsulta extends JPanel implements ActionListener{
    private Color colorFondo = new Color(170,45,72); 
    LabelCliente lblBusqueda, lblNIF;
    JTextField txtNIF;
    JButton btnConsulta;
    Clientes clientes;
    
    
    PanelClienteConsulta(Clientes clientes){
        super();
        this.clientes=clientes;
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(0,1));
        setBackground(colorFondo);
        componentes();
        
    }
    
    public void componentes(){
        
        lblNIF= new LabelCliente("NIF: ");
        add(lblNIF);
        txtNIF= new JTextField();
        add(txtNIF);
        btnConsulta=new JButton("Consultar");
        btnConsulta.addActionListener(this);
        add(btnConsulta);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        String NIF;
        
        NIF=txtNIF.getText();

        if(boton.equals("Consultar")){
            lblBusqueda = new LabelCliente(clientes.buscaCliente(NIF));
             add(lblBusqueda);
             updateUI();
            
        }
    }
    
}
