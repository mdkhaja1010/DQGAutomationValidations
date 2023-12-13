package com.global;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/* This class contains all the java specicfic methods
 * @Author Bhasha.k */
public class Java {
	/* This method will generate the system date and time
	 * @Param message */
	public String getSystemdate() {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		return timeStamp;
	}
	
	public int randomNumber()
	{
  
		Random rand=new Random();
		int randomInRange = rand.nextInt(100);
		return randomInRange;
	}
}
