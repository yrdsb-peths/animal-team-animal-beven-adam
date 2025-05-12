import greenfoot.*;

public class HighScore extends Actor {
    private static int savedHighScore = 0;
    private int highScore;

    public HighScore() {
        highScore = savedHighScore;
        updateHighScoreImage();
    }

    public void act() {
        World world = getWorld();
        if (world instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) world;
            int currentScore = myWorld.getScore();
            if (currentScore > highScore) {
                highScore = currentScore;
                savedHighScore = highScore;
                updateHighScoreImage();
            }
        }
    }

    private void updateHighScoreImage() {
        GreenfootImage img = new GreenfootImage(250, 60);
        img.setColor(Color.WHITE);
        
        Font font = new Font("Arial", 20);
        img.setFont(font);
        
        img.drawString("High Score: " + highScore, 10, 40);
        setImage(img);
    }

    public int getHighScore() {
        return highScore;
    }
}
