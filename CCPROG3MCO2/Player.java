

/**
 * This class is used for storing player name, player inventory, game Creatures, and player game menu.
 */
public class Player {
    private String strPlayerName;
    private int mapsignal;

    /**
     * This constructor accepts data for the player name, adds starter Creature to inventory, and adds all Creatures to the game.
     * 
     * @param strPlayerName  String value for player name
     * @param CFirstCreature  Creature object for first Creature
     * @param CCreatureGenerator  Generator object for all Creatures
     */
    public Player(){
        this.strPlayerName = null;
        this.mapsignal = 0;
    }

    public void setName(String name){
        this.strPlayerName = name;
    }

    public String getName(){
        return this.strPlayerName;
    }

    public void setmapsignal(int mapsignal){
        this.mapsignal = mapsignal;
    }

    public int getmapsignal(){
        return this.mapsignal;
    }

    

}