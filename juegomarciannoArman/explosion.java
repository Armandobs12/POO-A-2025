import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class explosion here.
 * 
 * @author Armando Betancourt Silva 
 * @version 1
 */
public class explosion extends Actor
{
    private int tam;
    private final int TAM_MAX=100;
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (this.tam<this.TAM_MAX){
        GreenfootImage img = new GreenfootImage("exooion-removebg-preview.png");
        img.scale(this.tam,this.tam); 
        this.setImage(img);
        this.tam+=10;
        }else{
            World mundo = this.getWorld();
            mundo.removeObject(this);
        }
        // Add your action code here.
    }
    public explosion(){
        GreenfootSound sonido = new GreenfootSound("explocion.mp3");
        sonido.setVolume(80);
        sonido.play();
        this.tam =1;
     GreenfootImage img = new GreenfootImage("exooion-removebg-preview.png");
     img.scale(this.tam,this.tam);
     //img.scale(img.getWidth()/2, img.getHeight()/2);
     this.setImage(img);
    }
}
