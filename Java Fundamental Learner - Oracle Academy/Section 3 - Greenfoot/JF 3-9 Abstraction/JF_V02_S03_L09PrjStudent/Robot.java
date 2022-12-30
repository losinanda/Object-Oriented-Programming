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
    int score = 0;
    int lives = 3;
    int pizzaEaten = 0;
    int timer = 1000;
    private int MAXTIMER = 1000;
    private GreenfootImage gameOver = new GreenfootImage("gameover.png");
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
        updateTimer();
    }
    public void robotMovement()
    {
        //moveRobot
        
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-2);
            animate();
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+2);
            animate();
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+2,getY());
            animate();
        }
    }
    void detectWallCollision()
    {
        // Code if the robot collides with the wall, then the robot will return to the beginning
        if (isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectBlockCollision()
    {
        // Code if the robot collides with the Instance of Block, then the robot will return to the beginning
        if (isTouching(Block.class))
        {
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectHome()
    {
        // Code if the robot detect Home
        if (isTouching(Home.class))
        {
            increaseScore();
            Greenfoot.playSound("yipee.wav");
            if (pizzaEaten==5){
                pizzaEaten=0;
                //resetTimer();
                resetPosition();
            }
        }
        RobotWorld myworld = (RobotWorld)getWorld();
        myworld.increaseLevel();
    }
    public void eatPizza()
    {
        // Code if the robot eat Pizza
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten++;
        }
    }
    private GreenfootImage robotimage1 = new GreenfootImage("man01.png");
    private GreenfootImage robotimage2 = new GreenfootImage("man02.png");
    public void animate()
    {
        if (getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
    }
    public void removeLife()
    {
        lives--;
        if (lives < 0)
        {
            testEndGame();
            lives = 0;
        }
        resetPosition();
    }
    public void testEndGame()
    {
        if (lives < 0 || pizzaEaten==5)
        {
            GreenfootImage image = new GreenfootImage(gameOver);
            setImage(image);
            Greenfoot.stop();
        }
    }
    public void increaseScore()
    {
        if (pizzaEaten==5)
        {
            score++;
        }
    }
    public void showStatus()
    {
        getWorld().showText("Score : "+score,71,523);
        getWorld().showText("Pizza : "+pizzaEaten,71,543);
        getWorld().showText("Lives : "+lives,71,563);
        getWorld().showText("Timer : "+timer,71,583);
    }
    public void updateTimer()
    {
        timer--;
        if (timer==0)
        {
            removeLife();
        }
        if (timer==0)
        {
            timer = 1000;
        }
        resetTimer();
        if (pizzaEaten==1 || pizzaEaten==2 || pizzaEaten==3 || pizzaEaten==4 || pizzaEaten==5)
        {
            // Every time a pizza is eaten, add another 200 to the timer
        }
    }
    public void resetPosition()
    {
        setLocation(48,50);
    }
    public void resetTimer()
    {
        //timer = 1000;
    }
}