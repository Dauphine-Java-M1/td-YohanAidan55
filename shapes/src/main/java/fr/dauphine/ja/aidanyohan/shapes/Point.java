package fr.dauphine.ja.aidanyohan.shapes;

import java.util.ArrayList;

public class Point {

	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y= y;
	}
	public Point(Point pt) {
		this.x=pt.x;
		this.y=pt.y ;
	}
    public boolean isSameAs(Point pt) {
    	return this.x==pt.x && this.y==pt.y;
	}
    public Point translate(int dx, int dy) {
    
		return new Point(this.x+dx,this.y+dy);
	}
    public String toString() { 
    	return   x +","+ y;
    	}
    
	 
	 public static void main( String[] args )
	    { 
		 Point p1=new Point(1,3);
		 Point p5=new Point(5,12);
		 Point p2=p1;
		 Point p3=new Point(1,2);
		 ArrayList<Point> list = new ArrayList<Point>();
		 list.add(p1);
		 System.out.println(p1.isSameAs(p2));
		 System.out.println(p1.isSameAs(p3));
		/* LigneBrisee l = new LigneBrisee(5);
		 l.add(p1);
		 l.add(p2);
		 l.add(p3);
		 l.add(p1);
		 l.add(p1);
	
		 for(int i=0; i<l.lesPoints.length; i++) {
		 System.out.println(l.lesPoints[i].x +","+ l.lesPoints[i].y);
		 }
		 l.nbPoint();
		 l.pointCapacity();
		 System.out.println(l.contains(p5));
	    */
		 LigneBrisee l = new LigneBrisee();
	 l.lesPoints.add(p1);
	 l.lesPoints.add(p1);
	 l.lesPoints.add(p3);
	 for(int i=0; i<l.lesPoints.size(); i++) {
		 System.out.println(l.lesPoints.get(i).x +","+ l.lesPoints.get(i).y);
		 }
	 System.out.println(l.lesPoints.contains(p5));
	 System.out.println("il y a " + l.lesPoints.size()+" point dans la ligne brisé");
	 Point p=new Point(1,2);
	 Circle c=new Circle(p,1);
	 Circle c2=new Circle(p,2);
	 c2.translate(1,1);
	 System.out.println(c+" "+c2);
	 
	 
	 Circle c3=new Circle(new Point(1,2), 1);
	 c3.translate(1,1);

	 System.out.println(c3);
	 
	    }
	 
	 
	 
}
