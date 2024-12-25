package org.stepsdefiniation;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep extends Bassclass {


@Given("The user should be in facebook login page")
public void the_user_should_be_in_facebook_login_page() {
	browserlaunch("chrome");
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("the user have to enter the username and password")
public void the_user_have_to_enter_the_username_and_password(io.cucumber.datatable.DataTable data) throws InterruptedException {
   // 1 Dimensional list or 1 Dimensional Without header
	
	List<String> l = data.asList();
	WebElement element = driver.findElement(By.id("email"));
	sendkeys(element, l.get(0));
	WebElement element2 = driver.findElement(By.id("pass"));
	sendkeys(element2, l.get(1));
	sleep(2);
	driver.quit();
}

@When("agin The user have to enter user and pass")
public void agin_The_user_have_to_enter_user_and_pass(io.cucumber.datatable.DataTable data) {
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
 //2 Dimensional list or 2 Dimensional Without header
	
	List<List<String>> li = data.asLists();
	List<String> l = li.get(2);
	WebElement element = driver.findElement(By.id("email"));
	sendkeys(element, l.get(0));
	WebElement element2 = driver.findElement(By.id("pass"));
	sendkeys(element2, l.get(1));
	driver.quit();
	
	
  
}

@Then("agin the user have to enter the username and password")
public void agin_the_user_have_to_enter_the_username_and_password(io.cucumber.datatable.DataTable data) {
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//1 Dimensional with header
	
	Map<String, String> mp = data.asMap(String.class,String.class);
	
	String string = mp.get("username");
	WebElement element = driver.findElement(By.id("email"));
	sendkeys(element, string);
	
	String string2 = mp.get("password");
	WebElement element2 = driver.findElement(By.id("pass"));
	sendkeys(element2, string2);
	driver.quit();
	
}
@Then("agin user have to enter the username and password  maps")
public void agin_user_have_to_enter_the_username_and_password_maps(io.cucumber.datatable.DataTable data) {
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//2 Dimensional with header
	
	List<Map<String, String>> mp = data.asMaps();
	
	Map<String, String> map = mp.get(2);
	
	String string = map.get("username");
	WebElement element = driver.findElement(By.id("email"));
	sendkeys(element, string);
	
	String string2 = map.get("password");
	WebElement element2 = driver.findElement(By.id("pass"));
	sendkeys(element2, string2);
	
	
	
	
	
	

}
}
