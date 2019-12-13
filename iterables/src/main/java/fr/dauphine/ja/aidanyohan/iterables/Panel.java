package fr.dauphine.ja.aidanyohan.iterables;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel  implements Iterator<Integer> 
{
	
	private int debut;
    private int fin;
    private int x;
   
    
    public Panel (int debut, int fin){
        if(debut > fin) throw new IllegalArgumentException("le debut doit etre in ferieur a la fin");
        this.debut = debut;
        this.fin = fin;
        this.x=debut;
        
       
    }
    public static List<Integer> panel(final int debut, final int fin)
   	{
   		return new AbstractList<Integer>()
   		{
   			@Override
   		    public int size(){
   		        return fin - debut + 1;
   		    }
   		    
   		    @Override
   		    public Integer get(int index){
   		        return debut + index;
   		    }
   		};
   	}
    public static Iterator<Integer> panel1(final int debut,final int fin) {
    	//Question 1 return new Panel(debut ,fin);
    	
    	//Question 2
    	Iterator<Integer> iterator = new Iterator<Integer>(){
    		
    		private int x = debut;

			public boolean hasNext() {
    			return (x <= fin);
    		}
			
			public Integer next() {
				return this.x++;
			}
    		
    	};
		return iterator;
	}
    
	
public static Iterable<Integer> panel2(final int debut,final int fin){
        
        return new Iterable<Integer>(){
          
           
            public Iterator<Integer> iterator(){
                return Panel.panel1(debut, fin);
            }
        };
    }

public boolean hasNext() {
	
	return (x<=fin);
}

public Integer next() {
	
	return this.x++;
}
	
	public static void main(String[] args )
	{
		/* question 1 
		 Iterator<Integer> it = panel1(1,5);
		for(;it.hasNext();)
		System.out.println(it.next()); // affiche 1 2 3 4 5
		*/
		/*
		for(int i:panel2(1,5))
			System.out.println(i); // affiche 1 2 3 4 5
		*/
		

		List<Integer> l = panel(3,6);
		for(int i:l) {
		System.out.println(i);
		//affiche 3 4 5 6
		}
		System.out.println(l.get(1)); //affiche 4
	}
	
	
}