//displays as day,date,month,time
package testoutput;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestOutputFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime today=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE,MM dd yyyy h:mm");
		String weekDay=formatter.format(today);
		System.out.println(weekDay);			
		DayOfWeek day=today.getDayOfWeek();
		System.out.println(day);

	}
}
