/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.java.saturday;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio1JavaSaturday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         System.out.println("ingrese un valo: ");
        int num = leer.nextInt();
        int suma = 0;
        //implemenacion del for para completa el proyecto
        for(int i =0; i <= num; i=i+2 ){
            suma = suma + i;  
        }
        System.out.print("la suma es " +suma);     
    }

}