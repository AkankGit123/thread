package com.rays.thread;

public class HelloWithThread extends Thread{

	private String name = null;
	
	public HelloWithThread(String ThreadName) {
		this.name = ThreadName;
	}
	
	public void run() {
		
		
		  for (int i = 0; i < 5; i++) { System.out.println(i +"Hello Thread  "+ name);
		  }
		 
	}

	
	
}
