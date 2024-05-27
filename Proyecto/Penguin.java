import greenfoot.*;
import java.util.*;
public class Penguin extends Actor 
{
    int frame = 1;
    int xVal, yVal;
    int XMove=15;
    int YMove=15;
    int stop=0;
    
    boolean blnGo=false;
    
    public static GreenfootImage WalkR1= new GreenfootImage ("pingu00.png");
    public static GreenfootImage WalkR2= new GreenfootImage ("pingu01.png");
    public static GreenfootImage WalkR3= new GreenfootImage ("pingu02.png");
    public static GreenfootImage WalkR4= new GreenfootImage ("pingu03.png");
    public static GreenfootImage WalkL1= new GreenfootImage ("pingu08.png");
    public static GreenfootImage WalkL2= new GreenfootImage ("pingu09.png");
    public static GreenfootImage WalkL3= new GreenfootImage ("pingu10.png");
    public static GreenfootImage WalkL4= new GreenfootImage ("pingu11.png");
    public static GreenfootImage WalkU1= new GreenfootImage ("pingu04.png");
    public static GreenfootImage WalkU2= new GreenfootImage ("pingu05.png");
    public static GreenfootImage WalkU3= new GreenfootImage ("pingu06.png");
    public static GreenfootImage WalkU4= new GreenfootImage ("pingu07.png");
    
    int walkdelay = 10;
    public void act() 
    {
        //getImage().scale(50,50);
        movimiento(); 
    }

    public void movimiento() 
    {
        if (frame>4)
        {
            frame=1;
        }
        if (Greenfoot.isKeyDown("/")) 
        {
            placeBlock();
        }
          if (Greenfoot.isKeyDown(".")) 
        {
            removeBlock();
        }
        
            if(Greenfoot.isKeyDown("left")) 
            {
                blnGo=true;
                xVal=-XMove;
                yVal=0;
                stop=0;
                setLocation(getX()+xVal, getY());
                moveleftframe();
                Greenfoot.delay(walkdelay);
            }
            if(Greenfoot.isKeyDown("right"))
            {
                blnGo=true;
                xVal=+XMove;
                yVal=0;
                stop=0;
                setLocation(getX()+xVal, getY());
                moverightframe();
                Greenfoot.delay(walkdelay);
            }
            if(Greenfoot.isKeyDown("up"))
            {
                blnGo=true;
                yVal=-YMove;
                xVal=0;
                stop=0;
                moveupframe();
                setLocation(getX(), getY()+yVal);
                Greenfoot.delay(walkdelay);
            }
            if(Greenfoot.isKeyDown("down"))
            {
                blnGo=true;
                yVal=+YMove;
                xVal=0;
                stop=0;
                moveleftframe();
                setLocation(getX(), getY()+yVal);
                Greenfoot.delay(walkdelay);
            }

    }
    
    public void moveleftframe()
    {

        if(frame == 1)
        {
            setImage(WalkL1);
            //getImage().scale(50,50);
        }
        else if (frame == 2)
        {
            setImage(WalkL2);
            //getImage().scale(50,50);

        }
        else if (frame == 3)
        {
            setImage(WalkL3);
            //getImage().scale(50,50);
            
        }
        else if (frame == 4)
        {
            setImage(WalkL4);
            //getImage().scale(50,50);
            frame=1;
            return;
        }
        frame++;

    }
    
    public void moverightframe()
    {

        if(frame == 1)
        {
            setImage(WalkR1);
            //getImage().scale(50,50);
        }
        else if (frame == 2)
        {
            setImage(WalkR2);
            //getImage().scale(50,50);

        }
        else if (frame == 3)
        {
            setImage(WalkR3);
            //getImage().scale(50,50);
            
        }
        else if (frame == 4)
        {
            setImage(WalkR4);
            //getImage().scale(50,50);
            frame=1;//it will "restart the frames" so it will go back to the first one
            return;//this is so it won't add 1 to the reseted int
        }
        frame++;//it will add 1 to the int after it changes the image
    }
    
    public void moveupframe()//I only have 2 frames for the up and down movement 
    {

        if(frame == 1)//if the int frame is =1it will change it to the second image
        {
            setImage(WalkU1);
            //getImage().scale(50,50);
        }
        else if (frame == 2)
        {
            setImage(WalkU2);
            //getImage().scale(50,50);
        }
        else if (frame == 3)
        {
            setImage(WalkU3);
            //getImage().scale(50,50);
        }
        else if (frame == 4)
        {
            setImage(WalkU4);
            //getImage().scale(50,50);
            frame=1;//it will "restart the frames" so it will go back to the first one
            return;//this is so it won't add 1 to the reseted int
        }
        frame++;//it will add 1 to the int after it changes the image
    }
    public void movedownframe()//I only have 2 frames for the up and down movement 
    {

        if(frame == 1)//if the int frame is =1it will change it to the second image
        {
            setImage(WalkL1);
            //getImage().scale(50,50);
        }
        else if (frame == 2)
        {
            setImage(WalkL2);
            //getImage().scale(50,50);
        }
        else if (frame == 3)
        {
            setImage(WalkL3);
            //getImage().scale(50,50);
        }
        else if (frame == 4)
        {
            setImage(WalkL4);
            //getImage().scale(50,50);
            frame=1;//it will "restart the frames" so it will go back to the first one
            return;//this is so it won't add 1 to the reseted int
        }
        frame++;//it will add 1 to the int after it changes the image
    }
    
    private void placeBlock() 
    {
        int x = getX()-15;
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

