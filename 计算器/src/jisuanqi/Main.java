package jisuanqi;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.Math.*;
import javax.swing.*;



public class Main{
	
	private JFrame f=new JFrame();
	private JPanel p1=new JPanel();
	private JTextField t=new JTextField(30);
	private JPanel p2=new JPanel();
	
	 public void js()//实现界面的函数
	 { 
	f.add(p1, BorderLayout.NORTH);
    p1.add(t);
    p2.setLayout(new GridLayout(5,4,0,0));
    String[] Buttonname={"sqrt","1/x","<","/","7","8","9","*","4","5","6","-","1","2","3","+","-/+","0",".","="};
    JButton[] b=new JButton[Buttonname.length];
    for(int i=0;i<Buttonname.length;i++)
    {
    	p2.add(b[i]=new JButton(Buttonname[i]));
    }
    f.add(p2);
    for(int i=0;i<Buttonname.length;i++)
    {
    	b[i].addActionListener(new knock());
    }
    f.pack();
    f.setVisible(true);
    f.addWindowListener(new window());
    
	 }
	    public int k=0;
		public String a;
		public double temp;
		public double next;
	class knock implements ActionListener//事件处理器，用于实现各种操作
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("0")||e.getActionCommand().equals("1")
					||e.getActionCommand().equals("2")||e.getActionCommand().equals("3")
					||e.getActionCommand().equals("4")||e.getActionCommand().equals("5")
					||e.getActionCommand().equals("6")||e.getActionCommand().equals("7")
					||e.getActionCommand().equals("8")||e.getActionCommand().equals("9"))
			
			{
			       t.setText(t.getText()+e.getActionCommand());
			     
		}
			 if(e.getActionCommand().equals("<"))
			{
				t.setText("");
			}
			 if(e.getActionCommand().equals("+"))
			{
		       a=t.getText();
		       temp=Double.parseDouble(a);
		       t.setText("");
		       k=0;
			}
			 if(e.getActionCommand().equals("-"))
			{
		       a=t.getText();
		       temp=Double.parseDouble(a);
		       t.setText("");
		       k=1;
			}
			 if(e.getActionCommand().equals("*"))
			{
				a=t.getText();
				temp=Double.parseDouble(a);
				t.setText("");
				k=2;
			}
			 if(e.getActionCommand().equals("/"))
			{
				a=t.getText();
				temp=Double.parseDouble(a);
				t.setText("");
				k=3;
			}
			 if(e.getActionCommand().equals("sqrt"))
			{
				a=t.getText();
				temp=Double.parseDouble(a);
				temp=Math.sqrt(temp);
				a=String.valueOf(temp);
				t.setText(a);
				
			}
			 if(e.getActionCommand().equals("1/x"))
			{
				a=t.getText();
				temp=Double.parseDouble(a);
				temp=1.0/temp;
				a=String.valueOf(temp);
				t.setText(a);
				
			}
			 if(e.getActionCommand().equals("-/+"))
				{
					a=t.getText();
					temp=Double.parseDouble(a);
					a=String.valueOf(temp);
					t.setText("-"+a);
					
				}
			 if(e.getActionCommand().equals("."))
			{
				a=t.getText();
				t.setText(a+".");
			}
			 if(e.getActionCommand().equals("="))
			{
				
				 a=t.getText();
				next=Double.parseDouble(a);
				if(k==0)
				{
					temp=temp+next;
					a=String.valueOf(temp);
					t.setText(a);
				}
				if(k==1)
				{
					temp=temp-next;
					a=String.valueOf(temp);
					t.setText(a);
				}
				if(k==2)
				{
					temp=temp*next;
					a=String.valueOf(temp);
					t.setText(a);
				}
				if(k==3)
				{
					temp=temp/next;
					a=String.valueOf(temp);
					t.setText(a);
					if(next==0)
					{
						t.setText("除数不能为0");
					}
				}
			}
		}
		
	}
	class window implements WindowListener//界面的控制与关闭
	{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
  

	public static void main(String[] args) {
		Main m=new Main();
		m.js();
		
		

	}

}
