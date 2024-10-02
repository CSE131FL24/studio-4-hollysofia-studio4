package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color pink = new Color(255, 130, 182);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		Color darkPink = new Color(255, 253, 183);
		StdDraw.setPenColor(darkPink);
		StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.15);
		Color circle = new Color(0, 109, 182);
		StdDraw.setPenColor(circle);
		StdDraw.filledCircle(0.40, 0.5, .1);
		StdDraw.filledCircle(0.60, 0.5, .1);
		Color white = new Color(255,255,255);
		StdDraw.setPenColor(white);
		StdDraw.filledEllipse(0.35, 0.5, .045, .025);
		StdDraw.filledEllipse(0.45, 0.5, .045, .025);
		StdDraw.filledEllipse(0.55, 0.5, .045, .025);
		StdDraw.filledEllipse(0.65, 0.5, .045, .025);
		Color black = new Color(0, 0, 0);
		StdDraw.setPenColor(black);
		StdDraw.filledCircle(0.35, 0.5, .015);
		StdDraw.filledCircle(0.45, 0.5, .015);
		StdDraw.filledCircle(0.55, 0.5, .015);
		StdDraw.filledCircle(0.65, 0.5, .015);
		
	}
}