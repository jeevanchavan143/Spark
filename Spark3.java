import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO.*;
import java.io.*;


public class Spark3 extends Frame implements ActionListener
{
Button b1,b6;
JButton b2,b3,b5,b4;
public Spark3()
{
setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("img6.jpg"));
	b1=new Button("Logout");
b1.setBackground(Color.red);
ImageIcon Resume_img = new ImageIcon("Resume.jpg");
b2=new JButton(Resume_img);

ImageIcon GD_img = new ImageIcon("GDimg.jpg");
b3=new JButton(GD_img);

ImageIcon PI_img = new ImageIcon("PIimg.jpg");
b4=new JButton(PI_img);

ImageIcon Aboutus = new ImageIcon("Aboutus.jpg");
b5=new JButton(Aboutus);


b6=new Button("Exit");
b6.setBackground(Color.red);

b1.setBounds(1200,50,100,30);
b2.setBounds(250,100,300,100);
b3.setBounds(250,300,300,100);
b4.setBounds(600,100,300,100);
b5.setBounds(600,300,300,100);
b6.setBounds(1200,300,100,30);

setTitle("Spark menu");
add(background);
background.add(b1);
background.add(b2);
background.add(b3);
background.add(b4);
background.add(b5);
background.add(b6);

setSize(1500,1000);
setVisible(true);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{


if(ae.getSource()==b1)
{
Spark2 l=new Spark2();
setVisible(false);
}

if(ae.getSource()==b2)
{
Resume b=new Resume();
//ComboBox1 c=new ComboBox1();
setVisible(false);
}
/*
if(ae.getSource()==b3)
{
GD h=new GD();
setVisible(false);
}
if(ae.getSource()==b4)
{
PI t=new PI();
setVisible(false);
}
if(ae.getSource()==b5)
{
About t=new About();
setVisible(false);
}
 */
if(ae.getSource()==b6)
{
System.exit(0);
}

repaint();
}
public static void main(String args[])
{
Spark2 l=new Spark2();
}
}

