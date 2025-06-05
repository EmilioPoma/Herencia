/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_semana01_02bim;

/**
 *
 * @author ASUS
 */
public class Ejercicio02_Cuenta {
    String titular;
    Double saldo;
    Double interes;

    public Ejercicio02_Cuenta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    
    void MostrarTitular(){
        System.out.println("Titular de la cuenta: "+titular);
    }
}
