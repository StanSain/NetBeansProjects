/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author John
 */
public class Operaciones {
    public int suma(int a, int b){
        return a+b;
    }
    
    public void controlaEdad(int e){
        if (e<18){
            System.out.println("menor de edad");
        }
        else{
            System.out.println("puede pasar");
        }
    }
    
    public int recurrente(int k){
        if (k>0){
            return k + recurrente(k-1);
        }else{
            return 0;
        }
    }
    
    public int fuma(int a, int b){
        if(a<b){
            return b + fuma (a , (b-1));
        }else{
            return b;
        }
            
    }
   public int entero(){
       int x = 5;
       return x;
   } 
    
}
