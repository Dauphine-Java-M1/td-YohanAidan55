package fr.dauphine.ja.aidanyohan.view;

import java.awt.Graphics;

import fr.dauphine.ja.aidanyohan.model.Ring;


public class RingDrawer extends Drawer{
	public Ring r;

	public RingDrawer(Ring r) {
		this.r=r;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(r.getC().getCenter().getX(),r.getC().getCenter().getY(),r.getC().getRadius(),r.getC().getRadius());
		g.drawOval(r.getC().getCenter().getX()+r.getRayonInterne(),r.getC().getCenter().getY()+r.getRayonInterne(),
				(r.getC().getRadius())-r.getRayonInterne()*2,(r.getC().getRadius())-r.getRayonInterne()*2);
	}

}