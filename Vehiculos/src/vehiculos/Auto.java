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
public class Auto extends Vehiculos{
     private int numLlantas;
    private float capacidadCombustible;
    private String pais;
    private String frenos;
    private String transmision;

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public float getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(float capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public Auto() {
        super();
        this.capacidadCombustible = 25.0f;
        this.frenos = "ABS";
        this.numLlantas = 4;
        this.pais = "Corea";
        this.transmision = "DSG";
    }

    public Auto(float capacidadCombustible, String frenos, int numLlantas, String pais, String transmision,
                float serie, int kilometraje, String motor, String color, String marca, String modelo,
                int anio, String capacidadPasajeros, float asientos, String rodadaLlanta) {
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
        
        this.capacidadCombustible = capacidadCombustible;
        this.frenos = frenos;
        this.numLlantas = numLlantas;
        this.pais = pais;
        this.transmision = transmision;
    }

    public void leer() {
        super.leer();
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Numero de llantas: ");
        this.numLlantas = lector.nextInt();

        System.out.print("Capacidad de combustible (L): ");
        this.capacidadCombustible = lector.nextFloat();

        System.out.print("Pais de fabricacion: ");
        this.pais = lector.next();

        System.out.print("Tipo de frenos: ");
        this.frenos = lector.next();

        System.out.print("Tipo de transmision: ");
        this.transmision = lector.next();
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Número de llantas: " + this.numLlantas);
        System.out.println("Capacidad de combustible: " + this.capacidadCombustible + " L");
        System.out.println("País de fabricación: " + this.pais);
        System.out.println("Tipo de frenos: " + this.frenos);
        System.out.println("Transmisión: " + this.transmision);
    }
}
