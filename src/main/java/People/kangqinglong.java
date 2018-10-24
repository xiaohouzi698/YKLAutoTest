package People;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class kangqinglong {
    public static void main(String[] args) {

        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");

        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        //初始化Chrome浏览器实例

        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.1.100:8281/upms-web/index");
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // get()打开一个站点

        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
        WebElement loginText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");

        loginText.sendKeys("康庆龙");
        WebElement passwordText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[2]");
        passwordText.sendKeys("123");
        WebElement identifyCodeText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/div[1]/div[1]/input");
        identifyCodeText.sendKeys("miyi");
        WebElement loginButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/button");
        loginButton.click();

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement assessorButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a");
        assessorButton.click();

        WebElement assessorClickButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/ul/li/div/a/strong");
        assessorClickButton.click();

        WebElement quitButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/div/div[2]/a");
        // quitButton.click();


        //关闭并退出浏览器
        //driver.quit();

    }
}
