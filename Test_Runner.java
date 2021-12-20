package com.Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Runner {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
Actions a= new Actions(driver);
a.moveToElement(signin);
a.click().build().perform();
WebElement mail = driver.findElement(By.name("email"));
a.moveToElement(mail);
a.click().build().perform();
mail.sendKeys("faketesting@gmail.com");
WebElement pass = driver.findElement(By.id("passwd"));
a.moveToElement(pass);
a.click().build().perform();
pass.sendKeys("12345678");
WebElement login = driver.findElement(By.id("SubmitLogin"));
a.moveToElement(login);
a.click().build().perform();
WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
a.moveToElement(tshirts);
a.click().build().perform();
WebElement end = driver.findElement(By.xpath("//a[text()='Sign out']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", end);
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,-1300)" );
WebElement img = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
a.click(img).build().perform();
Thread.sleep(5000);
WebElement addto = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
driver.switchTo().frame(addto);
Thread.sleep(5000);
WebElement click = driver.findElement(By.xpath("//button[@name='Submit']"));
a.moveToElement(click).build().perform();
a.click(click).build().perform();
WebDriverWait wait=new WebDriverWait(driver, 70); 
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
a.moveToElement(proceed).build().perform();
a.click(proceed).build().perform();
WebElement end1 = driver.findElement(By.xpath("//a[text()='Sign out']"));
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("arguments[0].scrollIntoView();", end1);
WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
a.moveToElement(cart).build().perform();
a.click(cart).build().perform();
WebElement end2 = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[5]/a"));
JavascriptExecutor j2=(JavascriptExecutor)driver;
j2.executeScript("arguments[0].scrollIntoView();", end2);
WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
a.moveToElement(cart2).build().perform();
a.click(cart2).build().perform();
WebElement end3 = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[5]/a"));
JavascriptExecutor j3=(JavascriptExecutor)driver;
j3.executeScript("arguments[0].scrollIntoView();", end3);
WebElement box = driver.findElement(By.id("cgv"));
a.moveToElement(box).build().perform();
a.click(box).build().perform();
WebElement cart3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
a.moveToElement(cart3).build().perform();
a.click(cart3).build().perform();
WebElement end4 = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[5]"));
JavascriptExecutor j4=(JavascriptExecutor)driver;
j4.executeScript("arguments[0].scrollIntoView();", end4);
WebElement pay = driver.findElement(By.xpath("//a[@class='cheque']"));
a.moveToElement(pay).build().perform();
a.click().build().perform();
WebElement end5 = driver.findElement(By.xpath("//a[text()='Sign out']"));
JavascriptExecutor j5=(JavascriptExecutor)driver;
j5.executeScript("arguments[0].scrollIntoView();", end5);
WebElement confrim = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
a.moveToElement(confrim).build().perform();
a.click().build().perform();
WebElement Theend = driver.findElement(By.xpath("//a[text()='Sign out']"));
JavascriptExecutor j6=(JavascriptExecutor)driver;
j6.executeScript("arguments[0].scrollIntoView();", Theend);
j6.executeScript("window.scrollBy(0,-500);");
Thread.sleep(5000);
TakesScreenshot s =(TakesScreenshot) driver;
File source = s.getScreenshotAs(OutputType.FILE);
ven_Project\\snaps\\snap.png");
FileUtils.copyFile(source, destination);
	
	}

}



