package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * ���ü��ϴ洢5��ѧ����Ȼ����� ������ 1.����һ�����ϣ��洢5��ѧ�� 2.������ת��Ϊ�ַ������� 3.����forѭ������5��ѧ��
		 * a:����һ��ѧ����
		 * b:����ѧ������
		 * c:����һ������
		 * d:����
		 */
	//System.out.println("������Ҫ¼���ѧ������");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	Student s=new Student();
	System.out.println("������ѧ��������");
	String name=sc.nextLine();
	s.setName(name);
	System.out.println("������ѧ�����䣺");
	int age=sc.nextInt();
	s.setAge(age);
	
	Collection c=new ArrayList();
	c.add(s);
	System.out.println(c);

	}
}