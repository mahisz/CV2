package pages.dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DressesPage extends BasePage {
    // PageFactory HOMEWORK
    private static final String CASUAL_DRESS_URL = "http://automationpractice.com/index.php?id_category=9&controller=category";

    private By leftBlock = new By.ByCssSelector(".block#layered_block_left");
    // relative selectors
    private By sSize = new By.ById("uniform-layered_id_attribute_group_1");
    private By mSize = new By.ById("uniform-layered_id_attribute_group_2");
    private By lSize = new By.ById("uniform-layered_id_attribute_group_3");

    private By sortByDropdown = new By.ById("selectProductSort");
    private By topCompareBtnPlaceholder = new By.ByCssSelector("div.top-pagination-content");

    public DressesPage(WebDriver driver) {
        super(driver, CASUAL_DRESS_URL);
    }

    /**
     * @param size - always better to put there enum type instead of String!!!
     */
    public void setSizeFilter(String size) {
        final WebElement filtersList = find(leftBlock).findElement(new By.ById("ul_layered_id_attribute_group_1"));
        WebElement chosenSizeFilter = null;
        if (size.equals("S")) {
            chosenSizeFilter = filtersList.findElement(sSize);
        } else if (size.equals("M")) {
            chosenSizeFilter = filtersList.findElement(mSize);
        } else if (size.equals("L")) {
            chosenSizeFilter = filtersList.findElement(lSize);
        }
        chosenSizeFilter.click();
    }

}
