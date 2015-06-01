package processingJava;

import processing.core.*;

public class CircleSketch extends PApplet {
	public void setup(){
		size(400, 400);
		background(0);
	}
	
	public void draw(){
		background(230);
		fill(0);
		ellipseMode(CENTER);
		ellipse(mouseX, mouseY, 40, 40);
	}
}
