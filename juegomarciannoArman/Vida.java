import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Vida(){
     GreenfootImage img = new GreenfootImage("herz.png");
     img.scale(25,25);
     //img.scale(img.getWidth()/2, img.getHeight()/2);
     this.setImage(img);
    }
}
