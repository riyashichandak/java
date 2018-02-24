import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Rainbow extends Applet implements MouseMotionListener
{
	String str = "";

	public void init()
	{
		addMouseMotionListener(this);
	}

	public void paint(Graphics g)
	{
		Font f=new Font("Ariel",Font.PLAIN,20);
		g.setFont(f);
		g.drawString(str,40,40);
	}
	public void mouseMoved(MouseEvent me)
	{
		setBackground(Color.yellow);
		str="Mouse Moved";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		setBackground(Color.red);
		str="Mouse Dragged";
		repaint();
	}
}
/*<applet code = "Rainbow.class" width=500 height=500></applet>*/