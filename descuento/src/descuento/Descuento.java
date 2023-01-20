/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner ;
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un 
        
        double valorcompra,valordescuento,totalpago;
        
        //3crear el scanner
        Scanner leer = new Scanner(System.in);
        //4 pedir los datos de entrada
          System.out.println("ingrese el valor de la compra");
          valorcompra=leer.nextDouble();
         //5procesos operacion
         if(valorcompra>600.000)
         {
             valordescuento= valorcompra* 0.20;
             totalpago =valorcompra-valordescuento;
             System.out.println("El total del descuento es de :"+valordescuento);
             System.out.println("Y el total a pagar es"+totalpago);
         }
         else 
         {
             valordescuento=valorcompra*0.10;
             totalpago=valorcompra-valordescuento;
             System.out.println("El total del descuento es de :"+valordescuento);
             System.out.println("Y el total a pagar es"+totalpago);
         }
             
             
    }
    
}
