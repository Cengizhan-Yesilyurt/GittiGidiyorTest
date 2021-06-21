import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class TestAddProductToCart extends BaseTest {

    HomePage homepage;
    ProductPage productpage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void login() {
        homepage = new HomePage(driver);
        homepage
                .login();

    }

    @Test
    @Order(2)
    public void searchProduct() {
        productpage = new ProductPage(driver);
        productpage
                .searchProduct();
    }

    @Test
    @Order(3)
    public void goToNextPage() {
        productpage = new ProductPage(driver);
        productpage
                .goToNextPage();

    }

    @Test
    @Order(4)
    public void searchARandomProduct() {
        productpage = new ProductPage(driver);
        productpage
                .selectProduct();
    }

    @Test
    @Order(5)
    public void addProductToCart() {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage
                .addToCart();


    }

    @Test
    @Order(6)
    public void goToCart() {
        homepage = new HomePage(driver);
        homepage
                .gotoCart();


    }

    @Test
    @Order(7)
    public void IncreasePieceOfProduct() {
        cartPage = new CartPage(driver);
        cartPage
                .increaseOfProduct();

    }

    @Test
    @Order(8)
    public void removeProductFromCart() {
        cartPage = new CartPage(driver);
        cartPage
                .removeProduct();
    }

}
