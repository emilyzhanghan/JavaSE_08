package com.luoExpress.assignment14;

public class Demo_Phone {
	public static void main(String[] args){
		new OldPhone().call();
        new OldPhone().sendMessage();
        new NewPhone().call();
        new NewPhone().sendMessage();
               
        new NewPhone(){
            public void PlayGame(){
                System.out.println("New phone is playing game");
            }
        }.PlayGame();
	}
	
}
