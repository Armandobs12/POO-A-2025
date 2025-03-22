/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;
/**
 *
 * @author ARMANDO BETANCOURT S, Juan Carlos Zavaleta Gonzales, Luis Angel Mejia, Victor Javier Varona Castro
 */
public class Vehiculos {
   private float serie;
    private int kilometraje;
    private String motor;
    private String color;
    private String marca;
    private String modelo;
    private int anio;
    private String capacidadPasajeros;
    private float asientos;
    private String rodadaLlanta;

    public float getSerie() {
        return serie;
    }

    public void setSerie(float serie) {
        this.serie = serie;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(String capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public float getAsientos() {
        return asientos;
    }

    public void setAsientos(float asientos) {
        this.asientos = asientos;
    }

    public String getRodadaLlanta() {
        return rodadaLlanta;
    }

    public void setRodadaLlanta(String rodadaLlanta) {
        this.rodadaLlanta = rodadaLlanta;
    }

    static Vehiculos[] vehiculos = new Vehiculos[10];
    static int indice = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu de opciones:");
            System.out.println("1.- Agregar vehiculo");
            System.out.println("2.- Consultar vehiculos");
            System.out.println("3.- Eliminar vehiculo");
            System.out.println("4.- Modificar vehiculo");
            System.out.println("5.- Salir");
            System.out.print("Seleccione una opcion: ");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    agregar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }
    }

    public static void agregar() {
        if (indice == vehiculos.length) {
            System.out.println("El inventario esta lleno");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione el tipo de vehículo a agregar:");
            System.out.println("1.- Auto");
            System.out.println("2.- Motocicleta");
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                vehiculos[indice] = new Auto();
            } else if (tipo == 2) {
                vehiculos[indice] = new Motocicleta();
            } else {
                System.out.println("Opcion no válida");
                return;
            }

            vehiculos[indice].leer();
            indice++;
        }
    }

    public static void consultar() {
        if (indice == 0) {
            System.out.println("No hay vehiculos registrados.");
        } else {
            for (int i = 0; i < indice; i++) {
                vehiculos[i].imprimirDatos();
            }
        }
    }

    public static void eliminar() {
        if (indice == 0) {
            System.out.println("No hay vehículos para eliminar.");
        } else {
            System.out.print("Ingrese el numero de serie del vehículo a eliminar: ");
            String sr = new Scanner(System.in).next();
            boolean encontrado = false;

            for (int i = 0; i < indice; i++) {
                if (Float.parseFloat(sr) == vehiculos[i].getSerie()) {
                    for (int j = i; j < indice - 1; j++) {
                        vehiculos[j] = vehiculos[j + 1];
                    }
                    vehiculos[indice - 1] = null;
                    indice--;
                    encontrado = true;
                    System.out.println("Vehiculo eliminado con exito.");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Vehiculo no encontrado ingrese primero un vehiculo.");
            }
        }
    }

    public static void modificar() {
        if (indice == 0) {
            System.out.println("No hay vehiculos para modificar.");
        } else {
            System.out.print("Ingrese el numero de serie del vehiculo a modificar: ");
            String sr = new Scanner(System.in).next();
            boolean encontrado = false;

            for (int i = 0; i < indice; i++) {
                if (Float.parseFloat(sr) == vehiculos[i].getSerie()) {
                    vehiculos[i].leer();
                    encontrado = true;
                    System.out.println("Vehiculo modificado con exito.");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Vehiculo no encontrado.");
            }
        }
    }

    public void imprimirDatos() {
        System.out.println("Informacion del vehiculo:");
        System.out.println("Serie: " + serie);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Motor: " + motor);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Asientos: " + asientos);
        System.out.println("Rodada de llanta: " + rodadaLlanta);
    }

    public void leer() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Numero de serie: ");
        this.serie = lector.nextFloat();
        System.out.print("Kilometraje: ");
        this.kilometraje = lector.nextInt();
        System.out.print("Motor: ");
        this.motor = lector.next();
        System.out.print("Color: ");
        this.color = lector.next();
        System.out.print("Marca: ");
        this.marca = lector.next();
        System.out.print("Modelo: ");
        this.modelo = lector.next();
        System.out.print("Año: ");
        this.anio = lector.nextInt();
        System.out.print("Capacidad de pasajeros: ");
        this.capacidadPasajeros = lector.next();
        System.out.print("Asientos: ");
        this.asientos = lector.nextFloat();
        System.out.print("Rodada de llanta: ");
        this.rodadaLlanta = lector.next();
    }
    /**
     * @param args the command line arguments
     */
    
    
}
