import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class magneto {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(" https://magento.softwaretestingboard.com/");
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page url is: " + driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement createAccount = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
        createAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        WebElement firstName = driver.findElement(By.xpath("//input[@id='email']"));
        firstName.click();
        firstName.sendKeys("Alman");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
        lastName.click();
        lastName.sendKeys("Momin");

        WebElement EmailId = driver.findElement(By.xpath("//input[@id='email_address']"));
       EmailId.click();
       EmailId.sendKeys("alman.momin94@gmail.com");

        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.click();
       Password.sendKeys("Alman@123");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
       confirmPassword.click();
        confirmPassword.sendKeys("Alman@123");

        WebElement createaccount = driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]"));
       createaccount.click();

        WebElement signEmailId = driver.findElement(By.xpath("//input[@id='email']"));
        signEmailId.click();
        EmailId.sendKeys("alman.momin94@gmail.com");
        WebElement signPassword = driver.findElement(By.xpath("//input[@id='password']"));
        signPassword.click();
        Password.sendKeys("Alman@123");

        WebElement signButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
        signButton.click();
    }}