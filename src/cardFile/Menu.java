package cardFile;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel {
	private CardLayout cl;
	private JPanel  cardPanel;
	public Menu(CardLayout cl, JPanel cardPanel){
		this.cl = cl;
		this.cardPanel = cardPanel;
		buildPanel();
	}
	
	protected void buildPanel(){
		JButton addPassenger = new JButton("Add Passenger");
		JButton remPassenger = new JButton("Remove Passenger");
		JButton quit = new JButton("Quit");		
		add(addPassenger);
		add(remPassenger);
		add(quit);
		addPassenger.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e){
				cl.show(cardPanel,"2");
			}
		});
		remPassenger.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e){
				cl.show(cardPanel,"2");
			}
		});
		quit.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});	
	}

}
