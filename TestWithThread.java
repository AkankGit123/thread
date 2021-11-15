package com.rays.thread;

public class TestWithThread {
	
	public static void main(String[] args) {
		HelloWithThread t1 = new HelloWithThread("Akanksha");
		HelloWithThread t2 = new HelloWithThread("Akank");
		
		t1.start();
		t2.start();
	}

}
