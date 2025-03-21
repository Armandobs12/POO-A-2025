/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class EmpleadoPorHoras {

    private String nombre;
    private double tarifaPorHora;
    private int horasTrabajadas;
    

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public EmpleadoPorHoras( String nombre, double tarifaPorHora, int horasTrabajadas) {
      this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
     public void mostrarSalario() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + calcularSalario());
        System.out.println("-------------------------------");
        
    }
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }
    
    
}
