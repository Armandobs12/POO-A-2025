/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guardarobjeto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardarObjeto {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.obj"))) {
            oos.writeObject(p);
            System.out.println("Objeto guardado en persona.obj");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
