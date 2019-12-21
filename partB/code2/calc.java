import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="calc" height="500" width="500"></applet>
public class calc extends Applet implements ActionListener{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	public void init(){
		l1=new Label("Enter 1st Number");
		add(l1);
		t1=new TextField(10);
                add(t1);
		l2=new Label("Enter 2nd Number");
                add(l2);
		t2=new TextField(10);
                add(t2);
		l3=new Label("Result");
                add(l3);
		t3=new TextField(10);
                add(t3);
		b1=new Button("+");
		add(b1);
		b1.addActionListener(this);
		b2=new Button("-");
                add(b2);
		b2.addActionListener(this);
		b3=new Button("*");
                add(b3);
		b3.addActionListener(this);
		b4=new Button("/");
                add(b4);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		int res=0;
		String a=ae.getActionCommand();
		if(a.equals("+")){
			res=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(res));
		}
		if(a.equals("-")){
                        res=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(res));
                }
		if(a.equals("*")){
                        res=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(res));
                }
		if(a.equals("/")){
			if(Integer.parseInt(t2.getText())!=0){
                        res=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(res));
			}
			else
				System.out.println("division error");
                }
	}
}

		
