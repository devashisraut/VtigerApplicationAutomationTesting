package UtilityFileVtigerApplication;

import java.util.Date;

public class JavaUtility {
	
	public String getSystemDate() {
		Date date1=new Date();
		String[] dateArray = date1.toString().split(" ");
		String date = dateArray[2];
		String month = dateArray[1];
		String year = dateArray[5];
		String time = dateArray[3];
		String currentTime=date+"-"+month+"-"+year+"/"+time;
		return currentTime;

	}
}
