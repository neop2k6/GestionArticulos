/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alum
 */
public class Articulo extends JPanel implements ActionListener{
    private int codArticulo;
    private String descripcion;
    private double precio;
    private int stock;
    
    Articulo(){
        
    }
    
    Articulo(int codArticulo, String descripcion){
        this(codArticulo ,descripcion, 0 ,0);
    }
    
    Articulo(int codArticulo, String descripcion, double precio, int stock){
         this.codArticulo=codArticulo;
         this.descripcion=descripcion;
         this.precio=precio;
         this.stock=stock;
    }
     

    
    @Override
    public String toString(){
        return "("+getCodArticulo()+","+getDescripcion()+","+getPrecio()+","+getStock()+")";
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
