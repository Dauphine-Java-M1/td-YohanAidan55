package fr.dauphine.ja.aidanyohan.model;

import java.util.LinkedList;

public class LigneBrisee {

	 /*Point[] lesPoints;
	 int n=0;
	 int compt=0;
	 
	public LigneBrisee(int max)
	{
		lesPoints=new Point[max];
	}
	public void add (Point p) {
		lesPoints[compt]=p;
        compt++;
			}
	
	public void pointCapacity() {
		System.out.println(lesPoints.length);
	}
	public void nbPoint() {
		System.out.println(compt);
	}
	public boolean contains(Point p) {
		for (Point unPoint:lesPoints) {
			if(unPoint == p) {
				return true;
			}
		}
		return false;
	}*/
	
	LinkedList<Point> lesPoints;
	
	public LigneBrisee()
	{
		this.lesPoints = new LinkedList<Point>();
	}
	
	
	
}

