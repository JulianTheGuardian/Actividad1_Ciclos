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
public class punto3 {
    
    public static void selec(){
        
        Scanner scan = new Scanner(System.in);
        int tam = (int) (Math.random()*23+1);
        int cont = 0;
        String enter;
        String num = "";
        boolean aprobado = true;
        
        String [] name = new String[tam];
        String [] cant = new String[tam];
        String [] precio = new String[tam];
        
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
                    
                    System.out.println("Ingrese " + tam + " productos, precio y cantidad segun se le pida:");
                    aprobado = While(cont, tam, scan, name, cant, precio, num);
                    break;
                    
                case "2":
                    
                    System.out.println("Ingrese " + tam + " productos, precio y cantidad segun se le pida:");
                    aprobado = DoWhile(cont, tam, scan, name, cant, precio, num);
                    break;
                    
                case "3":
                    
                    System.out.println("Ingrese " + tam + " productos, precio y cantidad segun se le pida:");
                    aprobado = For(tam, scan, name, cant, precio, num);
                    break;
                    
                case "4":
                    
                    System.out.println("Ingrese " + tam + " productos, precio y cantidad segun se le pida:");
                    aprobado = Each(cont, scan, name, cant, precio, num);
                    break;
                    
                default:
                    
                    aprobado = false;
                    System.out.println("Ingrese un númeor valido");
                    enter = scan.nextLine();
            }
            
        }while(!aprobado);
    }
    
    public static boolean While(int cont, int tam, Scanner scan, String name[], String cant[], String precio[], String num){

            while(cont != tam){
                System.out.print("Producto " + (cont+1) + ": ");
                name[cont] = scan.nextLine();
                
                while(name[cont].matches("")){
                    System.out.print("Ingrese un producto: ");
                    name[cont] = scan.nextLine();
                }
                
                System.out.print("Cantidad del producto: ");
                num = scan.nextLine();
                cant[cont] = "a";
                
                while(cant[cont].matches("[^0-9]+")){
                    if(num.matches("[0-9]+")){
                        cant[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        cant[cont] = "a";
                    }
                }
                
                System.out.print("Precio del producto: ");
                num = scan.nextLine();
                precio[cont] = "a";
                
                while(precio[cont].matches("[^0-9]+")){
                    if(num.matches("[0-9]+")){
                        precio[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        precio[cont] = "a";
                    }
                }
                cont++;
            }
            
            System.out.println("");
            cont = 0;
            System.out.println("Lista de la compra:");
            System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");
            
            while(cont != tam){
                System.out.println(name[cont] + "\t\t\t\t" + cant[cont] + "\t\t\t\t" + precio[cont]);
                cont++;
            }
            return true;
    }
    
    public static boolean DoWhile(int cont, int tam, Scanner scan, String name[], String cant[], String precio[], String num){
            
            do{
                System.out.print("Producto " + (cont+1) + ": ");
                name[cont] = scan.nextLine();
                
                do{
                    if(name[cont].matches("")){
                        System.out.print("Ingrese un producto: ");
                        name[cont] = scan.nextLine();
                    }
                }while(name[cont].matches(""));
                
                System.out.print("Cantidad del producto: ");
                num = scan.nextLine();
                
                do{
                    if(num.matches("[0-9]+")){
                        cant[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        cant[cont] = "a";
                    }
                }while(cant[cont].matches("[^0-9]+"));
                
                System.out.print("Precio del producto: ");
                num = scan.nextLine();
                
                do{
                    if(num.matches("[0-9]+")){
                        precio[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        precio[cont] = "a";
                    }
                }while(precio[cont].matches("[^0-9]+"));
                
                cont++;
                
            }while(cont != tam);
            
            System.out.println("");
            cont = 0;
            System.out.println("Lista de la compra:");
            System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");
            
            do{
                System.out.println(name[cont] + "\t\t\t\t" + cant[cont] + "\t\t\t\t" + precio[cont]);
                cont++;
            }while(cont != tam);
            
            return true;
    }
    
    public static boolean For(int tam, Scanner scan, String name[], String cant[], String precio[], String num){
        
            for(int i = 0; i != tam; i++){

                System.out.print("Producto " + (i+1) + ": ");
                name[i] = scan.nextLine();

                do{
                    if(name[i].matches("")){
                        System.out.print("Ingrese un producto: ");
                        name[i] = scan.nextLine();
                    }
                }while(name[i].matches(""));

                System.out.print("Cantidad del producto: ");
                num = scan.nextLine();

                do{
                    if(num.matches("[0-9]+")){
                        cant[i] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        cant[i] = "a";
                    }
                }while(cant[i].matches("[^0-9]+"));

                System.out.print("Precio del producto: ");
                num = scan.nextLine();

                do{
                    if(num.matches("[0-9]+")){
                        precio[i] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        precio[i] = "a";
                    }
                }while(precio[i].matches("[^0-9]+"));
            }

            System.out.println("Lista de la compra:");
            System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");

            for(int i = 0; i != tam; i++){
                System.out.println(name[i] + "\t\t\t\t" + cant[i] + "\t\t\t\t" + precio[i]);
            }
        return true;
    }

    public static boolean Each(int cont, Scanner scan, String name[], String cant[], String precio[], String num){
        
            for(String resul : name){

                System.out.print("Producto " + (cont+1) + ": ");
                name[cont] = scan.nextLine();

                while(name[cont].matches("")){
                    System.out.print("Ingrese un producto: ");
                    name[cont] = scan.nextLine();
                }

                System.out.print("Cantidad del producto: ");
                num = scan.nextLine();
                cant[cont] = "a";
                
                while(cant[cont].matches("[^0-9]+")){
                    if(num.matches("[0-9]+")){
                        cant[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        cant[cont] = "a";
                    }
                }

                System.out.print("Precio del producto: ");
                num = scan.nextLine();
                precio[cont] = "a";
                
                while(precio[cont].matches("[^0-9]+")){
                    if(num.matches("[0-9]+")){
                        precio[cont] = num;
                    }
                    else{
                        System.out.print("Ingrese un número entero: ");
                        num = scan.nextLine();
                        precio[cont] = "a";
                    }
                }
                cont++;
            }

            cont = 0;

            System.out.println("Lista de la compra:");
            System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");

            for(String resul : name){
                System.out.println(resul + "\t\t\t\t" + cant[cont] + "\t\t\t\t" + precio[cont]);
                cont++;
            }
        return true;
    }
}
