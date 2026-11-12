

/**
 * This class is used to store postion
 */
public class Area {

    private int nXPos;
    private int nYPos;

    /**
     * This constructor store map dimensions X and Y
     
     */
    public Area() {
        this.nXPos = -1;
        this.nYPos = -1;
    }

    /**
     * This method gets x position
     * @return nXpos current position
     */

    public int getnXPos() {
        return nXPos;
    }
    /**
     * This method gets y position
     * @return nYpos current position
     */
    public int getnYPos() {
        return nYPos;
    }
    /**
     * This method sets new x position
     * @param nXpos new x position
     */
    public void setnXPos(int nXPos) {
        this.nXPos = nXPos;        
    }


    /**
     * This method sets new y position
     * @param nXpos new y position
     */
    public void setnYPos(int nYPos) {
        this.nYPos = nYPos;
    }
}

