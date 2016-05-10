package cn;

import java.util.Scanner;

public class rejexDemo {
	public static void main(String[] args) {

		// 定义一个功能校验器：检测一个电话号码是否符合规格
		/*
		 * 电话号码如下： 15221306508 13122386203 18814456789L 13322211111 15880220458
		 */
		// 分析：
		/*
		 * 1:创建一个规则对象：制定规则 2:键盘键入一个电话号码 3：用电话对象调用规则，判断是否符合规则
		 */
		String rejex = "1[358][0-9]{9}";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个电话号码：");
			String phone = sc.nextLine();
			// 利用规则判断电话号码规范
			boolean flag = phone.matches(rejex);
			System.out.println(flag);
		}
	}
}
