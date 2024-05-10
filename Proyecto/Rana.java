import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rana extends Actor
{
    /**
     * Act - do whatever the Rana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
    }
        
    public void movimiento()
    {
        if (Greenfoot.isKeyDown("left")) setLocation(getX()-10, getY()); 
        if (Greenfoot.isKeyDown("right")) setLocation(getX()+10, getY());
        if (Greenfoot.isKeyDown("up")) setLocation(getX(), getY()-10);     
        if (Greenfoot.isKeyDown("down")) setLocation(getX(), getY()+10);   
    }
    
       public void setLocation(int x, int y)
    {
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        if(!getIntersectingObjects(Pared.class).isEmpty())
        {
            super.setLocation(oldX, oldY);
        }
    }
}
