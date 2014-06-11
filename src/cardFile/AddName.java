package cardFile;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddName extends JPanel{
	JTextField first,last;
	private CardLayout cl;
	private JPanel  cardPanel;
	
	public AddName(CardLayout cl, JPanel cardPanel){
		this.cl = cl;
		this.cardPanel = cardPanel;
		BuildPanel();
		}
	protected void BuildPanel(){
		first = new JTextField(10);
		last = new JTextField(10);
		add(new JLabel("First Name"));
		add(first);
		add(new JLabel("Last Name"));
		add(last);
		JButton jbtok = new JButton("OK");		
		add(jbtok);
		jbtok.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e){
				System.out.println("name is "+ first.getText()+" "+ last.getText());
				first.setText("");
				last.setText("");
				cl.show(cardPanel, "1");
			}
		});
	}

}
