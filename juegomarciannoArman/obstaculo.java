import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo here.
 * 
 * @author (Armando) 
 * @version (1)
 */
public class obstaculo extends Actor
{
    /**
     * Act - do whatever the obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        this.setLocation(this.getX(),this.getY()+10);
        if(this.getY()>680){
         World mundo = this.getWorld();
            mundo.removeObject(this); 
        }
        
    }
    public obstaculo(){
     GreenfootImage img = this.getImage();
     img.scale(img.getWidth()/4, img.getHeight()/4);
     this.setImage(img);
    }
}
