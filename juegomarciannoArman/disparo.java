import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disparo here.
 * 
 * @author Armando  
 * @version 1
 */
public class disparo extends Actor
{
    /**
     * Act - do whatever the disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        this.setLocation(this.getX(),this.getY()-10);
        if (this.getY()<20){
            World mundo = this.getWorld();
            mundo.removeObject(this);
        }
    }
      public disparo(){
     this.setRotation(270);
     GreenfootImage img = this.getImage();
     img.scale(img.getWidth()/3, img.getHeight()/3);
     this.setImage(img);
    }
}
