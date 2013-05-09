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
public class PanelArticuloBorrar extends JPanel implements ActionListener{
    private Color colorFondo = new Color(92,199,97); 
    JLabel lblBorrar, lblCodigo;
    JTextField txtCodigo;
    JButton btnBorrar;
    Almacen almacen;
    
    PanelArticuloBorrar(Almacen almacen){
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
        btnBorrar=new JButton("Borrar");
        btnBorrar.addActionListener(this);
        add(btnBorrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        int codigo;
        boolean borrado;
        codigo=Integer.parseInt(txtCodigo.getText());
        
        if(boton.equals("Borrar")){
            borrado=almacen.borrarElemento(codigo);
            if(borrado==true){
                lblBorrar = new JLabel("Articulo Borrado");
                add(lblBorrar);
                updateUI();
            }
            
        }
    }
    
    
}
