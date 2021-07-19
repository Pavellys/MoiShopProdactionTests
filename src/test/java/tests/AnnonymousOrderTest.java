package tests;

import org.testng.annotations.Test;
import test_data.TestData;

public class AnnonymousOrderTest extends BaseTest {
    TestData testData = new TestData();

    @Test
    public void makingOrderAnonymous(){
        promotionPage.openMainPage("https://moishop.by")
                .openPromotionPage()
                .clickOnFirstProduct()
                .clickOnButtonInCart()
                .clickButtonCart()
                .clickFirstButtonMakingOrder()
                .enterUserDataInCart(testData.getUserData());
    }
}
