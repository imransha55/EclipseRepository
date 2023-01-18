package org.jsp.link;

import java.util.Collections;
import java.util.Iterator;

public class LinkedList 
{
		public static void main(String[] args) 
		{
			try{
				//AllPrograms Project
			//https://www.w3resource.com/java-exercises/collection/index.php
			java.util.LinkedList<String> ll=new java.util.LinkedList<>();
			java.util.LinkedList<Integer>lll=new java.util.LinkedList<>();
			ll.add("Red");
			ll.add("Black");
			ll.add("Blue");
			ll.add("Brown");
			ll.add("Big-Black");
			lll.add(55);
			lll.add(88);
			System.out.println(ll);
			System.out.println();
			System.out.println("---iterating Elements---");
			for(String e:ll)
			{
				System.out.println(e);
			}
			System.out.println("---iterating Elements list From Specifeied Element---");
			Iterator<String> i=ll.listIterator(1);
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			Collections.reverse(ll);
			System.out.println("Reverse Order of List is: "+ll);
			ll.add(0, "Blacky");
			System.out.println("List After Adding Element at Specified index: "+ll);
			ll.addFirst("Black-Buddy1");
			ll.addLast("Black-Buddy1.0");
			System.out.println("List After Adding Elements At First and Last using .addFirst(),addLast(): "+ll);
			Object gf=ll.getFirst();Object gl=ll.getLast();
			System.out.println("Getting First Element using .getFirst(): '"+gf +"' LAst Elements .getLast(): '"+gl+"'");
			System.out.println("Getting Elements Along with Positions using for loop");
			for (int j = 0; j < ll.size(); j++)
			{
				System.out.println("Element at index: "+j+" is "+ll.get(j));
			}
			System.out.println("Element Removed  using .remove(index)is : "+ll.remove(7));
			System.out.println("List After Removing Element"+ll);
			System.out.println(ll.removeFirst()+" is the First Elemenet Removed from  thelist using  .removeFirst()");
			System.out.println(ll.removeLast()+" Is the Last Element Removed from the list using  .removeLast()");
			System.out.println("Elements in lll:" + lll);
			lll.removeAll(lll);System.out.println("Elements After Using .removeAll(): "+lll);
			System.out.println("Swapping two Elements usimng Collections.swap()");
			System.out.println("Before Swaping: "+ll);
			Collections.swap(ll, 2, 4);
			System.out.println("After Swaping 2 and 4: "+ll);
			Collections.shuffle(ll);
			System.out.println("After Shuffling list: "+ll);
			System.out.println("Removed Element: "+ll.pop());
			System.out.println("Given Element is thr: "+ll.contains("red"));
			System.out.println("Elements Contains in ll: "+ll.containsAll(ll));
			System.out.println("Before Replacing list: "+ll);
			String temp=ll.get(0);
			ll.set(0, "Black-BurraPadu");
			System.out.println("List After Replacing Element : "+temp+" with Black-Burrapadu "+ll);
		}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
		
		}

	}
