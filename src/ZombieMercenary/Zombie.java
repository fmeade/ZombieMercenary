package ZombieMercenary;

/**
 *
 * @author Meade & Zepp 
 */
public class Zombie extends Player
{
    private float locationX;
    private float locationY;
    
    public Zombie()
    {
        locationX = 500;
        locationY = 500;
    }
    
    public float getLocationX()
    {
        return locationX;
    }
    public float getLocationY()
    {
        return locationY;
    }
}
