package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    // Поле "Имя"
    private By inputName = By.xpath(".//input[@placeholder='* Имя']");
    // Поле "Фамилия"
    private By inputSurName = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле "Адрес"
    private By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле "Станция метро"
    private By inputMetro = By.className("select-search__input");
    // Поле "Телефон"
    private By inputTelephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private By nextButton = By.xpath("//div[contains(@class,'Order_NextButton')]//button[text()='Далее']");
    // Поле "Когда привезти самокат"
    private By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Поле "Срок аренды"
    private By inputPeriod = By.xpath(".//div/div[2]/div[2]/div[2]/div[1]/div[1]");
    // Селектор выбора цвета
    private By selectColor = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]");
    // Поле "Комментарий для курьера"
    private By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    private By orderButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Заказать']");
    // Кнопка "Да"
    private By yesButton = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");


    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void InputName(String name){
        driver.findElement(inputName).sendKeys(name);
    }
    public void InputSurName(String surName){
        driver.findElement(inputSurName).sendKeys(surName);
    }
    public void inputAddress(String address){
        driver.findElement(inputAddress).sendKeys(address);
    }
    public void inputMetro(){
        driver.findElement(inputMetro).sendKeys("Площадь революции");
    }
    public void inputTelephone(String telephone){
        driver.findElement(inputTelephone).sendKeys(telephone);
    }
    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }
    public void inputComment(String commentary){
        driver.findElement(inputComment).sendKeys(commentary);
    }
    public void clickColor(){
        driver.findElement(selectColor).click();
    }
    public void clickYes(){
        driver.findElement(yesButton).click();
    }
    public void clickPeriod()
    {
        driver.findElement(inputPeriod).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }
    public void clickOrder()
    {
        driver.findElement(orderButton).click();
    }
    public void inputDate(String date)
    {
        driver.findElement(inputDate).sendKeys(date);
    }
}