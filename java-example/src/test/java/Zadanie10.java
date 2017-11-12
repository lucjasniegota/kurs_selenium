import org.junit.Test;
import org.openqa.selenium.By;

public class Zadanie10 extends TestBase {

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/en/");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
  }
}
