import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for storing the player's <code>Creature</code> Creature objects.
 */
public class Inventory {
    private ArrayList<Creature> aCreatureList;      //generates an arraylist to store the creatures

    private Creature[] aAllCreatures;                                           //a copy of all creatures
    private CreatureGenerator CCreatureGenerator;
    private Creature ECreature1;
    private Creature ECreature2;
    private int nIndex1;
    private int nIndex2;

    /**
     * This constructor initializes the player active creature
     * 
     * @param CActiveCreature  Creature object of player's active Creature
     */
    public Inventory(){     //constructor
        this.aCreatureList = new ArrayList<Creature>();
        this.CCreatureGenerator = new CreatureGenerator();
        this.aAllCreatures = CCreatureGenerator.getCreatures(3);
        this.ECreature1 = null;
        this.ECreature2 = null;
        this.nIndex1 = -1;
        this.nIndex2 = -1;
    }

    /**
     * set index 1 of creature
     * @param nIndex1
     */
    public void setnIndex1 (int nIndex1){
        this.nIndex1 = nIndex1;
    }
    /**
     * set index 2 of creature
     * @param nIndex2
     */
    public void setnIndex2 (int nIndex2){
        this.nIndex2 = nIndex2;
    }
    /**
     * gets index to evolve
     * @return nindex1 
     */
    public int getnIndex1 (){
        return this.nIndex1;
    }

    /**
     * gets index of creature 2 to evolve
     * @return index 2 creature
     */
    public int getnIndex2 (){
        return this.nIndex2;
    }

    /**
     * This method adds a new <code>Creature</code> Creature to the inventory.
     * 
     * @param CCreature  Creature object for Creature to be added.
     */
    public void addCreature(Creature CCreature){
        Creature newCreature = new Creature(CCreature.getName(), CCreature.getType(), CCreature.getFamily(), CCreature.getEvolutionLevel(), CCreature.getFilename());
        aCreatureList.add(newCreature);
    }

    /**
     * sets creature 1 for evolving
     * @param ECreature1 creature
     */
    public void setECreature1 (Creature ECreature1){
        this.ECreature1 = ECreature1;
    }

    /**
     * sets creature 2 for evolving
     * @param ECreature2 creature 2
     */
    public void setECreature2 (Creature ECreature2){
        this.ECreature2 = ECreature2;
    }

    /**
     * gets ecreature 1
     * 
     * @return ecreature 1
     */
    public Creature getECreature1 (){
        return this.ECreature1;
    }

    /**
     * gets creature 2 for evolving
     * @return ecreature 2
     */
    public Creature getECreature2 (){
        return this.ECreature2;
    }

    //add javadoc
    //assumes: 1 and 2 are valid (same EL and family), are not the same index, are not EL3
    /**
     * evolves the two creatures
     */
    public Creature evolveCreature(){
        if (ECreature1 == null || ECreature2 == null
                || nIndex1 < 0 || nIndex2 < 0
                || nIndex1 >= aCreatureList.size() || nIndex2 >= aCreatureList.size()
                || nIndex1 == nIndex2) {
            return null;
        }

        Creature CNewCreature = null;
        for (Creature creature : aAllCreatures) {
            if (creature.getEvolutionLevel() == ECreature1.getEvolutionLevel() + 1
                    && creature.getFamily() == ECreature1.getFamily()) {
                CNewCreature = new Creature(creature.getName(), creature.getType(),
                        creature.getFamily(), creature.getEvolutionLevel(), creature.getFilename());
                break;
            }
        }

        if (CNewCreature == null) {
            return null;
        }

        if (ECreature1.getIsActive() == 1 || ECreature2.getIsActive() == 1) {
            CNewCreature.setIsActive(1);
        }

        int firstIndex = Math.max(nIndex1, nIndex2);
        int secondIndex = Math.min(nIndex1, nIndex2);
        aCreatureList.remove(firstIndex);
        aCreatureList.remove(secondIndex);
        aCreatureList.add(CNewCreature);

        nIndex1 = -1;
        nIndex2 = -1;
        ECreature1 = null;
        ECreature2 = null;

        System.out.println("\nEvolution SUCCESS!! " + CNewCreature.getName() + " has been added to your inventory.");
        System.out.println("--------------------------");
        System.out.println("Name: " + CNewCreature.getName());
        System.out.println("Type: " + CNewCreature.getType());
        System.out.println("Family: " + CNewCreature.getFamily());
        System.out.println("Evolution Level: " + CNewCreature.getEvolutionLevel());
        System.out.println("--------------------------\n");
        return CNewCreature;
    }


    /**
     * This method assigns a new Creature active.
     * 
     * @param CNewActiveCreature  Creature object for new Creature to be assigned active
     */
    public void setActiveCreature(int nIndex){        //sets current active creature to 0 and new active creature to 1
        if (nIndex < 0 || nIndex >= aCreatureList.size()) {
            return;
        }

        int activeIndex = getActiveIndex();
        if (activeIndex >= 0) {
            aCreatureList.get(activeIndex).setIsActive(0);
        }
        aCreatureList.get(nIndex).setIsActive(1);
    }

    public int getActiveIndex(){        //returns the index of the active creature
        for(int i=0; i<aCreatureList.size(); i++){
            Creature thisCreature = aCreatureList.get(i);
            if(thisCreature.getIsActive() == 1){
                return i;
            }
        }
        return -1;
    }

    /**
     * This method gets a creature from inventory.
     * 
     * @param nIndex  integer value for index of a Creature from array
     * @return  Creature object for Creature chosen
     */
    public Creature getCreature(int nIndex){
        return aCreatureList.get(nIndex);
    }

    public ArrayList<Creature> getCreatureList(){
        return aCreatureList;
    }

    /**
     * This method gets the number of Creature a player has
     * 
     * @return integer value for the number of Creature
     */
    public int getListSize(){
        return aCreatureList.size();
    }

    
}
