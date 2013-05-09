
package gestionarticulos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author MRWhite
 */
public class PanelArticuloNuevo extends JPanel implements ActionListener {
    
    JLabel lblTitulo, lblCodigo, lblDescripcion, lblPrecio, lblStock;
    JTextField txtCodigo, txtDescripcion, txtPrecio, txtStock;
    JButton btnCrear;
    private Color colorFondo = new Color(92,199,97); 
    private Color color2 = new Color(0,0,0);
    GestionArticulos jfGes;
    Almacen almacen;
    boolean hecho = false;
    
    PanelArticuloNuevo(){
        super();
        setPreferredSize(new Dimension(650, 250));
        setLayout(new GridLayout(5,2));
        setBackground(colorFondo);
        componentes();
        crearAlmacen(hecho);
        
    }
    public void componentes(){
        lblCodigo=new JLabel("Codigo Articulo :");
        add(lblCodigo);
        txtCodigo=new JTextField();
        add(txtCodigo);
        
        lblDescripcion=new JLabel("Descripcion :");
        add(lblDescripcion);
        txtDescripcion=new JTextField();
        add(txtDescripcion);
        
        lblPrecio=new JLabel("Precio :");
        add(lblPrecio);
        txtPrecio=new JTextField();
        add(txtPrecio);
        
        lblStock=new JLabel("Stock :");
        add(lblStock);
        txtStock=new JTextField();
        add(txtStock);        
        
        btnCrear =new JButton("Crear");
        btnCrear.addActionListener(this);
        add(btnCrear);
    
}
    
    public Almacen getAlmacen(){
        return almacen;
    }
    
    public void crearAlmacen(boolean hecho){
        if(hecho == false){
            almacen= new Almacen(100);
            hecho = true;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String boton = ae.getActionCommand();
        int stock, codigo;
        String descripcion;        
        double precio;
        String texto;
        
        codigo=Integer.parseInt(txtCodigo.getText());
        descripcion=txtDescripcion.getText();
        precio=Double.parseDouble(txtPrecio.getText());
        stock=Integer.parseInt(txtStock.getText());


            
            if(boton.equals("Crear")){
            almacen.setArticulo(codigo,descripcion,precio,stock);
        }
    }


    

    
}
