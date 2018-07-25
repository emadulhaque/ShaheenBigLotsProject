import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BigLotsTest 
{
	WebDriver driver;
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.biglots.com/");
		driver.navigate().refresh();
		driver.manage().window();
		
		
	}
}
