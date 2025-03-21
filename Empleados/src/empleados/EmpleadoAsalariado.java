/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class EmpleadoAsalariado {
    private String Nombre;
    private float  Mensual;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public float getMensual() {
        return Mensual;
    }

    public void setMensual(float Mensual) {
        this.Mensual = Mensual;
    }
    
    public EmpleadoAsalariado(){
        Nombre = "Armando";
        Mensual = 18900f;
        
    }
    public void imprimirDatos(){
        System.out.println("**-------------------------------**");
        System.out.println("**Empleado: " + this.getNombre());
        System.out.println("**salario: $" + this.getMensual());
        
        System.out.println("**-------------------------------**");
    }
    
      public EmpleadoAsalariado( String Nombre, float Mensual){
       this.Nombre=Nombre;
       this.Mensual=Mensual;
    }
    
    
   
}
