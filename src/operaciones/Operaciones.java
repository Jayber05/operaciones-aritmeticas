/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion, x,y;
        Scanner entrada=new Scanner(System.in);
         System.out.println("hola usuario, digita 2 numeros");
        x=entrada.nextInt();
        y=entrada.nextInt();
        operacionesaritmeticas z=new operacionesaritmeticas(x,y);
        
       
        
        
        System.out.println("¿Que operacion deseas que se realice?\n1:suma\n2:resta\n3:multiplicacion");
        eleccion=entrada.nextInt();
        
        switch(eleccion){
            case 1:
                z.setsuma();
        System.out.println("la suma es: "+z.gettotsuma());
        break;
            case 2:
                z.setresta();
        System.out.println("la resta es: "+z.gettotresta());
        break;
            case 3:
                z.setmultiplicacion();
        System.out.println("la multiplicacion es: "+z.gettotmul());
        break;
        }
    }
    
}
