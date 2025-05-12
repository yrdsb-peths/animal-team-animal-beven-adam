import greenfoot.*;

/**
 * Class for the main character the player will utilizing
 * 
 * @author Adam fung 
 * @version (May 2025)
*/
public class Animal extends Actor
{
    GreenfootSound animalSound = new GreenfootSound("kitty.mp3");
    GreenfootImage idle = new GreenfootImage("catIdle.png");
    GreenfootImage[] runAnimationLeft = new GreenfootImage[6];
    GreenfootImage[] runAnimationRight = new GreenfootImage[6];
    SimpleTimer deltaTimer = new SimpleTimer();

    public Animal()
    {
        deltaTimer.mark();
        setImage(idle);
        idle.scale(100, 100);

        for(int i = 0; i < runAnimationRight.length; i++) {
            runAnimationRight[i] = new GreenfootImage("images/runAnimation/runRight" + i + ".png");
            runAnimationRight[i].scale(100, 100);
        }

        for(int i = 0; i < runAnimationLeft.length; i++) {
            runAnimationLeft[i] = new GreenfootImage("images/runAnimation/runRight" + i + ".png");
            runAnimationLeft[i].mirrorHorizontally();
            runAnimationLeft[i].scale(100, 100);
        }
    }
    int facing = 0; // right = 0; left = 1;
    int imageIndex = 0;
    public void runAnimation() 
    {
        if (deltaTimer.millisElapsed() > 250)
            {
            if(facing == 0)
            {
                setImage(runAnimationRight[imageIndex]);
            }
            if(facing == 1)
            {
                setImage(runAnimationLeft[imageIndex]);
            }
            imageIndex = (imageIndex + 1) % runAnimationRight.length;
            
            deltaTimer.mark();
        }
    }
    
    
    public void act()
    {
        eat();
        if(Greenfoot.isKeyDown("left")) 
        {
            move(-5);
            facing = 1;
            runAnimation();
        } 
        else if(Greenfoot.isKeyDown("right")) 
        {
            move(5);
            facing = 0;
            runAnimation();
        }
        
        if (!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            setImage(idle);
        }
    }
    
    public void eat() {
        if(isTouching(Food.class)) 
        {
            removeTouching(Food.class);
            MyWorld world =(MyWorld) getWorld();
            world.createFood();   
            world.increaseScore();
            animalSound.play();
        }
    }


}
