import greenfoot.*;
/** 
 * 
 * 
 * @author Adam fung 
 * @version (May 2025)
*/
public class MyWorld extends World {
    Label scoreLabel;
    public MyWorld() {
        
        super(600, 400, 1, false);
        
        GreenfootImage background = new GreenfootImage("Background.png");
        setBackground(background);
        
        Animal animal = new Animal();
        addObject(animal, 300, 300);
        
        scoreLabel = new Label(0, 30);
        addObject(scoreLabel, 30, 30);
        
        createFood();
    }
    
    public int score = 0;
    public void increaseScore() {
        score+= 100;
        scoreLabel.setValue(score);
    }
    
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void createFood() {
        Food food = new Food();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(food, x, y);
    }
}
