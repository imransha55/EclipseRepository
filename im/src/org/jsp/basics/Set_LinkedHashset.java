package org.jsp.link;

import java.util.LinkedHashSet;

public class Set_LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Double> lhs =new LinkedHashSet<Double>();
		lhs.add(5.5);
		lhs.add(-1.1);
		lhs.add(88.5);
		lhs.add(2.8);
		lhs.add(-3.0);
		lhs.add(-8.0);
		lhs.add(0.0);
		System.out.println("LinkedSet o/p wil in insertion order");
		System.out.println(lhs);
		

	}

}
