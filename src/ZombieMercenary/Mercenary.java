package ZombieMercenary;

/**
 *
 * @author Meade & Zepp
 */
public class Mercenary extends Player
{
    private float locationX;
    private float locationY;
    
    public Mercenary()
    {
        locationX = 0;
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
