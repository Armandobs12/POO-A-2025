/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivobinario;

/**
 *
 * @author juan carlss 
 */
import java.io.*;

// Clase Persona que será serializada y deserializada
class Persona implements Serializable {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class ArchivoBinario {
    public static void main(String[] args) {
        // Parte 1: Escribir datos binarios en un archivo
        byte[] datos = {65, 66, 67, 68}; // valores en bytes (A, B, C, D)
        try (FileOutputStream fos = new FileOutputStream("archivo.bin")) {
            fos.write(datos);
            System.out.println("Datos binarios escritos en 'archivo.bin'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parte 2: Leer datos binarios desde el archivo
        System.out.println("Lectura de datos binarios desde 'archivo.bin':");
        try (FileInputStream fis = new FileInputStream("archivo.bin")) {
            int dato;
            while ((dato = fis.read()) != -1) {
                System.out.print(dato + " ");
            }
            System.out.println(); // Nueva línea después de mostrar todos los datos
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parte 3: Serializar un objeto Persona en un archivo
        Persona p = new Persona("Juan", 30);
        try (FileOutputStream fos = new FileOutputStream("persona.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
            System.out.println("Objeto Persona serializado en 'persona.bin'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parte 4: Deserializar el objeto Persona desde el archivo
        System.out.println("Deserialización del objeto Persona desde 'persona.bin':");
        try (FileInputStream fis = new FileInputStream("persona.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Persona pRecuperada = (Persona) ois.readObject();
            System.out.println("Nombre: " + pRecuperada.nombre);
            System.out.println("Edad: " + pRecuperada.edad);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
