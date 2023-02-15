/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoCiclos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CiclosRepaso {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        String entra;
        boolean aprobado = true;
        
        System.out.println("Ingrese el número del ejercicio que desea revisar.");
        System.out.println("Las opciones son 1, 2, 3, 4");
        System.out.print("Esperando datos:");
        entra = scan.nextLine();
        
        do{
            switch(entra){
                case "1":
                    punto1.selec();
                    aprobado = true;
                    break;

                case "2":
                    punto2.selec();
                    aprobado = true;
                    break;

                case "3":
                    punto3.selec();
                    aprobado = true;
                    break;

                case "4":
                    punto4.selec();
                    aprobado = true;
                    break;

                default: 
                    aprobado = false;
                    System.out.println("Ingrese un número valido");
                    entra = scan.nextLine();
            }
        }while(!aprobado);
    }
}
