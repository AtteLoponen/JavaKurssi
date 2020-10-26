package jees;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LämpötilaMuunnin extends JFrame {

	JButton nappi;
	JLabel celsius, tulos;
	JTextField luvut;

	public LämpötilaMuunnin() {
		setLayout(new GridLayout(2, 2));

		celsius = new JLabel("Celsius");
		add(celsius);

		luvut = new JTextField();
		add(luvut);

		nappi = new JButton("Convert");
		add(nappi);

		tulos = new JLabel("Farenheit: ");
		add(tulos);

		nappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String numerot = luvut.getText();
					float desimaali = Float.parseFloat(numerot);
					double nytLoppu = desimaali * 1.8 + 32;
					tulos.setText("Fahrenheit: " + nytLoppu);
				} catch (Exception i) {
					tulos.setText("Invalid input, try again.");
				}
			}
		});
	}

	public static void main(String args[]) {
		LämpötilaMuunnin ikkuna = new LämpötilaMuunnin();
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setVisible(true);
		ikkuna.pack();
		ikkuna.setTitle("Celsius Converter");
		ikkuna.setSize(400, 100);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	}
}
