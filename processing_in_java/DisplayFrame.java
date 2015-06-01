package processingJava;


public class DisplayFrame extends javax.swing.JFrame {
	public DisplayFrame(){
		this.setSize(600, 600); // the window dimensions
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		javax.swing.JPanel panel = new javax.swing.JPanel();
		panel.setBounds(20, 20, 600, 600);
		processing.core.PApplet sketch = new CircleSketch(); // the actual Processing sketch
		panel.add(sketch);
		this.add(panel);
		sketch.init(); //this is the fcn used to start the execution of the Processing sketch

		this.setVisible(true);
	}
}
