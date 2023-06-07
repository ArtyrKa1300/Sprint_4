package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    //Локатор до кнопок "Вопросы о важном"
    public By faqButtons = By.xpath("//div[contains(@class,'Home_FAQ')]");

    // локатор для кнопки «Заказать» в хедере
    private By orderTopButton = By.xpath("//div[contains(@class,'Header')]//button[text()='Заказать']");
    // локатор для кнопки «Заказать» в мидле
    private By orderMiddleButton = By.xpath("//div[contains(@class,'Home_FinishButton')]//button[text()='Заказать']");
    // локатор для кнопки «Закрыть» куки в футере
    private By closeCookie = By.xpath(".//button[text()='да все привыкли']");
    // локаторы для кнопок «Вопросы о важном»
    private By faqHowMuch = By.xpath("//*[@id='accordion__heading-0']");
    private By faqSeveralScooters = By.xpath("//*[@id='accordion__heading-1']");
    private By faqRentalTime = By.xpath("//*[@id='accordion__heading-2']");
    private By faqOrderToday = By.xpath("//*[@id='accordion__heading-3']");
    private By faqExtendOrderOrEarlier = By.xpath("//*[@id='accordion__heading-4']");
    private By faqBringChargers = By.xpath("//*[@id='accordion__heading-5']");
    private By faqCancelOrder = By.xpath("//*[@id='accordion__heading-6']");
    private By faqOutsideMoscowRingRoad = By.xpath("//*[@id='accordion__heading-7']");
    //Локаторы текста «Вопросы о важном»
    public By faqHowMuchText = By.id("accordion__panel-0");
    public By faqSeveralScootersText = By.id("accordion__panel-1");
    public By faqRentalTimeText = By.id("accordion__panel-2");
    public By faqOrderTodayText = By.id("accordion__panel-3");
    public By faqExtendOrderOrEarlierText = By.id("accordion__panel-4");
    public By faqBringChargersText = By.id("accordion__panel-5");
    public By faqCancelOrderText = By.id("accordion__panel-6");
    public By faqOutsideMoscowRingRoadText = By.id("accordion__panel-7");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderTopButton(){
        driver.findElement(orderTopButton).click();
    }

    public String openFaqHowMuch(){
        driver.findElement(faqHowMuch).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(faqHowMuchText));
        return driver.findElement(faqHowMuchText).getText();
    }
    public String openFaqSeveralScooters(){
        driver.findElement(faqSeveralScooters).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(faqSeveralScootersText));
        return driver.findElement(faqSeveralScootersText).getText();
    }
    public String openFaqRentalTime(){
        driver.findElement(faqRentalTime).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(faqRentalTimeText));
        return driver.findElement(faqRentalTimeText).getText();
    }
    public String openFaqOrderToday(){
        driver.findElement(faqOrderToday).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(faqOrderTodayText));
        return driver.findElement(faqOrderTodayText).getText();
    }
    public String openFaqExtendOrderOrEarlier(){
        driver.findElement(faqExtendOrderOrEarlier).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(faqExtendOrderOrEarlierText));
        return driver.findElement(faqExtendOrderOrEarlierText).getText();
    }
    public String openFaqBringChargers(){
        driver.findElement(faqBringChargers).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(faqBringChargersText));
        return driver.findElement(faqBringChargersText).getText();
    }
    public String openFaqCancelOrder(){
        driver.findElement(faqCancelOrder).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(faqCancelOrderText));
        return driver.findElement(faqCancelOrderText).getText();
    }
    public String openFaqOutsideMoscowRingRoad(){
        driver.findElement(faqOutsideMoscowRingRoad).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(faqOutsideMoscowRingRoadText));
        return driver.findElement(faqOutsideMoscowRingRoadText).getText();
    }

    public void clickOrderMiddleButton(){
        driver.findElement(orderMiddleButton).click();
    }

    public WebElement faqButtons(){
        return driver.findElement(faqButtons);
    }
    public void clickCloseCookie(){
        driver.findElement(closeCookie).click();
    }
}