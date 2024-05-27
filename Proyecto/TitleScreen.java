import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 */
public class TitleScreen extends World
{
    private static TitleScreen instance;
    private GreenfootSound backgroundMusic;
    private boolean musicStarted;

    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        backgroundMusic = new GreenfootSound("Pixel Love.mp3");
        musicStarted = false; // Play the sound in a loop
        prepare();
    }
    
    public static TitleScreen getInstance() {
        return instance; 
    }

    public void act()
    {
        if (!musicStarted) {
            backgroundMusic.playLoop(); // Play the sound in a loop
            musicStarted = true;
        }
        
        if (Greenfoot.isKeyDown("space")) {
            backgroundMusic.stop(); // Stop the music
            Greenfoot.setWorld(new fondo());
        }
        
        if (Greenfoot.isKeyDown("i")) {
            backgroundMusic.stop();
            Greenfoot.setWorld(new Instrucciones());
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