package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBe;

public class ProductPage extends Page {
  public ProductPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public void addProduct(int i) {
    driver.findElement(By.name("add_cart_product")).click();
    wait.until(textToBe(By.className("quantity"), String.valueOf(i)));
  }

  public void backToStorePage() {
    driver.findElement(By.id("logotype-wrapper")).click();
  }

  public void sizeOptionYellowDuck(String text) {
    if (text.equals("Yellow Duck")) {
      new Select(driver.findElement(By.name("options[Size]"))).selectByValue("Small");
    }
  }


}
