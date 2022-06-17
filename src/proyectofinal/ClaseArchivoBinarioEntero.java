/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayram
 */
public class ClaseArchivoBinarioEntero {
    
    public void guardarVecEnArchivo(String nomarch, int [][]vec){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream(nomarch);
            //C:\\Users\\mosva\\Desktop\\ArchivossPracticas\\numeros1.mos
            dos = new DataOutputStream(fos);
            
            for(int r=0; r<vec.length; r++)
                for(int c=0; c<vec.length; c++)
            {
                try 
                {
                    dos.writeInt(vec[r][c]);
                } catch (IOException ex) 
                {
                    Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                try {
                    if(fos != null)
                        fos.close();
                    
                    if(dos != null)
                        dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void agregarVecEnArchivo(String nomarch, int [][]vec){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream(nomarch, true);
            //C:\\Users\\mosva\\Desktop\\ArchivossPracticas\\numeros1.mos
            dos = new DataOutputStream(fos);
            
            for(int r=0; r<vec.length; r++)
            {
               for(int c=0; c<vec.length; c++)
               {
                try 
                {
                    dos.writeInt(vec[r][c]);
                } catch (IOException ex) {
                    Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                try {
                    if(fos != null)
                        fos.close();
                    
                    if(dos != null)
                        dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void leerVecEnArchivo(String nomarch, Numero numero,DefaultTableModel vec){
        FileInputStream fis = null;
        DataInputStream dis = null;
        int dato;
        numero.num = 0;//variable de entrada salida, pase por referencia
        
             try {
                fis = new FileInputStream(nomarch);
                dis = new DataInputStream(fis);
                
                while(true){
                    dato = dis.readInt();//se lee un entero del archivo
                    System.out.println(dato);//se muestra e pantalla de la consola
                    
                    //vec => Modelo
                    vec.addRow(new Object[numero.num]);//, num.i++,0;
                    vec.setValueAt(String.valueOf(dato), numero.num++, 0);
                }
            } catch (FileNotFoundException ex) {
               // Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println(ex.getMessage());
            //C:\\Users\\mosva\\Desktop\\ArchivossPracticas\\numeros1.mos
        } catch (IOException ex) {
            //Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("Fin del archivo");
        }
        finally{
                try {
                    if(fis != null)
                       fis.close();
                    
                    if(dis != null)
                        dis.close();
            } catch (IOException ex) {
                Logger.getLogger(ClaseArchivoBinarioEntero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
