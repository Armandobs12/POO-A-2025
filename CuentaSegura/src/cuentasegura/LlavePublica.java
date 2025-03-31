/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasegura;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class LlavePublica extends Llave {
     @Override
    public String generarLlave(String cadena) {
        StringBuilder nuevaLlave = new StringBuilder();

        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                int numero = Character.getNumericValue(c);
                char letra = (char) ('A' + numero); 
                nuevaLlave.append(letra);
            } else {
                nuevaLlave.append(c); 
            }
        }

        return nuevaLlave.toString();
    }
}


