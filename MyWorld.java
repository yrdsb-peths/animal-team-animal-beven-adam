import greenfoot.*;
/** 
 * 
 * 
 * @author Adam fung 
 * @version (May 2025)
*/
public class MyWorld extends World {
    Label scoreLabel;
    private int score = 0;
    private GreenfootImage[] backgrounds = new GreenfootImage[5];
    private int currentBackgroundIndex = 0;

    public MyWorld() {
        
        super(600, 400, 1, false);
        
        for (int i = 0; i < backgrounds.length; i++) {
            backgrounds[i] = new GreenfootImage("bg" + (i+1) + ".png");
        }
        setBackground(backgrounds[0]); 

        
        Animal animal = new Animal();
        addObject(animal, 300, 300);
        
        scoreLabel = new Label(0, 30);
        addObject(scoreLabel, 30, 30);
        
        HighScore highScore = new HighScore();
        addObject(highScore, 535, 30);
        
        createFood();
    }
    public void increaseScore() {
        score+= 100;
        scoreLabel.setValue(score);
        int newBackgroundIndex = score / 400;
        if (newBackgroundIndex < backgrounds.length && newBackgroundIndex != currentBackgroundIndex) {
            currentBackgroundIndex = newBackgroundIndex;
            setBackground(backgrounds[currentBackgroundIndex]);
        }
    }
    
        public int getScore() {
        return score;
        
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
