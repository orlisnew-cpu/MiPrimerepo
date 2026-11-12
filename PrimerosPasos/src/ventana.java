import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ventana {

	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 674, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 841, 5);
		frame.getContentPane().add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("Nombre\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(121, 166, 120, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(121, 209, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(121, 258, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(218, 165, 317, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("                      Registro de usuarios");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(10, 26, 586, 51);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(218, 208, 317, 19);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(217, 257, 317, 19);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Registrar ");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(163, 334, 88, 22);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar ");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(366, 334, 88, 22);
		frame.getContentPane().add(btnNewButton_1);
	}
}
