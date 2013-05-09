/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

/**
 *
 * @author alum
 */
public class Cliente {
    
    private String NIF;
    private String nombre;
    private int tlf;
    private int descuento;
    
    Cliente(String NIF, String nombre, int tlf, int descuento){
        
        this.NIF=NIF;
        this.nombre=nombre;
        this.tlf=tlf;
        this.descuento=descuento;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    
}
