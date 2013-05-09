
package gestionarticulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author MRWhite
 */
public class PanelFacturaNuevo extends JPanel implements ActionListener {
    
    JLabel lblTitulo, lblCodigo, lblDescripcion, lblPrecio, lblStock;
    JTextField txtCodigo, txtDescripcion, txtPrecio, txtStock;
    JButton btnCrear;
    Almacen[] almacen;
    private Color colorFondo = new Color(225,145,19); 
    private Color color2 = new Color(0,0,0);
    
    PanelFacturaNuevo(){
        super();
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(5,2));
        setBackground(colorFondo);
//        lblTitulo=new JLabel("Articulo Nuevo :");
//        add(lblTitulo);
        
        lblCodigo=new JLabel("Codigo Articulo :");
        add(lblCodigo);
        txtCodigo=new JTextField(" ");
        add(txtCodigo);
        
        lblDescripcion=new JLabel("Descripcion :");
        add(lblDescripcion);
        txtDescripcion=new JTextField(" ");
        add(txtDescripcion);
        
        lblPrecio=new JLabel("Precio :");
        add(lblPrecio);
        txtPrecio=new JTextField(" ");
        add(txtPrecio);
        
        lblStock=new JLabel("Stock :");
        add(lblStock);
        txtStock=new JTextField(" ");
        add(txtStock);        
        
        btnCrear =new JButton("Crear");
        btnCrear.addActionListener(this);
        add(btnCrear);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        if(boton.equals("Crear")){
            System.out.println("Se va a crear un articulo Nuevo");
        }
    }
    

    
}
