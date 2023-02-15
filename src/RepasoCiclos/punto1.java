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
public class punto1 {
    
    public static void selec(){
        
        Scanner scan = new Scanner(System.in);
        int multiplicando = (int) (Math.random()*2024);
        int multiplicador = (int) (Math.random()*2024);
        int cont = 0;
        String enter;
        boolean aprobado = true;
        
        System.out.println("Ingrese un número del 1 al 4 segun el tipo de ciclo que desea usar");
        System.out.println("1. While");
        System.out.println("2. Do-While");
        System.out.println("3. For");
        System.out.println("4. For Each");
        System.out.print("Esperando datos:");
        enter = scan.nextLine();
        
        do{
            switch(enter){
                case "1":
                    aprobado = While(multiplicador, cont, multiplicando);
                    break;
                    
                case "2":
                    aprobado = DoWhile(multiplicador, cont, multiplicando);
                    break;
                    
                case "3":
                    aprobado = For(multiplicador, multiplicando);
                    break;
                    
                case "4":
                    aprobado = Each(multiplicador, cont, multiplicando);
                    break;
                    
                default: 
                    aprobado = false;
                    System.out.println("Ingrese un número valido");
                    enter = scan.nextLine();
            }
        }while(!aprobado);    
    }
    
    public static boolean While(int multiplicador, int cont, int multiplicando){
                
        while(cont != multiplicador+1){
            System.out.println( multiplicando + "*" + cont + "=" + multiplicando*cont);
            cont++;
        }
        return true;
    }
    
    public static boolean DoWhile(int multiplicador, int cont, int multiplicando){
        
        do{
            System.out.println( multiplicando + "*" + cont + "=" + multiplicando*cont);
            cont++;
        }while(cont != multiplicador+1);
        return true;
    }
    
    public static boolean For(int multiplicador,  int multiplicando){
        
        for(int i = 0; i != multiplicador+1; i++){
            System.out.println( multiplicando + "*" + i + "=" + multiplicando*i);
        }
        return true;
    }
    
    public static boolean Each(int multiplicador,  int cont, int multiplicando){
        
        int [] almacen = new int[multiplicador+1];
        
        for(int resul : almacen){
            almacen[cont] = cont*multiplicando;
            cont++;
        }
        
        cont = 0;
        
        for(int resul : almacen){
            System.out.println(multiplicando + "*" + cont + "=" + resul);
            cont++;
        }
        return true;
    }
}
