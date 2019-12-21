import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="simplebox" height="500" width="500"></applet>
public class simplebox extends Applet implements KeyListener{
        TextField t1;
        Label l1;
        public void init(){
                l1=new Label("enter a number");
                add(l1);
                t1=new TextField(10);
                add(t1);
                t1.addKeyListener(this);
        }
	public void keyReleased(KeyEvent k){}
	public void keyTyped(KeyEvent k){}
        public void keyPressed(KeyEvent k){
		char a=k.getKeyChar();
                if(a=='r'){
				String t=t1.getText();
				StringBuffer b=new StringBuffer(t);
                        	showStatus(b.reverse().toString());
		}
	}
}
