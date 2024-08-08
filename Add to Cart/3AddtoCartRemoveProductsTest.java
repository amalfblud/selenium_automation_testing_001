// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class 3AddtoCartRemoveProductsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void 3AddtoCartRemoveProducts() {
    // Test name: 3_Add to Cart_Remove Products
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.saucedemo.com/");
    // 2 | setWindowSize | 1050x718 | 
    driver.manage().window().setSize(new Dimension(1050, 718));
    // 3 | click | css=*[data-test="username"] | 
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    // 4 | type | css=*[data-test="username"] | standard_user
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    // 5 | click | css=*[data-test="password"] | 
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    // 6 | type | css=*[data-test="password"] | secret_sauce
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    // 7 | click | css=*[data-test="login-button"] | 
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    // 8 | verifyElementPresent | css=.app_logo | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".app_logo"));
      assert(elements.size() > 0);
    }
    // 9 | verifyElementNotPresent | css=*[data-test="shopping-cart-badge"] | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"shopping-cart-badge\"]"));
      assert(elements.size() == 0);
    }
    // 10 | verifyText | css=*[data-test="add-to-cart-sauce-labs-backpack"] | Add to cart
    assertThat(driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).getText(), is("Add to cart"));
    // 11 | click | css=*[data-test="add-to-cart-sauce-labs-backpack"] | 
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
    // 12 | assertText | css=*[data-test="shopping-cart-badge"] | 1
    assertThat(driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")).getText(), is("1"));
    // 13 | verifyText | css=*[data-test="remove-sauce-labs-backpack"] | Remove
    assertThat(driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).getText(), is("Remove"));
    // 14 | click | css=*[data-test="remove-sauce-labs-backpack"] | 
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
    // 15 | verifyElementNotPresent | css=*[data-test="shopping-cart-badge"] | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"shopping-cart-badge\"]"));
      assert(elements.size() == 0);
    }
    // 16 | close |  | 
    driver.close();
  }
}
