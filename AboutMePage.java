import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
public class AboutMePage {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\getting statrted selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaaboutme.ccbp.tech");
        WebElement factsubheading = driver.findElement(By.cssSelector("h1[class = 'about-me-section-sub-heading mb-3']"));
        String actualtext = factsubheading.getText();
        String expecttext = "Facts";
        if(actualtext.equals(expecttext)){
            System.out.println("Sub-heading is as expected");
        }
        else{
            System.out.println("Mismatch found in sub-heading");
        }
        WebElement mainheading = driver.findElement(By.cssSelector("h1[class = 'about-me-section-sub-heading mb-3'] +h1"));
        String actualtext1 = mainheading.getText();
        String expecttext1 = "About me";
        if(actualtext1.equals(expecttext1)){
            System.out.println("Main-heading is as expected");
        }
        else{
            System.out.println("Mismatch found in Main-heading");
        }
        List<WebElement> skillstitles = driver.findElements(By.cssSelector("div[class ^= 'skills'] h1[class *= 'skills-card-title']"));
        for(WebElement text : skillstitles){
            System.out.println(text.getText());
        }
        driver.quit();
    }
}
