package com.mycompany.buclefor;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, contador;
        
        System.out.println("Digite un numero: ");
        contador = entrada.nextInt();
        
        if(contador >= 0)
        {
            for (i = 1; i <= contador; i++) 
            {
                System.out.println(i);
            }
        }
        else
        {
            for(i = -1; i>= contador; i--)
            {
                System.out.println(i);
            }
        }
        
    }
    
}
