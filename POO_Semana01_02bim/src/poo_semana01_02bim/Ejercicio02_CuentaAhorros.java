/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_semana01_02bim;

/**
 *
 * @author ASUS
 */
public class Ejercicio02_CuentaAhorros extends Ejercicio02_Cuenta{

    public Ejercicio02_CuentaAhorros(String titular, Double saldo) {
        super(titular, saldo);
    }
    
    public void mostrarSaldo(){
        System.out.println("La cuenta bancaria a nombre de "+titular+" tiene un saldo de "+saldo+" $.");
    }
    public void tipoInteres(String tipo, Double saldo){
        switch(tipo.toLowerCase()){
            case("corriente"):
                interes=saldo*0.07;
                break;
            case("ahorros"):
                interes=saldo*0.05;
                break;
        }
       System.out.println("La cuenta al ser una cuenta de tipo "+tipo+"  y su interes es "+interes+".");
    }
    
    
}
