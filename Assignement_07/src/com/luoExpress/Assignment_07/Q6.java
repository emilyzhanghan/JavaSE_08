package com.luoExpress.Assignment_07;

import java.util.ArrayList;

public class Q6 {
	public static void main(String[] args) {
	Phone xiaomi = new Phone();
	Phone huawei = new Phone();
	Phone leshi = new Phone();
	Phone qiku = new Phone();
	ArrayList<Phone> arrayList = new ArrayList<Phone>();
	arrayList.add(xiaomi);
	arrayList.add(huawei);
	arrayList.add(leshi);
	arrayList.add(qiku);
	
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i).brand + " "
				+ arrayList.get(i).price + "" + arrayList.get(i).color);

}

}
}
