/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirbinario;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class EscribirBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] datos = {65, 66, 67, 68}; // valores en bytes (A, B, C, D)
try (FileOutputStream fos = new FileOutputStream("archivo.bin")) {
fos.write(datos);
} catch (IOException e) {
e.printStackTrace();
        // TODO code application logic here
    }
   } 
}
