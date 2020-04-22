import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	
	//WebDriver driver;
	public void EmailTextBox(WebDriver driver) {
		driver.findElement(By.id("email")).sendKeys("pallavsidana");
		driver.findElement(By.name("pass")).sendKeys("pallav10");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("hello");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}
	
}
