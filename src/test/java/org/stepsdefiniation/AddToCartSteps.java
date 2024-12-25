package org.stepsdefiniation;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;

import org.bass.Bassclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartSteps extends Bassclass {
	//git example check 
	//conformation check
	
	@Given("The user should be in flipkart mani page")
	public void the_user_should_be_in_flipkart_mani_page() {
		browserlaunch("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	 
	}

	@When("The user have to search a product{string} and enter into product page")
	public void the_user_have_to_search_a_product_and_enter_into_product_page(String product) {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(product,Keys.ENTER);
	}

	@When("The user have to select the product by clicking")
	public void the_user_have_to_select_the_product_by_clicking() throws InterruptedException {
	   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	   for (int i = 0; i <elements.size(); i++) {
		   WebElement webElement = elements.get(i);
		   System.out.println(webElement.getText());
		
	}
	   Thread.sleep(5000);
	   WebElement iphone = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]"));
	    iphone.click();
	    System.out.println(iphone.getText());
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> li=new ArrayList<String>();
	    li.addAll(windowHandles);
	    driver.switchTo().window(li.get(1));
	    Thread.sleep(2000);
	    
	}

	@Then("The user have to click add to cart bttn")
	public void the_user_have_to_click_add_to_cart_bttn() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}



}
