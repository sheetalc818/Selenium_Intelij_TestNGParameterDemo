import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1
{
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(500);
        driver.findElement(By.id("email")).sendKeys(myName);
        Thread.sleep(500);
        System.out.println("Parameterized value is : " + myName);
        driver.close();
    }
}
