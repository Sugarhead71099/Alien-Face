import javax.swing.JFrame;

public class AlienFaceViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("An Alien Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AlienFace component = new AlienFace();
		frame.add(component);
		
		frame.setVisible(true);
		
	}
	
}