import javax.swing.JFrame ;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFr2 extends JFrame implements ActionListener
{
  
  JLabel l1,l2,l3,l4 ;
  JTextField  tf1 , tf2,tf3  ; 
  JRadioButton  b1,b2,b3,b4;
  ButtonGroup bg1 = new ButtonGroup();
   MyFr2()
{
super("My first Frame") ;
setLayout(new FlowLayout());
 l1=new JLabel(" Enter first number" );
 l2=new JLabel(" Enter second  number");
 tf1=new JTextField(20);
  tf2=new JTextField(20);
  tf3=new JTextField(20);
  b1=new JRadioButton("sum" );
 b2=new JRadioButton("sub" );
 b3=new JRadioButton("multi" );
 b4=new JRadioButton("Div" );
bg1.add(b1);
bg1.add(b2);
bg1.add(b3);
bg1.add(b4);
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