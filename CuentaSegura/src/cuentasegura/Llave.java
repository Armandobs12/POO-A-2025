package cuentasegura;

/**
 *
 * @author Carlos y modificado por armando 
 */
public class Llave {
    
    
    public String generarLlave(String cadena) {
        return cadena; 
    }
   
    public static void main(String[] args) {
        String numeroDeControl = "24070011"; // Reemplaza con tu número real

      
        LlavePrivada llavePrivada = new LlavePrivada();
        String llaveNumerica = llavePrivada.generarLlave(numeroDeControl);

       
        LlavePublica llavePublica = new LlavePublica();
        String llaveGenerada = llavePublica.generarLlave(numeroDeControl);

       
        String llaveFinal = llaveGenerada + "-" + llaveNumerica;

        
        System.out.println("Llave final generada: " + llaveFinal);
    }
}

