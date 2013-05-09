
package gestionarticulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author MRWhite
 */
public class PanelClienteNuevo extends JPanel implements ActionListener {
    
    LabelCliente lblNIF, lblNombre, lblTelf, lblDescuento;
    JTextField txtCodigo, txtNIF, txtNombre, txtTelf, txtDescuento;
    JButton btnCrear;
    Clientes clientes;
    private Color colorFondo = new Color(170,45,72); 
    private Color color2 = new Color(0,0,0);
    
    PanelClienteNuevo(){
        super();
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(0,2));
        setBackground(colorFondo);
        
        lblNIF=new LabelCliente("NIF :");
        add(lblNIF);
        txtNIF=new JTextField();
        add(txtNIF);
        
        lblNombre=new LabelCliente("Nombre :");
        add(lblNombre);
        txtNombre=new JTextField();
        add(txtNombre);
        
        lblTelf=new LabelCliente("Telefono :");
        add(lblTelf);
        txtTelf=new JTextField();
        add(txtTelf);
        
        lblDescuento=new LabelCliente("Descuento :");
        add(lblDescuento);
        txtDescuento=new JTextField();
        add(txtDescuento);        
        
        btnCrear =new JButton("Crear");
        btnCrear.addActionListener(this);
        add(btnCrear);
        
        clientes = new Clientes(100);
    }
    
    public Clientes getClientes(){
        return clientes;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
    
        String NIF, nombre;        
        int telf, descuento;
        
        NIF=txtNIF.getText();
        nombre=txtNombre.getText();
        telf=Integer.parseInt(txtTelf.getText());
        descuento=Integer.parseInt(txtDescuento.getText());
        
        if(boton.equals("Crear")){
            clientes.setCliente(NIF, nombre, telf, descuento);
            
        }
    }
    

    
}
