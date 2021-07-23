import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seconday {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		
		driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("aaerovin");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("89@vinoth");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//img[@class='gb_Ca gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
			}

}
