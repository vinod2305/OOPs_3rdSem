import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="greet" width="500" height="500"></applet>

public class greet extends Applet {
	String msg="";
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent m){
				msg="Welcome";
				repaint();
			}
			public void mouseReleased(MouseEvent m){
				msg="goodbye";
				repaint();
			}
		});
	}
	public void paint(Graphics g){
		g.drawString(msg,10,10);
	}
}
