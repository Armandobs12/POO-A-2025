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
import javax.swing.JOptionPane;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class Archivo {
    public static String ruta="elementos.txt";
    public static void guardarArchivo(){
        try{
            FileWriter a= new FileWriter(ruta);
            for(int i=0;i<Exploradorelementosquimicos.indice;i++){
                a.write(Exploradorelementosquimicos.elemento[i].getDatos());
            }
            a.close();
            JOptionPane.showMessageDialog(null,"los datos se guaradaron correctamente");
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null,"No se pudo crear el archivo"+ ex.getMessage());
        }
    }
    public static void abrirArchivo(){
        try{
            FileReader lector= new FileReader(ruta);
            BufferedReader l= new BufferedReader(lector);
            String linea="";
            
            
            while((linea= l.readLine())!=null){
                String[] datos= linea.split(",");
                Elemento e= new Elemento();
                e.setDatos(datos);
                Exploradorelementosquimicos.elemento[Exploradorelementosquimicos.indice] =e;
                Exploradorelementosquimicos.indice++;
            }
            l.close();
            lector.close();
            
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"el archivo no pudo ser abierto");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"wrror al intentar leer el  archivo ");
        }
    }
    
}
