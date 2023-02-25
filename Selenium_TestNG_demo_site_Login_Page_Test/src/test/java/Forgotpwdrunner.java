import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;

public class Forgotpwdrunner extends Setup{
    LoginPage loginPage = new LoginPage(driver);
    @Test(priority = 1)
    public void mforgotcancel() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(5000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.mforgetpwd();
        loginPage.reset();
        loginPage.forgetcancel();
        String ptitle = driver.getTitle();
        String pactual = "OrangeHRM";
        Assert.isTrue(ptitle.contains(pactual), ptitle);
        driver.navigate().refresh();
        System.out.println("Passed\n");


    }

    @Test(priority = 2)
    public void setForgotreset() throws InterruptedException {
        loginPage = new LoginPage(driver);
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().refresh();
        Thread.sleep(5000);
        loginPage.mforgetpwd();
        loginPage.reset();
        loginPage.setForgotreset();
        String ptitle = loginPage.resetlink.getText();
        String pactual = "Reset Password link";
        Assert.isTrue(ptitle.contains(pactual), ptitle);
        System.out.println("Passed\n");

    }
}
