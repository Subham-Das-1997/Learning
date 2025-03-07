package Assignments;
public class Assignment21 
{
	public static void main(String[] args) {
        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = 1;
        int month = 1;
        int dayCounter = 0;
        
        for (int i = 0; i < daysInMonth.length; i++) {
            for (int day = 1; day <= daysInMonth[i]; day++) {
                System.out.println(dayOfYear + " - Month " + month);
                dayOfYear++;
                dayCounter++;
                
                if (dayCounter == daysInMonth[i]) {
                    month++;
                    dayCounter = 0;
                }
            }
        }
    }
}