package cardFile;

import java.awt.CardLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu extends JFrame {
	private JPanel cardPanel;
	private CardLayout cl;
	//private int currentCard = 1;

	
	public MainMenu(){
		initUI();
	}
	protected void initUI(){
		setTitle("Reservation System");
		setSize(800, 600);
		cardPanel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        cl = new CardLayout();
        cardPanel.setLayout(cl);
        JPanel jp1 = new Menu(cl, cardPanel);
        JPanel jp2 = new AddName(cl, cardPanel);
        JPanel jp3 = new DisplaySeatingChart();
        cardPanel.add(jp1, "1");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        
        getContentPane().add(cardPanel);
        cl.show(cardPanel, "1");
        
	}

}
