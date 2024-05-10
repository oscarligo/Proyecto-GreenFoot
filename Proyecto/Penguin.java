import greenfoot.*;

public class Penguin extends Actor 
{
    public void act() 
    {
        movimiento(); 
    }

    public void movimiento() 
    {
        if (Greenfoot.isKeyDown("a")) setLocation(getX()-6, getY());
        if (Greenfoot.isKeyDown("d")) setLocation(getX()+6, getY());
        if (Greenfoot.isKeyDown("w")) setLocation(getX(), getY()-6);
        if (Greenfoot.isKeyDown("s")) setLocation(getX(), getY()+6);
        
        if (Greenfoot.isKeyDown("r")) 
        {
            placeBlock();
        }
          if (Greenfoot.isKeyDown("q")) 
        {
            removeBlock();
        }
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
    
    private void placeBlock() 
    {
        int x = getX()+70;
        int y = getY();
    
        Pared pared = new Pared();
        getWorld().addObject(pared, x, y);
        
    }
    
    private void removeBlock() 
    {
      int x = getX();
      int y = getY();
    
      Pared blockToRemove = (Pared) getOneObjectAtOffset(x, y, Pared.class);
    
      if (blockToRemove != null) {
        getWorld().removeObject(blockToRemove);
      }
    }
}

