package fr.dauphine.ja.aidanyohan.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{

	@Override
	 public void paintComponent(Graphics g){
		super.paintComponent(g);
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
	    System.out.println("Je suis exécutée !"); 
	  
	    g.drawLine(0,20,1000,2000);
	    
	  }  
	
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
	}
	
}
	
	

