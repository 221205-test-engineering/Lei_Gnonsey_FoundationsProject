package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement loginButton;
}
