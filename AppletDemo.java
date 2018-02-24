import java.awt.*;
import java.applet.Applet;

public class AppletDemo extends Applet
{
	String m;
	public void init()
	{
		m = "Initializing";
		setBackground(Color.yellow);
		setForeground(Color.red);
	}

	
 	public void start()
	{
		m = m+ "      Starting";
	}

 	public void paint(Graphics g)
	{
		m = m+ "      Painting";
		g.drawString(m,50,40);
	}

 	public void stop()
	{
		System.out.println("Stopped");
	}

	 public void destroy()
	{
		System.out.println("Destroyed");
	}
} 

/*<Applet code = "AppletDemo.class" width=1000 height= 500></Applet>*/