package DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SetupDriver {
   public static WebDriver driver;
   public static ChromeOptions Coptions;
   public static EdgeOptions Eoptions;
   public static WebDriver chromedriver() {
	   WebDriverManager.chromedriver().setup();
	   Coptions= new ChromeOptions();
	   Coptions.addArguments("--start-maximized");
		Coptions.addArguments("disable-notifications");
		Coptions.addArguments("disable-popup-blocking");
		//options.addArguments("headless");
		Coptions.addArguments("disable-blink-features-AutomationControlled");
	   driver= new ChromeDriver(Coptions);
 
	   driver.get("https://www.shiksha.com/");
	   return driver;
   }
   
   
   public static WebDriver edgedriver() {
	   WebDriverManager.edgedriver().setup();
	   Eoptions= new EdgeOptions();
	   Eoptions.addArguments("--start-maximized");
	   
	 //driver = new EdgeDriver(Eoptions);
	   driver=new EdgeDriver(Eoptions);
	   driver.get("https://www.shiksha.com/");
	   return driver;
   }
}
