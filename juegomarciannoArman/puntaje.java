import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puntaje extends Actor
{
    private int Puntaje;
    /**
     * Act - do whatever the puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void agregarPuntos(int puntos){
    Puntaje+=puntos;
    actualizarPuntaje();
    }
    public int getpuntos(){
    return this.Puntaje;
    }
    
    public void actualizarPuntaje(){
    GreenfootImage fondo =  new GreenfootImage(""+Puntaje,30,Color.BLACK,Color.YELLOW);//this.getImage();
     this.setImage(fondo);
    }
    
    
    
    
    public puntaje(){
     GreenfootImage fondo =  new GreenfootImage(""+Puntaje,30,Color.BLACK,Color.YELLOW);//this.getImage();
     //fondo.scale(120,40);
     //img.scale(img.getWidth()/2, img.getHeight()/2);
     this.setImage(fondo);
    }
}
