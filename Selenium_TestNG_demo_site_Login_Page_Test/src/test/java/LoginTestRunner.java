import dev.failsafe.internal.util.Assert;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

public class LoginTestRunner extends Setup {

    LoginPage loginPage;

    @Test (priority = 1)
    public void doLogin() {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        String actual = "OrangeHRM";
        Assert.isTrue(title.contains(actual), title);
        loginPage.doLoginwred();
        String atitle = loginPage.alert.getText();
        String aactual = "Invalid credentials";
        Assert.isTrue(atitle.contains(aactual), atitle);
        loginPage.doLogincred();
        String dtitle = loginPage.dboard.getText();
        String dactual = "Dashboard";
        Assert.isTrue(dtitle.contains(dactual), dtitle);
        loginPage.logout();
        WebElement logout = loginPage.logout_button.get(3);
        logout.click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.body.style.zoom='80%'");
//        driver.navigate().back();
        System.out.println("Passed\n");
    }
    @Test (priority = 5)
        public void Lin() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        loginPage.lin();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
//        String window_handles = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if (!windowHandle.equals(title)) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }
        String title = driver.getCurrentUrl();
        String actual = "linked";
        Assert.isTrue(title.contains(actual), title);
        System.out.println("Passed\n");
    }
    @Test (priority = 6)
    public void fb() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        loginPage.fb();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        String title = driver.getCurrentUrl();
        String actual = "facebook";
        Assert.isTrue(title.contains(actual), title);
        System.out.println("Passed\n");
    }
    @Test (priority = 7)
    public void twitter() {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        loginPage.twitter();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        String title = driver.getCurrentUrl();
        String actual = "twitter";
        Assert.isTrue(title.contains(actual), title);
        System.out.println("Passed\n");
    }
    @Test (priority = 8)
    public void yt() {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        loginPage.yt();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

        String title = driver.getCurrentUrl();
        String actual = "youtube";
        Assert.isTrue(title.contains(actual), title);
        System.out.println("Passed\n");
    }
    @Test (priority = 2)
    public void forgetpwd() throws InterruptedException {
        loginPage = new LoginPage(driver);
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.mforgetpwd();
        Thread.sleep(5000);
        String title = loginPage.resetpwdtitle.getText();
        String actual = "Reset Password";
        Assert.isTrue(title.contains(actual), title);
        driver.navigate().refresh();
        System.out.println("Passed\n");
    }
//    @Test  (priority = 3)
//    public void mforgotcancel() throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        Thread.sleep(5000);
////      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
////        loginPage.mforgetpwd();
//        loginPage.reset();
//        loginPage.forgetcancel();
//        String ptitle = driver.getTitle();
//        String pactual = "OrangeHRM";
//        Assert.isTrue(ptitle.contains(pactual), ptitle);
//        driver.navigate().refresh();
//        System.out.println("Passed\n");
//    }
//    @Test(priority = 4)
//    public void setForgotreset() throws InterruptedException {
//        loginPage = new LoginPage(driver);
////        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        loginPage.mforgetpwd();
//        loginPage.reset();
//        loginPage.setForgotreset();
//        String ptitle = loginPage.resetlink.getText();
//        String pactual = "Reset Password link";
//        Assert.isTrue(ptitle.contains(pactual), ptitle);
//        System.out.println("Passed\n");
//    }
}
