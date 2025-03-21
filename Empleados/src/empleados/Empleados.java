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
     * 
     *  * 
     * 
     * 
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
        EmpleadoPorHoras emp;
       EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Juan mecanico", 19, 149);
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Miguel Angel", 17, 180);
       EmpleadoPorHoras emp3 = new EmpleadoPorHoras("Rafael Quintero", 21, 150);
       
       
        emp1.mostrarSalario();
        emp2.mostrarSalario();
        emp3.mostrarSalario();
        
        System.out.println("Eso es todo por el dia de hoy");
        // TODO code application logic here
    }
    
}
