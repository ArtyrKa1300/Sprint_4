package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static final String url = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    //Локатор до кнопок "Вопросы о важном"
    public By FAQButtons = By.xpath("//div[contains(@class,'Home_FAQ__3uVm4')]");
    // локатор для кнопки «Заказать» в хедере
    private By orderTopButton = By.xpath("//div[contains(@class,'Header')]//button[text()='Заказать']");
    // локатор для кнопки «Заказать» в мидле
    private By orderMiddleButton = By.xpath("//div[contains(@class,'Home_FinishButton')]//button[text()='Заказать']");
    // локатор для кнопки «Закрыть» куки в футере
    private By closeCookie = By.xpath(".//button[text()='да все привыкли']");
    // локаторы для кнопок «Вопросы о важном»
    private By FAQHowMuch = By.xpath("//*[@id='accordion__heading-0']");
    private By FAQSeveralScooters = By.xpath("//*[@id='accordion__heading-1']");
    private By FAQRentalTime = By.xpath("//*[@id='accordion__heading-2']");
    private By FAQOrderToday = By.xpath("//*[@id='accordion__heading-3']");
    private By FAQExtendOrderOrEarlier = By.xpath("//*[@id='accordion__heading-4']");
    private By FAQBringChargers = By.xpath("//*[@id='accordion__heading-5']");
    private By FAQCancelOrder = By.xpath("//*[@id='accordion__heading-6']");
    private By FAQOutsideMoscowRingRoad = By.xpath("//*[@id='accordion__heading-7']");
    //Локаторы текста «Вопросы о важном»
    public By FAQHowMuchText = By.id("accordion__panel-0");
    public By FAQSeveralScootersText = By.id("accordion__panel-1");
    public By FAQRentalTimeText = By.id("accordion__panel-2");
    public By FAQOrderTodayText = By.id("accordion__panel-3");
    public By FAQExtendOrderOrEarlierText = By.id("accordion__panel-4");
    public By FAQBringChargersText = By.id("accordion__panel-5");
    public By FAQCancelOrderText = By.id("accordion__panel-6");
    public By FAQOutsideMoscowRingRoadText = By.id("accordion__panel-7");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderTopButton(){
        driver.findElement(orderTopButton).click();
    }

    public void openFAQHowMuch(){
        driver.findElement(FAQHowMuch).click();
    }
    public void openFAQSeveralScooters(){
        driver.findElement(FAQSeveralScooters).click();
    }
    public void openFAQRentalTime(){
        driver.findElement(FAQRentalTime).click();
    }
    public void openFAQOrderToday(){
        driver.findElement(FAQOrderToday).click();
    }
    public void openFAQExtendOrderOrEarlier(){
        driver.findElement(FAQExtendOrderOrEarlier).click();
    }
    public void openFAQBringChargers(){
        driver.findElement(FAQBringChargers).click();
    }
    public void openFAQCancelOrder(){
        driver.findElement(FAQCancelOrder).click();
    }
    public void openFAQOutsideMoscowRingRoad(){
        driver.findElement(FAQOutsideMoscowRingRoad).click();
    }

    public void clickOrderMiddleButton(){
        driver.findElement(orderMiddleButton).click();
    }

    public void clickCloseCookie(){
        driver.findElement(closeCookie).click();
    }
}