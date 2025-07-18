package seleniumtesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Finding total number of rows in web table
		List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total rows are: " +rowCount.size());
		
		// Finding total number of columns in web table
		List<WebElement> columnCount = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println("Total columns are: " +columnCount.size());

		for (int row = 1; row <= rowCount.size(); row++) {
			for (int column = 1; column <= columnCount.size(); column++) {

				System.out.print(driver
						.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + row + "]/td[" + column + "]"))
						.getText() + "----");
			}

			System.out.println();

		}

		System.out.println("Details has been printed successfully from web table !!");

	}

}
