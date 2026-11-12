import java.util.ArrayList;
import java.util.Random;

/**
 * This class is used for generating the list of all Creatures in the game and generating a random Creature.
 */
public class CreatureGenerator {
    private Creature aAllCreatures[];

    /**
     * This constructor initializes all the Creatures in the game.
     */
    public CreatureGenerator(){
        Creature Strawander = new Creature ("Strawander", "Fire", 'A', 1, "resources/strawander.png");
        Creature Chocowool = new Creature ("Chocowool", "Fire", 'B', 1, "resources/chocowool.png");
        Creature Parfwit = new Creature ("Parfwit", "Fire", 'C', 1, "resources/parfwit.png");
        Creature Brownisaur = new Creature ("Brownisaur", "Grass", 'D', 1, "resources/brownisaur.png");
        Creature Frubat = new Creature ("Frubat", "Grass", 'E', 1, "resources/frubat.png");
        Creature Malts = new Creature ("Malts", "Grass", 'F', 1, "resources/malts.png");
        Creature Squirpie = new Creature ("Squirpie", "Water", 'G', 1, "resources/squirpie.png");
        Creature Chocolite = new Creature ("Chocolite", "Water", 'H', 1, "resources/chocolite.png");
        Creature Oshacone = new Creature ("Oshacone", "Water", 'I', 1, "resources/oshacone.png");

        Creature Strawleon = new Creature ("Strawleon", "Fire", 'A', 2, "resources/strawleon.png");
        Creature Chocofluff = new Creature ("Chocofluff", "Fire", 'B', 2, "resources/chocofluff.png");
        Creature Parfure = new Creature ("Parfure", "Fire", 'C', 2, "resources/parfure.png");
        Creature Chocosaur = new Creature ("Chocosaur", "Grass", 'D', 2, "resources/chocosaur.png");
        Creature Golberry = new Creature ("Golberry", "Grass", 'E', 2, "resources/golberry.png");
        Creature Kirlicake = new Creature ("Kirlicake", "Grass", 'F', 2, "resources/kirlicake.png");
        Creature Tartortle = new Creature ("Tartortle", "Water", 'G', 2, "resources/tartortle.png");
        Creature Chocolish = new Creature ("Chocolish", "Water", 'H', 2, "resources/chocolish.png");
        Creature Dewice = new Creature ("Dewice", "Water", 'I', 2, "resources/dewice.png");

        Creature Strawizard = new Creature ("Strawizard", "Fire", 'A', 3, "resources/strawizard.png");
        Creature Candaros = new Creature ("Candaros", "Fire", 'B', 3, "resources/candaros.png");
        Creature Parfelure = new Creature ("Parfelure", "Fire", 'C', 3, "resources/parfelure.png");
        Creature Fudgasaur = new Creature ("Fudgasaur", "Grass", 'D', 3, "resources/fudgasaur.png");
        Creature Croberry = new Creature ("Croberry", "Grass", 'E', 3, "resources/croberry.png");
        Creature Velvevoir = new Creature ("Velvevoir", "Grass", 'F', 3, "resources/velveloir.png");
        Creature Piestoise = new Creature ("Piestoise", "Water", 'G', 3, "resources/piestoise.png");
        Creature Icesundae = new Creature ("Icesundae", "Water", 'H', 3, "resources/icesundae.png");
        Creature Samurcone = new Creature ("Samurcone", "Water", 'I', 3, "resources/samurcone.png");

        aAllCreatures = new Creature[]{Strawander, Chocowool, Parfwit, Brownisaur, Frubat, Malts, Squirpie, Chocolite, Oshacone, 
                                       Strawleon, Chocofluff, Parfure, Chocosaur, Golberry, Kirlicake, Tartortle, Chocolish, Dewice,
                                       Strawizard, Candaros, Parfelure, Fudgasaur, Croberry, Velvevoir, Piestoise, Icesundae, Samurcone};
        }
    

    //add javadoc
    public Creature[] getCreatures(int nEL){
        ArrayList<Creature> aCreatureTemp = new ArrayList<Creature>();
        for(Creature CCreature : aAllCreatures){
            if(CCreature.getEvolutionLevel() <= nEL){
                aCreatureTemp.add(CCreature);
            }
        }
        Creature[] aCreatureReturn = aCreatureTemp.toArray(new Creature[aCreatureTemp.size()]);
        return aCreatureReturn;
    }

    /**
     * This method gets a random Creature.
     * 
     * @return  creature object for random Creature.
     */
    public Creature randomCreature(int n){
        Random CRandom = new Random();
        return aAllCreatures[CRandom.nextInt(n)];
    }
    
}
