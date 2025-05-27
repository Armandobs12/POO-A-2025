/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirarchivo;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("archivo.txt");
            writer.write("¡Hola, bebé!\n" +
"¿Como has estado?\n" +
"Tal vez no sepas quién habla\n" +
"O tal vez, lo hayas olvidado.");
            writer.close();
            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo.");
            e.printStackTrace();
        }
    }
}
