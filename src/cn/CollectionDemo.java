package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * 请用集合存储5个学生，然后遍历 分析： 1.创建一个集合，存储5个学生 2.将集合转换为字符串数组 3.利用for循环遍历5个学生
		 * a:定义一个学生类
		 * b:创建学生对象
		 * c:创建一个集合
		 * d:遍历
		 */
	//System.out.println("请输入要录入的学生数：");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	Student s=new Student();
	System.out.println("请输入学生姓名：");
	String name=sc.nextLine();
	s.setName(name);
	System.out.println("请输入学生年龄：");
	int age=sc.nextInt();
	s.setAge(age);
	
	Collection c=new ArrayList();
	c.add(s);
	System.out.println(c);

	}
}