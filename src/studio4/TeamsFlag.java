package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class TeamsFlag {

	public static void main(String[] args) {
		
		
		StdDraw.setCanvasSize(704,512);
		StdDraw.clear()	;
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(3, 3, 3, 6);
			
			StdDraw.setPenColor(StdDraw.CYAN);
			StdDraw.filledEllipse(1, 1, 1, 1);
			
			StdDraw.setPenRadius(0.05)	;
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.line(0.55,0.5, 0.7,0.7);
			StdDraw.line(0.7, 0.7, 0.5, 0.7);
			StdDraw.line(0.5, 0.7, 0.65, 0.5);
			
			StdDraw.setPenRadius(0.005);
			StdDraw.filledCircle(0.6,0.83,0.1);
			
			StdDraw.setPenRadius(0.005);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.line(0, 0.5655, 0.55, 0.5655);
			StdDraw.line(0.647, 0.5655, 1, 0.5655);
			
			
		}


	}


