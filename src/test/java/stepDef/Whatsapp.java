package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Whatsapp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://web.whatsapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"side\"]/div[1]/div/div[2]/div[2]/div/div/p")));
        search.click();
        search.sendKeys("JPRB Sanatani");
        WebElement person = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='gridcell']//span[contains(text(), 'JPRB Sanatani')]/parent::*")));
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='gridcell']//span[contains(text(), 'JPRB Sanatani')]/parent::*"));
        elements.forEach((temp) -> {
            if (temp.getText().equals("JPRB Sanatani"))
                temp.click();
        });

        WebElement chatBox ;
        for (int i = 0; i < 100; i++) {
            chatBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")));
            chatBox.click();
            chatBox.sendKeys("Mera paisa wapas karo!");
            driver.findElement(By.xpath("//span[@data-icon=\"send\"]")).click();
//            Thread.sleep(15000);
        }

    }
}
