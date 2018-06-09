package basicOperations;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class BasicOperations {

	private JFrame frame;
	private JTextField txt111;
	private JTextField txt222;
	private JTextField txtAns;
	private JLabel lblBasicOperations;
	private JLabel lblValue;
	private JLabel lblValue_1;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicOperations window = new BasicOperations();
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
	public BasicOperations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt111 = new JTextField();
		txt111.setBounds(109, 119, 116, 22);
		frame.getContentPane().add(txt111);
		txt111.setColumns(10);
		
		txt222 = new JTextField();
		txt222.setBounds(411, 119, 116, 22);
		frame.getContentPane().add(txt222);
		txt222.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num1,num2,ans;
		     try {	
				num1=Integer.parseInt(txt111.getText());
				num2=Integer.parseInt(txt222.getText());
				
				ans= num1 + num2 ;
				
				txtAns.setText(Integer.toString(ans));
			}
			catch(Exception a)
			{
				
				JOptionPane.showMessageDialog(null,"only valid numbers are accepted");
			}
			}
		});
		btnAdd.setBounds(128, 196, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("Subtract");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
			     try {	
					num1=Integer.parseInt(txt111.getText());
					num2=Integer.parseInt(txt222.getText());
					
					ans= num1 - num2 ;
					
					txtAns.setText(Integer.toString(ans));
				}
				catch(Exception a)
				{
					
					JOptionPane.showMessageDialog(null,"only valid numbers are accepted");
				}
			}
		});
		btnSub.setBounds(214, 196, 97, 25);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("Multiply");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
			     try {	
					num1=Integer.parseInt(txt111.getText());
					num2=Integer.parseInt(txt222.getText());
					
					ans= num1 * num2 ;
					
					txtAns.setText(Integer.toString(ans));
				}
				catch(Exception a)
				{
					
					JOptionPane.showMessageDialog(null,"only valid numbers are accepted");
				}
			}
		});
		btnMul.setBounds(308, 196, 97, 25);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("Divide");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
			     try {	
					num1=Integer.parseInt(txt111.getText());
					num2=Integer.parseInt(txt222.getText());
					
					ans=(num1 / num2 );
					
					txtAns.setText(Integer.toString(ans));
				}
				catch(Exception a)
				{
					
					JOptionPane.showMessageDialog(null,"only valid numbers are accepted");
				}
			}
		});
		btnDiv.setBounds(398, 196, 97, 25);
		frame.getContentPane().add(btnDiv);
		
		txtAns = new JTextField();
		txtAns.setBounds(257, 278, 116, 22);
		frame.getContentPane().add(txtAns);
		txtAns.setColumns(10);
		
		lblBasicOperations = new JLabel("Basic Operations");
		lblBasicOperations.setFont(new Font("Arial", Font.BOLD, 20));
		lblBasicOperations.setBounds(245, 38, 282, 66);
		frame.getContentPane().add(lblBasicOperations);
		
		lblValue = new JLabel("value 1");
		lblValue.setBounds(131, 141, 56, 16);
		frame.getContentPane().add(lblValue);
		
		lblValue_1 = new JLabel("value 2");
		lblValue_1.setBounds(448, 141, 56, 16);
		frame.getContentPane().add(lblValue_1);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(293, 302, 56, 16);
		frame.getContentPane().add(lblAnswer);
	}

}
