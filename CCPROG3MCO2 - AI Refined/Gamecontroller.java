import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.SplittableRandom;
import java.util.*;
/**
 * this class is the game controller where views and models are connected
 */
public class Gamecontroller {
    private Gameview gameview;
    private Area area;
    private BattlePhase battlePhase;
    private Creature creature;
    private CreatureGenerator creatureGenerator;
    private Inventory inventory;
    private Player player;
    private int inventoryPage;
    private boolean battleSwapMode;

    /**
     * constructor that accepts views and models
     * @param gameview game view
     * @param player player storage
     * @param area area storage
     * @param battlePhase battle storage
     * @param creature creature storage
     * @param creatureGenerator creature generator
     * @param inventory inventory storage
     */
    public Gamecontroller(Gameview gameview, Player player, Area area, BattlePhase battlePhase, Creature creature, CreatureGenerator creatureGenerator, Inventory inventory){
        this.gameview = gameview;
        this.area = area;
        this.battlePhase= battlePhase;
        this.creature = creature;
        this.creatureGenerator = creatureGenerator;
        this.inventory = inventory;
        this.player = player;
        this.inventoryPage = 0;
        this.battleSwapMode = false;


        this.gameview.setStartBtnListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setIntroScreen();
			}
		});

        this.gameview.setintronextbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                    if(!gameview.getNameTfText().equals("")){
                    String name = gameview.getNameTfText();
                    player.setName(name);
                    gameview.setMyDialogue("Choose your starter pokemon.");
                    gameview.hideintrobutton();
                    gameview.hidenametf();
                    gameview.setStarterButtons();
                }
                
            }
		});

        this.gameview.setintrolastbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setMenuScreen();
                    
                
            }
		});

        this.gameview.setStrawanderListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do

                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[0];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setChocowoolListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[1];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setParfwitListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[2];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setBrownisaurListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[3];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setFrubatListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to d
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[4];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setMaltsListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[5];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setSquirpieListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[6];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setChocoliteListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[7];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        this.gameview.setOshaconeListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                Creature aAllCreatures[];
                aAllCreatures = creatureGenerator.getCreatures(1);
                Creature CFirstCreature = aAllCreatures[8];
                inventory.addCreature(CFirstCreature);
                inventory.getCreature(0).setIsActive(1);
                gameview.setMyDialogue("You chose " +
                inventory.getCreature(0).getName() + ".\n" + player.getName() + ", raise your young Pokemon by making it fight!");
                gameview.showintrolastbutton();
                gameview.hidestarterbuttons();
                
            }
		});

        //--

        this.gameview.setareabuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setAreaScreen();
                
            }
		});

        this.gameview.setinventorybuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do

                battleSwapMode = false;
                inventoryPage = 0;
                showInventoryPage();
                return;

                /*
                gameview.clearScreen();
                gameview.setInventoryScreen();
                ArrayList<Creature> list = inventory.getCreatureList();

                if(list.size() >= 1){
                    gameview.setImage1(list.get(0).getFilename());
                    int i = 0;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc1(description);
                }

                if(list.size() >= 2){
                    gameview.setImage2(list.get(1).getFilename());
                    int i = 1;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc2(description);
                } else {
                    gameview.setImage2(null);
                    gameview.setinventorydesc2("Empty inventory slot");
                    
                }

                if(list.size() >= 3){
                    gameview.setImage3(list.get(2).getFilename());
                    int i = 2;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc3(description);
                } else {
                    gameview.setImage3(null);
                    gameview.setinventorydesc3("Empty inventory slot");
                }

                if(list.size() >= 4){
                    gameview.setImage4(list.get(3).getFilename());
                    int i = 3;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc4(description);
                } else {
                    gameview.setImage4(null);
                    gameview.setinventorydesc4("Empty inventory slot");
                }

                if(list.size() >= 5){
                    gameview.setImage5(list.get(4).getFilename());
                    int i = 4;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc5(description);
                } else {
                    gameview.setImage5(null);
                    gameview.setinventorydesc5("Empty inventory slot");
                }

                if(list.size() >= 6){
                    gameview.setImage6(list.get(5).getFilename());
                    int i = 5;
                    String description;
                    description = "Code " + i + 
                                                "\n" + list.get(i).getName() +
                                                "\nType: " + list.get(i).getType() + 
                                                "\nFamily: " + list.get(i).getFamily() +
                                                "\nEL: " + list.get(i).getEvolutionLevel();
                    if (list.get(i).getIsActive() == 1){
                        description += "\nACTIVE";
                    }

                    gameview.setinventorydesc6(description);
                } else {
                    gameview.setImage6(null);
                    gameview.setinventorydesc6("Empty inventory slot");
                }

                


                

                // ArrayList<Creature> list = inventory.getCreatureList();

				// for(int i=0; i< list.size(); i++) {
                //     if(list.get(i).getIsActive() == 1){
                //         displayText += list.get(i).getName() + 
                //                     " EL: " + list.get(i).getEvolutionLevel() + 
                //                     " TYPE: " + list.get(i).getType() + 
                //                     " ACTIVE " + "\n";
                //     } else {
                //         displayText += list.get(i).getName() + 
                //                     " EL: " + list.get(i).getEvolutionLevel() + 
                //                     " TYPE: " + list.get(i).getType() + "\n";
                //     }
					
				// }

                // gameview.setinventorycontent(displayText);
                */
            }
		});

        this.gameview.setnextpagebuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if (inventoryPage < getInventoryPageCount() - 1) {
                    inventoryPage++;
                    showInventoryPage();
                }
            }
		});

        this.gameview.setbackpagebuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if (inventoryPage > 0) {
                    inventoryPage--;
                    showInventoryPage();
                }
            }
		});

        this.gameview.setevolutionbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
				gameview.resetEvolutionSelection();
                gameview.clearScreen();
                gameview.setevolutionscreen();
                gameview.setMyDialogue("Choose two Pokemon from your inventory with the same family and evolution level.");
                
                
            }
		});

        this.gameview.setexitbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                System.exit(0);
                
            }
		});

        //--

        this.gameview.setarea1buttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do\
                player.setmapsignal(1);
                gameview.clearScreen();
                gameview.setArea1Screen();
                gameview.setRed(360,270);
                area.setnXPos(360);
                area.setnYPos(270);
                

                
            }
		});

        this.gameview.setarea2buttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                player.setmapsignal(2);
                gameview.clearScreen();
                gameview.setArea2Screen();
                gameview.setRed(420,200);
                area.setnXPos(420);
                area.setnYPos(200);
                
            }
		});

        this.gameview.setarea3buttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                player.setmapsignal(3);
                gameview.clearScreen();
                gameview.setArea3Screen();
                gameview.setRed(390,180);
                area.setnXPos(390);
                area.setnYPos(180);
                
            }
		});

        this.gameview.setareaexitbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setMenuScreen();
                
                
            }
		});

        //--

        this.gameview.setupbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do\
                if( player.getmapsignal() == 1){
                    //donothing
                } else if (player.getmapsignal() == 2){
                    
                    int y = area.getnYPos();
                    if(y-60 == 140){

                    } else {
                    gameview.setRed(area.getnXPos(), y-60);
                    area.setnYPos(y-60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];

                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(18);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }

                    }
 
                } else if (player.getmapsignal() == 3){
                    int y = area.getnYPos();
                    if(y-60 == 120){

                    } else {
                    gameview.setRed(area.getnXPos(), y-60);
                    area.setnYPos(y-60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(27);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }

                    }
                }
                
                
            }
		});

        this.gameview.setdownbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                if( player.getmapsignal() == 1){
                    //do nothing
                } else if (player.getmapsignal() == 2){
                    
                    int y = area.getnYPos();
                    if(y+60 == 380){

                    } else {
                    gameview.setRed(area.getnXPos(), y+60);
                    area.setnYPos(y+60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature( 18);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }

                    }
 
                } else if (player.getmapsignal() == 3){
                    int y = area.getnYPos();
                    if(y+60 == 420){

                    } else {
                    gameview.setRed(area.getnXPos(), y+60);
                    area.setnYPos(y+60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(27);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                }
                
            }
		});

        this.gameview.setleftbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                if( player.getmapsignal() == 1){
                    int x = area.getnXPos();
                    if(x-60 == 300){

                    } else {
                    gameview.setRed( x-60, area.getnYPos());
                    area.setnXPos(x-60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(9);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                } else if (player.getmapsignal() == 2){
                    
                    int x = area.getnXPos();
                    if(x-60 == 360){

                    } else {
                    gameview.setRed( x-60, area.getnYPos());
                    area.setnXPos(x-60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(18);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
 
                } else if (player.getmapsignal() == 3){
                    int x = area.getnXPos();
                    if(x-60 == 330){

                    } else {
                    gameview.setRed( x-60, area.getnYPos());
                    area.setnXPos(x-60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(27);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                }
                
            }
		});

        this.gameview.setrightbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                
                if( player.getmapsignal() == 1){
                    int x = area.getnXPos();
                    if(x+60 == 660){

                    } else {
                    gameview.setRed( x+60, area.getnYPos());
                    area.setnXPos(x+60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(9);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                } else if (player.getmapsignal() == 2){
                    int x = area.getnXPos();
                    if(x+60 == 600){

                    } else {
                    gameview.setRed( x+60, area.getnYPos());
                    area.setnXPos(x+60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(18);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                    
                } else if (player.getmapsignal() == 3){
                    int x = area.getnXPos();
                    if(x+60 == 630){

                    } else {
                    gameview.setRed( x+60, area.getnYPos());
                    area.setnXPos(x+60);

                    boolean isFight = false;
                    boolean encounterChance[] = {true, true, false, false, false};
                    SplittableRandom random = new SplittableRandom();
                    isFight = encounterChance[random.nextInt(0,5)];
                    if(isFight){
                        Creature Enemy = creatureGenerator.randomCreature(27);
                        gameview.clearScreen();
                        gameview.showbattlescreen(Enemy.getFilename());
                        battlePhase.setParameters(Enemy,inventory.getCreature(inventory.getActiveIndex()));
                    }
                    }
                }
                
                
            }
		});
        
        this.gameview.setmapexitbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setMenuScreen();
                
                
            }
		});

        // ------------------------------------------------------------------

        this.gameview.setinvbackbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                gameview.clearScreen();
                gameview.setMenuScreen();
                
                
            }
		});

        this.gameview.setswapbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do

                int index = gameview.getSwapTFInt();
                if (index >= 0 && index < inventory.getListSize()) {
                    inventory.setActiveCreature(index);
                    inventoryPage = index / 6;
                    showInventoryPage();
                }
            }
		});


        //--

        this.gameview.setchoose1buttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                if(gameview.getpoke1TFInt() >= 0 && gameview.getpoke1TFInt()<inventory.getListSize()){
                int n =gameview.getpoke1TFInt();
                Creature CCreature = inventory.getCreature(n);
                inventory.setECreature1(CCreature);
                inventory.setnIndex1(n);
                gameview.setpoke1TA("Pokemon: " + CCreature.getName() +
                                    "\nEL: " + CCreature.getEvolutionLevel() +
                                    "\nType: " + CCreature.getType());
                gameview.setpokepic1(CCreature.getFilename());
                }
                


                
                
                
            }
		});

        this.gameview.setchoose2buttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                if(gameview.getpoke2TFInt() >= 0 && gameview.getpoke2TFInt()<inventory.getListSize()){
                int n =gameview.getpoke2TFInt();
                
                Creature CCreature = inventory.getCreature(n);
                inventory.setECreature2(CCreature);
                inventory.setnIndex2(n);
                gameview.setpoke2TA("Pokemon: " + CCreature.getName() +
                                    "\nEL: " + CCreature.getEvolutionLevel() +
                                    "\nType: " + CCreature.getType());
                gameview.setpokepic2(CCreature.getFilename());
                }
                
                
            }
		});

        this.gameview.setevobuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do

                if(inventory.getECreature1() != null &&
                   inventory.getECreature2() != null &&
                   inventory.getECreature1().getEvolutionLevel() != 3 &&
                   inventory.getECreature2().getEvolutionLevel() != 3 &&
                    inventory.getECreature1().getEvolutionLevel() == inventory.getECreature2().getEvolutionLevel() &&
                    inventory.getECreature1().getFamily() == inventory.getECreature2().getFamily() &&
                    inventory.getnIndex1() != inventory.getnIndex2()){
                        Creature evolvedCreature = inventory.evolveCreature();
                        if (evolvedCreature != null) {
                            int newCreatureCode = inventory.getListSize() - 1;
                            gameview.clearScreen();
                            gameview.showEvolutionResultScreen(
                                    evolvedCreature.getFilename(),
                                    "Evolution successful!\n"
                                    + evolvedCreature.getName()
                                    + " was added to your inventory.\nCode: "
                                    + newCreatureCode);
                        } else {
                            gameview.setMyDialogue("Evolution failed. Choose two different compatible Pokemon.");
                        }
                    } 
                
                
            }
		});

        this.gameview.setevobackbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do

                gameview.clearScreen();
                gameview.setMenuScreen();
                
                
            }
		});

        this.gameview.setattackbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                battlePhase.setturn(battlePhase.getturn() + 1);
                battlePhase.setnEnemyHealth(battlePhase.getnEnemyHealth() - (float)battlePhase.attack());
                gameview.setstats("Enemy Pokemon: " + battlePhase.getCEnemyCreature().getName() + "\nEnemy type: "
                                + battlePhase.getCEnemyCreature().getType() + "\nEnemy Health: " + battlePhase.getnEnemyHealth()
                                + "\nYour Pokemon: " + battlePhase.getCPlayerCreature().getName() + "\nPokemon type: "
                                + battlePhase.getCPlayerCreature().getType());
                if (battlePhase.getnEnemyHealth() <= 0){
                    battlePhase.setturn(0);
                    battlePhase.setnEnemyHealth(50);
                    gameview.clearScreen();
                    gameview.showCatchResultScreen(
                            battlePhase.getCEnemyCreature().getName() + " fainted!");
                } else if (battlePhase.getturn() == 3){
                    battlePhase.setturn(0);
                    battlePhase.setnEnemyHealth(50);
                    returnToMap();
                }
                
            }
		});

        this.gameview.setswapButtonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                battleSwapMode = true;
                inventoryPage = 0;
                showInventoryPage();
            }
		});

        this.gameview.setswapbutton2Listener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                if(gameview.getSwapTFInt() >= 0 && gameview.getSwapTFInt() < inventory.getListSize()){

                    int index = gameview.getSwapTFInt();
                    inventory.setActiveCreature(index);
                    battlePhase.setCPlayerCreature(inventory.getCreature(index));

                    battleSwapMode = false;
                    gameview.clearScreen();
                    gameview.showbattlescreen(battlePhase.getCEnemyCreature().getFilename());
                    battlePhase.setturn(battlePhase.getturn() + 1);
                    gameview.setstats("You swapped to " + battlePhase.getCPlayerCreature().getName());
                    if(battlePhase.getturn() == 3) {
                        battlePhase.setturn(0);
                        battlePhase.setnEnemyHealth(50);
                        gameview.setstats("");
                        if (player.getmapsignal() == 1){
                            gameview.clearScreen();
                            gameview.setArea1Screen();
                            gameview.setRed(area.getnXPos(),area.getnYPos());
                        } else if (player.getmapsignal() == 2){
                            gameview.clearScreen();
                            gameview.setArea2Screen();
                            gameview.setRed(area.getnXPos(),area.getnYPos());
                        } else if (player.getmapsignal() == 3){
                            gameview.clearScreen();
                            gameview.setArea3Screen();
                            gameview.setRed(area.getnXPos(),area.getnYPos());
                        }
                    }
                }
                
            }
		});

        this.gameview.setcatchbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                boolean value =battlePhase.catchEnemy(inventory);
                battlePhase.setturn(battlePhase.getturn() + 1);
                if (value){
                    inventory.addCreature(battlePhase.getCEnemyCreature());
                    battlePhase.setturn(0);
                    battlePhase.setnEnemyHealth(50);
                    gameview.clearScreen();
                    gameview.showCatchResultScreen(
                            "Catch successful! " + battlePhase.getCEnemyCreature().getName()
                            + " was added to your inventory.");
                } else if(battlePhase.getturn() == 3) {
                    battlePhase.setturn(0);
                    battlePhase.setnEnemyHealth(50);
                    gameview.clearScreen();
                    gameview.showCatchResultScreen(
                            "Catch failed. " + battlePhase.getCEnemyCreature().getName()
                            + " escaped after three turns.");
                } else {
                    gameview.setstats("Catch failed. Try again.");
                }
                
            }
		});

        this.gameview.setcatchResultButtonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                returnToMap();
            }
		});

        this.gameview.setevolutionResultButtonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                gameview.clearScreen();
                gameview.setMenuScreen();
            }
		});

        this.gameview.setrunbuttonListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                    if (player.getmapsignal() == 1){
                        gameview.clearScreen();
                        gameview.setArea1Screen();
                        gameview.setRed(area.getnXPos(),area.getnYPos());
                    } else if (player.getmapsignal() == 2){
                        gameview.clearScreen();
                        gameview.setArea2Screen();
                        gameview.setRed(area.getnXPos(),area.getnYPos());
                    } else if (player.getmapsignal() == 3){
                        gameview.clearScreen();
                        gameview.setArea3Screen();
                        gameview.setRed(area.getnXPos(),area.getnYPos());
                    }
                
            }
		});

        this.gameview.setinvbackbutton2Listener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// to do
                        gameview.clearScreen();
                        gameview.showbattlescreen(battlePhase.getCEnemyCreature().getFilename());
                
            }
		});
        

    }

    private int getInventoryPageCount() {
        return Math.max(1, (inventory.getListSize() + 5) / 6);
    }

    private void showInventoryPage() {
        gameview.clearScreen();
        if (battleSwapMode) {
            gameview.setSwapInventoryScreen();
        } else {
            gameview.setInventoryScreen();
        }

        ArrayList<Creature> list = inventory.getCreatureList();
        int firstIndex = inventoryPage * 6;
        for (int slot = 0; slot < 6; slot++) {
            int creatureIndex = firstIndex + slot;
            if (creatureIndex < list.size()) {
                Creature current = list.get(creatureIndex);
                String description = "Code " + creatureIndex
                        + "\n" + current.getName()
                        + "\nType: " + current.getType()
                        + "\nFamily: " + current.getFamily()
                        + "\nEL: " + current.getEvolutionLevel();
                if (current.getIsActive() == 1) {
                    description += "\nACTIVE";
                }
                setInventorySlot(slot, current.getFilename(), description);
            } else {
                setInventorySlot(slot, null, "Empty inventory slot");
            }
        }

        gameview.setInventoryNavigationEnabled(
                inventoryPage > 0,
                inventoryPage < getInventoryPageCount() - 1);
    }

    private void setInventorySlot(int slot, String filename, String description) {
        switch (slot) {
            case 0:
                gameview.setImage1(filename);
                gameview.setinventorydesc1(description);
                break;
            case 1:
                gameview.setImage2(filename);
                gameview.setinventorydesc2(description);
                break;
            case 2:
                gameview.setImage3(filename);
                gameview.setinventorydesc3(description);
                break;
            case 3:
                gameview.setImage4(filename);
                gameview.setinventorydesc4(description);
                break;
            case 4:
                gameview.setImage5(filename);
                gameview.setinventorydesc5(description);
                break;
            case 5:
                gameview.setImage6(filename);
                gameview.setinventorydesc6(description);
                break;
            default:
                throw new IllegalArgumentException("Invalid inventory slot: " + slot);
        }
    }

    private void returnToMap() {
        gameview.clearScreen();
        if (player.getmapsignal() == 1) {
            gameview.setArea1Screen();
        } else if (player.getmapsignal() == 2) {
            gameview.setArea2Screen();
        } else if (player.getmapsignal() == 3) {
            gameview.setArea3Screen();
        }
        gameview.setRed(area.getnXPos(), area.getnYPos());
    }

    
}
