import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Spark2 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;

	public Spark2()
	{
		setLayout(new BorderLayout());
		JLabel background =new JLabel(new ImageIcon("img4.jpg"));
		/*JImageComponent ic = new JImageComponent(myImageGoesHere);
imagePanel.add(ic);*/
		l1=new Label("Username");

		l2=new Label("Password");
		t1=new TextField(30);
		t2=new TextField(30);
		b1=new Button("Login");
		b2=new Button("Exit");
		b2.setBackground(Color.red);
		b1.setBackground(Color.blue);

			t2.setEchoChar('*');
		
		l1.setBounds(50,50,100,30);
		t1.setBounds(200,50,100,30);
		l2.setBounds(50,100,100,30);
		t2.setBounds(200,100,100,30);
		b1.setBounds(100,150,100,30);
		b2.setBounds(210,150,100,30);

		setTitle("Login screen");
		
		add(background);
		background.add(l1);
		background.add(t1);
		background.add(l2);
		background.add(t2);
		background.add(b1);
		background.add(b2);

		setSize(1500,1000);
		
		setVisible(true);
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=t1.getText();
		String bb=t2.getText();
		
		if(ae.getSource()==b1)
		{
			if(aa.equals("hacker") && bb.equals("hacker123"))
			{
				//JOptionPane.showMessageDialog(null,"Log in successful");
				Spark3 i=new Spark3();
				setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Log in not successful");
			}
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	repaint(0);
	}
public static void main(String args[])
{
Spark2 l=new Spark2();
}
}