import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CTL+I to indentation 
		System.out.println("firt program");
//		WebDriver is an interface and we will implement the methods of WebDriver	
		System.setProperty("webdriver.chrome.driver", "C:\\Jar files\\Chrome Browser\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
/*			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
			//System.out.println(driver.getPageSource());
			driver.get("https://flipkart.com");
			System.out.println(driver.getTitle());
			driver.navigate().back();

			System.out.println(driver.getTitle());
			driver.close();
			*/
		
		driver.get("http://www.facebook.com");
		Locators loc= new Locators();
		//loc.EmailTextBox("pallavsidana", "pallav10");
		loc.EmailTextBox(driver);
	}	

}
