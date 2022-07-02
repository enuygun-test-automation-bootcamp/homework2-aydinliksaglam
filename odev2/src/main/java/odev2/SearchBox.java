package odev2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");


        //SearchBox'ın görüntülenip görüntülenmediğini doğrulamak için isDisplayed() yöntemi kullanıldı.

        //isDisplayed() kullanarak SearchBox'ı doğrulama
        WebElement searchBoxElement = driver.findElement(By.id("searchBox"));
        boolean isDisplayed = searchBoxElement.isDisplayed();

        // element görüntülendiğinde tıklama işlemini gerçekleştirir.
        if (isDisplayed) {
            searchBoxElement.click();
        }

    }
}
