package Tests.Suite_Interaction_With_Elements;

import Baseclass.BaseClass;
import Helpers.RetryAnalyzer;
import Pages.AccessAndNavigation.Page_Access_And_Navigate;
import Pages.InteractionWithElements.Page_Contactus;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ TestListenerAdapter.class})
@Epic("Allure TestNG Suite Test")
@Feature("Ingress correctly contactus and form complete")
public class Contactus_Tests  extends BaseClass {

    @Test(groups = { "smoke" }, description = "Validate complete form",retryAnalyzer = RetryAnalyzer.class, priority = 1 )
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validate complete form")
    @Story("Contactus")
    public void test_CompleteForm() throws InterruptedException {
        Page_Access_And_Navigate pageAccessAndNavigate = new Page_Access_And_Navigate(driver);
        Page_Contactus page_contactus = new Page_Contactus(driver);
        pageAccessAndNavigate.navigateToStartLinio();
        Assert.assertEquals(pageAccessAndNavigate.proAmerica(),"Promociones y Descuentos");
        Assert.assertTrue(page_contactus.contactus(),"Its not possible ingress to contactus");
        Assert.assertEquals(page_contactus.CompleteToForm(),"Su comentario ha sido enviado con éxito al propietario de la tienda.");
    }
}
