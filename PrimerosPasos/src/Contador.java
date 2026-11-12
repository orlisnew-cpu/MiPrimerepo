import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contador {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador window = new Contador();
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
	public Contador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(130, 0, 221, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(100, 70, 103, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setText("0");
		textField.setBounds(239, 80, 120, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(292, 190, 113, 47);
		frame.getContentPane().add(btnReset);
		
		JButton btnResta = new JButton("Resta 1 ");
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResta.setBounds(147, 190, 125, 47);
		frame.getContentPane().add(btnResta);
		
		JButton btnSuma = new JButton("Suma 1");
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSuma.setBounds(10, 190, 113, 47);
		frame.getContentPane().add(btnSuma);
	}
}
