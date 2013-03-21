package ZombieMercenary;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;


/**
 *
 * @author Meade & Zepp
 */
public class ZombieMercenaryDriver 
{
    public static void main(String[] args) throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new SlickBasicGame());
 
         app.setDisplayMode(800, 600, false);
         app.start();
    }
}
