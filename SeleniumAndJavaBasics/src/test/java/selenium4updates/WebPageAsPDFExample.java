package selenium4updates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class WebPageAsPDFExample {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Printing webpage using print method
		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		
		//Proving path & OutputType for PDF using write() method
		Files.write(Paths.get("./screenshots/selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
		System.out.println("Webpage printed as PDF successfully !!");
	}
}
