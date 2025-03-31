package cuentasegura;

/**
 *
 * @author Carlos y modificado por armando
 */
public class LlavePrivada extends Llave{
    
      private int llaveNumerica;

    
    public String generarLlave(String cadena) {
        int suma = 0;
        
        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        
        llaveNumerica = suma; 
        return String.valueOf(suma);
    }

  
}
    

