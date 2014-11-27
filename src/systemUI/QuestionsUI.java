package systemUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuestionsUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionsUI frame = new QuestionsUI();
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
	public QuestionsUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your question for the students:");
		lblPleaseEnterYour.setBounds(12, 12, 337, 27);
		contentPane.add(lblPleaseEnterYour);
		
		textField = new JTextField();
		textField.setBounds(12, 46, 327, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterAParameter = new JLabel("Enter a parameter name (ie, GPA, experience):");
		lblEnterAParameter.setBounds(12, 79, 365, 41);
		contentPane.add(lblEnterAParameter);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 116, 120, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnAdd.setBounds(261, 162, 71, 25);
		contentPane.add(btnAdd);
		
		JButton btnDone = new JButton("Done");
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Just use the X");
			}
		});
		btnDone.setBounds(178, 162, 71, 25);
		contentPane.add(btnDone);
		
	}
}
