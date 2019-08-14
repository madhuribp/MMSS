package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Madhuri/Desktop/htmls/links.html");
List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
int count=alllinks.size();
System.out.println(count);
driver.close();





	}
}
