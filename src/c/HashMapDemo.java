package c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * ��������� ����һ���꼶��¼��༶ѧ��ѧ������
 *        1��
 *         		ѧ��  ����  
 *        2��
 *        		ѧ�� ����
 */

public class HashMapDemo {

	public static void main(String[] args) {
		// �����༶����
		HashMap<String, HashMap<String, Integer>> hsmap = new HashMap<String, HashMap<String, Integer>>();
		// ����1��ѧ������
		HashMap<String, Integer> student_1 = new HashMap<String, Integer>();
		student_1.put("zhanghao", 18);
		student_1.put("xushilong", 20);
		student_1.put("haorui", 18);
		student_1.put("xuning", 20);
		// ��1��ѧ�����ϴ���༶������
		hsmap.put("1��", student_1);
		// ����2��ѧ������
		HashMap<String, Integer> student_2 = new HashMap<String, Integer>();
		student_2.put("���ܷ�", 23);
		student_2.put("���Ļ�", 25);
		student_2.put("���Ƕ�", 18);
		student_2.put("������", 20);
		// ��2��ѧ�����ϴ���༶������
		hsmap.put("2��", student_2);
		//����
		Set<String> hsmapset=hsmap.keySet();
		for(String hsmapsetkey : hsmapset){
			 HashMap<String, Integer> hsmapsetkeyvalue= hsmap.get(hsmapsetkey);
			 System.out.println(hsmapsetkey);
			 //����HashMap<String, Integer>=hsmapsetkeyvalue
			 Set<String>  hsmapsetkeyvalueset=hsmapsetkeyvalue.keySet();
			 for(String setkey :hsmapsetkeyvalueset){
				 Integer setkeybalue=hsmapsetkeyvalue.get(setkey);
				 System.out.println("\t"+setkey+"-----"+setkeybalue);
			 }
			 
		}

	}

}
