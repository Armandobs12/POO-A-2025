package cuentasegura;

/**
 *
 * @author Carlos y modificado por armando 
 */
public class Llave extends LlavePrivada{
    private String codigo;
    private int llaveNumerica;
    private String numeroControl;
    
    public String generarLlave(String codigo){
        return this.codigo;
    }
  
 
    
    
    public int procesarCadena(String cadena) {
        int suma = 0;
        for (char c : numeroControl.toCharArray()) {
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        return suma;
    }

   

    public int getLlaveNumerica() {
         this.llaveNumerica = procesarCadena(numeroControl);
        return llaveNumerica;
    }

    public Llave(){
        this.codigo="01";
        this.numeroControl = "24070011";
    }
    
}
