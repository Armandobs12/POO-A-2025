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
     private String Nombre;
    private float  Hora;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public float getMHora() {
        return Hora;
    }

    public void setHora(float Mensual) {
        this.Hora = Hora;
    }
    
    public EmpleadoPorHoras(){
        Nombre = "Juan mecanico";
        Hora = 18900f;
        
    }
    public void imprimirDatos(){
        System.out.println("**-------------------------------**");
        System.out.println("**nombre: " + this.getNombre());
        System.out.println("**salario: $" + this.getHora());
        
        System.out.println("**-------------------------------**");
    }
    
      public EmpleadoPorHoras( String Nombre, float Mensual){
       this.Nombre=Nombre;
       this.Hora=Hora;
    }
    
}
