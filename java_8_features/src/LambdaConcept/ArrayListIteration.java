package LambdaConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList <String> tvShows = new ArrayList<String>();
		tvShows.add("GOT");
		tvShows.add("Breaking Bad");
		tvShows.add("Mirjapur");
		tvShows.add("Stranger Things");
		tvShows.add("Panchayat");
		
		System.out.println("-------------using 1-----------");
		//1. iterating using lambda expression
		
		tvShows.forEach(shows -> {System.out.println(shows);});
		
		System.out.println("-------------using 2-----------");
		//Using Iterator
		
		Iterator<String> itr = tvShows.iterator();
		while(itr.hasNext()) {
			String shows= itr.next();
			System.out.println(shows);
		}
		
		System.out.println("-------------using 3-----------");
		itr= tvShows.iterator();
		itr.forEachRemaining(show -> {System.out.println(show);});
		
		System.out.println("-------------using 4-----------");
		
		for (String show : tvShows) {
			System.out.println(show);
		}
		
		
		System.out.println("-------------using 5 reverce order print-----------");
		ListIterator<String> tvshowlistiterator = tvShows.listIterator(tvShows.size());
		while(tvshowlistiterator.hasPrevious()) {
			String show = tvshowlistiterator.previous();
			System.out.println(show);
		}
		
	}

}
