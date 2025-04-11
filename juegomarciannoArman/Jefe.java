import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe extends Actor
{
    
    private boolean direccion = false;
    private final int LIMITE_TIEMPO_OBSTACULO=25;
    private int  tiempoObstaculo;
    private int LimiteDerecha= 700;
    private int LimiteIzquierda= 100;
    /**
     * Act - do whatever the Jefe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your if action code here.
        if(direccion==false){
        this.setLocation(this.getX()+10,this.getY());
        if(this.getX()>LimiteDerecha){
        direccion=true;
        LimiteIzquierda = (int)(Math.random()*350)+100;
        }
        }else{
        this.setLocation(this.getX()-10,this.getY());
        if(this.getX()<LimiteIzquierda){
        direccion=false;
        LimiteDerecha = (int)(Math.random()*350)+350;
    
       }
       
       }
        if(tiempoObstaculo==0){
     World mundo = this.getWorld();
     int posx = this.getX();
     Mini o = new Mini();
     mundo.addObject(o, posx,this.getY());
     this.tiempoObstaculo = LIMITE_TIEMPO_OBSTACULO;
     //eje y mayor a la posicion de la eliminaacion de bala
     
       }else
       tiempoObstaculo--;
    
    
    }
    
    public Jefe(){

     GreenfootImage img = this.getImage();
     img.scale(200,200);
     this.setImage(img);
    }
}
