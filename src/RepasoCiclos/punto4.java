/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoCiclos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class punto4 {
    
    public static void selec(){
        
        Scanner scan = new Scanner(System.in);
        int cont;
        int vec = 0;
        String enter;
        String rotar;
        boolean aprobado = true;
        
        System.out.println("Ingrese un número del 1 al 4 segun el tipo de ciclo que desea usar");
        System.out.println("1. While");
        System.out.println("2. Do-While");
        System.out.println("3. For");
        System.out.println("4. For Each");
        System.out.print("Esperando datos:");
        enter = scan.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese la frase o texto que desea dar vuelta: ");
        rotar = scan.nextLine();
        
        cont = rotar.length()-1;
        char [] almacen = new char[rotar.length()];
        
        System.out.println("");
        System.out.print( "Palabra invertida: ");
        
        do{
            switch(enter){
                case "1":
                    aprobado = While(cont, rotar);
                    break;
                    
                case "2":
                    
                    aprobado = DoWhile(cont, rotar);
                    break;
                    
                case "3":
                    
                    aprobado = For(rotar);
                    break;
                    
                case "4":
                    
                    aprobado = Each(cont, rotar, almacen, vec);
                    break;
                    
                default:
                    
                    aprobado = false;
                    System.out.println("Ingrese un númeor valido");
                    enter = scan.nextLine();
            }
            
        }while(!aprobado);
        System.out.println("");
    }
    
    public static boolean While(int cont, String rotar){
        
        while(cont >= 0){
            System.out.print(rotar.charAt(cont));
            cont--;
        }
        return true;
    }
    
    public static boolean DoWhile(int cont, String rotar){
        
        do{
            System.out.print(rotar.charAt(cont));
            cont--;
        }while(cont >= 0);
        return true;
    }
    
    public static boolean For(String rotar){
        
        for(int i = rotar.length()-1; i >= 0; i--){
            System.out.print(rotar.charAt(i));
        }
        return true;
    }
    
    public static boolean Each(int cont, String rotar, char almacen[], int vec){
        
        for(char resul : almacen){
            almacen[vec] = rotar.charAt(cont);
            cont--;
            vec++;
        }
        vec =0;
        
        for(char resul : almacen){
            System.out.print(resul);
        }
        return true;
    }
}
