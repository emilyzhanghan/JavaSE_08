package com.luoExpress._18;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Mon");
		map.put("2", "Tues");
		map.get("1");
		//map.remove("1");
		System.out.print(map.keySet());
		System.out.print(map);
		
	}

}
