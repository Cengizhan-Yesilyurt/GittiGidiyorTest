
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By enter = By.cssSelector("div[title='Giriş Yap']");
    By signInButton = By.cssSelector("a[data-cy='header-login-button']");
    By userNameField = By.id("L-UserNameField");
    By passwordField = By.id("L-PasswordField");
    By loginButton = By.cssSelector("input[id='gg-login-enter']");
    String userName = "cyesilyurt29@gmail.com";
    String password = "cengiz123.";

    public void login() {
        String matchUserName1 = findElement(By.cssSelector("div[class*='gekhq4-4']>span")).getText();
        gotoElement(driver, enter);
        click(signInButton);
        sendKeys(userNameField, userName);
        sendKeys(passwordField, password);
        click(loginButton);
        String matchUserName2 = findElement(By.cssSelector("div[class*='gekhq4-4']>span")).getText();
        Assert.assertNotSame("Login oldunuz", matchUserName1, matchUserName2);
    }

    By basketButton = By.cssSelector("a[class='dIB']");
    By goToBasketButton = By.cssSelector("a[class='gg-ui-btn-default padding-none']");

    public void gotoCart() {
        gotoElement(driver, basketButton);
        click(goToBasketButton);
    }
}
