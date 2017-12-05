package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page {


  public WebDriverWait wait;
  protected WebDriver driver;


  public Page(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }
}
