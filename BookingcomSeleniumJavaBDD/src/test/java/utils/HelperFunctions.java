package utils;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelperFunctions {
	
	public static String returnDateRelativeToCurrentDate(int numberOfDays){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, numberOfDays);
		Date todayDate = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(todayDate);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnDateRelativeToCurrentDate(30));
		
	}

}
