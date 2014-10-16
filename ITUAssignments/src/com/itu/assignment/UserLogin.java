package com.itu.assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserLogin extends JFrame
{
JButton login,cancel;
JTextField uname;
JPasswordField pass;
JLabel u,p;

public class books{
	public static int NumBooks=5;
	private string "java";
	private string "python";
	private string "Javascript";
	private string "PHP";
	private string "Ruby";
	
}
 public UserLogin()
 {
 setTitle("Login");
 setLayout(new GridLayout(3,2));
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setVisible(true);

 u=new JLabel("Username");
 p=new JLabel("Password");

 uname=new JTextField(20);
 pass=new JPasswordField(20);

 login=new JButton("Login");
 cancel=new JButton("Cancel");

 add(u);
 add(uname);

 add(p);
 add(pass);

 add(login);
 add(cancel);

 uname.requestFocus();

 cancel.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  System.exit(0);
  }
 });

 login.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  String un=uname.getText();
  String pa=new String(pass.getPassword());
  
  if((un.equals("itu"))&&(pa.equals("itu")))

  {

  dispose();

  new WelcomeFrame();

  }

 }

});



KeyAdapter k=new KeyAdapter(){

 public void keyPressed(KeyEvent ke)

 {

  if(ke.getKeyCode()==KeyEvent.VK_ENTER)

  login.doClick();

 }

};



pass.addKeyListener(k);

uname.addKeyListener(k);



pack();

setLocationRelativeTo(null);

}



class WelcomeFrame extends JFrame

{

JLabel exit;

JMenuBar mbar;

JLabel label;



public WelcomeFrame()

{

setTitle("Welcome To ITU");

setSize(400,400);

setVisible(true);

setDefaultCloseOperation(EXIT_ON_CLOSE);



mbar=new JMenuBar();

mbar.setLayout(new FlowLayout());



label=new JLabel("You are logged in to ITU.");


mbar.add(label);

exit=new JLabel("<html><a href=''>Exit</a></html>");

exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

exit.setFont(new Font("Tahoma",Font.PLAIN,13));



exit.addMouseListener(new MouseAdapter(){

 public void mouseClicked(MouseEvent ae)

 {

 System.exit(0);

 }

});



mbar.add(exit);



setJMenuBar(mbar);



setExtendedState(MAXIMIZED_BOTH);

}

}



public static void main(String args[])

{

new UserLogin();

}



}