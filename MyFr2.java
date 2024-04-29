import javax.swing.JFrame ;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFr2 extends JFrame implements ActionListener
{
  
  JLabel l1,l2,l3,l4 ;
  JTextField  tf1 , tf2,tf3  ; 
  JButton  b1,b2,b3,b4;
   MyFr2()
{
super() ;
setLayout(new FlowLayout());
 l1=new JLabel(" Enter first number" );
 l2=new JLabel(" Enter second  number");
 tf1=new JTextField(20);
  tf2=new JTextField(20);
  tf3=new JTextField(20);
  b1=new JButton("+" );
 b2=new JButton("-" );
 b3=new JButton("*" );
 b4=new JButton("/" );
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
  add(l1);
 add(tf1);
 add(l2);
 add(tf2);
add(b1);
add(b2);
add(b3);
add(b4);
add(tf3);
   
  }
  public void actionPerformed(ActionEvent ae)
{
   sum();
   sub();
   multi();
   Div();
if(ae.getSource()==b1)
 {
    sum();
 }
if(ae.getSource()==b2)
 {
    sub();
 }
if(ae.getSource()==b3)
 {
    multi();
 }
if(ae.getSource()==b4)
 {
    Div();
 }
}
public void sum()
{
  int a,b,c;
float r;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
r=a+b;
tf3.setText("   "+r);
}
public void sub()
{
  int a,b,c;
float r;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
r=a-b;
tf3.setText("   "+r);
}
public void multi()
{
  int a,b,c;
float r;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
r=a*b;
tf3.setText("   "+r);
}
public void Div()
{
  int a,b,c;
float r;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
r=a/b;
tf3.setText("   "+r);
}
}