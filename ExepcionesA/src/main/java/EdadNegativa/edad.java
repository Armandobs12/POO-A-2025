/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EdadNegativa;

/**
 *
 * @author ARMANDO BETANCOURT S,Juan Carlos Zavaeta,Luis Angel Mejia, Victor Varona,Critopher Cisneros
 */
public class edad {
       
    public static void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("Edad establecida: " + edad);
    }
public static void main(String[] args) {
        
            establecerEdad(-5);
        
    }
}
