import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstStage extends MyWorld
{

    /**
     * Constructor for objects of class FirstStage.
     * 
     */
    public FirstStage()
    {

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bom bom = new bom();
        addObject(bom,146,106);
        bom bom2 = new bom();
        addObject(bom2,410,72);
        bom bom3 = new bom();
        addObject(bom3,99,502);
        bom bom4 = new bom();
        addObject(bom4,709,89);
        bom bom5 = new bom();
        addObject(bom5,576,480);
        bom bom6 = new bom();
        addObject(bom6,408,287);
        bom bom7 = new bom();
        addObject(bom7,86,246);
        bom bom8 = new bom();
        addObject(bom8,331,476);
        bom bom9 = new bom();
        addObject(bom9,286,150);
        bom bom10 = new bom();
        addObject(bom10,715,226);
        bom bom11 = new bom();
        addObject(bom11,740,359);
        Counter counter = new Counter();
        addObject(counter,53,36);
    }
}
