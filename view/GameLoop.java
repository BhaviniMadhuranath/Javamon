package Javamon.view;
// import Javamon.model.Moves;
// import Javamon.model.OpponentBuild.OpponentFactory;

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
    String position = "menu";
    JTextArea mainTextArea;
    JTextField inputTextField;
    TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();

    static int level;
    int score;
    String name;
    static int boss_defeated = 0;
    




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

        // weaponLabel = new JLabel("Weapon:");
        // weaponLabel.setFont(normalFont);
        // weaponLabel.setForeground(Color.white);
        // weaponLabel.setBackground(Color.red);
        // playerPanel.add(weaponLabel);

        // weaponLabelName = new JLabel();
        // weaponLabelName.setFont(normalFont);
        // weaponLabelName.setForeground(Color.white);
        // playerPanel.add(weaponLabelName);


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
        // Player p = new Player();
        // p.initialize();
    }

    void setVillian(int level)
    {
        // Villian v = new Villian();
        // v.initialize();
        System.out.print("Villain has been created");;
    }

    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
            name = inputTextField.getText();
            System.out.println(name);
            playerLabelName.setText(name);
            hpLabelNumber.setText("100");

            // OpponentFactory opponentFactory = new OpponentFactory();
            // Moves newOpponent = opponentFactory.getOpponent(1);
            // System.out.println(newOpponent.get_name());
        }
    }


    void setOptions(String c1, String c2, String c3, String c4)
    {
        choice1.setText(c1);
		choice2.setText(c2);
		choice3.setText(c3);
		choice4.setText(c4);
    }

    public void selectJavamon(String javamon_name)
    {
        // initialize selected javamon to player
        position = "Game";
    }

    public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();
            position = "Menu";
			switch(position){
                case "Menu" : 
                    mainTextArea.setText("Hi! Welcome to the game. I'm rohith. Please select a javamon.");
                    setOptions("Squirtle", "Chamander", "Gogul", ".");
                    selectJavamon(yourChoice);	
                    break;
                case "Quit" : 
                    window.dispose();
                    break;
                case "Game": 
                    while(boss_defeated != 0){

                    }
                    break; 
            }
			
		}
	}

    public static void main(String[] args) 
    {
		new GameLoop();
	}
}
