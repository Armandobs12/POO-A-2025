import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NuevaVida here.
 * 
 * @author (Armando B) 
 * @version (1.1.1.2)
 */
public class NuevaVida extends Actor
{
    /**
     * Act - do whatever the NuevaVida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        this.setLocation(this.getX(),this.getY()+5);
        if(this.getY()>680){
         World mundo = this.getWorld();
            mundo.removeObject(this); 
        }
    }
}
