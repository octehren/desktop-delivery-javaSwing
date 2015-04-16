import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Delivery extends JFrame
{
	public static void main(String[] args)
	{
		new Delivery();
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
	}
}