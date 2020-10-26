import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;

	/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					JuomaAutomaatti ja = new JuomaAutomaatti();

					
					GUI_Automaatti frame = new GUI_Automaatti(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktorissa rakennetaan k‰yttˆliittym‰. Huomaa, ett‰ otetaan parametrina
	 * vastaan alussa luotu juoma-automaatti. T‰m‰ siksi, ett‰ voidaan n‰ytt‰‰ sen
	 * tiedot GUI:ssa
	 */
	public GUI_Automaatti(JuomaAutomaatti ja) {

		// Ikkunan otsikko ja koko

		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 705);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu yllapito = new JMenu("Yll\u00E4pito");
		yllapito.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(yllapito);
		
		JMenuItem item1 = new JMenuItem("Aseta kahvin m\u00E4\u00E4r\u00E4");
		item1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(item1);
		
		JMenuItem item2 = new JMenuItem("Aseta teen m\u00E4\u00E4r\u00E4");
		item2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(item2);
		
		JMenuItem item3 = new JMenuItem("Aseta kaakaon m\u00E4\u00E4r\u00E4");
		item3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(item3);
		
		JMenuItem menuItem4 = new JMenuItem("Tallenna automaatin tila");
		menuItem4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(menuItem4);
		
		JMenuItem item5 = new JMenuItem("Lataa automaatti");
		item5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(item5);
		
		JMenuItem item6 = new JMenuItem("Lopeta");
		item6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yllapito.add(item6);
		
		JMenu tietoja = new JMenu("Tietoja ohjelmasta");
		tietoja.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(tietoja);
		
		JMenuItem tiedot1 = new JMenuItem("Versiotiedot");
		tiedot1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		tietoja.add(tiedot1);
		
		JMenuItem tiedot2 = new JMenuItem("Ohje");
		tiedot2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		tietoja.add(tiedot2);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton kahvi = new JButton("Kahvi");
		kahvi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kahvi.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/img/coffee.jpg")));
		kahvi.setBounds(22, 47, 132, 132);
		contentPane.add(kahvi);

		JButton tee = new JButton("Tee");
		tee.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		tee.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/img/tea.jpg")));
		tee.setBounds(22, 233, 132, 132);
		contentPane.add(tee);

		JButton kaakao = new JButton("Kaakao");
		kaakao.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kaakao.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/img/cocoa.jpg")));
		kaakao.setBounds(22, 437, 132, 132);
		contentPane.add(kaakao);

		JLabel kahviJLable = new JLabel("Kahvi");
		kahviJLable.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kahviJLable.setBounds(59, 190, 49, 22);
		contentPane.add(kahviJLable);

		JLabel teeJLable = new JLabel("Tee");
		teeJLable.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		teeJLable.setBounds(59, 380, 49, 22);
		contentPane.add(teeJLable);

		JLabel kaakaoJLable = new JLabel("Kaakao");
		kaakaoJLable.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kaakaoJLable.setBounds(59, 580, 63, 22);
		contentPane.add(kaakaoJLable);

		JLabel kahvit = new JLabel("Kahvi: 50");
		kahvit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kahvit.setBounds(235, 108, 157, 22);
		contentPane.add(kahvit);

		JLabel teet = new JLabel("Tee: 50");
		teet.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		teet.setBounds(235, 299, 132, 22);
		contentPane.add(teet);

		JLabel kaakaot = new JLabel("Kaakao: 50");
		kaakaot.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		kaakaot.setBounds(235, 497, 157, 22);
		contentPane.add(kaakaot);
		

		kahvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ja.valmistaKahvi();
				int maara = ja.getKahvi();
				kahvit.setText("Kahvi: " + maara);
				if (maara<=20) {
					kahvit.setForeground(Color.RED); 
				}
			}
		});

		tee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ja.valmistaTee();
				int maara = ja.getTee();
				teet.setText("Tee: " + maara);
				if (maara<=20) {
					teet.setForeground(Color.RED); 
				}
			}
		});

		kaakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ja.valmistaKaakao();
				int maara = ja.getKaakao();
				kaakaot.setText("Kaakao: " + maara);
				if (maara<=20) {
					kaakaot.setForeground(Color.RED); 
				}
			}
		});
		
		
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newValue = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiKahvi = Integer.parseInt(newValue);
				ja.setKahvi(uusiKahvi);
			}
		});
		
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newValue = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiTee = Integer.parseInt(newValue);
				ja.setTee(uusiTee);
			}
		});
		
		item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newValue = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiKaakao = Integer.parseInt(newValue);
				ja.setKaakao(uusiKaakao);
			}
		});
		
		menuItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sarjallistamista.kirjoitaTiedostoon(ja);
				}catch(Exception j) {
					System.out.println("Tallentaminen ei onnistu");
				}
			}
		});
		
		item5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JuomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					int kahvi=uusi.getKahvi();
					ja.setKahvi(kahvi);
					
					int tee=uusi.getTee();
					ja.setTee(tee);
					
					int kaakao=uusi.getKaakao();
					ja.setKaakao(kaakao);
					
				}catch(Exception h) {
					System.out.println("Kokeile uudestaan.");
				}
			}
		});
		
		item6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		tiedot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Versiotiedot ikkuna = new Versiotiedot();
				ikkuna.setVisible(true);
			}
		});
		
		tiedot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
