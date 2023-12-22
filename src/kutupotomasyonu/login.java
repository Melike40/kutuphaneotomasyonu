package kutupotomasyonu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel w_pane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 481);
		w_pane = new JPanel();
		w_pane.setBackground(SystemColor.controlHighlight);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JTabbedPane w_tabbpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabbpane.setBounds(27, 187, 635, 244);
		w_pane.add(w_tabbpane);
		
		JPanel panel = new JPanel();
		panel.setLocation(30, 25);
		panel.setForeground(UIManager.getColor("Button.foreground"));
		panel.setBackground(SystemColor.window);
		w_tabbpane.addTab("Öğrenci Girişi", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblrenciNumaras = new JLabel("Öğrenci Numarası:");
		lblrenciNumaras.setBounds(34, 21, 176, 29);
		lblrenciNumaras.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(lblrenciNumaras);
		
		JLabel lblifre = new JLabel("Öğrenci Şifresi:");
		lblifre.setBounds(34, 58, 176, 29);
		lblifre.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(lblifre);
		
		textField = new JTextField();
		textField.setBounds(176, 24, 326, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 61, 326, 29);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Giriş");
		btnNewButton.setBounds(173, 111, 153, 44);
		btnNewButton.setForeground(SystemColor.textText);
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnKaytOl = new JButton("Kayıt Ol");
		btnKaytOl.setBounds(349, 111, 153, 44);
		btnKaytOl.setForeground(SystemColor.textText);
		btnKaytOl.setFont(new Font("Serif", Font.BOLD, 20));
		btnKaytOl.setBackground(SystemColor.menu);
		panel.add(btnKaytOl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		w_tabbpane.addTab("Personel Girişi", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblKullancAd = new JLabel(" Personel Adı:");
		lblKullancAd.setFont(new Font("Serif", Font.PLAIN, 18));
		lblKullancAd.setBounds(25, 24, 176, 29);
		panel_1.add(lblKullancAd);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 27, 326, 29);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(163, 64, 326, 29);
		panel_1.add(textField_3);
		
		JLabel lblPersonelifresi = new JLabel(" Personel Şifresi:");
		lblPersonelifresi.setFont(new Font("Serif", Font.PLAIN, 18));
		lblPersonelifresi.setBounds(25, 61, 176, 29);
		panel_1.add(lblPersonelifresi);
		
		JButton btnNewButton_1 = new JButton("Giriş");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(SystemColor.textText);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(255, 112, 135, 45);
		panel_1.add(btnNewButton_1);
		
	
		
		
		JLabel lblNewLabel = new JLabel("Kütüphane Otomasyonuna Hoşgeldiniz");
		lblNewLabel.setBounds(122, 149, 446, 34);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		w_pane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("kitap2.png.jpg")));
		lblNewLabel_1.setBounds(211, 11, 268, 140);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		w_pane.add(lblNewLabel_1);
	}
}
