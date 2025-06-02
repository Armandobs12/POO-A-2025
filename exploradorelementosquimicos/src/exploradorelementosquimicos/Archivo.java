/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploradorelementosquimicos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class Archivo {
    
    public static String ruta = "elementos.txt";
    
    public  static void guardadArchivo(){
        try {
            FileWriter a = new FileWriter(ruta);
            for(int i =0;i< Exploradorelementosquimicos.indice; i++){
                a.write(Exploradorelementosquimicos.elemento[i].getDatos());
            }
            a.close();
            JOptionPane.showMessageDialog(null, " los datos se guardaron correctamente ");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, " no se puede guardar el archivo. " + ex.getMessage());
        }
    }
    
    public  static void abrirArchivo(){
        try {
            FileReader lector = new FileReader(ruta);
            BufferedReader l =new BufferedReader(lector);
            String linea ="";
            
            while(( linea = l.readLine())!=null){
           String[] datos = linea.split(",");
           Elemento e = new Elemento();
           e.seDatos(datos);
            }
            
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, " no se puede abrir el archivo. " + ex.getMessage());
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, " error al intentar leer el archivo. " + ex.getMessage());
        }
    }
}
