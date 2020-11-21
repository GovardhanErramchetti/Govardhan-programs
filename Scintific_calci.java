import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Scintific_calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JTextField label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scintific_calci window = new Scintific_calci();
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
	public Scintific_calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calculator ");
		frame.setBounds(100, 100, 467, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(0, 0, 432, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textField.setBounds(0, 67, 432, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				result=Math.sqrt(first);
				textField.setText(""+result);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(0, 117, 86, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(0, 177, 86, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="^";
				label.setText(""+first+operation);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(0, 239, 86, 61);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				first*=first*first;
				textField.setText(""+first);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(0, 302, 86, 61);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				first*=first;
				textField.setText(""+first);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_4.setBounds(0, 366, 86, 61);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Double.parseDouble(textField.getText());
				if (a<=1)
					textField.setText(""+1);
				else
				{
					result=1;
					for (int i=2;i<=a;i++)
					{
						result*=i;
					}
					textField.setText(""+result);
				}
			}
		});
		btnN.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnN.setBounds(0, 429, 86, 61);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Double.parseDouble(textField.getText());
				a*=-1;
				int c=(int)a;
				if(a==c)
					textField.setText(""+c);
				else
				textField.setText(""+a);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_6.setBounds(0, 493, 86, 61);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnEx.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnEx.setBounds(88, 117, 86, 61);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(88, 177, 86, 61);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton BTN7 = new JButton("7");
		BTN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN7.getText();
				textField.setText(number);
			}
		});
		BTN7.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN7.setBounds(88, 302, 86, 61);
		frame.getContentPane().add(BTN7);
		
		JButton BTN4 = new JButton("4");
		BTN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN4.getText();
				textField.setText(number);
				
			}
		});
		BTN4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN4.setBounds(88, 366, 86, 61);
		frame.getContentPane().add(BTN4);
		
		JButton BTN1 = new JButton("1");
		BTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN1.getText();
				textField.setText(number);
			}
		});
		BTN1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN1.setBounds(88, 429, 86, 61);
		frame.getContentPane().add(BTN1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
				
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSin.setBounds(178, 117, 86, 61);
		frame.getContentPane().add(btnSin);
		
		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(178, 177, 86, 61);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton BTN8 = new JButton("8");
		BTN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN8.getText();
				textField.setText(number);
			}
		});
		BTN8.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN8.setBounds(178, 302, 86, 61);
		frame.getContentPane().add(BTN8);
		
		JButton bTN5 = new JButton("5");
		bTN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+bTN5.getText();
				textField.setText(number);
			}
		});
		bTN5.setFont(new Font("Times New Roman", Font.BOLD, 24));
		bTN5.setBounds(178, 366, 86, 61);
		frame.getContentPane().add(bTN5);
		
		JButton BTN2 = new JButton("2");
		BTN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN2.getText();
				textField.setText(number);
			}
		});
		BTN2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN2.setBounds(178, 429, 86, 61);
		frame.getContentPane().add(BTN2);
		
		JButton BTN0 = new JButton("0");
		BTN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN0.getText();
				textField.setText(number);
			}
		});
		BTN0.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN0.setBounds(88, 493, 176, 61);
		frame.getContentPane().add(BTN0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCos.setBounds(269, 117, 86, 61);
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(269, 177, 86, 61);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton BTN9 = new JButton("9");
		BTN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN9.getText();
				textField.setText(number);
			}
		});
		BTN9.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN9.setBounds(269, 302, 86, 61);
		frame.getContentPane().add(BTN9);
		
		JButton BTN6 = new JButton("6");
		BTN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN6.getText();
				textField.setText(number);
			}
		});
		BTN6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN6.setBounds(269, 366, 86, 61);
		frame.getContentPane().add(BTN6);
		
		JButton BTN3 = new JButton("3");
		BTN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTN3.getText();
				textField.setText(number);
			}
		});
		BTN3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		BTN3.setBounds(269, 429, 86, 61);
		frame.getContentPane().add(BTN3);
		
		JButton btnNewButton_6_3 = new JButton(".");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp=textField.getText();
				boolean g=true;
				for(int i=0;i<temp.length();i++)
				{
					if(temp.charAt(i)=='.')
						g=false;
				}
				if(g)
				{
					String number=textField.getText()+btnNewButton_6_3.getText();
					textField.setText(number);
				}
			}
		});
		btnNewButton_6_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton_6_3.setBounds(269, 493, 86, 61);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTan.setBounds(358, 117, 86, 61);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(358, 177, 86, 61);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					int a=(int)result;
					if(a==result)
					{
						answer=""+a;
						
					}
					
					else
					{
						//answer=String.format("%.2f",""+result);
						double w=Math.round(result*100);
						result=w/100;
						answer=""+result;
					}
					textField.setText(answer);
					first=Double.parseDouble(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					int a=(int)result;
					if(a==result)
						answer=""+a;
					else
					{
						double w=Math.round(result*100);
						result=w/100;
						answer=""+result;
					}
					textField.setText(answer);
					first=Double.parseDouble(answer);
					
				}
				else if(operation=="*")
				{
					result=first*second;
					int a=(int)result;
					if(a==result)
						answer=""+a;
					else
					{
						double w=Math.round(result*100);
						result=w/100;
						answer=""+result;
					}
						//answer=String.format("%.2f",""+result);
					textField.setText(answer);
					first=Double.parseDouble(answer);
					
				}
				else if(operation =="/")
				{
					result=first/second;
					//int a=(int)result;
					//if(a==result)
						//answer=""+a;
					//else
					try {
						answer=""+result;
						//String temp[]=answer.split(".");
						//answer=temp[0]+"."+temp[1].substring(0,2);
					
					textField.setText(answer);
					}
					catch(Exception e)
					{
						textField.setText(""+e);
					}
					
					first=Double.parseDouble(answer);
					
				}
				else if(operation=="%")
				{
					result=first%second;
					int a=(int)result;
					if(a==result)
						answer=""+a;
					else
					{
						double w=Math.round(result*100);
						result=w/100;
						answer=""+result;
					}
						//answer=String.format("%.2f",""+result);
					textField.setText(answer);
					first=Double.parseDouble(answer);
					
				}
				else if(operation=="^")
				{
					result=Math.pow(first,second);
					int a=(int)result;
					if(a==result)
						answer=""+a;
					else
					{
						double w=Math.round(result*100);
						result=w/100;
						answer=""+result;
					}
						//answer=String.format("%.2f",""+result);
					textField.setText(answer);
					
					first=Double.parseDouble(answer);
				}
			}
		});
		equal.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		equal.setBounds(358, 493, 86, 61);
		frame.getContentPane().add(equal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				operation="+";
				textField.setText("");
				label.setText(""+first+operation);
			}
		});
		btnadd.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnadd.setBounds(358, 429, 86, 61);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				operation="-";
				textField.setText("");
				label.setText(""+first+operation);
			}
		});
		btnsub.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnsub.setBounds(358, 366, 86, 61);
		frame.getContentPane().add(btnsub);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				operation="/";
				textField.setText("");
				label.setText(""+first+operation);
			}
		});
		btndiv.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btndiv.setBounds(358, 302, 86, 61);
		frame.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				operation="*";
				textField.setText("");
				label.setText(""+first+operation);
			}
		});
		btnmul.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnmul.setBounds(358, 239, 86, 61);
		frame.getContentPane().add(btnmul);
		
		JButton backspace = new JButton("X");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()>1)
				{
					StringBuilder s=new StringBuilder(textField.getText().substring(0,textField.getText().length()-1));
					//s=s.substring(0,s.length()-1);
					textField.setText(new String(s));
				}
				else if(textField.getText().length()==1)
				{
					textField.setText("");
				}
				
				
			}
		});
		backspace.setFont(new Font("Times New Roman", Font.BOLD, 24));
		backspace.setBounds(269, 239, 86, 61);
		frame.getContentPane().add(backspace);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				label.setText("");
				
			}
		});
		btnclear.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnclear.setBounds(178, 237, 86, 61);
		frame.getContentPane().add(btnclear);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				operation="%";
				textField.setText("");
			}
		});
		btnpercent.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnpercent.setBounds(88, 237, 86, 61);
		frame.getContentPane().add(btnpercent);
		
		label = new JTextField();
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(178, 31, 254, 37);
		frame.getContentPane().add(label); 
		label.setColumns(10);
	}
}
