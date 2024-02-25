package updated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class separated {
	
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipa\\eclipse-workspace\\testbrowser\\drivers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.setBinary("C:\\Users\\saipa\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://omayo.blogspot.com/");
		
		
		
		
		
	}

}
