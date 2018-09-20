package com.studt.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Myjob {

	public void run() {
		System.out.println("任务执行了-------"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
	}
}
