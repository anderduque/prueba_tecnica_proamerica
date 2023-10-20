package Pages.Validation;

import Helpers.Helpers;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Premia_Mall {
    public WebDriver driver; //Declaro Objeto Driver.
    public Helpers helpers;
    public Page_Premia_Mall(WebDriver driver) {  //Metodo Constructor de la Clase.
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */

    public By premiaMall = By.xpath("(//span[contains(.,'Premia Mall')])[1]");
    public By titlePremiaMall = By.xpath("(//p[contains(.,'Premia Mall')])[1]");
    public By aboutUs = By.xpath("//a[contains(.,'¿Quiénes somos?')]");
    public By titleAboutUs = By.xpath("//h1[contains(.,'¿Quiénes somos?')]");

     /**
     * ---------------------------------------------------------------------------------------------------------
     *  Functions // Functions // Functions // Functions // Functions // Functions // Functions // Functions //
     * ---------------------------------------------------------------------------------------------------------
     */

     @Step("ingress to premia mall")
     public void ingressToPremiaMall(){
         helpers.click(premiaMall);
         helpers.attachment("ingress to premia mall");
         helpers.explicitWait_textToBePresentInElementLocated(titlePremiaMall,"Premia Mall");
     }
     @Step("Scroll to element about us")
     public void scrollToAboutUs(){
         helpers.scrollDownToElement(aboutUs);
         helpers.attachment("Scroll to element");
         helpers.SleepSeconds(2);
         helpers.click(aboutUs);
     }
     @Step("Validate site about us")
     public boolean tittleAboutUs(){
         helpers.attachment("Validate title about us");
         return  helpers.explicitWait_PresenceOfElementDisplayed(titleAboutUs);
     }
}
