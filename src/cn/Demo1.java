package cn;

import java.util.Date;
import java.util.Random;
/*
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		// ֱ��ת��
		String s = num + "";
		String ss = String.valueOf(num);
		Integer i = new Integer(num);
		String sss = i.toString();
		System.out.println(s);
		System.out.println(ss);
		System.out.println(sss);
		Random r=new Random(10);
		System.out.println("-------------------------------------");
		System.out.println(r);
		Date d=new Date();
	}

}
