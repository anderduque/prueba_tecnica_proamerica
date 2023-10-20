package Pages.InteractionWithElements;

import Helpers.Helpers;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Contactus {

    public WebDriver driver; //Declaro Objeto Driver.
    public Helpers helpers;
    public Page_Contactus(WebDriver driver) {  //Metodo Constructor de la Clase.
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */

    public By contactus = By.xpath("(//span[contains(.,'Contáctenos')])[1]");
    public By titleContactus = By.xpath("//h1[contains(.,'Contáctenos')]");
    public By inputName = By.xpath("//input[contains(@id,'FullName')]");
    public By inputMail = By.xpath("//input[@id='Email']");
    public By inputComments = By.xpath("//textarea[@id='Enquiry']");
    public By sent = By.xpath("//input[contains(@name,'send-email')]");
    public By commentsSuccesfull = By.xpath("//div[@class='result'][contains(.,'Su comentario ha sido enviado con éxito al propietario de la tienda.')]");
    /**
     * ---------------------------------------------------------------------------------------------------------
     *  Functions // Functions // Functions // Functions // Functions // Functions // Functions // Functions //
     * ---------------------------------------------------------------------------------------------------------
     */

    @Step("Ingress to contactus")
    public boolean contactus(){
        helpers.click(contactus);
        helpers.attachment("ingress to contactus");
        return helpers.explicitWait_PresenceOfElementDisplayed(titleContactus);
    }
    @Step("Complete to form")
    public String CompleteToForm(){
        helpers.sendText(inputName,helpers.generateRandomName() + " " + helpers.generateRandomLastNames());
        helpers.sendText(inputMail,helpers.generateMail());
        helpers.sendText(inputComments, "Realizando prueba tecnica para pro america");
        helpers.click(sent);
        helpers.attachment("Complete to form");
        return helpers.getText(commentsSuccesfull);
    }

}
