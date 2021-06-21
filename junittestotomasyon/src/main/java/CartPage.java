import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    By removeButton = By.cssSelector("a[title='Sil']");
    String controlCart;
    String getControlCart1;

    public void removeProduct() {
        controlCart = findElement(By.cssSelector("p[class='new-price']")).getText();
        click(removeButton);
        getControlCart1 = findElement(By.cssSelector("p[class='new-price']")).getText();
        Assert.assertNotSame("ürün sepetten silindi", getControlCart1, controlCart);


    }

    By selectDropDown = By.cssSelector("select[class='amount']");

    public void increaseOfProduct() {
        Select increaseOfProduct = new Select(findElement(selectDropDown));
        increaseOfProduct.selectByValue("2");
    }
}
