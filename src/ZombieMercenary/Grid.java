package ZombieMercenary;

/**
 *
 * @author Meade & Zepp
 */
public class Grid {

//Background Image?
    Mercenary mercenary;
    Zombie[] zombies;

    public Grid() {
        mercenary = new Mercenary();
        zombies = new Zombie[50];
    }
//collision detection here? Something like this-->   public boolean isCollidingWith(){} returns true if two players collide

    public boolean isCollidingWith() {
        for(int i=0;i<zombies.length;i++)
        {
            //if()
            {
                return true;
            }
        }
        return false;
    }
    
    
    /*
     * get position methods for Zombies.
     */
    public float getX(Zombie p) { 
        float playerX = p.getLocationX();
        return playerX;
    }
    
    
    public float getY(Zombie p) {
        float y = p.getLocationY();
        return y;
    }
    
    
    
    /*
     * get position methods for mercenary.
     */
    public float getX(Mercenary p) { 
        float playerX = p.getLocationX();
        return playerX;
    }
    
    
    public float getY(Mercenary p) { 
        float playerY = p.getLocationY();
        return playerY;
    }
// method to set location    public void setLocation(getX(),getY()){}
    public void setLocation() {
        
        
        
        
    }




}
