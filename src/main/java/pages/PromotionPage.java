package pages;

import elements.Input;
import lombok.extern.log4j.Log4j2;
import objects.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class PromotionPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), 'Акции')]")
    WebElement promotionButton;
    @FindBy(xpath = "//*[@class= 'title']")
    WebElement firstProduct;
    @FindBy(xpath = "//*[contains(text(), 'В корзину')]")
    WebElement buttonInCart;
    @FindBy(className = "go-to-cart-link")
    WebElement buttonCart;
    @FindBy(id = "btnShowCheckoutForm")
    WebElement firstButtonMakingOrder;

    public PromotionPage(WebDriver driver) {
        super(driver);
    }

    public PromotionPage openMainPage(String url) {
        driver.get(url);
        return this;
    }

    public PromotionPage openPromotionPage() {
        promotionButton.click();
        return this;
    }

    public PromotionPage clickOnFirstProduct() {
        log.info("Click on first product");
        firstProduct.click();
        return this;
    }

    public PromotionPage clickOnButtonInCart() {
        buttonInCart.click();
        return this;
    }

    public PromotionPage clickButtonCart(){
        buttonCart.click();
        return this;
    }

    public PromotionPage clickFirstButtonMakingOrder() {
        firstButtonMakingOrder.click();
        return this;
    }

    public PromotionPage enterUserDataInCart(UserData userData) {
        new Input(driver, "fullname").write(userData.getFullName());
        new Input(driver, "phone-mask").write(userData.getPhone_mask());
        new Input(driver, "comment").write(userData.getComment());
        return this;
    }
}
