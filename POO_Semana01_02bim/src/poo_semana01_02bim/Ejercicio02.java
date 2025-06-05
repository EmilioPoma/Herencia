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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese al titular de la cuenta");
        String titular=entrada.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipo=entrada.nextLine();
        System.out.println("Ingrese el saldo de la cuenta: ");
        Double saldo=entrada.nextDouble();
        Ejercicio02_CuentaAhorros ca=new Ejercicio02_CuentaAhorros(titular, saldo);
        System.out.println("======CUENTA======");
        ca.MostrarTitular();
        ca.mostrarSaldo();
        ca.tipoInteres(tipo, saldo);
    }
    
}
