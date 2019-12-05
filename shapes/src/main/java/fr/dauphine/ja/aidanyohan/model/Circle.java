package fr.dauphine.ja.aidanyohan.model;

import fr.dauphine.ja.aidanyohan.view.CircleDrawer;

public class Circle extends Shape {
Point p;
int rayon;

public Circle(Point pt, int r) {
	super();
	this.p=pt;
	this.rayon=r;
	super.drawer=new CircleDrawer(this);
}
public void translate(int dx, int dy) {
	this.p=this.p.translate(dx, dy);
}

double surface() {
	return Math.PI*this.rayon*this.rayon;
}

public String toString() { 
return  "rayon: "+rayon+" et centre: "+p+ "et surface "+this.surface();
}
public Point getCenter() { 
return   this.p;
}
public int getRadius() { 
return   this.rayon;
}
public boolean contains(Point p) {

	return Math.sqrt((p.getX()-p.getX())*(p.getX()-p.getX())+(p.getY()-p.getY()))<rayon;
}

public static boolean contains(Point p, Circle...circles){
	for(Circle c : circles){
		if(c.contains(p)){
			return true;
		}
	}
	return false;
}
}