import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        enemyMove();
    }
    public Enemy() {
        setRotation(180); 
    }
    private int speed = 3;
    public Enemy (int speed) {
        setRotation(180);
        this.speed = speed;
    }
    
    protected void enemyMove()
    {
        // Add your action code here.
        move(speed);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
}
