import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
//import javax.swing.JPanel;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class AlienFace extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		// Recover Graphiscs2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the head
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
		g2.draw(head);
		
		// Draw the eyes
		Line2D.Double eye1 = new Line2D.Double(25, 70, 45, 90);
		g2.draw(eye1);
		Line2D.Double eyeSub1 = new Line2D.Double(50, 70, 30, 90);
		g2.draw(eyeSub1);
		
		Line2D.Double eye2 = new Line2D.Double(70, 70, 90, 90);
		g2.draw(eye2);
		Line2D.Double eyeSub2 = new Line2D.Double(95, 70, 75, 90);
		g2.draw(eyeSub2);
		
		// Draw the mouth
		Rectangle mouth = new Rectangle(30, 130, 50, 5);
		g2.setColor(Color.RED);
		g2.fill(mouth);
		
		// Draw the greeting
		g2.setColor(Color.BLUE);
		g2.drawString("Hello, World!",  5,  175);
		
	}
	
}