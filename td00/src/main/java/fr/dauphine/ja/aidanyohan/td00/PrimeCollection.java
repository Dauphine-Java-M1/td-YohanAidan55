package fr.dauphine.ja.aidanyohan.td00;

import java.util.ArrayList;
import java.lang.Math;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	java.util.ArrayList<Integer> numbers;
	
	public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
	
public void initRandom(int n, int m) {
	int nb;
		for (int i=0; i<n ; i++) {
			nb = (int) (Math.random() * m );
			this.numbers.add(nb);
			
		}
		
	}
public Boolean isPrime(int p) {
	if(p==0) {
		return false;
	}
	for (int i=2; i<p ; i++) {
		if(p%i==0) {
			return  false;
		} 
	}
return true;
	}

public void printprimes() {
	for(int i=0; i<this.numbers.size();i++) {
		if(isPrime(this.numbers.get(i))) {
			System.out.println(this.numbers.get(i));
		}
	}
}

public static void main( String[] args )
{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	PrimeCollection p = new PrimeCollection(numbers);
    p.initRandom(1000, 2000);
    System.out.println(p.numbers);  
    System.out.println(p.isPrime(15)); 
    p.printprimes();
}
}

	
	
