package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	/*	Scanner in = new Scanner(System.in);
		System.out.println("What x value do you want it centered around?");
		double x = in.nextDouble();
		System.out.println("y value?");
		double y = in.nextDouble();
		System.out.println("Half Width?");
		double halfw = in.nextDouble();
		System.out.println("Half Height?");
		double halfh = in.nextDouble();
		StdDraw.filledRectangle(x,y,halfw,halfh);
		StdDraw.ellipse(73,0,146,0.5);
		*/
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5,.5,.4,.25);
		
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5,.4,.2,.05);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.32,.6,.07,.07);
		StdDraw.filledEllipse(0.7,.6,.07,.07);
		StdDraw.filledRectangle(0.5,.4225,.05,.025);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledEllipse(0.3,.57,.03,.03);
		StdDraw.filledEllipse(0.73,.625,.03,.03);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.006);
		StdDraw.rectangle(0.5,.4,.2,.05);
		StdDraw.ellipse(0.32,.6,.071,.071);
		StdDraw.ellipse(0.7,.6,.071,.071);
		StdDraw.rectangle(0.5,.4225,.0501,.0251);
		StdDraw.line(.5, .45,.5 ,.4 );
		StdDraw.ellipse(0.3,.57,.03,.03);
		StdDraw.ellipse(0.73,.625,.03,.03);
		StdDraw.rectangle(0.5,.5,.4001,.2501);
	
		
		
	}

	private static Object ellipse(int i, int j, int k, boolean b, double d, double e, double f, double g) {
		// TODO Auto-generated method stub
		return null;
	}
}