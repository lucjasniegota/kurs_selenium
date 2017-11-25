import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;


public class Zadanie14 extends TestBase {

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/admin/?app=countries&doc=countries");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.linkText("Add New Country")).click();


    WebElement table = driver.findElement(By.id("content"));
    List<WebElement> rows = table.findElements(By.tagName("td"));


    rows.get(1).findElement(By.name("iso_code_2")).sendKeys("iso_code_2");
    rows.get(1).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(2).findElement(By.name("iso_code_3")).sendKeys("iso_code_3");
    rows.get(2).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(3).findElement(By.name("name")).sendKeys("name");
    rows.get(4).findElement(By.name("domestic_name")).sendKeys("domestic_name");
    rows.get(5).findElement(By.name("tax_id_format")).sendKeys("tax_id_format");
    rows.get(5).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(6).findElement(By.name("address_format")).sendKeys("address_format");
    rows.get(6).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(7).findElement(By.name("postcode_format")).sendKeys("postcode_format");
    rows.get(7).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(8).findElement(By.name("currency_code")).sendKeys("currency_code");
    rows.get(8).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(9).findElement(By.name("phone_code")).sendKeys("phone_code");
    rows.get(9).findElement(By.className("fa-external-link")).click();
    wait.until(numberOfWindowsToBe(2));
    changeWindow();

    rows.get(11).findElement(By.name("zone[code]")).sendKeys("zone[code]");
    rows.get(12).findElement(By.name("zone[name]")).sendKeys("zone[name]");
    driver.findElement(By.name("save")).click();
    
  }

  private void changeWindow() {
    String originalWindow = driver.getWindowHandle();
    Set<String> existingWindows = driver.getWindowHandles();
    for (String newWindow : existingWindows) {
      if (!newWindow.equals(originalWindow)) {
        driver.switchTo().window(newWindow);
        driver.close();
        driver.switchTo().window(originalWindow);
      }
    }
  }
}


