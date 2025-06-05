/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_semana01_02bim;

/**
 *
 * @author ASUS
 */
public class Ejercicio01_Perro extends Ejercicio01_Animal {
    String raza;
    
    public Ejercicio01_Perro(String tipo, String raza){
        super(tipo);
        this.raza=raza;
    }
    
    void ladrar(){
        System.out.println("Guau guau-Soy un "+raza);
    }
    void vacunas(int num){
        int nVacunas;
       if(num<=3){
           nVacunas=4;
       } else{
           nVacunas=7;
       }
       System.out.println("Al ser un "+edad+" debe de tener  "+nVacunas+" vacunas.");
    }
}
