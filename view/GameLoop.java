package Javamon.view;
import Javamon.model.Moves;
import Javamon.model.JavamonBuild.MainJavamon;
import Javamon.model.OpponentBuild.OpponentFactory;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/*
    Run Commands:

 * javac -d . GameLoop.java
 * java Javamon.view.GameLoop
 */


public class GameLoop {
    JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, inputTextPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, playerLabelName, playerLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    JTextField inputTextField;
    TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
    
    String position = "menu";
    static int level = 1;
    int score;
    String name;
    static int boss_defeated = 0;
    
    static Moves newOpponent;
    static MainJavamon newJavamon;

    public GameLoop()
    {
        window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		// window.setIconImage(logo.getImage());
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
        inputTextPanel = new JPanel();
        inputTextPanel.setBounds(300,300,200,50);
		inputTextPanel.setBackground(Color.black);
        inputTextPanel.setForeground(Color.white);
        JLabel inputText = new JLabel("Enter your name");
        // inputText.getColorModel();
        // inputText.setFont(normalFont);

        inputTextField = new JTextField("");  
        inputTextField.setColumns(15);
        // inputText.addActionListener(tsHandler);
        // inputText.setBounds(300,300,100,50);

		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
        inputTextPanel.add(inputText);
        inputTextPanel.add(inputTextField);

		con.add(titleNamePanel);
		con.add(startButtonPanel);
        con.add(inputTextPanel); 
		window.setVisible(true);
    }

    public void createGameScreen()
    {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        inputTextPanel.setVisible(false);


        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);		
        mainTextArea = new JTextArea("Welcome to javamon");
        // mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true); 
        mainTextArea.setEditable(false); 	
        
        mainTextPanel.add(mainTextArea);
        
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);		
        choice1 = new JButton("Start game");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler); 
        choice1.setActionCommand("c1"); 
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("Tutorial");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("Quit");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);
        
    //		choice4.setContentAreaFilled(false);  // Disable highlighting on press!!!
            

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 100);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        playerLabel = new JLabel("Name: ");
        playerLabel.setFont(normalFont);
        playerLabel.setForeground(Color.white);
        playerPanel.add(playerLabel);

        playerLabelName = new JLabel();
        playerLabelName.setFont(normalFont);
        playerLabelName.setForeground(Color.white);
        playerPanel.add(playerLabelName);

        initialize();
    }

    void initialize() {
        level = 1;
        score = 0;
        selectJavamon();
    }

    public void selectJavamon()
    {
        position = "Menu";
        mainTextArea.setText("Hi! Welcome to the game. I'm rohith. \nYour First Javamon is " + newJavamon.getJavamon().getName());;
        choice1.setText("Continue");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
        // choice2.setText("Chamander");
        // choice3.setText("Gogle");
        // choice4.setText(".");
    }

    public void playerMove()
    {
            position = "player turn";
            // System.out.println(newOpponent.get_hp());
        
            mainTextArea.setText("Your javamon is "+newJavamon.get_name()+"\nYour opponent is " + newOpponent.get_name() +"\n Opponent Health:" + newOpponent.get_hp() +"\n Choose a move");
            choice1.setText("Attack");
            choice2.setText("Defend");
            choice3.setText("Use Item");
            choice4.setText("Run away");
            // newOpponent.receive_attack(10, 0);
            System.out.println(newOpponent.get_hp());    
    }

    public void playerAttack()
    {
        position = "player turn";

        mainTextArea.setText("Your javamon is "+newJavamon.get_name()+"\nYour opponent is " + newOpponent.get_name() +"\n Opponent Health:" + newOpponent.get_hp() +"\n Choose a move");
        choice1.setText("Attack");
        choice2.setText("Defend");
        choice3.setText("Use Item");
        choice4.setText("Run away");
    }

    public void playerDefend()
    {
        position = "player defend";
        newJavamon.defend();
        mainTextArea.setText("Your javamon is "+newJavamon.get_name()+"\nYour opponent is " + newOpponent.get_name() +"\n Opponent Health:" + newOpponent.get_hp() +"\n You defended \nChoose a move");
        choice1.setText("Attack");
        choice2.setText("Defend");
        choice3.setText("Use Item");
        choice4.setText("Run away");
    }

    
    public void opponentTurn()
    {
        position = "opponent turn";
        int atk = newOpponent.launch_attack();
        
        newJavamon.receive_attack(atk, newOpponent.get_attribute());
        int playerHealth = newJavamon.getJavamon().getHP();
        // playerHealth -= atk;
        // newJavamon.getJavamon().setHP(playerHealth);
        hpLabelNumber.setText("" + newJavamon.getJavamon().getHP());
        if(playerHealth > 0){
            mainTextArea.setText("Your javamon is "+newJavamon.get_name()+"\nYour opponent is " + newOpponent.get_name() +"\n Opponent Health:" + newOpponent.get_hp() +"\nYour opponent attacked you!"+"\n Choose a move");
            choice1.setText("Continue");
            choice2.setVisible(false);
            choice3.setVisible(false);
            choice4.setVisible(false);
        }
        else {
            mainTextArea.setText("You have been defeated. Game Over!");
            choice2.setText("Continue");
            choice1.setVisible(false);
            choice3.setVisible(false);
            choice4.setVisible(false);
        }
    }
    
    public void nextLevel()
    {
        position = "next level";

        if(level < 5)
        {
            level+=1;
            OpponentFactory opponentFactory = new OpponentFactory();
            newOpponent = opponentFactory.getOpponent(level);
            newJavamon = new MainJavamon(level);
            hpLabelNumber.setText("" + newJavamon.getJavamon().getHP());
            mainTextArea.setText("Your opponent has been defeated. Nice job!\n Your Javamon has evolved into " +newJavamon.get_name()+"\n Your next opponent is " + newOpponent.get_name());
            choice1.setText("Continue");
            choice2.setVisible(false);
            choice3.setVisible(false);
            choice4.setVisible(false);
        } else {
            mainTextArea.setText("You have defeated all the opponents and graduated. You win!");
            choice2.setText("Continue");
            choice1.setVisible(false);
            choice3.setVisible(false);
            choice4.setVisible(false);
        }
    }

    public void getReward(){
        position = "reward";

        mainTextArea.setText("You have been rewarded with a choice between the following items: ");
        choice1.setText("Get weapon(Bonus damage)");
        choice2.setText("Get a mystery item");
        choice3.setText("Get a new javamon");
        choice4.setText("Get a new life");
    }
    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
            name = inputTextField.getText();
            System.out.println(name);
            playerLabelName.setText(name);
            hpLabelNumber.setText(newJavamon.getJavamon().getHP() + "");
        }
    }

    public class ChoiceHandler implements ActionListener
    {
		public void actionPerformed(ActionEvent event)
        {
            String yourChoice = event.getActionCommand();
            switch(position)
            {
                case "Menu":
                    // selectJavamon();
                    switch(yourChoice)
                    {
                        case "c1":
                            choice2.setVisible(true);
                            choice3.setVisible(true);
                            choice4.setVisible(true);
                            playerMove();break;
                    }
                    break;
                case "player turn":
                    switch(yourChoice)
                    {
                        case "c1":
                            newOpponent.receive_attack(newJavamon.get_atk_pow(), newJavamon.get_attribute());
                            if(newOpponent.get_hp() <= 0)
                            {
                                nextLevel();
                            }
                            else
                            {
                                choice2.setVisible(true);
                                choice3.setVisible(true);
                                choice4.setVisible(true);
                                playerAttack();
                                opponentTurn();break;
                            }
                            break;
                        case "c2":
                            playerDefend();
                            opponentTurn();
                            break;
                        case "c3":
                            break;
                        case "c4":
                            break;
                    }
                    break;
                case "opponent turn":
                    switch(yourChoice)
                    {
                        case "c1":
                            choice2.setVisible(true);
                            choice3.setVisible(true);
                            choice4.setVisible(true);
                            playerAttack();break;
                        case "c2":
                            choice1.setVisible(true);
                            choice3.setVisible(true);
                            choice4.setVisible(true);
                            window.dispose();
                            break;
                    }
                    break;
                case "next level":
                    switch(yourChoice)
                    {
                        case "c1":
                            choice2.setVisible(true);
                            choice3.setVisible(true);
                            choice4.setVisible(true);
                            playerMove();
                            break;
                        case "c2":
                            window.dispose();
                            break;
                    }
                    break;
            }
		}
	}

    public static void main(String[] args) 
    {
        OpponentFactory opponentFactory = new OpponentFactory();
        newOpponent = opponentFactory.getOpponent(level);
        // MainJavamon generate_javamon = new MainJavamon(level);
        // newJavamon = generate_javamon.getJavamon();
        // newJavamon = javamon.MainJavamon(level);
        newJavamon = new MainJavamon(level);
		new GameLoop();
	}
}
