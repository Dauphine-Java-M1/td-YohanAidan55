package fr.dauphine.ja.aidanyohan.shapes;

public class Circle {
Point p;
int rayon;

public Circle(Point pt, int r) {
	this.p=pt;
	this.rayon=r;
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

}
