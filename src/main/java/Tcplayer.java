
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Tcplayer {
	
	// the real challenge would be implementing the other features like Video manipulation 
	// file management , and yada yada yada alot of these are going to change if Tcplayer becomes a object

	public static void main(String[] args) {
		
		JFrame mainframe = new JFrame();
		// Default dimensions 
		mainframe.setSize(new Dimension (600 , 400));
		mainframe.setBackground(Color.CYAN);
		
		
		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(Color.gray);
		mainpanel.setLayout( new BorderLayout());
		mainpanel.setMaximumSize(new Dimension ( 300 , 200));
		
		// code about media or just video manipulation and etc..
		JPanel videopanel = new JPanel();
		videopanel.setBackground(Color.gray);
		videopanel.setLayout( new BorderLayout());
		
		// honestly we could either go JButton or JPanel with event listeners
		
		JButton playbutton = new JButton();
		
		playbutton.addActionListener ((ActionEvent e) -> {
			
			// code to manipulate timeline / pause or play videos
			// code to change icon
			// etc..
			
			
			if (playbutton.getText().equals("pause")){
			playbutton.setText("play");
			System.out.println("playing");
			}else {
			playbutton.setText("pause");
			System.out.println("paused");
			}
		});
			
			playbutton.setText("play");
		
		
		JSlider audioslider = new JSlider();
		
		audioslider.addChangeListener( new ChangeListener(){
		    @Override
		    public void stateChanged(ChangeEvent e) {
		    	// Volume Changing Logic
		    	int audiovalue = audioslider.getValue();
		    	System.out.println(audiovalue);
		    }
		});
		
		JButton next = new JButton();
			
		next.addActionListener((ActionEvent e) -> {
			// playnext logic
			System.out.println("Clicked Next");
		});
		
		next.setText("next");
		
		JButton back = new JButton();
		
		back.addActionListener((ActionEvent e)-> {
			// playlast logic 
			System.out.println("Clicked Back");
		});
		
		back.setText("back");
		
		
		JPanel utilitybar = new JPanel();
		utilitybar.setLayout( new BoxLayout(utilitybar , BoxLayout.X_AXIS));
		utilitybar.add(playbutton);
		utilitybar.add(back);
		utilitybar.add(next);
		utilitybar.add(audioslider);
		
		videopanel.add(utilitybar , BorderLayout.SOUTH);
		
		
		// bottom bar settings
		JPanel bottombar = new JPanel();
		bottombar.setBackground(Color.red);
		bottombar.setLayout(new BoxLayout(bottombar , BoxLayout.Y_AXIS) );
		bottombar.setPreferredSize(new Dimension ( 200 , 200));
				
		
		// bottom bar components like information and stuff
		
		mainpanel.add(videopanel , BorderLayout.CENTER);
		mainpanel.add(bottombar , BorderLayout.SOUTH);
		
		// sidebar settings
		JPanel sidebar = new JPanel();
		sidebar.setBackground(Color.green);
		sidebar.setPreferredSize(new Dimension ( 300 , 400));
		
		//sidebar components 
		
		mainframe.setLayout(new BorderLayout());
		mainframe.add(mainpanel , BorderLayout.CENTER);
		mainframe.add(sidebar , BorderLayout.EAST);
	
		
		
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
