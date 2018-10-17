import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.io.*;
import javax.imageio.ImageIO.*;
public class Sample1 extends Frame implements ActionListener
{

TextArea t1;
Sample1()
{
setLayout(new BorderLayout());
JLabel background=new JLabel(new ImageIcon("img1.jpg"));

	t1=new TextArea("www.google.com");
t1.setBounds(100,50,1000,800);

add(background);
background.add(t1);
setTitle("Sample1");
setSize(1500,1000);
setVisible(true);

}


public void actionPerformed(ActionEvent ae)
{
	
repaint();
}
public static void main(String args[])throws Exception
{
	Sample1 s1 =new Sample1();
}
}
