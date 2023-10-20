package Pages.AccessAndNavigation;

import Helpers.Helpers;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Access_And_Navigate {

    public WebDriver driver; //Declaro Objeto Driver.
    public Helpers helpers;

    public Page_Access_And_Navigate(WebDriver driver) {  //Metodo Constructor de la Clase.
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */

    public By promotionsAndDiscounts = By.xpath("(//span[contains(.,'Promociones y Descuentos')])[1]");
    public By restaurant = By.xpath("(//span[contains(.,'Restaurantes')])[1]");
    public By titleRestaurant = By.xpath("//h1[contains(.,'Restaurantes')]");
    /**
     * ---------------------------------------------------------------------------------------------------------
     *  Functions // Functions // Functions // Functions // Functions // Functions // Functions // Functions //
     * ---------------------------------------------------------------------------------------------------------
     */

    @Step("I navigate to the start of the pro america portal")
    public void navigateToStartLinio() {
        helpers.navigateTOUrl(helpers.GetSelectedenvironment());
        helpers.attachment("Navigate to star pro america portal");
    }
    @Step("Validate title site pro america")
    public String proAmerica(){
        helpers.explicitWait_visibilityOfElementLocated(promotionsAndDiscounts);
        System.out.println("**** Realizando ingreso al portal, se validará con el titulo: " + helpers.getText(promotionsAndDiscounts));
        helpers.attachment("Validation of titlle");
        return helpers.getText(promotionsAndDiscounts);
    }
    @Step("Ingress to restaurant")
    public boolean ingressToRestaurant(){
        helpers.ClickForJS(restaurant);
        helpers.attachment("ingress to restaurant");
        return helpers.explicitWait_visibilityOfElementLocated(titleRestaurant);
    }



}
