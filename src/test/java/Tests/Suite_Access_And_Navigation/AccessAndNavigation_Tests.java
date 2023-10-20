package Tests.Suite_Access_And_Navigation;

import Baseclass.BaseClass;
import Helpers.RetryAnalyzer;
import Pages.AccessAndNavigation.Page_Access_And_Navigate;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListenerAdapter.class})
@Epic("Allure TestNG Suite Test")
@Feature("Ingress correctly pro america")
public class AccessAndNavigation_Tests extends BaseClass {
    String ClassName = "[" + getClass().getName() + "]: "; //Se usa para ordenar el reporte.
    @Test(groups = { "smoke" }, description = "Ingress to access and navigation",retryAnalyzer = RetryAnalyzer.class, priority = 1 )
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validate Ingress correct pro america")
    @Story("Account_Tests")
    public void test_IngressCorrectProAmerica() throws InterruptedException {
        Page_Access_And_Navigate pageAccessAndNavigate = new Page_Access_And_Navigate(driver);
        pageAccessAndNavigate.navigateToStartLinio();
        Assert.assertEquals(pageAccessAndNavigate.proAmerica(),"Promociones y Descuentos");
        pageAccessAndNavigate.ingressToRestaurant();
    }

}
