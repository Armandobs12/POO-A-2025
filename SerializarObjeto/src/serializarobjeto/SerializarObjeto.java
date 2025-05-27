/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializarobjeto;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author criss
 */
class Persona implements Serializable {
String nombre;
int edad;

Persona(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
  }
}
public class SerializarObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 30);
try (FileOutputStream fos = new FileOutputStream("persona.bin");
ObjectOutputStream oos = new ObjectOutputStream(fos)) {
oos.writeObject(p);
} catch (IOException e) {
e.printStackTrace();
}
        // TODO code application logic here
    }
    
}