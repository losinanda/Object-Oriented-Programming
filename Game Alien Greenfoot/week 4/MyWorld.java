import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();      
    }
    private void prepare() {
        Hero hero = new Hero();
        addObject(hero,100,200);
    }
    public void act () {
        spawnEnemy();
        spawnEnemy2();
    }
    private int timerEnemy = 0;
    public void spawnEnemy() {
        if (timerEnemy == 180) { // if the timer is 3 second
            int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(new Enemy(), 599, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }
        else {
            timerEnemy++;
        }
    }
    public void spawnEnemy2() {
        if (timerEnemy == 180) { // if the timer is 3 second
            int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(new Enemy2(), 599, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }
        else {
            timerEnemy++;
        }
    }
}
