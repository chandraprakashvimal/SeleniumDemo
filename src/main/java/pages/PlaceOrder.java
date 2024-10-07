package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrder {
	
	private WebDriver driver;
	
	private By loginBtn = By.xpath("//a[@id='login2']");
	private By userName = By.xpath("//input[@id='loginusername']");
	private By password = By.xpath("//input[@id='loginpassword']");
	private By login = By.xpath("//button[text()='Log in']");
	private By samsungGalaxyS6 = By.xpath("//a[text()='Samsung galaxy s6']");
	private By addToCart = By.xpath("//a[text()='Add to cart']");
	private By placeOrder = By.xpath("//button[text()='Place Order']");
	private By name = By.xpath("//input[@id='name']");
	private By country = By.xpath("//input[@id='country']");
	private By city = By.xpath("//input[@id='city']");
	private By card = By.xpath("//input[@id='card']");
	private By month = By.xpath("//input[@id='month']");
	private By year = By.xpath("//input[@id='year']");
	private By purchase = By.xpath("//button[text()='Purchase']");
	private By id = By.xpath("//p[@class='lead text-muted ']");
	private By cart = By.xpath("//a[text()='Cart']");
	
	public void setUp() {
//		System.setProperty("webDriver.chrome.driver", "C:/Users/vikashsingh/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.demoblaze.com/index.html");
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	public void loginToApp(String user, String pass) {
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
	
	public void selectSGalaxy() {
		try {
		driver.findElement(samsungGalaxyS6).click();
		}
		catch(StaleElementReferenceException e){
			driver.navigate().refresh();
			driver.findElement(samsungGalaxyS6).click();
		}
	}
	
	public void addPhoneToCart() {
		driver.findElement(addToCart).click();
	}
	public void goToCartAndPlaceOrder() {
		driver.findElement(cart).click();
		driver.findElement(placeOrder).click();
	}
	
	public void enterDetails() {
		driver.findElement(name).sendKeys("abcd");
		driver.findElement(country).sendKeys("usa");
		driver.findElement(city).sendKeys("altanta");
		driver.findElement(card).sendKeys("6574765");
		driver.findElement(month).sendKeys("12");
		driver.findElement(year).sendKeys("2023");
		
	}
	
	public void clickOnPurchase() {
		driver.findElement(purchase).click();
	}
	
	public void printPurchaseId() {
		String purchaseid =driver.findElement(id).getText().substring(4, 11);
		System.out.println("purchase id is: " +purchaseid);
		driver.quit();
	}
}
