package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio3 {
    /*
        Guillermo tiene N dinero, Luis tiene la mitad de Guillermo
        Juan tiene la mitad de lo que tiene Luis y Guillemro juntos
        Crea un programa que calcule cuanto tienen entre los 3 juntos
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float gui, luis, juan, cant;
        System.out.println("Ingresa la cantidad que tiene Guillermo");
        gui = entrada.nextFloat();
        
        luis = gui / 2;
        
        juan = (luis + gui) / 2;
        
        cant = gui + luis + juan;
        
        System.out.println("Entre los 3 poseen $"+cant);
        
        
        
        
    }
    
}
