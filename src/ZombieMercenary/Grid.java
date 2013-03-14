package ZombieMercenary;

/**
 *
 * @author Meade & Zepp
 */
public class Grid {

//Background Image?
    Player mercenary;
    Player[] zombies;

    public Grid() {
        mercenary = new Player();
        zombies = new Player[50];
    }
//collision detection here? Something like this-->   public boolean isCollidingWith(){} returns true if two players collide

    public boolean isCollidingWith() {
        for(int i=0;i<zombies.length;i++)
        {
            if()
            {
                return true;
            }
        }
        return false;
    }

// methods to get and set location of players -->  public float getX(Player){returns a float of the players position
// on the X-axis}
    public int getX(Player p) {
        int x = 0;
        //x = p.locationX();
        return x;
    }
// same thing for Y value

    public int getY(Player p) {
        int y = 0;
        //y = p.locationY();
        return y;
    }

// method to set location    public void setLocation(getX(),getY()){}
    public void setLocation() {
        
    }




}
