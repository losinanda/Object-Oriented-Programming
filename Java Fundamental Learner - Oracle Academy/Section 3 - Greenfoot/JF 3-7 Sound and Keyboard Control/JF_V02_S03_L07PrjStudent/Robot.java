import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    public void robotMovement()
    {
        //moveRobot
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }

    }
    void detectWallCollision()
    {
        // Code if the robot collides with the wall, then the robot will return to the beginning
        if (isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(48,50);
        }
    }
    public void detectBlockCollision()
    {
        // Code if the robot collides with an instance of a Block, then the robot will return to the beginning 
        if (isTouching(Block.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(48,50);
        }
    }
    public void detectHome()
    {
        // Code if the robot detect Home
        if (isTouching(Home.class))
        {
            Greenfoot.playSound("yipee.wav");
            setLocation(48,50);
        }
    }
    public void eatPizza()
    {
        // Code if the robot eat Pizza
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
        }
    }
}