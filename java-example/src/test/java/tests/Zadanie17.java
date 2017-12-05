package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import java.util.List;

public class Zadanie17 extends TestBase {

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/admin/login.php");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    driver.get("http://localhost:8090/litecart/admin/?app=catalog&doc=catalog&category_id=1");
    WebElement table = driver.findElement(By.className("dataTable"));
   List<WebElement> rows =  table.findElements(By.xpath(".//*[contains(@name, 'products')]/../.."));
for (int i = 0; i<rows.size(); i++){
  table = driver.findElement(By.className("dataTable"));
   rows =  table.findElements(By.xpath(".//*[contains(@name, 'products')]/../.."));
      String link = rows.get(i).getText();
      rows.get(i).findElement(By.linkText(link)).click();
      driver.manage().logs().get("browser").forEach(l -> System.out.println(l));
      driver.findElement(By.name("cancel")).click();
      wait.until(titleIs("Catalog | My Store"));
    }
  } }

