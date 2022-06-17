/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author ayram
 */
public class ClassBusqueda {
    
    public static void Secuencial_Datos_Desordenados(Producto[]vec, String X, Numero pos)
    {
        pos.num = -1;
        int i = 0;
        
        while((pos.num == -1) && (i<vec.length))
        {    
            if(vec[i].getProducto().compareTo(X) == 0)
            {
                pos.num = i;
                //return true;
            }
            i++;
        }
        //return false;
        //Implementar con for y do-while
    }
    
    public static void SDD(Producto []vec, int X, Numero pos)
    {
        pos.num = -1;
        int i = 0;
        
        while((pos.num == -1) && (i<vec.length))
        {    
            if(vec[i].getCodigo() == X)
            {
                pos.num = i;
                //return true;
            }
            i++;
        }
        //return false;
        //Implementar con for y do-while
    }
    
}
