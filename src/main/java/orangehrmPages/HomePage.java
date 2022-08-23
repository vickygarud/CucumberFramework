package orangehrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseClass;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginBth;

}
