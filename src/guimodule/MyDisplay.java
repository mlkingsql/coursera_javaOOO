package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	
	public void setup(){
		int width=400;
		int height=400;
		size(width,height);
		background(0,200,0);
		
	}
	
	public void draw(){
		fill(255,245,9);
		ellipse(width/2,height/2,375,375);
		fill(0,0,0);
		ellipse(120, 130, 50,70);
		ellipse(280,130, 50,70);
		arc(200,280,175,75,0,PI);
		noFill();
	}

}
