package metodoslistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosListas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        boolean x= true;
        
        List <Integer> Numeros;
           Numeros = new ArrayList<Integer>(); 
            Numeros.add(33); 
            Numeros.add(56);
            Numeros.add(14);
            Numeros.add(7);
            Numeros.add(22);
             
            Metodo met= new Metodo();
         
        
        while(x){
        System.out.println("\n-----MENU-----");
        System.out.println("    ¿que metodo desea utilizar?");
        System.out.println("[1]METODO SHELLSORT");
        System.out.println("[2]METODO RADIX");
        System.out.println("[3] salir");
        
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("[----METODO SHELLSORT----]");

               
                System.out.println("Lista original");
                for(int j=0;j<Numeros.size();j++){
                System.out.print(Numeros.get(j)+" ");
                 }
                met.shell(Numeros);
                System.out.println("");
                System.out.println("Lista ordenado");
                for(int j=0;j<Numeros.size();j++){
                System.out.print(Numeros.get(j)+" ");
                    }
               
                break;

            case 2:
                System.out.println("-----METODO RADIX-----");
                System.out.println("Lista original");
                for(int j=0;j<Numeros.size();j++){
                System.out.print(Numeros.get(j)+" ");
                }
                
                
                  met.Radix(Numeros);
                 System.out.println("");
                System.out.println(" Lista ordenado");
                for(int j=0;j<Numeros.size();j++){
                System.out.print(Numeros.get(j)+" ");
                    }
                
                break;
                
            case 3:
                x= false;

        }
    }
    }

  

}
