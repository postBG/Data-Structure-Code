package test;

import java.util.Hashtable;

public class ReferenceTest {

	public static void main(String[] args) {
		Hashtable<String, String> HT=new Hashtable<>();
		
		HT.put("소요산", "115");
		HT.put("소요", "116");
		HT.put("소산", "117");
		HT.put("요산", "118");
		HT.put("소", "119");
		HT.put("ㅅ", "119");
		
		System.out.println(HT.get("소"));
		System.out.println(HT.get("ㅅ"));
	}

}
