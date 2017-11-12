import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Zadanie8 extends TestBase {
  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/en/");
    driver.findElement(By.linkText("Rubber Ducks")).click();
    WebElement products = driver.findElement(By.cssSelector("[class*=products]"));
    List<WebElement> listDucks = products.findElements(By.cssSelector("[class=image-wrapper]"));
    for (WebElement oneDuck : listDucks) {
      int sizeSticker = oneDuck.findElements(By.cssSelector("[class*=sticker]")).size();
      assertEquals(sizeSticker, 1);
    }
  }
}
