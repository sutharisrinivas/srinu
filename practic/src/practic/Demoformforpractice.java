package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoformforpractice {

	public static void main(String[] args) {
		// launch site
		System.setProperty("webdriver.chrome.driver", "G:\\india\\chromedriver.exe");
		WebDriver demo=new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://www.toolsqa.com/");
		//
		WebDriverWait w=new WebDriverWait(demo,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='navigation']/ul/li[7]/a/span/span")));
		Actions a=new Actions(demo);
		WebElement e=demo.findElement(By.xpath("//*[//*[@class='navigation']/ul/li[7]/a/span/span"));
		a.moveToElement(e).build().perform();
		

	}

}
