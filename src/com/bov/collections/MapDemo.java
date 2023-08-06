package com.bov.collections;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(121, "madhu");
		hm.put(101,  "vasu");
		hm.put(45, "ravi");
		hm.put(454, "hindu");
		hm.put(55,  "ailuuuu");
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(12132));
		System.out.println(hm.containsValue("test"));
		System.out.println(hm.clone());
		hm.clear();
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		
		
	}

}
