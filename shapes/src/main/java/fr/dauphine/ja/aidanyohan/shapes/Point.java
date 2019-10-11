package fr.dauphine.ja.aidanyohan.shapes;

import java.util.ArrayList;

public class Point {

	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y= x;
	}
	public Point(Point pt) {
		this.x=pt.x;
		this.y=pt.y ;
	}
    public boolean isSameAs(Point pt) {
    	return this.x==pt.x && this.y==pt.y;
	}
	 
	 public static void main( String[] args )
	    { 
		 Point p1=new Point(1,2);
		 Point p2=p1;
		 Point p3=new Point(1,2);
		 ArrayList<Point> list = new ArrayList<Point>();
		 list.add(p1);
		 System.out.println(p1.isSameAs(p2));
		 System.out.println(p1.isSameAs(p3));
	    }

	 
	 
}
