package org.jsp.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Im {
	
		public static void main(String[]args) {
        List<String> al=new ArrayList<String>();
        al.add("ismart");
        al.add("is an emp of");
        al.add("eidiko");
        System.out.println("elements added using Collection");
        System.out.println(al);
        Collections.addAll(al,"and","eidiko is a","mnc org");
        System.out.println("elements added using Collections");
        System.out.println(al);
        Collections.sort(al);
        System.out.println("elements after using Sort by Collections");                System.out.println(al);
}       
}       

