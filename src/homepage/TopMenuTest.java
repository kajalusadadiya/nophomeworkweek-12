package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyPageNavigation() {
           /* WebElement dropdown = driver.findElement(By.linkText("Computers "));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Desktops ");*/
            //List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        String expectedMessage = "Computers";
        String actualMessage = getTextElement(By.xpath("//a[normalize-space()='Computers']"));
        Assert.assertEquals("products page not displayed", expectedMessage, actualMessage);
                  /* System.out.println(alloptions.size());
                   for (WebElement option : alloptions){
                   if(option.getText().equalsIgnoreCase("Desktops ")){
                    option.click();
                     }}*/

    }

}





