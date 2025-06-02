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
 private String nombre;//*
 private int numatomico;//numero atomico
 private double pesoAtomico;//*
 private String simbolo;//*
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
 
 public String getDatos(){
    String datos ="";
    datos+= nombre+","+numatomico+","+pesoAtomico+","+simbolo+","+nivelesElectronicos+","+estadodeOxidacion+","+
            masaAtomica+","+disElectronicasOrbitas+","+periodo+","+grupo+","+familia+","+estado+","+notas+","+descubrimiento+"\n";
     return datos;
    
 }  
 public void seDatos(String [] datos) {
        this.nombre = datos[0];
        this.numatomico = Integer.parseInt(datos[1]);
        this.pesoAtomico = Double.parseDouble(datos[2]);
        this.simbolo = datos[3];
        this.nivelesElectronicos = new int[]{ Integer.parseInt(datos[ 4]) };
         this.estadodeOxidacion = new int[]{ Integer.parseInt(datos[ 5]) };
          this.masaAtomica = Double.parseDouble(datos[6]);
           this.disElectronicasOrbitas = Integer.parseInt(datos[7]);
            this.periodo = Integer.parseInt(datos[8]);
             this.grupo = Integer.parseInt(datos[9]);
             this.familia = datos[10];
             this.estado = datos[11];
             this.notas = datos[12];
             this.descubrimiento = Integer.parseInt(datos[13]);
             
        
    }

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

    void setDatos(String[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
