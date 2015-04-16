import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Delivery extends JFrame
{
	public static void main(String[] args)
	{
		Delivery delivery = new Delivery();
		delivery.setLocationRelativeTo(null);
	}

	private JButton buttonOK;

	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;

	private JCheckBox burger;
	private JCheckBox ak47;
	private JCheckBox m16;
	private JCheckBox hipsterShirt;

	public Delivery()
	{
		this.setSize(420,420);
		this.setTitle("Please buy something here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		JPanel sizePanel = new JPanel();

		Border b1 = BorderFactory.createTitledBorder("Size");

		sizePanel.setBorder(b1);

		ButtonGroup sizeGroup = new ButtonGroup();

		small = new JRadioButton("Small");
		small.setSelected(true);
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");

		sizePanel.add(small);
		sizeGroup.add(small);
		sizePanel.add(medium);
		sizeGroup.add(medium);
		sizePanel.add(large);
		sizeGroup.add(large);

		mainPanel.add(sizePanel);

		JPanel upperPanel = new JPanel();

		Border b2 = BorderFactory.createTitledBorder("Product");

		upperPanel.setBorder(b2);

		burger = new JCheckBox("Some Burger");
		ak47 = new JCheckBox("AK-47, for those who like efficiency");
		m16 = new JCheckBox("M16, for the gentlemen with fine taste");
		hipsterShirt = new JCheckBox("Nothing says 'I am a NY well-informed lefty' like a 'Che Guevara in Starbucks' shirt");

		upperPanel.add(burger);
		upperPanel.add(ak47);
		upperPanel.add(m16);
		upperPanel.add(hipsterShirt);

		mainPanel.add(upperPanel);

		buttonOK = new JButton("BRING ME MY ORDER");
		buttonOK.addActionListener(e -> buttonOKClick() );

		mainPanel.add(buttonOK);

		this.add(mainPanel);
		this.setVisible(true);

	}

	public void buttonOKClick()
	{
		String products = "";
		String happyThankYou = "\nHappy-Thank-You-Message: \n";

		if (burger.isSelected()) 
		{ 
			products += "Burger \n";
			happyThankYou += "Burger? Lol, I hope you get a hard time in the bathroom tonight, fatass. \n";
		}

		if (ak47.isSelected()) 
		{ 
			products += "AK-47 \n"; 
			happyThankYou += "AK-47? Give up, the 40 virgins are warcraft players. \n";
		}

		if (m16.isSelected()) 
		{ 
			products += "M16 \n";
			happyThankYou +=  "Rambo...? Hahaha, at least you've got the middle age crisis in common. \n";
		}

		if (hipsterShirt.isSelected()) 
		{ 
			products += "Hipster_-_Shirt \n";
			happyThankYou += "This shirt was made in China for $0.10 and you buy it for $100? Thanks for showing your critical spirit, sucker! \n"; 
		}

		if (products.equals(""))
		{
			happyThankYou += "Nothing? I hope you burn in hell, miserable basterd! \n";
		}

		products += "Here's watchu bought: \n" + products + happyThankYou;

		JOptionPane.showMessageDialog(buttonOK, products, "---ORDER SUMMARY---", JOptionPane.INFORMATION_MESSAGE);

		burger.setSelected(false);
		ak47.setSelected(false);
		m16.setSelected(false);
		hipsterShirt.setSelected(false);

		small.setSelected(true);
	}
}