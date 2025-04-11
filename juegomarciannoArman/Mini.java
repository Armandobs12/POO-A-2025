import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mini here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mini extends Actor
{
    /**
     * Act - do whatever the Mini wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Adthis.setLocation(this.getX(),this.getY()+10);
        this.setLocation(this.getX(),this.getY()+10);
        if(this.getY()>680){
         World mundo = this.getWorld();
            mundo.removeObject(this); 
        }
    }
    public Mini(){
     GreenfootImage img = this.getImage();
     img.scale(130,130);
     this.setImage(img);
    }
}
