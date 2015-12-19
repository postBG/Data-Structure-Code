package test;

import java.util.HashMap;

public class ParseDoubleTest {

	public static void main(String[] args) {
		HashMap<String, Integer> Map=new HashMap<>();
		
		Map.put("a", 1);
		Map.put("a", 2);
		Map.put("a", 3);
		Map.put("b", 31);
		Map.put("c", 4);
		Map.put("d", 19);
		Map.put("e", 10);
		Map.put("f", 11);
		Map.put("g", 12);
		
		for(Integer value:Map.values()){
			System.out.println(value);
		}
	}

}
