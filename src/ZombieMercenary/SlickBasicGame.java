package ZombieMercenary;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
 
public class SlickBasicGame extends BasicGame{
 
    private Image mercenary = null;
    private Image land = null;
    private Image zombie = null;
    private float x = 0;
    private float y = 500;
    private float x1 = 500;
    private float y1 = 500;
    private float scale = 2.0f;
 
    public SlickBasicGame()
    {
        super("Zombie Mercenary");
    }
 
    @Override
    public void init(GameContainer gc) throws SlickException {
        mercenary = new Image("/Users/forrest_meade/Documents/RU/Freshman2/Itec220/NetBeansProjects/Project5/resourcesmercenary.png");
        land = new Image("/Users/forrest_meade/Documents/RU/Freshman2/Itec220/NetBeansProjects/Project5/resources/LoadingScreen.png");
        zombie = new Image("/Users/forrest_meade/Documents/RU/Freshman2/Itec220/NetBeansProjects/Project5/resources/zombie.png");
    }
 
    @Override
    public void update(GameContainer gc, int delta) throws SlickException
    {
        Input input = gc.getInput();
        
        if(x1 < x)
        {
            x1+=0.1f;
        }
        
        if(x1 > x)
        {
            x1-=0.1f;
        }
        
        if(y1 < y)
        {
            y1+=0.1f;
        }
        
        if(y1 > y)
        {
            y1-=0.1f;
        }
 
        if(input.isKeyDown(Input.KEY_A) && mercenary.getHeight() <= 800)
        {
            x-= .5f;
            //plane.rotate(-0.2f * delta);
        }
 
        if(input.isKeyDown(Input.KEY_D) && mercenary.getHeight() >= 0)
        {
            x+= .5f;
            //aplane.rotate(0.2f * delta);
        }
 
        if(input.isKeyDown(Input.KEY_W))
        {
            //float hip = 0.4f * delta;
 
            //float rotation = plane.getRotation();
            y-= .5f;
            //y+= 0.2f;
            //x+= hip * Math.sin(Math.toRadians(rotation));
            // y-= hip * Math.cos(Math.toRadians(rotation));
        }
        
        if(input.isKeyDown(Input.KEY_S))
        {
            y+= .5f;
        }
    }
 
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        land.draw(0, 0);
        
        mercenary.draw(x, y, scale);
        zombie.draw(x1,y1,scale);
 
    }
}
