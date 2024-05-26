import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 */
public class TitleScreen extends World
{
    private GreenfootSound backgroundMusic;

    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        backgroundMusic = new GreenfootSound("Rise of the Machines.mp3");
        backgroundMusic.playLoop(); // Play the sound in a loop
        Greenfoot.start();
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            backgroundMusic.stop(); // Stop the music
            Greenfoot.setWorld(new fondo());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}