package firstprojct;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupPageSpecial {

	WebDriver driver = new ChromeDriver();

	String TheWebsite = "https://automationexercise.com/";

	String theSignupPage = "https://automationexercise.com/signup";

	Random rand = new Random();
	
	String publicEmail ; 
	
	

	@BeforeTest

	public void mySetup() {

		driver.get(TheWebsite);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test(priority = 1, invocationCount = 3)

	public void signup() throws InterruptedException {

		String[] USERNAMES = { "LAYAN", "ZAINA", "MAHDI", "NISREEN", "ABDUALLAH", "MUTHANA", "MOHAMMAD" }; // static
																											// array

		int randomUserIndex = rand.nextInt(USERNAMES.length);

		int myRandomNumberForTheEmail = rand.nextInt(5477110);
		
		
		

		String email = USERNAMES[randomUserIndex] + myRandomNumberForTheEmail + "@gmail.com";
		
		
		
		publicEmail=email ; 

		driver.navigate().to(theSignupPage);

//		System.out.println(email);

		WebElement NameSignUp = driver.findElement(By.xpath("//input[@placeholder='Name']"));

		WebElement EmailSignUp = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

		NameSignUp.sendKeys("ahmad");

		EmailSignUp.sendKeys(email);

		WebElement SignupButton = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));

		SignupButton.click();

		Thread.sleep(4000);

	}
	
	@Test (priority = 2,invocationCount = 3)
	
	public void login(){
		
		driver.navigate().to("https://automationexercise.com/login");
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(publicEmail); 
	}

	@AfterTest

	public void AfterMyTest() {
	}

}

