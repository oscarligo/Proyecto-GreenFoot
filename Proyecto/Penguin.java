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
        // Get the penguin's current location
        int x = getX()+70;
        int y = getY();
    
        // Create a new Pared object at the current location
        Pared pared = new Pared();
        getWorld().addObject(pared, x, y);
        
    }
    
    private void removeBlock() 
    {
      // Get the penguin's current location with an offset (assuming block is placed in front)
      int x = getX();
      int y = getY();
    
      // Find the Pared object at the calculated location
      Pared blockToRemove = (Pared) getOneObjectAtOffset(x, y, Pared.class);
    
      // Check if a Pared object is found at the location
      if (blockToRemove != null) {
        // Remove the Pared object from the world
        getWorld().removeObject(blockToRemove);
      }
    }
}

