package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StorePage extends Page {
  public StorePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }


  public void openPage() {
    driver.get("http://localhost:8090/litecart/en/");
  }

  public List<WebElement> listOFDucks() {
    return driver.findElements(By.className("name"));
  }

}