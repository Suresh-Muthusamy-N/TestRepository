package LambdaExpressions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrintCurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("CurrentDate :"+ date);
		System.out.println("CurrentTime :"+ time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		System.out.println("CurrentDateTime :"+ dateTime);

	}

}
