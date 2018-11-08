package com.luoExpress.assignment_15;

public class Q3 {
	public static void main(String[] args) {
		
	
	String[] arr={"010","3223","666","7890987","123123"};
	int count=0;
	for(int i=0;i<arr.length;i++){
		char[] ch=arr[i].toCharArray();
		for(int j=0;j<ch.length;j++){
		if(ch[j]==ch[ch.length-1-j]){
			continue;
		}else{
			break;
		}
		
	}
		count++;

} System.out.println(count);
}
}