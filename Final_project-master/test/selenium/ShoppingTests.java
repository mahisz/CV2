package selenium;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.dresses.DressesPage;

public class ShoppingTests extends SdaBaseTest {
    //isPossibleToCompareTwoProducts()
    //isRemovingOfItemPossibleFromShoppingCard()
    //isPossibleToOrderChoosenItems()
    private DressesPage dressesPage;

    @BeforeEach
    public void setup() {
        super.setup();
        dressesPage = new DressesPage(driver);
        dressesPage.visit();
    }

    @Test
    public void isSizeSFilterWorkFine() throws InterruptedException {
        dressesPage.setSizeFilter("S");
        Assert.assertTrue(driver.findElement(By.cssSelector("span.checked")).isDisplayed());
    }

    @Test
    public void isRemovingOfItemPossibleFromShoppingCard(){


    }
}
