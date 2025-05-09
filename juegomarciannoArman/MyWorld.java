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
    public static Vida[] vidas;
    public static int indiceVida;
    public static  puntaje puntaje;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
        sonido = new GreenfootSound("La Chona - Los Tucanes De Tijuana [Audio Oficial].mp3");
        //sonido.play();
        sonido.setVolume(50);
    }
    private int puntosVida=30;
        public void act (){
        if(!sonido.isPlaying())
           sonido.play();

           
        if(puntaje.getpuntos()>puntosVida){
            if(indiceVida<5){
         int posx = (int)(Math.random()*700)+50;
         NuevaVida o = new NuevaVida();
         this.addObject(o, posx,30);
         puntosVida+=puntosVida;
        }
      }
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
        vidas = new Vida[5];
        int separacion = 5;
        indiceVida = 3;

        for(int i=0;i<3;i++){
            vidas[i] = new Vida();
            addObject(vidas[i],separacion+=30,40);
        }

        //vidas[0] = new Vida();
        //addObject(vidas[0],separacion+=30,34);

        //[1] = new Vida();
        //addObject(vidas[1],separacion+=30,34);

        //vidas[2] = new Vida();
        //addObject(vidas[2],separacion+=30,34);

        puntaje = new puntaje();
        addObject(puntaje,767,24);

        Jefe jefe = new Jefe();
        addObject(jefe,329,87);
        jefe.setLocation(418,73);
    }
   
}
