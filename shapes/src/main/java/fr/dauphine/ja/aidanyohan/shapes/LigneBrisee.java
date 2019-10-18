package fr.dauphine.ja.aidanyohan.shapes;

public class LigneBrisee {

	 Point[] ligne;
	
	public LigneBrisee(int max)
	{
		ligne=new Point[max];
	}
	public void add (Point p) {
		this.ligne[ligne.length-1]=p;
			}
}

