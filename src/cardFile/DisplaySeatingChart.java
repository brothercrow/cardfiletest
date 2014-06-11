package cardFile;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplaySeatingChart extends JPanel{
	public DisplaySeatingChart(){
		buildPanel();
		}
	protected void buildPanel(){
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(10, 10, 10, 10));
		 JButton[] button = new JButton[40];
	        String[] seats = new String[40];
	        int i,j;
	        for (i = 0, j = 2; i < seats.length; i++, j++) {
	        	if(j == 4){
	        		add(new JLabel());
	        		j = 0;
	        	}
	        	seats[i]= Integer.toString(i+1);
	        	button[i] = new JButton(seats[i]);
	            add(button[i]);	        	
	        	button[i].addActionListener(new bListener());	         
	        	}
}
	class bListener implements ActionListener {
	    public void actionPerformed(ActionEvent e)
	    {
	        //Execute when button is pressed
	    	if(e.getActionCommand().equals("1"))
	    			System.out.printf("You clicked the button seat 1\n");
	    	else
	    		System.out.println("You clicked the button seat " + e.getActionCommand());
	    }
}}
