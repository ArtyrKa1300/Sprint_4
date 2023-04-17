import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tab.*;
import static junit.framework.TestCase.assertEquals;

public class CheckOrderScooter
{
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    HomePage homePage = new HomePage(driver);
    OrderPage orderPage = new OrderPage(driver);

    @Before
    public void testPreparing()
    {
        // Для запуска Firefox
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Artyr\\IdeaProjects\\Sprint_4\\src\\main\\resources\\geckodriver.exe");
        //FirefoxOptions options = new FirefoxOptions();
        //WebDriver driver = new FirefoxDriver(options);
        //HomePage homePage = new HomePage(driver);
        //OrderPage orderPage = new OrderPage(driver);
        driver.get(homePage.url);
        homePage.clickCloseCookie();
        new WebDriverWait(driver,3);



            homePage.clickOrderTopButton();
            orderPage.inputName("Владимир");
            orderPage.inputSurName("Ленин");
            orderPage.inputAddress("Москва, Красная площадь");
            orderPage.inputTelephone("+7111111111");
            orderPage.inputMetro();
            orderPage.clickNextButton();
            orderPage.inputComment("Со стороны Кремля");
            orderPage.clickColor();
            orderPage.clickPeriod();
            orderPage.inputDate("15.04.2023");
            orderPage.clickOrder();
            orderPage.clickYes();

            String answer = driver.findElement(orderPage.lookStatus).getText();
            assertEquals("Посмотреть статус", answer);
            System.out.println(answer);

    }

    @Test
    public void checkOrderScooterTopButton()
    {
        homePage.clickOrderTopButton();
        orderPage.inputName("Владимир");
        orderPage.inputSurName("Ленин");
        orderPage.inputAddress("Москва, Красная площадь");
        orderPage.inputTelephone("+7111111111");
        orderPage.inputMetro();
        orderPage.clickNextButton();
        orderPage.inputComment("Со стороны Кремля");
        orderPage.clickColor();
        orderPage.clickPeriod();
        orderPage.inputDate("15.04.2023");
        orderPage.clickOrder();
        orderPage.clickYes();

        String answer = driver.findElement(orderPage.lookStatus).getText();
        assertEquals("Заказ оформлен", answer);
    }

    @Test
    public void checkOrderScooterMiddleButton()
    {
        homePage.clickOrderMiddleButton();
        orderPage.inputName("ТетовоеИмя");
        orderPage.inputSurName("ТестоваяФамилия");
        orderPage.inputAddress("ТестовыйАдрес");
        orderPage.inputTelephone("+79143935566");
        orderPage.inputMetro();
        orderPage.clickNextButton();
        orderPage.inputComment("•◘♣○♠♥☻");
        orderPage.clickColor();
        orderPage.clickPeriod();
        orderPage.inputDate("22.04.1870");
        orderPage.clickOrder();
        orderPage.clickYes();

        String answer =   driver.findElement(orderPage.lookStatus).getText();
        assertEquals("Заказ оформлен", answer);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}