package AmazonSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Anjali\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement username= driver.findElement(By.id("ap_email"));
		username.sendKeys("8109782217");
		driver.findElement(By.xpath("//input[@id='continue'and @type='submit']")).click();
		WebElement password= driver.findElement(By.id("ap_password"));
		password.sendKeys("Mnbvcxz654@");
		driver.findElement(By.xpath("//input[@id='signInSubmit'and @type='submit']")).click();
		
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("philips straightening brush");
		search.submit();
		driver.findElement(By.linkText("BHH880 StyleCare Essential Heated Brush")).click();
		
		
		WebElement addToCard= driver.findElement(By.id("mbc-buybutton-addtocart-1"));
		addToCard.click();
		Thread.sleep(3000);
		WebElement viewCard= driver.findElement(By.id("nav-cart-count"));
		viewCard.click();
		WebElement checkout= driver.findElement(By.name("proceedToRetailCheckout"));
		checkout.click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement search1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search1.sendKeys("earbuds");
		search1.submit();
		driver.findElement(By.linkText("SAMSUNG Galaxy Buds Pro 2 [2022] (SM-R510) - (Gray)")).click();
		WebElement wishlist= driver.findElement(By.id("add-to-wishlist-button-submit"));
		wishlist.click();
		Thread.sleep(3000);
		
		WebElement viewWishList= driver.findElement(By.linkText("View Your List"));
		viewWishList.click();
		Thread.sleep(2000);

		
		WebElement orderHistory= driver.findElement(By.id("nav-orders"));
		orderHistory.click();
		
	}

}
