/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import java.util.Scanner;
/**
 *
 * @author ARMANDO BETANCOURT S, Juan Carlos Zavaleta Gonzales, Luis Angel Mejia, Victor Javier Varona Castro
 */
public class Motocicleta  extends Vehiculos {
     private String materiales;
    private float capacidadGasolina;
    private int llantas;
    private int espejos;
    private float asientos;

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public float getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public void setCapacidadGasolina(float capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getEspejos() {
        return espejos;
    }

    public void setEspejos(int espejos) {
        this.espejos = espejos;
    }

    public float getAsientos() {
        return asientos;
    }

    public void setAsientos(float asientos) {
        this.asientos = asientos;
    }

    public Motocicleta() {
        super();
        this.asientos = 1;
        this.capacidadGasolina = 18;
        this.espejos = 2;
        this.llantas = 2;
        this.materiales = "Aluminio";
    }

    public Motocicleta(float capacidadGasolina, String materiales, int llantas, int espejos, float serie, int kilometraje, 
                       String motor, String color, String marca, String modelo, int anio, String capacidadPasajeros, 
                       float asientos, String rodadaLlanta) {
        super();
        this.setSerie(serie);
        this.setKilometraje(kilometraje);
        this.setMotor(motor);
        this.setColor(color);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnio(anio);
        this.setCapacidadPasajeros(capacidadPasajeros);
        this.setAsientos(asientos);
        this.setRodadaLlanta(rodadaLlanta);

        this.asientos = asientos;
        this.capacidadGasolina = capacidadGasolina;
        this.espejos = espejos;
        this.llantas = llantas;
        this.materiales = materiales;
    }

    public void leer() {
        super.leer();
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los siguientes datos del vehiculo:");

        System.out.print("Materiales: ");
        this.materiales = lector.next();

        System.out.print("Capacidad de gasolina (L): ");
        this.capacidadGasolina = lector.nextFloat();

        System.out.print("Numero de llantas: ");
        this.llantas = lector.nextInt();

        System.out.print("Numero de espejos: ");
        this.espejos = lector.nextInt();

        System.out.print("Numero de asientos: ");
        this.asientos = lector.nextFloat();
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Materiales: " + this.materiales);
        System.out.println("Capacidad de gasolina: " + this.capacidadGasolina + " L");
        System.out.println("Numero de llantas: " + this.llantas);
        System.out.println("Numero de espejos: " + this.espejos);
        System.out.println("Número de asientos: " + this.asientos);
    }
}
