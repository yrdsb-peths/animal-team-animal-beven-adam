import greenfoot.*;

public class Food extends Actor
{
    GreenfootImage fish = new GreenfootImage("fish.png");
    static int count = 0;
    static int speed = 1;

    public void act()
    {
        setImage(fish);
        fish.scale(70, 50);
        
        count++;
        setSpeed();
        setLocation(getX(), getY() + speed);
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            speed = 1;
        }
    }

    public void setSpeed() {
        if (count == 650) {
            speed ++;
            count = 0;
        }
    }
}


