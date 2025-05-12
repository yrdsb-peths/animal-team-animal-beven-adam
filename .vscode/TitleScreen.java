import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Adam fung 
 * @version (May 2025)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Kitty", 60);
    Label instructionLabel = new Label("press the space bar to start", 22);
    Label instructionLabel1 = new Label("use \u2190 & \u2192 keys to move", 22);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(600, 400, 1);
        
        GreenfootImage background = new GreenfootImage("Background.png");
        setBackground(background);
        
        addObject(instructionLabel, 300, 250);
        addObject(instructionLabel1, 300, 270);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Animal animal = new Animal();
        addObject(animal,319,290);
        animal.setLocation(285,300);
        animal.setLocation(297,295);
        animal.setLocation(306,292);
        animal.setLocation(292,294);
        animal.setLocation(304,292);
        animal.setLocation(307,318);
        Food food = new Food();
        addObject(food,307,318);
        animal.setLocation(310,324);
        animal.setLocation(311,259);
        animal.setLocation(438,169);
        food.setLocation(317,67);
        Food food2 = new Food();
        addObject(food2,416,63);
        Food food3 = new Food();
        addObject(food3,506,56);
        Food food4 = new Food();
        addObject(food4,209,62);
        Food food5 = new Food();
        addObject(food5,90,54);
        Food food6 = new Food();
        addObject(food6,570,47);
        Food food7 = new Food();
        addObject(food7,22,53);
        food5.setLocation(93,57);
        food4.setLocation(158,53);
        food5.setLocation(86,57);
        food.setLocation(234,58);
        food2.setLocation(322,56);
        food2.setLocation(329,48);
        food3.setLocation(409,72);
        food3.setLocation(420,70);
        food3.setLocation(431,59);
        food6.setLocation(525,34);
        food6.setLocation(541,53);
        food6.setLocation(519,42);
        food6.setLocation(568,49);
        food5.setLocation(110,51);
        food3.setLocation(469,55);
        food3.setLocation(462,47);
        food2.setLocation(343,54);
        food2.setLocation(353,45);
        food2.setLocation(360,49);
        food2.setLocation(356,49);
        animal.setLocation(323,281);
        animal.setLocation(316,316);
        animal.setLocation(288,301);
        animal.setLocation(306,305);
        removeObject(food7);
        removeObject(food5);
        removeObject(food4);
        removeObject(food);
        removeObject(food2);
        removeObject(food3);
        removeObject(food6);
        animal.setLocation(304,132);
    }
}
