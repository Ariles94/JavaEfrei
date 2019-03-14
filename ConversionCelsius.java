package fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.*;

public class ConversionCelsius extends JFrame implements ActionListener{
	
	private JTextField nombre;
	private JLabel resultat;
	private JOptionPane jop;
	
	public ConversionCelsius(){
		
		// Initialisation des objects
		super();
		nombre = new JTextField();
		resultat = new JLabel();
		JLabel celsius = new JLabel("Celsius");
		JButton conversion = new JButton("Conversion");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		jop = new JOptionPane();
		
		// Parametre de base d'une fenetre
		setSize(500,200);
		setVisible(true);
		setTitle("Calcul de mon age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Parametre de la zone de texte
		nombre.setPreferredSize(new Dimension(100,20));
		nombre.setHorizontalAlignment(JTextField.LEFT);
		//resultat.setPreferredSize(new Dimension(100,20));
		
		// Ajout de l'action au bouton
		conversion.addActionListener(this);
		
		// Parametre du premier panel
		panel.add(nombre);
		panel.add(celsius);
		
		// Parametre du deuxieme panel
		panel1.add(conversion);
		panel1.add(resultat);
		
		// Ajout des panels a la fentre
		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double number;
		double res;
		int x = 0;
		
		try
		{
			number = Double.parseDouble(nombre.getText());
			res = (number * 1.8 ) + 32;
		}
		catch(NumberFormatException f)
		{
			System.out.println(" Ce n'est pas un nombre");
			JOptionPane.showMessageDialog(null, "Ce n'est pas un nombre", "Erreur", JOptionPane.ERROR_MESSAGE);
			res = 0;
		}

		resultat.setText(String.valueOf(res) + " Fahrenheit");
		
	}

}
