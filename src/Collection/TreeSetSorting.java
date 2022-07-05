package Collection;

import java.util.TreeSet;

public class TreeSetSorting 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>((i1,i2)-> {return (i1>i2)?-1:(i1<i2)?+1:0;});
			tree.add(10);
			tree.add(4);
			tree.add(15);
			tree.add(30);
			tree.add(40);
			tree.add(10);
			tree.add(12);
			tree.add(7);
			tree.add(19);
			tree.add(15);
			
			System.out.println(tree);
	}
}
