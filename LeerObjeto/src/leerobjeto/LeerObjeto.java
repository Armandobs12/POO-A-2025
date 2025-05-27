/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerobjeto;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjeto {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.obj"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Objeto leído: " + p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}