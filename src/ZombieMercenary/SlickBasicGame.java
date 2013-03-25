package ZombieMercenary;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import ZombieMercenary.Constants;
 
public class SlickBasicGame extends BasicGame{
 
    private Mercenary mercenary = new Mercenary();
    private Zombie zombie = new Zombie();
    private Constants constants = new Constants();
    private Image mercenaryImage = null;
    private Image landImage = null;
    private Image zombieImage = null;
    private float mercenaryX = mercenary.getLocationX();
    private float mercenaryY = mercenary.getLocationY();
    private float zombieX = zombie.getLocationX();
    private float zombieY = zombie.getLocationY();
    private float scale = constants.getScale();
 
    public SlickBasicGame()
    {
        super("Zombie Mercenary");
    }
 
    @Override
    public void init(GameContainer gc) throws SlickException {
        mercenaryImage = new Image("resources/mercenary.png");
        landImage = new Image("resources/LoadingScreen.png");
        zombieImage = new Image("resources/zombie.png");
    }
 
    @Override
    public void update(GameContainer gc, int delta) throws SlickException
    {
        Input input = gc.getInput();
        
        if(zombieX < mercenaryX)
        {
            zombieX+=0.1f;
        }
        
        if(zombieX > mercenaryX)
        {
            zombieX-=0.1f;
        }
        
        if(zombieY < mercenaryY)
        {
            zombieY+=0.1f;
        }
        
        if(zombieY > mercenaryY)
        {
            zombieY-=0.1f;
        }
 
        if(input.isKeyDown(Input.KEY_A) && mercenaryImage.getHeight() <= 800)
        {
            mercenaryX-= .5f;
            //plane.rotate(-0.2f * delta);
        }
 
        if(input.isKeyDown(Input.KEY_D) && mercenaryImage.getHeight() >= 0)
        {
            mercenaryX+= .5f;
            //aplane.rotate(0.2f * delta);
        }
 
        if(input.isKeyDown(Input.KEY_W))
        {
            //float hip = 0.4f * delta;
 
            //float rotation = plane.getRotation();
            mercenaryY-= .5f;
            //y+= 0.2f;
            //x+= hip * Math.sin(Math.toRadians(rotation));
            // y-= hip * Math.cos(Math.toRadians(rotation));
        }
        
        if(input.isKeyDown(Input.KEY_S))
        {
            mercenaryY+= .5f;
        }
    }
 
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        landImage.draw(0, 0);
        
        mercenaryImage.draw(mercenaryX, mercenaryY, scale);
        zombieImage.draw(zombieX,zombieY,scale);
 
    }
}
