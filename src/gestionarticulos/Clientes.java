/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarticulos;

/**
 *
 * @author alum
 */
public class Clientes {
    Cliente[] clientes;
    int nCliente;
    
    
    Clientes(int max){
        clientes=new Cliente[max];
        nCliente=0;
    }
    
    public void setCliente(String NIF, String nombre,int telf, int descuento){
        clientes[nCliente] = new Cliente(NIF,nombre,telf,descuento);
        nCliente++;
    }
    
    public String getCliente(int pos){
        return clientes[pos].getNIF()+"  "+clientes[pos].getNombre()+"   "+clientes[pos].getTlf()+"    "+clientes[pos].getDescuento();
    }
    
    public String buscaCliente(String NIF){
        String cliente= " ";
        for(int i=0; i<nCliente ;i++){
                if(clientes[i].getNIF().equals(NIF) == true){
                    cliente =getCliente(i);
                }
        }
        return cliente;
    }
    
    public boolean borrarCliente(String NIF){
        String cliente= " ";
        boolean borrado = false;
        int i=0;
        while (i<nCliente && borrado==false){
                if(clientes[i].getNIF().equals(NIF) == true){
                    clientes[i] =clientes[nCliente];
                    borrado=true;
                }
                i++;
        }
        return borrado;
    }
    
}
