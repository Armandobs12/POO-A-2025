/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerbinario;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author criss
 */
public class LeerBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("numeros.bin")) {
int dato;
while ((dato = fis.read()) != -1) {
System.out.print(dato + " ");
}
} catch (IOException e) {
e.printStackTrace();
}
        // TODO code application logic here
    }
    
}
