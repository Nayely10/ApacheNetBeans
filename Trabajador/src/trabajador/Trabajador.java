/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajador;



/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Trabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un programa que le permita al usuario ingresar el tipo de trabajador (FIJO O TEMPORAL)
        //Y  con base a esto pueda imprimir el nombre y el salario neto sabiendo que:
        //1.3 si es FIJO debe leer el nombre, numero de horas trabajadas, el salario basico hora,el total de deduciones
        //y estotal de bonoficaciones
        //2.si es TEMPORAL solo debe de leer el  nombre y el numero de horas trabajadas
        //estos trabajadores tiene un salario basico fijo hora de 60.000
        //y no tiene deduciones ni bonificaciones
        Scanner guardar= new Scanner(System.in);
                
        String nombre,tipotrabajador;
        double salariohora,deduciones,bonificaciones,salariototal;
        int horastrabajadas;
        
       
        System.out.println("ingrese tipo de trabajador(fijo tempotal)");
        tipotrabajador=guardar.nextLine();
 
        if("fijo".equals(tipotrabajador))
        {
            System.out.println("ingrese su nombre");
            nombre=guardar.nextLine();
            System.out.println("ingrese numero de horas trabajadas");
            horastrabajadas=guardar.nextInt();
            System.out.println("ingrese salario por hora");
            salariohora=guardar.nextDouble();
            System.out.println("ingrese total de deduciones");
            deduciones=guardar.nextDouble();
            System.out.println("ingrese el total de bonificaciones");
            bonificaciones=guardar.nextDouble();
            
            salariototal=(horastrabajadas*salariohora)+bonificaciones-deduciones;
            System.out.println(nombre+"su salario neto es:"+salariototal);
            
        }
        else{
            System.out.println("ingrese su nombre");
            nombre=guardar.nextLine();
            System.out.println("ingrese numero de horas trabajadas");
            horastrabajadas=guardar.nextInt();
            
            salariototal=(horastrabajadas*60.000);
            System.out.println(nombre+"su salario neto es:"+salariototal);
                    
                    
        }
        
        
        }
        
        
    }
    

