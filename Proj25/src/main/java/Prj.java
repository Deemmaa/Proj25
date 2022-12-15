import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prj {
    WebDriver driver;

    public Prj() {
        System.setProperty("webdriver.chrome.driver", "\\Users\\Dema\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        this.driver= new ChromeDriver();
    }
    public WebElement getElement (String Selector){
        WebElement element= this.driver
                .findElement(By.cssSelector(Selector));
        return element;

}
}
