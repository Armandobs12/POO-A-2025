/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class Empleados {
private String nombre;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       EmpleadoAsalariado SA;
       SA = new EmpleadoAsalariado();
       EmpleadoAsalariado SA2 = new EmpleadoAsalariado ("Zavaleta", 59000f);
       EmpleadoAsalariado SA3 = new EmpleadoAsalariado();
      
       SA.setNombre("Victor");
       SA.setMensual(5000f);
       
       System.out.println("Personal Asalariado");
      
       SA.imprimirDatos();
               SA2.imprimirDatos();
                       SA3.imprimirDatos();
                       System.out.println("---------------------------------");
                       
        System.out.println("Personal * hora");               
        // TODO code application logic here
    }
    
}
