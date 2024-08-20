/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author angel
 */
public class operacionesaritmeticas {
   private int a, b, totsuma, totresta, totmul;
    
    public operacionesaritmeticas(int a, int b){
        this.a=a;
        this.b=b;
    
}
    public void setsuma(){
        totsuma=a+b;
    }
    public void setresta(){
        totresta=a-b;
    }
    public void setmultiplicacion(){
        totmul=a*b;
    }
    
    public int gettotsuma(){
        return totsuma;
    }
     public int gettotresta(){
        return totresta;
    }
      public int gettotmul(){
        return totmul;
    }
}
