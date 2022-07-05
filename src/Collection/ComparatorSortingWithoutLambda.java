package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.omg.CORBA.INTERNAL;

public class ComparatorSortingWithoutLambda 
{
	public static void main(String[] args) 
	{
		System.out.println("Before sorting\n----------------------------------------\n");
		ArrayList<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(28);
			list.add(9);
			list.add(14);
			list.add(31);
			list.add(22);
			list.add(8);
			list.add(19);
		System.out.println(list+"\n");
		//If no sorting is done, then the list will be displayed based on the insertion order as the list preserves insertion order.
		
		System.out.println("After default natural sorting\n----------------------------------------\n");
		Collections.sort(list);		
		System.out.println(list+"\n");
		//If no comparator implementation is given, default natural sort is applied. Numbers: ascending order, String: Alphabetical order
		
		System.out.println("After customized natural sorting by creating a new class\n----------------------------------------\n");
		Collections.sort(list, new MyComparator());		
		System.out.println(list+"\n");
		
		System.out.println("After customized natural sorting by creating a anonymous class\n----------------------------------------\n");
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1>o2)?-1:(o1<o2)?+1:0;
			}
		});
		System.out.println(list+"\n");
		
		System.out.println("After customized natural sorting by using lambda expressions\n----------------------------------------\n");
		Collections.sort(list, (o1,o2)->{return (o1>o2)?+1:(o1<o2)?-1:0;});
		System.out.println(list+"\n");
	}
}

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {		
		
		if(o1>o2)
		{
			return -1;
		}
		else if(o2>o1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}