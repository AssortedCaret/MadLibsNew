import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class MadLibsNew extends JFrame {
	private JTextField textColour;
	private JTextField textVerd;
	private JTextField textAjective;
	
		public MadLibsNew() {
		setTitle("Mad Libs");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblStory = new JLabel("Mad Lib App");
		lblStory.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStory.setBounds(228, 11, 125, 25);
		getContentPane().add(lblStory);
		
		JLabel lblColour = new JLabel("Enter an colour:");
		lblColour.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblColour.setBounds(27, 79, 125, 17);
		getContentPane().add(lblColour);
		
		textColour = new JTextField();
		textColour.setBounds(172, 76, 86, 20);
		getContentPane().add(textColour);
		textColour.setColumns(10);
		
		JLabel lblVerb = new JLabel("Enter a verd ending in -ed:");
		lblVerb.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVerb.setBounds(278, 82, 187, 14);
		getContentPane().add(lblVerb);
		
		textVerd = new JTextField();
		textVerd.setBounds(485, 76, 86, 20);
		getContentPane().add(textVerd);
		textVerd.setColumns(10);
		
		JLabel lblAdjective = new JLabel("Enter an Ajective:");
		lblAdjective.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdjective.setBounds(172, 138, 130, 14);
		getContentPane().add(lblAdjective);
		
		textAjective = new JTextField();
		textAjective.setBounds(314, 132, 86, 20);
		getContentPane().add(textAjective);
		textAjective.setColumns(10);
		
		JLabel lblResalt = new JLabel("");
		lblResalt.setBackground(Color.PINK);
		lblResalt.setHorizontalAlignment(SwingConstants.CENTER);
		lblResalt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResalt.setBounds(62, 237, 465, 42);
		getContentPane().add(lblResalt);
		
		JButton btnViewCreation = new JButton("View Creation!");
		btnViewCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner (System.in);
				String colour= textColour.getText();
				String happend = textVerd.getText();
				String prilag = textAjective.getText();
				lblResalt.setText(colour + " дракон " + happend + " на "+ prilag + " рыцаря.");
				}
		});
		btnViewCreation.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewCreation.setBounds(181, 183, 219, 23);
		getContentPane().add(btnViewCreation);
		}

	public static void main(String[] args) {
		MadLibsNew theGame= new MadLibsNew();
		theGame.setSize (new Dimension(650, 350));
		theGame.setVisible(true);
		} 

	}

