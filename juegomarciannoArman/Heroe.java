import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heroe here.
 * 
 * @author Armando Betancourt Silva  
 * @version 1
 */
public class Heroe extends Actor
{
    /**
     * Act - do whatever the Heroe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-5,this.getY());
        
        }
        
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+5,this.getY());
        
        }
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(),this.getY()-5);
        
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(),this.getY()+5);
        
        }
        
    }
    public Heroe(){
     this.setRotation(90);
     GreenfootImage img = this.getImage();
     img.scale(img.getWidth()/7, img.getHeight()/7);
     this.setImage(img);
    }
}
