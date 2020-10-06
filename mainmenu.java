import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class mainmenu {
	
		
//-------------------------------Main Menu Creation-----------------------------\\
    
	public static int width = 900, height = 600; {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Makes and defines the frame
		JFrame frame = new JFrame("GUI");	//Makes a frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When you press the red X it closes the program
	    frame.setSize(width,height);	       
	    frame.setResizable(true);
	    frame.setLocationRelativeTo(null); //Makes the window appear in the center of your screen when you start the program
	    
	    
	    //Creates buttons
	    JButton NewGame = new JButton("New Game");
	    JButton LoadGame = new JButton("Load Game");
	    JButton Settings = new JButton("Settings");
	    JButton Exit = new JButton("Exit Game");
	    
	    
	    //Defines the buttons
	    NewGame.setBounds(100,150,100,40); //Location and dimensions of the buttons
	    LoadGame.setBounds(100,200,100,40); //x axis, y axis, width, height
	    Settings.setBounds(100,250,100,40);
	    Exit.setBounds(100,300,100,40);
	    
	    //Adds the buttons to the frame
	    frame.add(NewGame);
	    frame.add(LoadGame);
	    frame.add(Settings);
	    frame.add(Exit);
	    
//---------------------------Functions of the buttons-----------------------------\\
	    
	    
	    //Defines the "Exit" button's function
	    Exit.addActionListener(new ActionListener() {     
	    	public void actionPerformed(ActionEvent e) {	
	    		JFrame areyousure = new JFrame(); //Creates a frame when the button "Exit Game" is pressed
	    		areyousure.setSize(250,150);
	    		areyousure.setResizable(false);
	    		areyousure.setLocationRelativeTo(null); //Centers frame
	    		JLabel LabelSure = new JLabel("Are you Sure you want to Exit?");
	    			    		
	    		LabelSure.setBounds(35,5,300,40);
	    		areyousure.add(LabelSure);
	    		
	    		//Creates buttons for answers "Yes" and "No"
	    		JButton YesSure = new JButton("Yes");
	    		JButton NoSure = new JButton("No");
	    		
	    		//Sets the location and dimentions of the two buttons
	    		YesSure.setBounds(40,45,65,40); //x-axis, y-axis, width, height
	    		NoSure.setBounds(130,45,65,40);
	    		
	    		//Makes the two buttons visible
	    		areyousure.add(YesSure);
	    		areyousure.add(NoSure);
	    		
	    		//Sets the windows to be visible and have no layout so we can set the bounds of the buttons
	    		areyousure.setLayout(null);
	    		areyousure.setVisible(true);
	    		
	    		YesSure.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				System.exit(0); 	//Terminates the program
	    			}
	    		});
	    		
	    		NoSure.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				areyousure.dispose(); //disposed of or shuts down the areyousure window
	    			}
	    		});
	    	}
	    });
	     
	   
	    
	    //Defines the "NewGame" button's function
	    NewGame.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		CharacterCreation();
	    		frame.dispose(); //disposed of or shuts down the frame window
	    		
	    	}
	    });
	    
	    
	    
	    //Defines the "LoadGame" button's function
	    LoadGame.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	}
	    });
	    
	    
	    
	    //Defines the "Settings" button's function
	    Settings.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JFrame fsettings = new JFrame("Settings"); //Makes another frame to pop up when button "Settings" is pressed
	    		fsettings.setSize(400,200);
	    		fsettings.setVisible(true);
	    		fsettings.setLocationRelativeTo(null);
	    		fsettings.setResizable(false);
	    		fsettings.setLayout(null);
	    		
	    		

	    		//Creates two text fields for width and height input
	    		JTextField settingwidth = new JTextField(3);
	    		fsettings.add(settingwidth);
	    		settingwidth.setBounds(100,60,50,20);
	    		JTextField settingheight = new JTextField(3);
	    		fsettings.add(settingheight);
	    		settingheight.setBounds(230,60,50,20);
	    		
	    		
	    		//Creates two labels
	    		JLabel SetW = new JLabel("Enter Desired Width");
	    		fsettings.add(SetW);
	    		SetW.setBounds(70,40,200,20);
	    		JLabel SetH = new JLabel("Enter Desired Height");
	    		fsettings.add(SetH);
	    		SetH.setBounds(200,40,200,20);
	    
	    				
	    		
	    		//Sets max characters you can type in the text field "settingwidth"
	    		settingwidth.addKeyListener(new KeyAdapter() {
	    		    public void keyTyped(KeyEvent e) { 
	    		        if (settingwidth.getText().length() >= 4 ) // limit textfield to 3 characters
	    		            e.consume(); 
	    		    }  
	    		});
	    		
	    		//Sets max character you can type in the text field "settingheight"
	    		settingheight.addKeyListener(new KeyAdapter() {
	    		    public void keyTyped(KeyEvent e) { 
	    		        if (settingheight.getText().length() >= 4 ) //limits textfield to 4 characters
	    		            e.consume(); 
	    		    }  
	    		});
	    		
	    	}
	    });
	    
	    JPanel GameLoad = new JPanel();
	    GameLoad.setBounds(210, 204, 110, 160);	   
	    GameLoad.setBorder(BorderFactory.createLineBorder(Color.black));
	    GameLoad.setBackground(new java.awt.Color(191,191,191));
	    GameLoad.setVisible(true);
	    
	    frame.add(GameLoad);
	    frame.setLayout(null);	//Gives the frame no layout
	    frame.setVisible(true); //Makes the frame visible
	    
	    
	    
	    
	}
//---------------------Character Creation Window---------------------\\
	
	public static void CharacterCreation() {
		JFrame cc = new JFrame("Character Creation");
		cc.setSize(width,height);
		cc.setVisible(true);
		cc.setLocationRelativeTo(null);
		cc.setResizable(false);
	}
		
}




