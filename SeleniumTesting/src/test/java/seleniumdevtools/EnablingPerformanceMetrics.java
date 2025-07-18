package seleniumdevtools;

import java.util.List;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.performance.Performance;
import org.openqa.selenium.devtools.v124.performance.model.Metric;

public class EnablingPerformanceMetrics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Enabling Performance Metrics by using DevTools
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		
		devTool.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
		
		driver.get("https://www.selenium.dev/");
		
		List<Metric> metrics = devTool.send(Performance.getMetrics());
		metrics.forEach(metric ->System.out.println(metric.getName()+" = "+metric.getValue()));
		
		System.out.println("Performce metrics has been enabled successfully !!");
		
	}

}
