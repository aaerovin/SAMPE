import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstday {

	public static void main(String[] args) throws AWTException, InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='1']"));
		List<WebElement> list = table.findElements(By.tagName("tr"));
//		for (int i = 0; i < list.size(); i++) {
			WebElement data = list.get(3);
			System.out.println(data.getText());
			
		table.findElements(By.tagName("td"));
			WebElement data1 = list.get(3);
			System.out.println(data1.getText());
	
	}
	}
		
		
		


