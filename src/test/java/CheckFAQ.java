import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tab.*;
import static junit.framework.TestCase.assertEquals;


public class CheckFAQ {
   ChromeOptions options = new ChromeOptions();
   WebDriver driver = new ChromeDriver(options);
    HomePage homePage = new HomePage(driver);

    @Before
    public void testPreparing(){
        driver.get(HomePage.url);
        homePage.clickCloseCookie();
        new WebDriverWait(driver,3);
    }

    @Test
    public void checkFAQ() {
        WebElement element = driver.findElement(homePage.FAQButtons);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openFAQHowMuch();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQHowMuchText));
        String actual =  driver.findElement(homePage.FAQHowMuchText).getText();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);

        homePage.openFAQSeveralScooters();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQSeveralScootersText));
        actual =  driver.findElement(homePage.FAQSeveralScootersText).getText();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actual);

        homePage.openFAQRentalTime();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQRentalTimeText));
        actual =  driver.findElement(homePage.FAQRentalTimeText).getText();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);

        homePage.openFAQOrderToday();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQOrderTodayText));
        actual =  driver.findElement(homePage.FAQOrderTodayText).getText();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);

        homePage.openFAQExtendOrderOrEarlier();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQExtendOrderOrEarlierText));
        actual =  driver.findElement(homePage.FAQExtendOrderOrEarlierText).getText();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actual);

        homePage.openFAQBringChargers();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQBringChargersText));
        actual =  driver.findElement(homePage.FAQBringChargersText).getText();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);

        homePage.openFAQCancelOrder();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQCancelOrderText));
        actual =  driver.findElement(homePage.FAQCancelOrderText).getText();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actual);

        homePage.openFAQOutsideMoscowRingRoad();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(homePage.FAQOutsideMoscowRingRoadText));
        actual =  driver.findElement(homePage.FAQOutsideMoscowRingRoadText).getText();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actual);
    }

    @After
    public void quit() {
        driver.quit();
    }
}