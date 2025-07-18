package seleniumjquerycalenders;

import java.time.Duration;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDatePicker {

	static int targetDay=0,
			          targetMonth=0,
			          targetYear=0;
	
	static int currentDay=0,
			          currentMonth=0,
			          currentYear=0;
	
	static boolean incrementor =false;

	
	static int numberOfMonthsToJump=0;
	
	static String dateToSet = "10/12/2024";
	
    public static void getCurrentDayMonthYear() {
		
		Calendar cal = Calendar.getInstance();
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
		
	}
	
	public static void getTargetDayMonthYear(String dateToSet) {
		
		int firstIndex = dateToSet.indexOf("/");
		int lastIndex = dateToSet.lastIndexOf("/");
		
		String day = dateToSet.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);
		
		String month = dateToSet.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		String year = dateToSet.substring(lastIndex+1, dateToSet.length());
		targetYear = Integer.parseInt(year);
		
	}
	
    public static void getNoOfMothsToJump() {
		
    	if((targetMonth-currentMonth)>0){
    		
    		numberOfMonthsToJump = (targetMonth - currentMonth);
    		incrementor = true;
    		
    	}else {
    		
    		numberOfMonthsToJump = (currentMonth - targetMonth);
    	}	
		
	}
	
	public static void main(String[] args) {

		// Printing Current Day, Month & Year by calling getCurrentDayMonthYear() Method 
		getCurrentDayMonthYear();
		System.out.println("Current date is: "+currentDay+"   "+currentMonth+"   "+currentYear);
		
		// Printing Target Day, Month & Year by calling getTargetDayMonthYear() Method 
		getTargetDayMonthYear("10/12/2024");
		System.out.println("Target date is: "+targetDay+"   "+targetMonth+"   "+targetYear);
		
		// Printing Number of Months to Jumps off by calling getNoOfMothsToJump() Method
		getNoOfMothsToJump();
		System.out.println("Number of months to Jump off: "+numberOfMonthsToJump);
		System.out.println("Incrementor value: "+incrementor);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		for(int i=1; i<=numberOfMonthsToJump; i++) {
			
			if(incrementor) {
				
				driver.findElement(By.xpath("//a[contains(@class, 'ui-datepicker-next ui-corner-all')]")).click();
				
			}else {
			
				driver.findElement(By.xpath("//a[contains(@class, 'ui-datepicker-prev ui-corner-all')]")).click();
			
			}
		}	
		
		driver.findElement(By.linkText("10")).click();
		
		System.out.println("Date has been selected from calendar successfully !!");
		
	}

}
