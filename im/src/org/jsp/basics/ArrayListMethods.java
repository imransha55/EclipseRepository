package org.jsp.link;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList num=new ArrayList<>();
		ArrayList tempnum=new ArrayList<>();
		ArrayList ept=new ArrayList<>();
		
		//using add()
		tempnum.add(1);
		tempnum.add(22);
		tempnum.add(5);
		tempnum.add(13);
		num.add(1);
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		al.add("heena");
		al.add("meena");
		al.add("sheena");
		al.add("peena");
		System.out.println("after using add(): ");
		System.out.println(al);
		//using add(index,element)
		System.out.println("After updating list using add(index,elemt): ");
		al.add(3, "soona");
		System.out.println(al);
		System.out.println("-----------------------------");
		ArrayList<String> a1=new ArrayList<>();
		a1.add("ismart");
		a1.add("pawan");
		System.out.println("students in std[] list");
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<>();
		a2.add("'Gopal'");
		a2.add("'mahesh'");
		System.out.println("adding std to a1 using addAll()");
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println("---------------------------");
		System.out.println("Removing all elements using clear() from a2 elements:"+a2);
		a2.clear();
		System.out.println("Elements in a2 after using Remove:"+a2);
		System.out.println("-----------");
		System.out.println("Creating a copy of ArrayList num using Clone(): "+num);
		ArrayList<Integer> clonenum=(ArrayList<Integer>)num.clone();
		System.out.println("Cloned ArrayList: "+clonenum);
		System.out.println("------------");
		System.out.println("Removing elements using removeAll()"+num);
		num.removeAll(num);
		System.out.println("After Using removeAll(): "+num);
		System.out.println("----------");
		System.out.println("elements in clonenum: "+clonenum);
		System.out.println("elements in tempnum: "+ tempnum);
		System.out.println("Remove all Elements from an ArrayList-clonenum Present in Another ArrayList-tempnum: "+tempnum);
		clonenum.removeAll(tempnum);
		System.out.println(clonenum);
		System.out.println("duplicate of clonenum elements will be removed from tempnum");
		System.out.println("----------");
		System.out.println("checking Content present in Arraylist or not using contains() returns Boolean");
		System.out.println(clonenum.contains(5));
		System.out.println("------");
		System.out.println("getting Element using 'get(int index)' from array: "+clonenum);
		//Accessing Elements at index n,
		//if arraylist is integer use int,if String use String to store the 
		//fetched index element in the obj.
		int n1=clonenum.get(2);
		System.out.println("the element Present at given index is: "+n1);
		System.out.println("----------");
		System.out.println("Geting index of given Specefied Element using 'indexOf' returns indexno.from array: "+clonenum);
		System.out.println(clonenum.indexOf(5));
		System.out.println("if given element is not present in list the it returns '-1'");
		System.out.println("-------");
		System.out.println("Getting first occurrence of Element using 'indexOf()' returns indexno.from: "+clonenum);
		System.out.println(clonenum.indexOf(3));
		System.out.println("-------");
		System.out.println("to check size of array list returns int using 'size()': "+clonenum);
		int size = clonenum.size();
		System.out.println("Size of array is: "+size);
		System.out.println("-------");
		System.out.println("Checking Array empty or not  returns boolean using 'isEmpty()'");
		boolean result=ept.isEmpty();
		System.out.println(" Given array is empty: "+result);
		System.out.println("---------");
		System.out.println("sorted list using 'Comparator.naturalOrder()'");
		clonenum.sort(Comparator.naturalOrder());
		System.out.println(clonenum);
		System.out.println("---------");
		System.out.println("sorting  list in Reverse Order using 'Comparator.reverseOrder()'");
		clonenum.sort(Comparator.reverseOrder());
		System.out.println(clonenum);
	}

}
