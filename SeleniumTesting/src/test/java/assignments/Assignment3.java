package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 3
// Navigate to "https://timesofindia.indiatimes.com/poll.cms"
// Handle the text from Re-captcha
// Add numbers(It can be any number)
// Handle operators(It can be +, -, *)

public class Assignment3 {
	
	static int firstNumber =0;
	static int secondNumber =0;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String equation = driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
		System.out.println("Equation to automate is: "+equation);
		
		int firstIndex = equation.indexOf('+');
		int lastIndex = equation.lastIndexOf('=');
		
		String num1 = equation.substring(0, firstIndex).trim();
		firstNumber = Integer.parseInt(num1);
		
		System.out.println("First integer of the equation is: "+firstNumber);
		
		String num2 = equation.substring(firstIndex+1, lastIndex).trim();
		secondNumber = Integer.parseInt(num2);
		
		System.out.println("Second integer of the equation is: "+secondNumber);
		
		int sum =(firstNumber + secondNumber);
		
		System.out.println("Sum & Answer of the equation is: "+sum);
		
		driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(String.valueOf(sum));
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[4]/td/div")).click();
		driver.quit();
		
		System.out.println("Equation captcha has been automated successfully !!");

	}

}
