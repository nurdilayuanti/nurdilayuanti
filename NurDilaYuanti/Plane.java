import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    
    public void moveAndTurn()
    {
        move(2);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor bom;
        bom = getOneObjectAtOffset(0, 0, bom.class);
        if(bom != null)
        {
            World world;
            world = getWorld();
            world.removeObject(bom);
            addScore();
        }
        
    }
    
    public void addScore()
    {
        if(!getWorld().getObjects(Counter.class).isEmpty())
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).add(1);
            
        }
    
    }
}
