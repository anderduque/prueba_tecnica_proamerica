package Tests.Suite_Premia_Mall;

import Baseclass.BaseClass;
import Helpers.RetryAnalyzer;
import Pages.AccessAndNavigation.Page_Access_And_Navigate;
import Pages.Validation.Page_Premia_Mall;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ TestListenerAdapter.class})
@Epic("Allure TestNG Suite Test")
@Feature("Ingress to premia mall")

public class Premia_Tests extends BaseClass {

    @Test(groups = { "smoke" }, description = "Validate ingress to premia mall" ,retryAnalyzer = RetryAnalyzer.class, priority = 1 )
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validate Ingress to premia mall")
    @Story("Account_Tests")
    public void test_IngressCToPremiaMall() throws InterruptedException {
        Page_Access_And_Navigate pageAccessAndNavigate = new Page_Access_And_Navigate(driver);
        Page_Premia_Mall page_premia_mall = new Page_Premia_Mall(driver);
        pageAccessAndNavigate.navigateToStartLinio();
        Assert.assertEquals(pageAccessAndNavigate.proAmerica(),"Promociones y Descuentos");
        page_premia_mall.ingressToPremiaMall();
        page_premia_mall.scrollToAboutUs();
        page_premia_mall.tittleAboutUs();
    }

}
