/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author aa508
 */
public class ClassPila 
{
    private int []vec;
    //private int tam;
    private int tope;
    private boolean vacia;
    private boolean llena;
    
    public ClassPila (int n)
    {
        //tam = n;
        vec = new int[n];
        tope = 0;
        vacia = true;
        llena = false;
    }
    
    public void push(int valor)
    {
        vacia = false;
        vec[tope++]= valor;
        if( tope== vec.length) //tam)
            llena = true;
    }
    
    public int pop(){
        if(--tope == 0)
            vacia = true;
        llena = false;
        return vec[tope];
    }
    
    public boolean estaVacia()
    {
        return vacia;    
    }
    
    public boolean esta_Llena()
    {
        return llena;
    }
    
}