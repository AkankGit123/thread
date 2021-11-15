package com.rays.thread;

public class ThreadInfo {
	public static void main(String[] args) {
		Thread t = new Thread("My Thread");
		log(t);
		
	}
	public static void log(Thread t)	{
		
		System.out.println( "name is :" + t.getName());
		System.out.println( "id id :" + t.getId());
		System.out.println("Priority is :" + t.getPriority());
		System.out.println("State is :"+ t.getState());
		System.out.println("Thread Group is :" + t.getThreadGroup().getName());
		System.out.println("Is alive :" + t.isAlive());
		System.out.println("Is deamon :" + t.isDaemon());
	}
	
	public static void info(ThreadGroup tg) {
		int trCount = tg.activeCount();
		Thread[] tr = new Thread[trCount];
		tg.enumerate(tr);
	System.out.println("Thread Group name is:" + tg.getName());
	System.out.println("Is Deamon : " + tg.isDaemon());
	for (int i = 0; i < tr.length; i++) {
		log(tr[i]);
	}
	int groupCount = tg.activeGroupCount();
	ThreadGroup[] grp = new ThreadGroup[]
	}
}
