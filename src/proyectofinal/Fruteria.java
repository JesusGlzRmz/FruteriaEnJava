/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ayram
 */
public class Fruteria {
    private Producto [] lista;
    
    public Fruteria()
    {
        lista = new Producto[5];
        for(int r=0; r<lista.length; r++)
            lista[r] = new Producto();
    }
    
    public Fruteria(int n)
    {
        if(n<1)
            n = 5;
        
        lista = new Producto[n];
        for(int r=0; r<lista.length; r++)
            lista[r] = new Producto();
    }
    
    public int getTamaño()
    {
        return lista.length;
    }
    
    public Producto getProducto(int pos)
    {
        return lista[pos];
    }
    
    public void setProducto(Producto pro, int pos)
    {
        lista[pos] = pro;
    }
    
    public Producto getCodigo(int pos)
    {
        return lista[pos];
    }
    
    public void setCodigo(Producto sku, int pos)
    {
        lista[pos] = sku;
    }
    
    public Producto getPrecio(int pos)
    {
        return lista[pos];
    }
    
    public void setPrecio(Producto pre, int pos)
    {
        lista[pos] = pre;
    }
    
    public Producto getCantidad(int pos)
    {
        return lista[pos];
    }
    
    public void setCantidad(Producto cant, int pos)
    {
        lista[pos] = cant;
    }
    
    public void Mostrar(JTable tabla, JTextField texto, JTextField CanProd)
    {
        double total = 0;
        int can = 0; 
        DecimalFormat f = new DecimalFormat("##,###.00");
        
        for(int r=0; r<tabla.getRowCount(); r++)
        {
            tabla.setValueAt(lista[r].getProducto(), r, 0);
            tabla.setValueAt(lista[r].getCodigo(), r, 1);
            tabla.setValueAt(f.format(lista[r].getPrecio()), r, 2);
            tabla.setValueAt(lista[r].getCantidad(), r, 3);
            
            tabla.setValueAt(f.format(lista[r].Total()), r, 4);
            
            total += lista[r].Total();
            can += lista[r].getCantidad();
        }
        
        texto.setText(f.format(total));
        CanProd.setText(can+"");
    }
    
    public void quicksortProducto(Producto []vec, int izq, int der)
    {
        int i, j;
        Producto pivote, aux;
        i = izq;
        j = der;
        
        pivote = vec[(izq+der)/2];
        
        do
        {
            while(vec[i].getProducto().compareTo(pivote.getProducto()) < 0 && i < der)
                i++;
            
            while(vec[i].getProducto().compareTo(pivote.getProducto()) > 0 && j > izq)
                j--;
            
            if(i <= j) 
            {
                aux = vec[i];
                vec[i] = vec[j] ;
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
            if(izq < j)
            quicksortProducto(vec,izq,j);
                   
            if(i < der)
            quicksortProducto(vec,i,der);
    }
    
    public void quicksortCodigo(Producto []vec, int izq, int der)
    {
        int i, j;
        Producto pivote, aux;
        i = izq;
        j = der;
        
        pivote = vec[(izq+der)/2];
        
        do
        {
            while(vec[i].getCodigo() < pivote.getCodigo() && i < der)
                i++;
            
            while(vec[i].getCodigo() > pivote.getCodigo() && j > izq)
                j--;
            
            if(i <= j) 
            {
                aux = vec[i];
                vec[i] = vec[j] ;
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
            if(izq < j)
            quicksortProducto(vec,izq,j);
                   
            if(i < der)
            quicksortProducto(vec,i,der);
    }
    
    public void quicksortPrecio(Producto []vec, int izq, int der)
    {
        int i, j;
        Producto pivote, aux;
        i = izq;
        j = der;
        
        pivote = vec[(izq+der)/2];
        
        do
        {
            while(vec[i].getPrecio() < pivote.getPrecio() && i < der)
                i++;
            
            while(vec[i].getPrecio() > pivote.getPrecio() && j > izq)
                j--;
            
            if(i <= j) 
            {
                aux = vec[i];
                vec[i] = vec[j] ;
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
            if(izq < j)
            quicksortProducto(vec,izq,j);
                   
            if(i < der)
            quicksortProducto(vec,i,der);
    }
    
    public void quicksortCantidad(Producto []vec, int izq, int der)
    {
        int i, j;
        Producto pivote, aux;
        i = izq;
        j = der;
        
        pivote = vec[(izq+der)/2];
        
        do
        {
            while(vec[i].getCodigo() < pivote.getCodigo() && i < der)
                i++;
            
            while(vec[i].getCodigo() > pivote.getCodigo() && j > izq)
                j--;
            
            if(i <= j) 
            {
                aux = vec[i];
                vec[i] = vec[j] ;
                vec[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);
            if(izq < j)
            quicksortProducto(vec,izq,j);
                   
            if(i < der)
            quicksortProducto(vec,i,der);
    }
}
