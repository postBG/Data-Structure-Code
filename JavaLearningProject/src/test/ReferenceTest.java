package test;

import java.util.Hashtable;

public class ReferenceTest {

	public static void main(String[] args) {
		Hashtable<String, String> HT=new Hashtable<>();
		
		HT.put("�ҿ��", "115");
		HT.put("�ҿ�", "116");
		HT.put("�һ�", "117");
		HT.put("���", "118");
		HT.put("��", "119");
		HT.put("��", "119");
		
		System.out.println(HT.get("��"));
		System.out.println(HT.get("��"));
	}

}
