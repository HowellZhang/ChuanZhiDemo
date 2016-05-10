package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ItratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("hello");
		list.add("java");
		list.add("world");
		ListIterator it=list.listIterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if (s.equals("java")) {
				it.add("javaee");
			}
			System.out.println("List:"+list);
		}
	}

}
