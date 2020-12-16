package selenium;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends SdaBaseTest {
    private MainPage mainPage;
    @BeforeEach
    public void setup() {
        super.setup();
        mainPage = new MainPage(driver);
        mainPage.visit();
    }
    @Test
    public void doesMenMenuOptionExists() {
        Assertions.assertTrue(false, "This functionality is not implemented yet");
    }
   /* @Test
    public void isRemovingOfItemPossibleFromShoppingCard(){
        //#center_column #homefeatured > li a[title="Faded Short Sleeve T-shirts"] hover
        mainPage.hover(MainPage.shortPlaceholder);
        //#homefeatured .right-block .button-container a[data-id-product="1"] click
        mainPage.click(MainPage.addToCardButton);
        //.layer_cart_cart .button-medium click
        mainPage.click(MainPage.checkoutOrderButton);
        //.icon-trash click
        mainPage.click(MainPage.trashButton);
        //.alert-warning (visible + text validation)
    }*/

    @Test
    public void isRemovingOfItemPossibleFromShoppingCardVar2(){
        mainPage.hoverDressPlaceholder();
        mainPage.clickAddToCard();
        mainPage.clickCheckoutOrder();
        mainPage.removeElementFromCard();
        mainPage.waitForRemovingShoppingList();
        Assertions.assertTrue(mainPage.isAlertVisible(),"Alert powinien być widoczny, ale nie jest");
        Assertions.assertEquals("Your shopping cart is empty.", mainPage.getAlertText(), "HAHAHAHAHAHAHAH text w Alercie nie jest równy zakładanemu.");
        //.alert-warning (visible + text validation)
    }
    // doAllMenuOptionsExists()
    // isTheContentOfWomenSubMenuOK()
    // isTheContentOfDressesSubMenuOK()
    // isTheContentOfTshirtsSubMenuOK()
    // areAll23AdverbsVisible()
    //addToCartItemsFromMainPage()
    //isNewsletterWorking()
    //doesSearchWorkWithCorrectData()
}



    // doAllMenuOptionsExists()
    // isTheContentOfWomenSubMenuOK()
    // isTheContentOfDressesSubMenuOK()
    // isTheContentOfTshirtsSubMenuOK()
    // areAll23AdverbsVisible()

    //addToCartItemsFromMainPage()
    //isNewsletterWorking()

    //doesSearchWorkWithCorrectData()


