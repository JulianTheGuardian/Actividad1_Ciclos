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
public class punto2 {
    
    public static void selec(){
        Scanner scan = new Scanner(System.in);
        String enter;
        int tamano = (int) (Math.random()*9+1);
        int cont = 0;
        int mitad = 0;
        int cont2 = 0;
        int cont3 = 0;
        int max = 0;
        double media = 0;
        boolean aprobado = true;
        
        int [] almacen = new int[tamano];
        int [] almacen2 = new int[tamano];
        
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
                    aprobado = While(cont, tamano, enter, scan, almacen, mitad, media, almacen2, cont2, cont3, max);
                    break;
                    
                case "2":
                    aprobado = DoWhile(cont, tamano, enter, scan, almacen, mitad, media, almacen2, cont2, cont3, max);
                    break;
                    
                case "3":
                    aprobado = For(tamano, enter, scan, almacen, mitad, media, almacen2, cont3, max);
                    break;
                    
                case "4":
                    aprobado = Each(cont, tamano, enter, scan, almacen, mitad, media, almacen2, cont2, cont3, max);
                    break;
                    
                default:
                    aprobado = false;
                    System.out.println("Ingrese un númeor valido");
                    enter = scan.nextLine();
            }
            
        }while(!aprobado);
    }

    public static boolean While(int cont, int tamano, String enter, Scanner scan, int almacen[], int mitad, double media, int almacen2[], int cont2, int cont3, int max){
        
        System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
        //Llenar datos
        
            while(cont != tamano){
                System.out.print((cont+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[cont] = Integer.parseInt(enter);
                    cont++;
                }else{
                    System.out.println("Favor de ingresar números naturales.");
                }
            }

            cont = 0;
        
        //Mediana
        
            Arrays.sort(almacen);

            if(tamano%2 != 0){
                mitad = tamano/2;
                System.out.println("La mediana es: " + almacen[mitad]);
            }
            else{
                mitad = tamano/2;
                System.out.println("Hay 2 medianas, estas son: " + almacen[mitad-1] + " y " + almacen[mitad]);
            }

        //Media

            while(cont != tamano){
                media = media + almacen[cont];
                cont++;
            }
            System.out.println("La media es: " + media/tamano);
            
            cont = 0;

        //Moda
        
            while(cont != almacen2.length){
                while(cont2 != almacen2.length){
                    if(almacen[cont] == almacen[cont2]){
                        cont3++;
                    }
                    cont2++;
                }
                almacen2[cont] = cont3;
                cont++;
                cont3 = 0;
                cont2 = 0;
            }
            
            cont = 0;
            
            while(cont != almacen2.length){
                if(almacen2[cont] > max){
                    max = almacen2[cont];
                }
                cont++;
            }
            
            System.out.print("La moda es: ");
            while(cont2 != almacen.length){
                if(max == almacen2[cont2]){
                    if(cont2 != 0){
                        if(almacen[cont2] != almacen[(cont2-1)]){
                            System.out.print(almacen[cont2] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[cont2] + " ");
                    }
                }
                cont2++;
            }
            
            return true;
    }
    
    public static boolean DoWhile(int cont, int tamano, String enter, Scanner scan, int almacen[], int mitad, double media, int almacen2[], int cont2, int cont3, int max){
        
        //Llenar espacios

            System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
            do{
                System.out.print((cont+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[cont] = Integer.parseInt(enter);
                    cont++;
                }else{
                    System.out.println("Favor de ingresar numeros naturales.");
                }
            }while(cont != tamano);
            
            cont = 0;

        //Mediana

            Arrays.sort(almacen);

            if(tamano%2 != 0){
                mitad = tamano/2;
                System.out.println("La mediana es: " + almacen[mitad]);
            }
            else{
                mitad = tamano/2;
                System.out.println("Hay 2 medianas, estas son: " + almacen[mitad-1] + " y " + almacen[mitad]);
            }

        //Media

            do{
                media = media + almacen[cont];
                cont++;
            }while(cont != tamano);
            System.out.println("La media es: " + media/tamano);
            
            cont = 0;

        //Moda

            do{
                do{
                    if(almacen[cont] == almacen[cont2]){
                        cont3++;
                    }
                    cont2++;
                }while(cont2 != almacen2.length);
                
                almacen2[cont] = cont3;
                cont++;
                cont3 = 0;
                cont2 = 0;
                
            }while(cont != almacen2.length);
            cont = 0;
            
            do{
                if(almacen2[cont] > max){
                    max = almacen2[cont];
                }
                cont++;
            }while(cont != almacen2.length);
            
            System.out.print("La moda es: ");
            do{
                if(max == almacen2[cont2]){
                    if(cont2 != 0){
                        if(almacen[cont2] != almacen[(cont2-1)]){
                            System.out.print(almacen[cont2] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[cont2] + " ");
                    }
                }
                cont2++;
            }while(cont2 != almacen.length);
        
        return true;
    }
    
    public static boolean For(int tamano, String enter, Scanner scan, int almacen[], int mitad, double media, int almacen2[], int cont3, int max){
        System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
            for(int i=0; i != tamano; i++){
                System.out.print((i+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[i] = Integer.parseInt(enter);
                }else{
                    System.out.println("Favor de ingresar numeros naturales.");
                    i--;
                }
            }

        //Mediana

        Arrays.sort(almacen);
        
            if(tamano%2 != 0){
                mitad = tamano/2;
                System.out.println("La mediana es: " + almacen[mitad]);
            }
            else{
                mitad = tamano/2;
                System.out.println("Hay 2 medianas, estas son: " + almacen[mitad-1] + " y " + almacen[mitad]);
            }

        //Media

            for(int i=0 ; i != tamano; i++){
                media = media + almacen[i];
            }
            
            System.out.println("La media es: " + media/tamano);

        //Moda
            
            for(int i=0; i != almacen2.length; i++){
                for(int j=0; j != almacen2.length;j++){
                    if(almacen[i] == almacen[j]){
                        cont3++;
                    }
                }
                almacen2[i] = cont3;
                cont3 = 0;
            }
            
            for(int i=0;i != almacen2.length;i++){
                if(almacen2[i] > max){
                    max = almacen2[i];
                }
            }
            
            System.out.print("La moda es: ");
            for(int i=0; i != almacen.length;i++){
                if(max == almacen2[i]){
                    if(i != 0){
                        if(almacen[i] != almacen[(i-1)]){
                            System.out.print(almacen[i] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[i] + " ");
                    }
                }
            }
        return true;
    }
    
    public static boolean Each(int cont, int tamano, String enter, Scanner scan, int almacen[], int mitad, double media, int almacen2[], int cont2, int cont3, int max){
        
        // Media, mediana y moda con While

        System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
            for(int each : almacen){
                System.out.print((cont+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[cont] = Integer.parseInt(enter);
                    cont++;
                }else{
                    System.out.println("Debido a que no hizo caso a la orden de ingresar números naturales, se asumira que ingreso un 0.");
                    cont++;
                }
            }
            cont = 0;
            
        //Mediana

        Arrays.sort(almacen);
            
            if(tamano%2 != 0){
                mitad = tamano/2;
                System.out.println("La mediana es: " + almacen[mitad]);
            }
            else{
                mitad = tamano/2;
                System.out.println("Hay 2 medianas, estas son: " + almacen[mitad-1] + " y " + almacen[mitad]);
            }

        //Media

            for(int each : almacen){
                media = media + almacen[cont];
                cont++;
            }
            cont = 0;
            
            System.out.println("La media es: " + media/tamano);

        //Moda

            for(int each : almacen){
                for(int each2 : almacen){
                    if(almacen[cont] == almacen[cont2]){
                        cont3++;
                    }
                    cont2++;
                }
                almacen2[cont] = cont3;
                cont++;
                cont3 = 0;
                cont2 = 0;
            }
            cont= 0;
            
            for(int each : almacen){
                if(almacen2[cont] > max){
                    max = almacen2[cont];
                }
                cont++;
            }
            
            System.out.print("La moda es: ");
            for(int each : almacen){
                if(max == almacen2[cont2]){
                    if(cont2 != 0){
                        if(almacen[cont2] != almacen[(cont2-1)]){
                            System.out.print(almacen[cont2] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[cont2] + " ");
                    }
                }
                cont2++;
            }
        return true;    
    }
}
