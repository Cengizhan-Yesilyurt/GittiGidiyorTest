import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By addToBasketButton = By.cssSelector("[id='add-to-basket']");
    String priceOfProduct1;
    String priceOfProduct;

    public void addToCart() {
        priceOfProduct = findElement(By.cssSelector("div[id='sp-price-lowPrice']")).getText();
        WebElement element1 = findElement(By.cssSelector("div[class='policy-alert-v2-close policy-alert-v2-close-action']"));
        click(element1);
        WebElement elementAddBasketButton = findElement(addToBasketButton);
        elementAddBasketButton.isDisplayed();
        elementAddBasketButton.click();
        priceOfProduct1 = findElement(By.cssSelector("span[class='product-new-price']")).getText();
        Assert.assertEquals("Sepeteki ve listeki fiyatları aynıdır", priceOfProduct, priceOfProduct1);
    }

}
