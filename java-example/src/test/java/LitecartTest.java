import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LitecartTest {
  private WebDriver driver;
  private WebDriverWait wait;

  @Before
  public void start() {
// driver= new InternetExplorerDriver();
    // driver= new FirefoxDriver();

    ChromeOptions options = new ChromeOptions();
    //  options.setBinary("C:\\kurs_selenium\\chromedriver.exe");
    // options.addArguments("start-fullscreen");
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, 10);
  }

  @Test
  public void litecartTest() {
    driver.get("http://localhost:8090/litecart/admin/login.php");
    // driver.findElement(By.name("username")).sendKeys("admin");
    // driver.findElement(By.name("password")).sendKeys("admin");
    // driver.findElement(By.name("login")).click();
    // wait.until(titleIs("My Store"));
  }

  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
