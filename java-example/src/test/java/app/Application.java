package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.OrderPage;
import pages.ProductPage;
import pages.StorePage;

import java.util.List;

public class Application {


  private WebDriver driver;


  private StorePage storePage;
  private OrderPage orderPage;
  private ProductPage productPage;


  public Application() {
    driver = new ChromeDriver();
    storePage = new StorePage(driver);
    orderPage = new OrderPage(driver);
    productPage = new ProductPage(driver);
  }


  public void addProducts() {
    storePage.openPage();
    for (int i = 1; i < 4; i++) {
      List<WebElement> ducks = storePage.listOFDucks();
      String text = ducks.get(0).getText();
      ducks.get(0).click();
      productPage.sizeOptionYellowDuck(text);
      productPage.addProduct(i);
      productPage.backToStorePage();
    }
  }

  public void removeProducts() {
    orderPage.openPage();
    numberOfProducts();
    List<WebElement> rows = orderPage.listOfElement();
    int numberOfProducts = numberOfProducts();
    orderPage.numberOfRows(rows);
    removeProduct(numberOfProducts);
  }


  public void quit() {
    driver.quit();
  }


  public void removeProduct(int numberOfRows) {
    List<WebElement> rows;
    for (int i = 0; i <= numberOfRows; i++) {
      orderPage.remove();
      if (i != numberOfRows) {
        orderPage.minusRow(numberOfRows);
        rows = orderPage.listOfElement();
        orderPage.numberOfRows(rows);
      }
    }
  }


  public int numberOfProducts() {
    List<WebElement> rows = orderPage.listOfElement();
    orderPage.numberOfRows(rows);
    int numberOfProducts = 0;
    for (WebElement row : rows) {
      int numberInRow = Integer.parseInt(row.getText());
      numberOfProducts = (numberOfProducts + numberInRow);
    }
    return numberOfProducts;
  }

}

