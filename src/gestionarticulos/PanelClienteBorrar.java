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
 * @author alum
 */
public class PanelClienteBorrar extends JPanel implements ActionListener{
    private Color colorFondo = new Color(170,45,72); 
    LabelCliente lblBorrar, lblCodigo;
    JTextField txtNIF;
    JButton btnBorrar;
    Clientes clientes;
    
    PanelClienteBorrar(Clientes clientes){
        super();
        this.clientes= clientes;
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(0,1));
        setBackground(colorFondo);
        componentes();
        
    }
    
    public void componentes(){
        lblCodigo= new LabelCliente("NIF: ");
        add(lblCodigo);
        txtNIF= new JTextField();
        add(txtNIF);
        btnBorrar=new JButton("Borrar");
        btnBorrar.addActionListener(this);
        add(btnBorrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        String NIF;
        boolean borrado;
        NIF=txtNIF.getText();
        
        if(boton.equals("Borrar")){
            borrado=clientes.borrarCliente(NIF);
            if(borrado==true){
                lblBorrar = new LabelCliente("Elemento Borrado");
                add(lblBorrar);
                updateUI();
            }
            
        }
    }
    
    
}
