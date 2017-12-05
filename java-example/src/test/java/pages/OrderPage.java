package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBe;

public class OrderPage extends Page {
  public OrderPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public void openPage() {
    driver.findElement(By.linkText("Checkout »")).click();
    wait.until(elementToBeClickable(By.name("remove_cart_item")));

  }

  public void numberOfRows(List<WebElement> rows) {
    rows.size();
  }


  public List<WebElement> listOfElement() {
    WebElement table = driver.findElement(By.id("order_confirmation-wrapper"));
    return table.findElements(By.xpath(".//td[1][@style='text-align: center;']"));
  }

  public void remove() {
    driver.findElement(By.name("remove_cart_item")).click();
  }


  public void minusRow(int numberOfRows) {
    wait.until(numberOfElementsToBe(By.xpath(".//td[1][@style='text-align: center;']"), (numberOfRows - 1)));
  }
}
