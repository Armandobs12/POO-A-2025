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
    private final int LIMITE_RAFAGA=15;
    private final int LIMITE_TIEMPO_OBSTACULO=50;
    private int tiempoObstaculo;
    private int rafaga;
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
        if(Greenfoot.isKeyDown("space")){
            if(rafaga==0){
            World mundo =this.getWorld();
            disparo d = new disparo();
            mundo.addObject(d,this.getX()+40,this.getY()-125);
            this.rafaga = LIMITE_RAFAGA;
        
        }else
        this.rafaga--;
    }
       
    
    
    //Creacion de obstaculos
    if(tiempoObstaculo==0){
     World mundo = this.getWorld();
     int posx = (int)(Math.random()*700)+50;
     obstaculo o = new obstaculo();
     mundo.addObject(o, posx,30);
     this.tiempoObstaculo = LIMITE_TIEMPO_OBSTACULO;
     //eje y mayor a la posicion de la eliminaacion de bala
     
       }else
       tiempoObstaculo--;
       Actor ox =null;
       

       if((ox=this.getOneIntersectingObject(obstaculo.class))!=null){
        World mundo = this.getWorld();
        
        explosion ex = new explosion(); 
        mundo.addObject(ex,ox.getX(), ox.getY());
        mundo.removeObject(ox);
         
        mundo.removeObject(MyWorld.vidas[MyWorld.indiceVida-1]);
         MyWorld.indiceVida--;
         if(MyWorld.indiceVida==0){
             Greenfoot.stop();
             
        }
    }
       
}
    public Heroe(){
     this.setRotation(90);
     this.rafaga=10;
     GreenfootImage img = this.getImage();
     img.scale(img.getWidth()/3, img.getHeight()/3);
     this.setImage(img);
    }
    
}
