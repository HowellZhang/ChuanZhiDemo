package cn;

import java.util.Scanner;

public class rejexDemo {
	public static void main(String[] args) {

		// ����һ������У���������һ���绰�����Ƿ���Ϲ��
		/*
		 * �绰�������£� 15221306508 13122386203 18814456789L 13322211111 15880220458
		 */
		// ������
		/*
		 * 1:����һ����������ƶ����� 2:���̼���һ���绰���� 3���õ绰������ù����ж��Ƿ���Ϲ���
		 */
		String rejex = "1[358][0-9]{9}";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������һ���绰���룺");
			String phone = sc.nextLine();
			// ���ù����жϵ绰����淶
			boolean flag = phone.matches(rejex);
			System.out.println(flag);
		}
	}
}
