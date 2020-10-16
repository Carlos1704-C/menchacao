package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class javaswing extends JFrame{

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
					javaswing frame = new javaswing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		//DefaultListModel listModel;
		private JTextField textField_3;
		private JTextField textField_2;
	/**
	 * Create the frame.
	 */
	public javaswing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//listModel =new DefaultListModel();
				String texto1 = textField.getText();
				String texto2 =  textField_1.getText();
				
				int x,y;
				
					x = Integer.parseInt(texto1);
					y = Integer.parseInt(texto2);
					textField_3.setText(texto1+" \n"+texto2+" \n");
		        int m = Integer.parseInt(textField_2.getText());
		        int a=1;
		       do
		       {
		    	   int z= x+y;
		            String anterior = textField_3.getText();
		            textField_3.setText(anterior+" \n"+z);
		            x=y;
		            y=z;
		            a++;
		       }while(a>m);
			}
		});
		btnNewButton.setBounds(32, 244, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_3.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(162, 244, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(306, 244, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Numero1");
		lblNewLabel.setBounds(43, 24, 109, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 52, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero2");
		lblNewLabel_1.setBounds(43, 55, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 115, 260, 118);
		textField_3.setEditable(false);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(346, 24, 38, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Iteraciones");
		lblNewLabel_2.setBounds(321, 69, 71, 14);
		contentPane.add(lblNewLabel_2);
	}
}