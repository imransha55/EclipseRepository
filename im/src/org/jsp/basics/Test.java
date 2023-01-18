package org.jsp.link;

import java.util.ArrayList;
import java.util.Collections;

class Test
{
  public static void main(String[]args)
  {
   ArrayList<String> al=new ArrayList<>();
    al.add("red");
    al.add("black");
    al.add("blue");
    al.add("lite-blue");
    al.add("dark-blue");
    al.add("full lite-blue");
    al.add("full dark-blue");
    System.out.println(al);
    System.out.println("iterate through elements");
    for (String element : al) {
        System.out.println(element);
        System.out.println("inserting element at first position");
        al.add(0, "cocoBlack");
        System.out.println(al);
        System.out.println("Element at 1st inderx is: "+al.get(1));
        al.set(0,"fulldarkblack");
        System.out.println("Setting element at Specified Index: "+al);
        System.out.println("Removing Element from specified index: '"+al.remove(1));
        System.out.println("After Removing "+ al);
        System.out.println(al.contains("dark-blue"));
        Collections.sort(al);
        System.out.println("Sorted List: "+ al);
        System.out.println("For Coping one array into another use 'Collections.copy(list1,list2) list1 is replaced by list2");
        Collections.shuffle(al);
        System.out.println("Result Of Collection.shuffle(al) "+al);
        Collections.reverse(al);
        System.out.println("Reversing the arraylist by C.reverse(al) : "+al);
        System.out.println("Extracting Portion of list using .sublist(0,3): "+ al.subList(0, 4));
        Collections.swap(al, 0, 1);
        System.out.println("After Swapping: "+al);
        
    }
  }
}