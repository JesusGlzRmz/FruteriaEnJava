/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayram
 */
public class Producto {
    String producto;
    private int codigo;
    private double precio;
    private int cantidad;
    
    public Producto()
    {
        producto = "";
        codigo = 0;
        precio = 0.0;
        cantidad = 0;
    }
    
    public Producto(String pro,int sku, double pre, int cant)
    {
        producto = pro;
        codigo = sku;
        precio = pre;
        cantidad = cant;
    }
    
    public String getProducto()
    {
        return producto;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setProducto(String pro)
    {
        producto = pro;
    }
    
    public void setCodigo(int sku)
    {
        codigo = sku;
    }
    
    public void setPrecio(double pre)
    {
        precio = pre;
    }
    
    public void setCantidad(int can)
    {
        cantidad = can;
    }
    
    public String toString()
    {
        return producto+"  codigo del producto: "+
               codigo+" precio: "+precio+" cantidad: "+cantidad;
    }
    
    public double Total()
    {
        return cantidad*precio;
    }
    
    
    
    public int CantPro(DefaultTableModel model)
    {
        int t = model.getRowCount();
        return t;
    }
}
