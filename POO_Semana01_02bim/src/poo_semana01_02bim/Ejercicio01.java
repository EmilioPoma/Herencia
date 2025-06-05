/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_semana01_02bim;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        Ejercicio01_Perro p = new Ejercicio01_Perro("Mamifero", "Labrador");
        System.out.println("Ingrese la edad de su mascota: ");
        int num = entrada.nextInt();
        p.ladrar();
        p.describir();
        p.calculoEdad(num);
        p.vacunas(num);

    }

}
