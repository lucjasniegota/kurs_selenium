import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class Zadanie10 extends TestBase {

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/en/");
    WebElement campaigne = driver.findElement(By.id("box-campaigns"));
    WebElement kaczka = campaigne.findElement(By.className("link"));
    String nazwaStronaGlowna = kaczka.findElement(By.className("name")).getText();

    String cenaStronaGlowna = kaczka.findElement(By.className("regular-price")).getText();
    String nowaCenaStronaGlowna = kaczka.findElement(By.className("campaign-price")).getText();
    String stylCeny = kaczka.findElement(By.className("regular-price")).getCssValue("color");
    String stylNowejCeny = kaczka.findElement(By.className("campaign-price")).getCssValue("color");
    String styl2Ceny = kaczka.findElement(By.className("regular-price")).getCssValue("font-weight");
    String styl2NowejCeny = kaczka.findElement(By.className("campaign-price")).getCssValue("font-weight");
    String styl3Ceny = kaczka.findElement(By.className("regular-price")).getCssValue("text-decoration");
    String styl3NowejCeny = kaczka.findElement(By.className("campaign-price")).getCssValue("text-decoration");
    kaczka.click();

    WebElement kampania = driver.findElement(By.id("box-product"));
    String nazwaKampania = kampania.findElement(By.className("title")).getText();
    String cenaKampania = kampania.findElement(By.className("regular-price")).getText();
    String nowaCenaKampania = kampania.findElement(By.className("campaign-price")).getText();
    String stylCenyKampania = kampania.findElement(By.className("regular-price")).getCssValue("color");
    String stylNowejCenyKampania = kampania.findElement(By.className("campaign-price")).getCssValue("color");
    String styl2CenyKampania = kampania.findElement(By.className("regular-price")).getCssValue("font-weight");
    String styl2NowejCenyKampania = kampania.findElement(By.className("campaign-price")).getCssValue("font-weight");
    String styl3CenyKampania = kampania.findElement(By.className("regular-price")).getCssValue("text-decoration");
    String styl3NowejCenyKampania = kampania.findElement(By.className("campaign-price")).getCssValue("text-decoration");


    assertEquals(nazwaStronaGlowna, nazwaKampania);
    assertEquals(cenaStronaGlowna, cenaKampania);
    assertEquals(nowaCenaStronaGlowna, nowaCenaKampania);
    assertEquals(stylCeny, stylCenyKampania);
    assertEquals(styl2Ceny, styl2CenyKampania);
    assertEquals(styl2NowejCeny, styl2NowejCenyKampania);
    assertEquals(styl3Ceny, styl3CenyKampania);
    assertEquals(styl3NowejCeny, styl3NowejCenyKampania);
    assertEquals(stylNowejCeny, stylNowejCenyKampania);
  }
}
