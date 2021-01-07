package com.java.eight.lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(11);
		list.add(13);
		list.add(1);
		System.out.println(list);
		
		Comparator<Integer> c = (i,j)->(i>j)?1:(i<j)?-1:0;
		Collections.sort(list,c);
		System.out.println("sorted:"+list);
				
	}

}
