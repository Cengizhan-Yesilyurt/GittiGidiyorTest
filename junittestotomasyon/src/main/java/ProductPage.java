
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By clickSearchBox = By.cssSelector("input[placeholder='Keşfetmeye Bak']");
    By findButton = By.cssSelector("button[data-cy='search-find-button']");
    String searchWords = "Bilgisayar";

    public void searchProduct() {
        sendKeys(clickSearchBox, searchWords);
        click(findButton);
    }

    By nextPageButton = By.cssSelector("li[class='next-link']");

    public void goToNextPage() {
        String controlTitle = driver.getCurrentUrl();
        System.out.println(controlTitle);
        click(nextPageButton);
        String controlTitle1 = driver.getCurrentUrl();
        System.out.println(controlTitle1);
        Assert.assertNotEquals("2.Sayfa açılmıştır", controlTitle, controlTitle1);
    }

    By elementsOfPage = By.cssSelector("[class*='image-container product-hslider-container']");

    public void selectProduct() {
        List<WebElement> listings = findElements(elementsOfPage);
        Random r = new Random();
        int randomValue = r.nextInt(listings.size());
        listings.get(randomValue).click();
    }
}
