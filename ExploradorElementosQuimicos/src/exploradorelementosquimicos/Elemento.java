/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploradorelementosquimicos;

/**
 *
 * @author ARMANDO BETANCOURT S
 */
public class Elemento {
 private String nombre;
 private int numatomico;//numero atomico
 private double pesoAtomico;
 private String simbolo;
 private int[] nivelesElectronicos;
 private int[]estadodeOxidacion;
 private double masaAtomica;
 private int disElectronicasOrbitas;
 private int periodo;
 //private int serie; corresponde  grupo.
 private int grupo;
 private String familia;
 private String estado;
 private String notas;
 private int descubrimiento;//año de descubrimiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumatomico() {
        return numatomico;
    }

    public void setNumatomico(int numatomico) {
        this.numatomico = numatomico;
    }

    public double getPesoAtomico() {
        return pesoAtomico;
    }

    public void setPesoAtomico(double pesoAtomico) {
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int[] getNivelesElectronicos() {
        return nivelesElectronicos;
    }

    public void setNivelesElectronicos(int[] nivelesElectronicos) {
        this.nivelesElectronicos = nivelesElectronicos;
    }

    public int[] getEstadodeOxidacion() {
        return estadodeOxidacion;
    }

    public void setEstadodeOxidacion(int[] estadodeOxidacion) {
        this.estadodeOxidacion = estadodeOxidacion;
    }

    public double getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public int getDisElectronicasOrbitas() {
        return disElectronicasOrbitas;
    }

    public void setDisElectronicasOrbitas(int disElectronicasOrbitas) {
        this.disElectronicasOrbitas = disElectronicasOrbitas;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

   // public int getSerie() {
     //   return serie;
    //}

    //public void setSerie(int serie) {
      //  this.serie = serie;
    //}

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getDescubrimiento() {
        return descubrimiento;
    }

    public void setDescubrimiento(int descubrimiento) {
        this.descubrimiento = descubrimiento;
    }
     public static int []Extraervalores(String origen){
         String ne[]=origen.split(",");//ne =["2","4","7"]
               int nee[]=new int[ne.length];// nee=[0,0,0]
               for(int i=0;i<ne.length;i++){
                   nee[i]=Integer.parseInt(ne[i]);
               }
               return nee;
     }
 
}
