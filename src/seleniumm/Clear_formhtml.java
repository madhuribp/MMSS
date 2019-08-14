package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_formhtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Madhuri/Desktop/htmls/form.html");
WebElement s=driver.findElement(By.id("fm"));

s.sendKeys("HIIIIIII");
//By clear method
Thread.sleep(8000);
s.clear();
// by using sendkeys
s.sendKeys("Hjjjijijijijij");
Thread.sleep(8000);
s.sendKeys(Keys.CLEAR);
System.out.println("HIII");
//by using sendkeys control

/*s.sendKeys("okokokokok");
Thread.sleep(4000);
s.sendKeys(Keys.CONTROL+"a");
s.sendKeys(Keys.BACK_SPACE);
*/
driver.findElement(By.id("\n")).click();
driver.close();

	}
}