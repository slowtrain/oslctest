package com.cafelivro.etc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import java.io.*;


public class DeleteLog extends TimerTask{
	private static String dir;
	private static int month;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Calendar cal=Calendar.getInstance();
			cal.add(Calendar.MONTH,month);
			String logname=new String(format.format(cal.getTime())+".log");
			System.out.println("=================== Log File Name "+logname);
			File file = new File(dir+"\\"+logname);
			boolean bool=file.exists();
			System.out.println(bool);
			if(bool){
				file.delete();
				System.out.println(format.format(new Date())+" delete logfile completed");
			}
		}catch(Exception e){
			System.out.println("Error while delete logfile");
		}

	}
	
	
	public static void main(String[] args){
		if(args.length!=3){
			System.out.println("============== EXIT SYSTEM");
			return;
		}
		
		dir=args[0].substring(2);
		long time=new Long(args[1].substring(2));
		month=new Integer(args[2].substring(2));
		
		TimerTask deletelog = new DeleteLog();		
		Timer timer = new Timer();
		timer.schedule(deletelog,0,time);
			
	}
	
	
}
