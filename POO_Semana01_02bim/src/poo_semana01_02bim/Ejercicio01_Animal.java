/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_semana01_02bim;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio01_Animal {
    String tipo;
    String edad;

    public Ejercicio01_Animal(String tipo) {
        this.tipo = tipo;
    }
    
    void describir(){
        System.out.println("Tipo: "+tipo);
    }
    
    void calculoEdad(int num){
        if(num<=3){
            edad="Cachorro";
        } else{
            edad="Adulto";
        }
        System.out.println("Su mascota tiene "+num+" años por lo tanto es un "+edad+".");
    }
}
