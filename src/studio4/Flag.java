package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String z = in.next()	;
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean t = in.nextBoolean();
		double x = in.nextDouble()	;
		double y = in.nextDouble()	;
		double halfHeight = in.nextDouble() ;
		double halfWidth = in.nextDouble();
		
		StdDraw.setPenColor(r, g, b)	;
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		
		
	}
}