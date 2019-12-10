/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2ppl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Abyan
 */
public class Kuis2PPL {

    /**
     * @param args the command line arguments
     */
     private static WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", 
                "D:\\Book JTI\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/index.php?module=Users&action=DetailView&record=1&layout_tab=Integration");
        
        WebElement user_name = driver.findElement(By.name("user_name"));
        user_name.sendKeys("admin");
        user_name.sendKeys(Keys.TAB);
        WebElement user_password = driver.findElement(By.name("user_password"));
        user_password.sendKeys("admin");
        user_password.sendKeys(Keys.ENTER);
        
        Thread.sleep(15000);
        
        driver.findElement(By.className("default-avatar")).click();
    }
    
}
