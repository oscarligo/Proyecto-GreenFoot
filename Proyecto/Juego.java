import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private GreenfootSound backgroundMusic;
    private boolean musicStarted;
    /**
     * Constructor for objects of class fondo.
     * 
     */
    public Juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        backgroundMusic = new GreenfootSound("Rhythm of Fire.mp3");
        musicStarted = false; // Play the sound in a loop
        prepare();
        

    }
    
    public void act(){
        
        if (!musicStarted) {
            backgroundMusic.playLoop(); // Play the sound in a loop
            musicStarted = true;
        }
        
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Penguin penguin = new Penguin();
        addObject(penguin,650,350);
        Polo polo = new Polo();
        addObject(polo,40,44);
        removeObject(penguin);
        addObject(penguin,650,350);
    }
}
