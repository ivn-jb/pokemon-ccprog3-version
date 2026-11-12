public class Driver {
    public static void main(String args[]){

        Player CPlayer = new Player();
        Area CArea = new Area();
        BattlePhase CBattlePhase = new BattlePhase();
        Creature CCreature = new Creature(null, null, '0', 0, null);
        CreatureGenerator CCreatureGenerator = new CreatureGenerator();
        Inventory CInventory = new Inventory();

        Gameview CGameview = new Gameview();

        Gamecontroller CGamecontroller = new Gamecontroller(CGameview, CPlayer, CArea, CBattlePhase, CCreature, CCreatureGenerator, CInventory);
    }       
}

