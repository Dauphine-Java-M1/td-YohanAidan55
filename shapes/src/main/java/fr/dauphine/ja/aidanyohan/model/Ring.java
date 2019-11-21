package fr.dauphine.ja.aidanyohan.model;

public class Ring extends Circle {
int rayonInterne;
	
	public Ring(Point pt, int r, int rayonInterne) {
		super(pt, r);
		if(rayonInterne > r) {
		throw new IllegalArgumentException("Le rayon interne dois etre inferieur au rayon du cercle ! ");	
		}
		this.rayonInterne=rayonInterne;
		
	}

	@Override
	public boolean equals(Object obj) {
		Ring ring = (Ring) obj;
         if(ring.rayonInterne == this.rayonInterne && ring.getCenter() == this.getCenter() && ring.getRadius() == this.getRadius()){
           return true;
           }
            return false;
	}
	@Override
	public String toString() { 
		return  "rayon: "+rayon+" et centre: "+p+ "et rayon interne "+this.rayonInterne;
		//ou on utilise super.toString() de la classe Circle
		}
	
	public Boolean contains(Point pt) {
		if(Math.sqrt(Math.pow(pt.getX()-p.getX(), 2)+Math.pow(p.getY()-pt.getY(), 2))<rayonInterne) {
			return false;	
		}else
		if(super.contains(pt)) {
		return true;
		}
	return false;
}
	public static boolean contains(Point p, Ring...rings){
		for(Ring r : rings){
			if(r.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	
	
}