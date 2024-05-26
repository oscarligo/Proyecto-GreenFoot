import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Penguin penguin = new Penguin();
        addObject(penguin,179,389);
        Rana rana = new Rana();
        addObject(rana,938,361);
        Pared pared = new Pared();
        addObject(pared,58,131);
        Pared pared2 = new Pared();
        addObject(pared2,60,205);
        Pared pared3 = new Pared();
        addObject(pared3,54,155);
        Pared pared4 = new Pared();
        addObject(pared4,57,259);
        Pared pared5 = new Pared();
        addObject(pared5,57,321);
        Pared pared6 = new Pared();
        addObject(pared6,57,409);
        Pared pared7 = new Pared();
        addObject(pared7,63,524);
        Pared pared8 = new Pared();
        addObject(pared8,59,604);
        Pared pared9 = new Pared();
        addObject(pared9,59,680);
        Pared pared10 = new Pared();
        addObject(pared10,66,467);
        Pared pared11 = new Pared();
        addObject(pared11,66,361);
        Pared pared12 = new Pared();
        addObject(pared12,67,92);
        Pared pared13 = new Pared();
        addObject(pared13,67,40);
        pared2.setLocation(44,233);
        removeObject(pared4);
        removeObject(pared3);
        removeObject(pared12);
        removeObject(pared13);
        removeObject(pared2);
        removeObject(pared);
        removeObject(pared11);
        pared6.setLocation(90,456);
        removeObject(pared5);
        removeObject(pared6);
        removeObject(pared10);
        removeObject(pared7);
        removeObject(pared8);
        pared9.setLocation(57,667);
        removeObject(pared9);
        Pared pared14 = new Pared();
        addObject(pared14,539,207);
        Pared pared15 = new Pared();
        addObject(pared15,538,380);
        Pared pared16 = new Pared();
        addObject(pared16,538,557);
        penguin.setLocation(182,374);
        rana.setLocation(935,337);
        rana.setLocation(932,347);
        removeObject(rana);
        penguin.setLocation(179,377);
        penguin.setLocation(174,383);
        penguin.setLocation(174,395);
        removeObject(penguin);
        Rana rana2 = new Rana();
        addObject(rana2,912,376);
        Penguin penguin2 = new Penguin();
        addObject(penguin2,214,377);
    }
}
