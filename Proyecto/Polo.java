import greenfoot.*;
import java.util.*;

public class Polo extends Actor 
{
    int frame = 1;
    int xVal, yVal;
    int XMove=15;
    int YMove=15;
    int stop=0;
    
    boolean blnGo=false;
    
    public static GreenfootImage WalkR1= new GreenfootImage ("polo200.png");
    public static GreenfootImage WalkR2= new GreenfootImage ("polo201.png");
    public static GreenfootImage WalkR3= new GreenfootImage ("polo202.png");
    public static GreenfootImage WalkR4= new GreenfootImage ("polo203.png");
    public static GreenfootImage WalkL1= new GreenfootImage ("polo204.png");
    public static GreenfootImage WalkL2= new GreenfootImage ("polo205.png");
    public static GreenfootImage WalkL3= new GreenfootImage ("polo206.png");
    public static GreenfootImage WalkL4= new GreenfootImage ("polo207.png");
    public static GreenfootImage WalkU1= new GreenfootImage ("polo208.png");
    public static GreenfootImage WalkU2= new GreenfootImage ("polo209.png");
    public static GreenfootImage WalkU3= new GreenfootImage ("polo210.png");
    public static GreenfootImage WalkU4= new GreenfootImage ("polo211.png");
    public static GreenfootImage WalkD1= new GreenfootImage ("polo212.png");
    public static GreenfootImage WalkD2= new GreenfootImage ("polo213.png");
    public static GreenfootImage WalkD3= new GreenfootImage ("polo214.png");
    public static GreenfootImage WalkD4= new GreenfootImage ("polo215.png");
    int walkpolodelay = 7;
    int a = 75;
    
    
    public void act() 
    {
        //getImage().scale(a,a);
        movimiento(); 
    }

    public void movimiento() 
    {
        if (frame>4)
        {
            frame=1;
        }

            if(Greenfoot.isKeyDown("a")) 
            {
                blnGo=true;
                xVal=-XMove;
                yVal=0;
                stop=0;
                setLocation(getX()+xVal, getY());
                moveleftframe();
                Greenfoot.delay(walkpolodelay);
            }
            if(Greenfoot.isKeyDown("d"))
            {
                blnGo=true;
                xVal=+XMove;
                yVal=0;
                stop=0;
                setLocation(getX()+xVal, getY());
                moverightframe();
                Greenfoot.delay(walkpolodelay);
            }
            if(Greenfoot.isKeyDown("w"))
            {
                blnGo=true;
                yVal=-YMove;
                xVal=0;
                stop=0;
                movedownframe();
                setLocation(getX(), getY()+yVal);
                Greenfoot.delay(walkpolodelay);
            }
            if(Greenfoot.isKeyDown("s"))
            {
                blnGo=true;
                yVal=+YMove;
                xVal=0;
                stop=0;
                moveupframe();
                setLocation(getX(), getY()+yVal);
                Greenfoot.delay(walkpolodelay);
            }

    }
    
    public void moveleftframe()
    {

        if(frame == 1)
        {
            setImage(WalkL1);
            //getImage().scale(a,a);
        }
        else if (frame == 2)
        {
            setImage(WalkL2);
            //getImage().scale(a,a);

        }
        else if (frame == 3)
        {
            setImage(WalkL3);
            //getImage().scale(a,a);
            
        }
        else if (frame == 4)
        {
            setImage(WalkL4);
            //getImage().scale(a,a);
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
            //getImage().scale(a,a);
        }
        else if (frame == 2)
        {
            setImage(WalkR2);
            //getImage().scale(a,a);

        }
        else if (frame == 3)
        {
            setImage(WalkR3);
            //getImage().scale(a,a);
            
        }
        else if (frame == 4)
        {
            setImage(WalkR4);
            //getImage().scale(a,a);
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
            //getImage().scale(a,a);
        }
        else if (frame == 2)
        {
            setImage(WalkU2);
            //getImage().scale(a,a);
        }
        else if (frame == 3)
        {
            setImage(WalkU3);
            //getImage().scale(a,a);
        }
        else if (frame == 4)
        {
            setImage(WalkU4);
            //getImage().scale(a,a);
            frame=1;//it will "restart the frames" so it will go back to the first one
            return;//this is so it won't add 1 to the reseted int
        }
        frame++;//it will add 1 to the int after it changes the image
    }
    public void movedownframe()//I only have 2 frames for the up and down movement 
    {

        if(frame == 1)//if the int frame is =1it will change it to the second image
        {
            setImage(WalkD1);
            //getImage().scale(a,a);
        }
        else if (frame == 2)
        {
            setImage(WalkD2);
            //getImage().scale(a,a);
        }
        else if (frame == 3)
        {
            setImage(WalkD3);
            //getImage().scale(a,a);
        }
        else if (frame == 4)
        {
            setImage(WalkD4);
            //getImage().scale(a,a);
            frame=1;//it will "restart the frames" so it will go back to the first one
            return;//this is so it won't add 1 to the reseted int
        }
        frame++;//it will add 1 to the int after it changes the image
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