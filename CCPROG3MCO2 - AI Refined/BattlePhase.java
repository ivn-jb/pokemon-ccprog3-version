import java.util.SplittableRandom;

/**
 * This class is used to do battle. A random enemy Creature is set in this class.
 */
public class BattlePhase {

    private SplittableRandom random;
    private float fEnemyHealth;
    private Creature CPlayerCreature;
    private Creature CEnemyCreature;
    private int turn;

    /**
     * This constructor accepts the randomizer object, and initializes randomly chosen enemy and its health.
     * 
     * 
     */
    public BattlePhase(){
        random  = new SplittableRandom();
        fEnemyHealth = 50;
        CEnemyCreature = null;
        CPlayerCreature = null;
        turn = 0;
    }

    /**
     * gets current player creature
     * @return CPlayerCreature current creature
     */
    public Creature getCPlayerCreature (){
        return this.CPlayerCreature;
    }

    /**
     * sets players creature
     * @param CCreature player creature
     */
    public void setCPlayerCreature (Creature CCreature){
        this.CPlayerCreature = CCreature;
    }

    /**
     * gets  enemy creature
     * @param CCreature current enemy creature 
     */
    public Creature getCEnemyCreature (){
        return this.CEnemyCreature;
    }
    
    /**
     * gets turn in battle
     * @return current turn
     */
    public int getturn(){
        return this.turn;
    }
    /**
     * sets turn
     * @param turn the new turn
     */
    public void setturn(int turn){
        this.turn = turn;
    }

    /**
     * sets enemy health 
     * @param fEnemyHealth enemy health
     */
    public void setnEnemyHealth(float fEnemyHealth ){
        this.fEnemyHealth = fEnemyHealth; 
    }
    /**
     * gets enemy health
     * @return enemy health
     */
    public float getnEnemyHealth(){
        return this.fEnemyHealth;
    }

    public void setParameters(Creature CEnemy, Creature PlayerCreature){
        this.CEnemyCreature = CEnemy;
        this.CPlayerCreature = PlayerCreature;
    }
    

    /**
     * This method analyzes if player Creature has advantage over enemy Creature.
     * 
     * @return  boolean value for if player has advantage
     */
    public boolean isAdvantage(){
        if(CPlayerCreature.getType().equals("Fire") && CEnemyCreature.getType().equals("Grass")
        || CPlayerCreature.getType().equals("Grass") && CEnemyCreature.getType().equals("Water")
        || CPlayerCreature.getType().equals("Water") && CEnemyCreature.getType().equals("Fire")){
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method solves for damage dealt based on chance.
     * 
     * @return  float value of calculated damage
     */
    public float attack(){
        float fDamage;

        if(isAdvantage()){
            fDamage = random.nextInt(1,11) * CPlayerCreature.getEvolutionLevel() * 1.5f;
        } else {
            fDamage = random.nextInt(1,11) * CPlayerCreature.getEvolutionLevel();
        }

        return fDamage;
    }

    /**
     * This method analyzes if enemy Creature is caught based on chance.
     * 
     * @return  boolean value for if player caught the enemy Creature
     */
    public boolean catchEnemy(Inventory CPlayerInventory){

        float catchChance = (40 + 50 - fEnemyHealth)/100;
        double r = random.nextDouble();

        if(r < catchChance){
            return true;
        } 
        else{
            return false;
        }
    }
   
}
