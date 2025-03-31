package cuentasegura;

/**
 *
 * @author Carlos y modificado por armando
 */
public class LlavePrivada {
    
    
    private int llaveNumerica;
     private String numeroControl;
    
    public LlavePrivada(){
        this.llaveNumerica = 0;
        
        
    }
    
    public static void main(String[] args) {
        Llave  A = new Llave();
        String numeroControl = "24070011"; // Cambia esto por tu número de control real
        
       A.generarLlave(numeroControl);
        
        System.out.println("La llave numérica generada es: " + A.getLlaveNumerica());
    }
}
