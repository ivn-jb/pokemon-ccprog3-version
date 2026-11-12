import javax.swing.*;

import java.awt.event.ActionListener;

public class Gameview {
    
    //start screen components
    private JFrame frame;
    private ImageIcon startBackground;
    private JLabel myBackground;
    private JButton startButton;

    //1st intro screen components
    private JTextArea myDialogue;
    private JButton intronextbutton;
    private JTextField nameTF;

    private JButton strawanderbutton;
    private Icon strawanderchoice;
    private JButton chocowoolbutton;
    private Icon chocowoolchoice;
    private JButton parfwitbutton;
    private Icon parfwitchoice;
    private JButton brownisaurbutton;
    private Icon brownisaurchoice;
    private JButton frubatbutton;
    private Icon frubatchoice;
    private JButton maltsbutton;
    private Icon maltschoice;
    private JButton squirpiebutton;
    private Icon squirpiechoice;
    private JButton chocolitebutton;
    private Icon chocolitechoice;
    private JButton oshaconebutton;
    private Icon oshaconechoice;

    private JButton introlastbutton;

    //menu screen components
    private JButton inventorybutton;
    private JButton areabutton;
    private JButton evolutionbutton;
    private JButton exitbutton;

    //area screen components
    private JButton area1button;
    private JButton area2button;
    private JButton area3button;
    private JButton areaexitbutton;

    //map screen components
    private JButton upbutton;
    private JButton downbutton;
    private JButton leftbutton;
    private JButton rightbutton;
    private JButton mapexitbutton;

    private ImageIcon redImage;
    private JLabel redLabel;

    //inventory screen components
    private JTextField swapTF;
    private JLabel swapDialogue;
    private JButton nextpagebutton;
    private JButton invbackbutton;
    private JButton swapbutton;

    private ImageIcon inventory1Icon;
    private ImageIcon inventory2Icon;
    private ImageIcon inventory3Icon;
    private ImageIcon inventory4Icon;
    private ImageIcon inventory5Icon;
    private ImageIcon inventory6Icon;

    private JLabel inventory1Pic;
    private JLabel inventory2Pic;
    private JLabel inventory3Pic;
    private JLabel inventory4Pic;
    private JLabel inventory5Pic;
    private JLabel inventory6Pic;

    private JTextArea inventorydesc1;
    private JTextArea inventorydesc2;
    private JTextArea inventorydesc3;
    private JTextArea inventorydesc4;
    private JTextArea inventorydesc5;
    private JTextArea inventorydesc6;

    private JButton backpagebutton;

    //evolution screen components
    private JButton choose1button;
    private JButton choose2button;
    private JButton evobackbutton;
    private JButton evobutton;
    private JTextField poke1TF;
    private JTextField poke2TF;
    private ImageIcon pic1;
    private ImageIcon pic2;
    private JLabel pokepic1;
    private JLabel pokepic2;
    private JTextArea poke1TA;
    private JTextArea poke2TA;

    //fight screen
    private JButton attackButton;
    private JButton swapButton;
    private JButton catchButton;
    private JButton runButton;
    private JButton catchResultButton;
    private JButton evolutionResultButton;
    private JTextArea evolutionResultText;
    private JLabel evolutionResultPic;

    private JTextArea stats;
    private JTextArea inventorycontent;

    private ImageIcon enemyIcon;
    private JLabel enemyPic;

    //swap pokemon screen
    private JButton invbackbutton2;
    private JButton swapbutton2;

    public Gameview(){

        //frame
        frame = new JFrame("Pokemon CCPROG3 Version");
        frame.setSize(1020, 630);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //start screen background
        startBackground = new ImageIcon(this.getClass().getResource("resources/startscreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        //start screen add button
        startButton = new JButton("Press Start");
        startButton.setBounds(431,388,159,43);
        myBackground.add(startButton);

        frame.add(myBackground);

        

        //intro screen
        intronextbutton = new JButton("Next");
        intronextbutton.setBounds(869,535,80,30);
        myDialogue = new JTextArea("Welcome to the pokemon world!\nWhat is your name?");
        configureTextArea(myDialogue);
        myDialogue.setBounds(71,448,300,100);
        myDialogue.setEditable(false);
        nameTF = new JTextField();
        nameTF.setBounds(71,485,180,30);

        strawanderchoice = new ImageIcon ("resources/strawanderbutton.png");
        strawanderbutton = new JButton(strawanderchoice);
        strawanderbutton.setBounds(228,22,181,114);

        chocowoolchoice = new ImageIcon ("resources/chocowoolbutton.png");
        chocowoolbutton = new JButton(chocowoolchoice);
        chocowoolbutton.setBounds(228,148,181,114);

        parfwitchoice = new ImageIcon ("resources/parfwitbutton.png");
        parfwitbutton = new JButton(parfwitchoice);
        parfwitbutton.setBounds(228,274,181,114);

        brownisaurchoice = new ImageIcon ("resources/brownisaurbutton.png");
        brownisaurbutton = new JButton(brownisaurchoice);
        brownisaurbutton.setBounds(432,22,181,114);

        frubatchoice = new ImageIcon ("resources/frubatbutton.png");
        frubatbutton = new JButton(frubatchoice);
        frubatbutton.setBounds(432,148,181,114);

        maltschoice = new ImageIcon ("resources/maltsbutton.png");
        maltsbutton = new JButton(maltschoice);
        maltsbutton.setBounds(432,274,181,114);

        squirpiechoice = new ImageIcon ("resources/squirpiebutton.png");
        squirpiebutton = new JButton(squirpiechoice);
        squirpiebutton.setBounds(636,22,181,114);

        chocolitechoice = new ImageIcon ("resources/chocolitebutton.png");
        chocolitebutton = new JButton(chocolitechoice);
        chocolitebutton.setBounds(636,148,181,114);

        oshaconechoice = new ImageIcon ("resources/oshaconebutton.png");
        oshaconebutton = new JButton(oshaconechoice);
        oshaconebutton.setBounds(636,274,181,114);

        introlastbutton = new JButton("Next");
        introlastbutton.setBounds(869,535,80,30);
        introlastbutton.setVisible(false);

        //menu screen 
        areabutton = new JButton("Area");
        areabutton.setBounds(120,90,360,180);

        inventorybutton = new JButton("Inventory");
        inventorybutton.setBounds(120,330,360,180);

        evolutionbutton = new JButton("Evolution");
        evolutionbutton.setBounds(540,90,360,180);

        exitbutton = new JButton("Exit");
        exitbutton.setBounds(540,330,360,180);

        //area screen 
        area1button = new JButton("Area 1");
        area1button.setBounds(330,86,360,125);

        area2button = new JButton("Area 2");
        area2button.setBounds(330,239,360,125);

        area3button = new JButton("Area 3");
        area3button.setBounds(330,392,360,125);

        areaexitbutton = new JButton("Back");
        areaexitbutton.setBounds(869,535,80,30);

        //map screen 
        upbutton = new JButton("\u2191");
        upbutton.setBounds(120,210,60,60);
        downbutton = new JButton("\u2193");
        downbutton.setBounds(120,330,60,60);
        leftbutton = new JButton("\u2190");
        leftbutton.setBounds(60,270,60,60);
        rightbutton = new JButton("\u2192");
        rightbutton.setBounds(180,270,60,60);
        

        mapexitbutton = new JButton("Back");
        mapexitbutton.setBounds(869,535,80,30);

        redImage = new ImageIcon(this.getClass().getResource("resources/RED.png"));
        redLabel = new JLabel(redImage);
        redLabel.setSize(60,60);

        //inventory component

        swapTF = new JTextField();
        swapTF.setBounds(71,515,180,30);
        swapDialogue = new JLabel("Enter Pokemon code:");
        swapDialogue.setBounds(71,453,300,100);
        swapbutton = new JButton("Swap");
        swapbutton.setBounds(71,547,80,30);

        nextpagebutton = new JButton("->");
        nextpagebutton.setBounds(869,495,80,30);
        invbackbutton = new JButton("Back");
        invbackbutton.setBounds(869,535,80,30);
        backpagebutton = new JButton("<-");
        backpagebutton.setBounds(869,450,80,30);

        inventorycontent = new JTextArea("");
        configureTextArea(inventorycontent);
        inventorycontent.setBounds(97,28,827,370);

        inventorydesc1 = new JTextArea("");
        configureTextArea(inventorydesc1);
        inventorydesc1.setBounds(253,21,232,139);
        inventorydesc1.setEditable(false);

        inventorydesc2 = new JTextArea("");
        configureTextArea(inventorydesc2);
        inventorydesc2.setBounds(253,169,232,139);
        inventorydesc2.setEditable(false);

        inventorydesc3 = new JTextArea("");
        configureTextArea(inventorydesc3);
        inventorydesc3.setBounds(253,317,232,139);
        inventorydesc3.setEditable(false);

        inventorydesc4 = new JTextArea("");
        configureTextArea(inventorydesc4);
        inventorydesc4.setBounds(649,21,232,139);
        inventorydesc4.setEditable(false);

        inventorydesc5 = new JTextArea("");
        configureTextArea(inventorydesc5);
        inventorydesc5.setBounds(649,169,232,139);
        inventorydesc5.setEditable(false);

        inventorydesc6 = new JTextArea("");
        configureTextArea(inventorydesc6);
        inventorydesc6.setBounds(649,317,232,139);
        inventorydesc6.setEditable(false);

        
        
        //evolution

        choose1button = new JButton("CHOOSE");
        choose1button.setBounds(145,100,110,30);
        choose2button = new JButton("CHOOSE");
        choose2button.setBounds(745,100,110,30);
        evobackbutton = new JButton("Back");
        evobackbutton.setBounds(869,535,80,30);
        evobutton = new JButton("evolve");
        evobutton.setBounds(450,300,80,30);
        poke1TF = new JTextField();
        poke1TF.setBounds(160,130,80,30);
        poke2TF = new JTextField();
        poke2TF.setBounds(760,130,80,30);

        
        

        poke1TA = new JTextArea();
        configureTextArea(poke1TA);
        poke1TA.setBounds(100,400,200,50);
        poke2TA = new JTextArea();
        configureTextArea(poke2TA);
        poke2TA.setBounds(720,400,200,50);
        poke1TA.setEditable(false);
        poke2TA.setEditable(false);


        // fightBackground = null;
        // fBackground = null;

        catchButton = new JButton("Catch");
        catchButton.setBounds(869,465,80,30);
        runButton = new JButton("Run");
        runButton.setBounds(869,535,80,30);
        catchResultButton = new JButton("Continue");
        catchResultButton.setBounds(869,535,80,30);
        attackButton = new JButton("Attack");
        attackButton.setBounds(769,465,80,30);
        swapButton = new JButton("Swap");
        swapButton.setBounds(769,535,80,30);
        stats = new JTextArea();
        configureTextArea(stats);
        stats.setBounds(71,448,300,100);
        stats.setText("Choose Attack, Catch, Swap, or Run.");

        evolutionResultButton = new JButton("Continue");
        evolutionResultButton.setBounds(869,535,80,30);
        evolutionResultText = new JTextArea();
        configureTextArea(evolutionResultText);
        evolutionResultText.setBounds(330,390,360,100);

        swapbutton2 = new JButton("Swap");
        swapbutton2.setBounds(71,547,80,30);
        invbackbutton2 = new JButton("Back");
        invbackbutton2.setBounds(869,535,80,30);
        
        frame.setVisible(true);
        
        
    }

    public void setStartBtnListener(ActionListener actionListener) {
		this.startButton.addActionListener(actionListener);
	}

    public void clearScreen(){
        frame.getContentPane().removeAll();
        frame.repaint();
    }

    public void showEvolutionResultScreen(String filename, String message){
        startBackground = new ImageIcon(this.getClass().getResource("resources/inventory.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        evolutionResultText.setText(message);
        myBackground.add(evolutionResultText);
        myBackground.add(evolutionResultButton);

        ImageIcon evolutionIcon = new ImageIcon(this.getClass().getResource(filename));
        evolutionResultPic = new JLabel(evolutionIcon);
        evolutionResultPic.setBounds(375,80,270,270);
        myBackground.add(evolutionResultPic);

        frame.add(myBackground);
        frame.repaint();
    }
    
    public void setIntroScreen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/introscreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);

        //add button
        myBackground.add(intronextbutton);

        //add textfield
        myBackground.add(nameTF);

        //add dialogue
        myBackground.add(myDialogue);
        
        frame.add(myBackground);

    }

    public void setintronextbuttonListener(ActionListener actionListener) {
		this.intronextbutton.addActionListener(actionListener);
	}

    public void setintrolastbuttonListener(ActionListener actionListener) {
		this.introlastbutton.addActionListener(actionListener);
	}

    public String getNameTfText() {
		return this.nameTF.getText();
	}

    public void setMyDialogue(String text) {
        myDialogue.setText(text);
    }

    public void resetEvolutionSelection() {
        poke1TF.setText("");
        poke2TF.setText("");
        poke1TA.setText("");
        poke2TA.setText("");
    }

    private void configureTextArea(JTextArea textArea) {
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
    }

    public void hideintrobutton(){
        intronextbutton.setVisible(false);
    }

    public void hidenametf(){
        nameTF.setVisible(false);
    }

    public void setStarterButtons(){
        myBackground.add(strawanderbutton);
        myBackground.add(chocowoolbutton);
        myBackground.add(parfwitbutton);
        myBackground.add(brownisaurbutton);
        myBackground.add(frubatbutton);
        myBackground.add(maltsbutton);
        myBackground.add(squirpiebutton);
        myBackground.add(chocolitebutton);
        myBackground.add(oshaconebutton);

        frame.repaint();
    }

    public void setStrawanderListener(ActionListener actionListener) {
		this.strawanderbutton.addActionListener(actionListener);
	}

    public void setChocowoolListener(ActionListener actionListener) {
		this.chocowoolbutton.addActionListener(actionListener);
	}

    public void setParfwitListener(ActionListener actionListener) {
		this.parfwitbutton.addActionListener(actionListener);
	}

    public void setBrownisaurListener(ActionListener actionListener) {
		this.brownisaurbutton.addActionListener(actionListener);
	}

    public void setFrubatListener(ActionListener actionListener) {
		this.frubatbutton.addActionListener(actionListener);
	}

    public void setMaltsListener(ActionListener actionListener) {
		this.maltsbutton.addActionListener(actionListener);
	}

    public void setSquirpieListener(ActionListener actionListener) {
		this.squirpiebutton.addActionListener(actionListener);
	}

    public void setChocoliteListener(ActionListener actionListener) {
		this.chocolitebutton.addActionListener(actionListener);
	}

    public void setOshaconeListener(ActionListener actionListener) {
		this.oshaconebutton.addActionListener(actionListener);
	}

    public void showintrobutton(){
        intronextbutton.setVisible(true);
    }

    public void showintrolastbutton(){
        myBackground.add(introlastbutton);
        introlastbutton.setVisible(true);
    }

    public void hidestarterbuttons(){
        strawanderbutton.setVisible(false);
        parfwitbutton.setVisible(false);
        chocowoolbutton.setVisible(false);
        brownisaurbutton.setVisible(false);
        maltsbutton.setVisible(false);
        frubatbutton.setVisible(false);
        squirpiebutton.setVisible(false);
        chocolitebutton.setVisible(false);
        oshaconebutton.setVisible(false);
    }

    public void setMenuScreen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/menuscreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        myBackground.add(areabutton);
        myBackground.add(inventorybutton);
        myBackground.add(evolutionbutton);
        myBackground.add(exitbutton);

        frame.add(myBackground);

    }

    public void setareabuttonListener(ActionListener actionListener) {
		this.areabutton.addActionListener(actionListener);
	}

    public void setinventorybuttonListener(ActionListener actionListener) {
		this.inventorybutton.addActionListener(actionListener);
	}

    public void setevolutionbuttonListener(ActionListener actionListener) {
		this.evolutionbutton.addActionListener(actionListener);
	}

    public void setexitbuttonListener(ActionListener actionListener) {
		this.exitbutton.addActionListener(actionListener);
	}

    public void setAreaScreen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/menuscreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        myBackground.add(area1button);
        myBackground.add(area2button);
        myBackground.add(area3button);
        myBackground.add(areaexitbutton);

        frame.add(myBackground);

        frame.repaint();

    }


    public void setarea1buttonListener(ActionListener actionListener) {
		this.area1button.addActionListener(actionListener);
	}

    public void setarea2buttonListener(ActionListener actionListener) {
		this.area2button.addActionListener(actionListener);
	}

    public void setarea3buttonListener(ActionListener actionListener) {
		this.area3button.addActionListener(actionListener);
	}

    public void setareaexitbuttonListener(ActionListener actionListener) {
		this.areaexitbutton.addActionListener(actionListener);
	}

    public void setRed(int x, int y){
        redLabel.setBounds(x,y,60,60);
        myBackground.add(redLabel);
        frame.repaint();
    }

    public void setArea1Screen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/map1.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);

        myBackground.add(upbutton);
        myBackground.add(downbutton);
        myBackground.add(rightbutton);
        myBackground.add(leftbutton);
        myBackground.add(mapexitbutton);

        frame.add(myBackground);

        frame.repaint();

    }

    public void setArea2Screen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/map2.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);

        myBackground.add(upbutton);
        myBackground.add(downbutton);
        myBackground.add(rightbutton);
        myBackground.add(leftbutton);
        myBackground.add(mapexitbutton);

        frame.add(myBackground);

        frame.repaint();

    }

    public void setArea3Screen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/map3.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);

        myBackground.add(upbutton);
        myBackground.add(downbutton);
        myBackground.add(rightbutton);
        myBackground.add(leftbutton);
        myBackground.add(mapexitbutton);

        frame.add(myBackground);

        frame.repaint();

    }

    public void setupbuttonListener(ActionListener actionListener) {
		this.upbutton.addActionListener(actionListener);
	}

    public void setdownbuttonListener(ActionListener actionListener) {
		this.downbutton.addActionListener(actionListener);
	}

    public void setleftbuttonListener(ActionListener actionListener) {
		this.leftbutton.addActionListener(actionListener);
	}

    public void setrightbuttonListener(ActionListener actionListener) {
		this.rightbutton.addActionListener(actionListener);
	}

    public void setmapexitbuttonListener(ActionListener actionListener) {
		this.mapexitbutton.addActionListener(actionListener);
	}

    public void setInventoryScreen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/inventory.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        myBackground.add(swapTF);
        myBackground.add(swapDialogue);
        myBackground.add(nextpagebutton);
        myBackground.add(invbackbutton);
        myBackground.add(swapbutton);
        // myBackground.add(inventorycontent);

        myBackground.add(backpagebutton);

        

        myBackground.add(inventorydesc1);
        myBackground.add(inventorydesc2);
        myBackground.add(inventorydesc3);
        myBackground.add(inventorydesc4);
        myBackground.add(inventorydesc5);
        myBackground.add(inventorydesc6);

        frame.add(myBackground);

        frame.repaint();

    }

    public void setInventoryNavigationEnabled(boolean canGoBack, boolean canGoForward) {
        backpagebutton.setEnabled(canGoBack);
        nextpagebutton.setEnabled(canGoForward);
    }

    public void setinventorydesc1(String text){
        inventorydesc1.setText(text);
    }

    public void setinventorydesc2(String text){
        inventorydesc2.setText(text);
    }

    public void setinventorydesc3(String text){
        inventorydesc3.setText(text);
    }

    public void setinventorydesc4(String text){
        inventorydesc4.setText(text);
    }

    public void setinventorydesc5(String text){
        inventorydesc5.setText(text);
    }

    public void setinventorydesc6(String text){
        inventorydesc6.setText(text);
    }
    
    public void setImage1(String filename){
        if (filename == null) {
            return;
        }
        inventory1Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory1Pic = new JLabel(inventory1Icon);
        inventory1Pic.setBounds(114,20,139,139);
        myBackground.add(inventory1Pic);
    }

    public void setImage2(String filename){
        if (filename == null) {
            return;
        }
        inventory2Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory2Pic = new JLabel(inventory2Icon);
        inventory2Pic.setBounds(114,169,139,139);
        myBackground.add(inventory2Pic);
    }

    public void setImage3(String filename){
        if (filename == null) {
            return;
        }
        inventory3Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory3Pic = new JLabel(inventory3Icon);
        inventory3Pic.setBounds(114,316,139,139);
        myBackground.add(inventory3Pic);

        
    }

    public void setImage4(String filename){
        if (filename == null) {
            return;
        }
        inventory4Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory4Pic = new JLabel(inventory4Icon);
        inventory4Pic.setBounds(510,20,139,139);
        myBackground.add(inventory4Pic);

    }

    public void setImage5(String filename){
        if (filename == null) {
            return;
        }
        inventory5Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory5Pic = new JLabel(inventory5Icon);
        inventory5Pic.setBounds(510,169,139,139);
        myBackground.add(inventory5Pic);
    }

    public void setImage6(String filename){
        if (filename == null) {
            return;
        }
        inventory6Icon = new ImageIcon(this.getClass().getResource(filename));
        inventory6Pic = new JLabel(inventory6Icon);
        inventory6Pic.setBounds(510,316,139,139);
        myBackground.add(inventory6Pic);
    }

    
    public void setinventorycontent(String text){
        inventorycontent.setText(text);
    }

    public void setinvbackbuttonListener(ActionListener actionListener) {
		this.invbackbutton.addActionListener(actionListener);
	}

    public void setswapbuttonListener(ActionListener actionListener) {
		this.swapbutton.addActionListener(actionListener);
	}

    public void setnextpagebuttonListener(ActionListener actionListener) {
		this.nextpagebutton.addActionListener(actionListener);
	}

    public void setbackpagebuttonListener(ActionListener actionListener) {
		this.backpagebutton.addActionListener(actionListener);
	}

    public int getSwapTFInt() {
		return parseIndex(this.swapTF);
	}

    public void setevolutionscreen(){
        
        //change background

        startBackground = new ImageIcon(this.getClass().getResource("resources/inventory.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        
        myBackground.add(myDialogue);
        myBackground.add(choose1button);
        myBackground.add(choose2button);
        myBackground.add(poke1TF);
        myBackground.add(poke2TF);
        myBackground.add(evobutton);
        myBackground.add(poke1TA);
        myBackground.add(poke2TA);
        myBackground.add(evobackbutton);   

        frame.add(myBackground);

        frame.repaint();

    }


    public void setchoose1buttonListener(ActionListener actionListener) {
		this.choose1button.addActionListener(actionListener);
	}

    public void setchoose2buttonListener(ActionListener actionListener) {
		this.choose2button.addActionListener(actionListener);
	}

    public void setevobuttonListener(ActionListener actionListener) {
		this.evobutton.addActionListener(actionListener);
	}

    public void setevobackbuttonListener(ActionListener actionListener) {
		this.evobackbutton.addActionListener(actionListener);
	}

    public int getpoke1TFInt() {
		return parseIndex(this.poke1TF);
	}

    public int getpoke2TFInt() {
		return parseIndex(this.poke2TF);
	}

	private int parseIndex(JTextField field) {
	    try {
	        return Integer.parseInt(field.getText().trim());
	    } catch (NumberFormatException exception) {
	        return -1;
	    }
	}

    public void setpoke1TA(String text) {
        poke1TA.setText(text);
    }

    public void setpokepic1 (String filename){
        if (pokepic1 != null) {
            myBackground.remove(pokepic1);
        }
        pic1 = new ImageIcon(this.getClass().getResource(filename));
        pokepic1 = new JLabel(pic1);
        pokepic1.setBounds(74,121,270,270);
        myBackground.add(pokepic1);
        myBackground.revalidate();
        myBackground.repaint();
    }

    public void setpokepic2 (String filename){
        if (pokepic2 != null) {
            myBackground.remove(pokepic2);
        }
        pic2 = new ImageIcon(this.getClass().getResource(filename));
        pokepic2 = new JLabel(pic2);
        pokepic2.setBounds(673,121,270,270);
        myBackground.add(pokepic2);
        myBackground.revalidate();
        myBackground.repaint();
    }



    public void setpoke2TA(String text) {
        poke2TA.setText(text);
    }

    public void setpicture1(String filename) {
        pic1 = new ImageIcon(this.getClass().getResource(filename));
        pokepic1 = new JLabel(pic1);
        frame.add(pokepic1);

        frame.repaint();
    }

    public void setpicture2(String filename) {
        pic2 = new ImageIcon(this.getClass().getResource(filename));
        pokepic2 = new JLabel(pic2);
        frame.add(pokepic2);

        frame.repaint();
    }

    public void setstats(String text){
        stats.setText(text);
    }

    public void showbattlescreen(String filename){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/battlescreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        stats.setText("Choose Attack, Catch, Swap, or Run.");

        myBackground.add(catchButton);
        myBackground.add(attackButton);
        myBackground.add(swapButton);
        myBackground.add(runButton);
        myBackground.add(stats);
        
        frame.add(myBackground);
        
        enemyIcon = new ImageIcon(this.getClass().getResource(filename));
        enemyPic = new JLabel(enemyIcon);
        enemyPic.setBounds(325,28, 370, 370);
        myBackground.add(enemyPic);

    }

    public void showCatchResultScreen(String message){
        startBackground = new ImageIcon(this.getClass().getResource("resources/battlescreen.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        stats.setText(message);
        myBackground.add(stats);
        myBackground.add(catchResultButton);
        frame.add(myBackground);
        frame.revalidate();
        frame.repaint();
    }
    public void setattackbuttonListener(ActionListener actionListener) {
		this.attackButton.addActionListener(actionListener);
	}

    public void setswapButtonListener(ActionListener actionListener) {
		this.swapButton.addActionListener(actionListener);
	}

    public void setcatchbuttonListener(ActionListener actionListener) {
		this.catchButton.addActionListener(actionListener);
	}

    public void setcatchResultButtonListener(ActionListener actionListener) {
		this.catchResultButton.addActionListener(actionListener);
	}

    public void setevolutionResultButtonListener(ActionListener actionListener) {
		this.evolutionResultButton.addActionListener(actionListener);
	}

    public void setrunbuttonListener(ActionListener actionListener) {
		this.runButton.addActionListener(actionListener);
	}

    public void setswapscreen(){
        
        //change background
        startBackground = new ImageIcon(this.getClass().getResource("resources/inventory.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);
        
        myBackground.add(swapTF);
        myBackground.add(swapDialogue);
        myBackground.add(nextpagebutton);
        myBackground.add(invbackbutton2);
        myBackground.add(swapbutton2);
        myBackground.add(inventorycontent);

        frame.add(myBackground);

        frame.repaint();

    }

    public void setSwapInventoryScreen(){
        startBackground = new ImageIcon(this.getClass().getResource("resources/inventory.png"));
        myBackground = new JLabel(startBackground);
        myBackground.setSize(1020,600);

        myBackground.add(swapTF);
        myBackground.add(swapDialogue);
        myBackground.add(nextpagebutton);
        myBackground.add(backpagebutton);
        myBackground.add(invbackbutton2);
        myBackground.add(swapbutton2);
        myBackground.add(inventorydesc1);
        myBackground.add(inventorydesc2);
        myBackground.add(inventorydesc3);
        myBackground.add(inventorydesc4);
        myBackground.add(inventorydesc5);
        myBackground.add(inventorydesc6);

        frame.add(myBackground);
        frame.revalidate();
        frame.repaint();
    }

    public void setswapbutton2Listener(ActionListener actionListener) {
		this.swapbutton2.addActionListener(actionListener);
	}

    public void setinvbackbutton2Listener(ActionListener actionListener) {
		this.invbackbutton2.addActionListener(actionListener);
	}





}
