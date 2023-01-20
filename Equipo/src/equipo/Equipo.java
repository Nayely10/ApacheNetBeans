/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipo;

/**
 *
 * @author Laboratorio
 */
 import java.util.Scanner ;
public class Equipo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un programa que indique si una persona es apta o no es apta para un equipo de baloncesto
        //para ser apto debe cumplir lo siguiente:  
        //1 medir si es hombre debe de ser mayor de edad, medir mas de 1.70 metros y que pese menos de 75kg
        //2 si es mujer que tenga mas de 16 años, que mida minimo 1.70 y pese maximo 60kg
        String genero;
        int edad;
        double estatura,peso;
        
        System.out.println("ingrese su genero(F M");
        genero=guardar.next();
        System.out.println("ingrese su edad");
        edad=guardar.nextInt();
        System.out.println("ingrese su estatura");
        estatura=guardar.nextDouble();
        System.out.println("ingrese su peso");
        peso=guardar.nextDouble();
        
        if((estatura>1.70) && ("M".equals(genero)) && (peso<=75) && (edad>=18))
        {
            System.out.println("Eres apto para ingresar al equipo");
        }
        else if ( (estatura>1.70) && ("F".equals(genero)) && (peso<60) && (edad>=16))
        {
            System.out.println("Eres apta para ingresar al equipo");
        }
        else
        {
            System.out.println("No apt@ para ingresar al equipo");
        }
    }

    private static class guardar {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public guardar() {
        }
    }
}
