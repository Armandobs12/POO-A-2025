import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Armando Betancourt 
 * @version  1
 */
public class MyWorld extends World
{
    private GreenfootSound  sonido;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        prepare();
        sonido = new GreenfootSound("Dragon Ball Z Música de Pelea..mp3");
        //sonido.play();
        //sonido.setVolume(50);
    }
        public void act (){
        if(!sonido.isPlaying())
           sonido.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Heroe heroe = new Heroe ();
        addObject(heroe,336,369);
        heroe.setLocation(370,628);
       
       
    }
   
}
