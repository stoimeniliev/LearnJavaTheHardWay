import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.red);
        g.fillRect(300,300,200,200);  // draw a rectangle
        g.fillOval(160,20,200,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(300,300,100,100); // a filled-in rectangle
        g.drawOval(200,430,200,100);
		g.setColor(Color.black);
        g.fillRect(600,600,100,100); // a filled-in rectangle
        
        
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = 100;
        int y = 100;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}