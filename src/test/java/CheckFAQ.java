import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tab.*;
import static junit.framework.TestCase.assertEquals;


public class CheckFAQ {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    HomePage homePage = new HomePage(driver);
    String url = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void testPreparing(){
        driver.get(url);
        homePage.clickCloseCookie();

        new WebDriverWait(driver,3);
    }

    @Test
    public void checkFAQ() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openFAQ1();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-0")));
        String actual =  driver.findElement(By.id("accordion__panel-0")).getText();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);

        homePage.openFAQ2();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-1")));
        actual =  driver.findElement(By.id("accordion__panel-1")).getText();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actual);

        homePage.openFAQ3();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-2")));
        actual =  driver.findElement(By.id("accordion__panel-2")).getText();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);

        homePage.openFAQ4();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-3")));
        actual =  driver.findElement(By.id("accordion__panel-3")).getText();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);

        homePage.openFAQ5();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-4")));
        actual =  driver.findElement(By.id("accordion__panel-4")).getText();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actual);

        homePage.openFAQ6();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-5")));
        actual =  driver.findElement(By.id("accordion__panel-5")).getText();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);

        homePage.openFAQ7();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-6")));
        actual =  driver.findElement(By.id("accordion__panel-6")).getText();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actual);

        homePage.openFAQ8();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-7")));
        actual =  driver.findElement(By.id("accordion__panel-7")).getText();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actual);
    }

    @After
    public void quit() {
        driver.quit();
    }
}