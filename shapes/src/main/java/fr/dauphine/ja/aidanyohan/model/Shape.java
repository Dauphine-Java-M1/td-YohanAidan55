package fr.dauphine.ja.aidanyohan.model;


import fr.dauphine.ja.aidanyohan.view.Drawer;

public abstract class Shape {
	public Drawer drawer;
	public abstract boolean contains (Point p);
	public abstract void translate(int dx, int dy );
}