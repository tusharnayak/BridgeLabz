package com.Bridgelabz.Logical;

public class StopWatch {
	long startTimer=0;
	long stopTimer=0;
	long elapsed;
	
	
	public void start()//to start the timing
	{
		startTimer=System.currentTimeMillis();
		System.out.println("start timing is: "+startTimer);
	}
	public void stop()//to stop the timing
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("stop timing is: "+stopTimer);
	}
	public long getElapsedTime()//to get the difference
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		Utility u=new Utility();
		System.out.println("press 1 to start");
		u.inputInteger();
		sw.start();
		System.out.println();
		
		System.out.println("press 2 to stop");
		u.inputInteger();
		sw.stop();
		
		long l=sw.getElapsedTime();
		System.out.println("total time elapsed="+l);
		System.out.println("converting milliSecond to second "+l/1000+" sec");
		
	}

}
