import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Zadanie11  extends TestBase  {

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/en/");

    driver.findElement(By.linkText("New customers click here")).click();
    driver.findElement(By.name("firstname")).sendKeys("Lucja");
    driver.findElement(By.name("lastname")).sendKeys("Sniegota");
    driver.findElement(By.name("address1")).sendKeys("Gdynia");
    driver.findElement(By.name("postcode")).sendKeys("80-900");
    driver.findElement(By.name("city")).sendKeys("Gdynia");
    driver.findElement(By.className("select2-selection__arrow")).click();
    driver.findElement(By.className("select2-search__field")).sendKeys("Poland");
    driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
    driver.findElement(By.name("email")).sendKeys("lu@snie.com");
    driver.findElement(By.name("phone")).sendKeys("123456");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("confirmed_password")).sendKeys("admin");
    driver.findElement(By.name("create_account")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.name("email")).sendKeys("lu@snie.com");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
  }
}
