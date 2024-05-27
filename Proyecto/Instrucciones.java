import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{
    private GreenfootSound backgroundMusic;
    
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        backgroundMusic = new GreenfootSound("Revolution.mp3");
        backgroundMusic.playLoop(); 
    }
    
    public void act()
    {
            
        if (Greenfoot.isKeyDown("i")) {
            backgroundMusic.stop();
            Greenfoot.setWorld(new TitleScreen()); 
        }
    }
        
    }

