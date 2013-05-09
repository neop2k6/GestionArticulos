/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

import javax.swing.JLabel;

/**
 *
 * @author MRBrown
 */
public class Almacen {

    int nArticulos;
    private Articulo[] almacen;
    
    Almacen(int max){
        almacen = new Articulo[max];
        nArticulos=0;
       
    }
    
    public void setArticulo(int codigo, String descripcion, double precio, int stock){
        almacen[nArticulos] = new Articulo(codigo,descripcion,precio,stock);
        nArticulos++;
    }
    
    public String getArticulo(int pos){
        return almacen[pos].getCodArticulo()+"  "+almacen[pos].getDescripcion()+"   "+almacen[pos].getPrecio()+"    "+almacen[pos].getStock();
    }
    
    public String buscaArticulo(int codigo){
        String articulo= " ";
        for(int i=0; i<nArticulos ;i++){
                if(almacen[i].getCodArticulo()==codigo){
                    articulo =getArticulo(i);
                }
        }
        return articulo;
    }
    
    public boolean borrarElemento(int codigo){
        boolean borrado=false;
        int i=0;
        while(i<nArticulos && borrado==false){
            if(almacen[i].getCodArticulo()==codigo){
                    almacen[i]=almacen[nArticulos];
                    borrado=true;
               }
            i++;
        }
        return borrado;
    }
    
    public void setArticuloPos(int pos, int codigo, String descripcion, double precio, int stock){

        if(almacen[pos]==null){
        almacen[pos] = new Articulo(codigo,descripcion,precio,stock);       
        }
        else{
            for(int i=0; i<nArticulos ;i++){
                if(almacen[i]==null){
                    almacen[i]=almacen[pos];
                }
            }
            almacen[pos] = new Articulo(codigo,descripcion,precio,stock);  
        }
        
    }
    
//    public void getPosArticulo(String codigo){
//        
//         boolean si;
//         int i=0;
//         
//         while(i<nArticulos){
//             if()
//         }
//        
//        
//    }
    
    
    
    
    
    
    
    @Override
    public String toString(){ 
        String cadena =" ";
        for(int i=0;i<nArticulos; i++){
            cadena=cadena+almacen[i];
        }
        System.out.println(cadena);
        return cadena;
    }
    
    
    
    
    
    
    

}
