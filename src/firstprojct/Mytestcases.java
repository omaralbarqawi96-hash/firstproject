package firstprojct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {

	String myWebsite = "https://www.saucedemo.com/";
	WebDriver driver= new EdgeDriver();
	
	String userName = "standard_user";
	
	String password = "secret_sauce";
	
	@BeforeTest
	public void mySetUp() {
		
		driver.get(myWebsite);
		
		driver.manage().window().maximize();
		
		
		
		
		
	}
	
	
	
	@Test
    public void login() {
		
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		
		
	}
	
	
	//	WebDriver driver = new EdgeDriver();

	String TheWebsite = "https://www.saucedemo.com/";

	String TheWebsite2 = "https://www.google.com";

	String theUserName = "standard_user";

	String thePassword = "secret_sauce";
	
	
	String firstname = "ahmad";
	String lastname = "ali";
	String postalCode = "1980";

	@BeforeTest

	public void mySetup() throws InterruptedException {

		driver.get(TheWebsite);

		driver.manage().window().maximize();

//		driver.navigate().to(TheWebsite2);
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();

		// raghad

		// el yom shrbet segara
//		
//		driver.navigate().refresh();

	}

	@Test(priority = 1)
	public void Login() {

		// elements
		WebElement userNameInputField = driver.findElement(By.id("user-name"));

		WebElement PasswordInputField = driver.findElement(By.id("password"));

		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

		// actions
		userNameInputField.sendKeys(theUserName);

		PasswordInputField.sendKeys(thePassword);

		LoginButton.click();

		
		
	}

	@Test(priority = 2)

	public void AddNewItemToTheCart() {

		WebElement AddBackPackToThecart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

		AddBackPackToThecart.click();

	}
	
	@Test(priority = 3)
	
	public void CheckOut() {
		
		//driver.navigate().to("https://www.saucedemo.com/cart.html");
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
		
		WebElement Checkoutbutton = driver.findElement(By.id("checkout"));
		
		Checkoutbutton.click(); 
		
		
		//Elements
		WebElement FirstNameInputField = driver.findElement(By.id("first-name"));
		WebElement LastNameInputField = driver.findElement(By.id("last-name"));
		WebElement PostalNumberInputField = driver.findElement(By.id("postal-code"));
		
		// Actions 
		
		FirstNameInputField.sendKeys(firstname);
		LastNameInputField.sendKeys(lastname);
		PostalNumberInputField.sendKeys(postalCode);
		
		
		WebElement CountinueButton = driver.findElement(By.id("continue"));
		
		CountinueButton.click();
		
		WebElement FinishButton = driver.findElement(By.id("finish"));
		
		FinishButton.click();

	}

	@AfterTest
	public void AfterFinishingTheTest() {
	}

	
	
	
	@AfterTest
    public void AfterMyTest() {
		//driver.close();
		}
	}
	
