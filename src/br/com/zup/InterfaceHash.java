package br.com.zup;

import java.util.HashMap;
import java.util.Map;

public class InterfaceHash {

	public static void main(String[] args) {
		Map<String, Integer> hasMap = new HashMap<String, Integer>();
		hasMap.put("Segunda- feira ", 100 );
		hasMap.put("Terça-feira ", 179);
		System.out.println(hasMap.containsKey("Segunda-Feira"));
		hasMap.replace("Segunda-Feira", 100, 400);
		System.out.println(hasMap.values());
	}

}
