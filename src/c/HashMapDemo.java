package c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 需求分析： 创建一个年级，录入班级学生学号姓名
 *        1班
 *         		学号  姓名  
 *        2班
 *        		学号 姓名
 */

public class HashMapDemo {

	public static void main(String[] args) {
		// 创建班级集合
		HashMap<String, HashMap<String, Integer>> hsmap = new HashMap<String, HashMap<String, Integer>>();
		// 创建1班学生集合
		HashMap<String, Integer> student_1 = new HashMap<String, Integer>();
		student_1.put("zhanghao", 18);
		student_1.put("xushilong", 20);
		student_1.put("haorui", 18);
		student_1.put("xuning", 20);
		// 将1班学生集合存入班级集合中
		hsmap.put("1班", student_1);
		// 创建2班学生集合
		HashMap<String, Integer> student_2 = new HashMap<String, Integer>();
		student_2.put("汪周飞", 23);
		student_2.put("王文辉", 25);
		student_2.put("王亚东", 18);
		student_2.put("张悦明", 20);
		// 将2班学生集合存入班级集合中
		hsmap.put("2班", student_2);
		//遍历
		Set<String> hsmapset=hsmap.keySet();
		for(String hsmapsetkey : hsmapset){
			 HashMap<String, Integer> hsmapsetkeyvalue= hsmap.get(hsmapsetkey);
			 System.out.println(hsmapsetkey);
			 //遍历HashMap<String, Integer>=hsmapsetkeyvalue
			 Set<String>  hsmapsetkeyvalueset=hsmapsetkeyvalue.keySet();
			 for(String setkey :hsmapsetkeyvalueset){
				 Integer setkeybalue=hsmapsetkeyvalue.get(setkey);
				 System.out.println("\t"+setkey+"-----"+setkeybalue);
			 }
			 
		}

	}

}
