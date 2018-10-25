package HotelManagement.LayoutMangage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class AddLayoutChrome {

    public static void main(String[] args) throws AWTException, InterruptedException {
        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");

        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        //初始化Chrome浏览器实例
        Robot robot = new Robot();
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // get()打开一个站点
        driver.get("http://192.168.1.100:8281/upms-web/index");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： " + driver.getTitle());
        WebElement loginText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");
        loginText.sendKeys("业务员1");
        WebElement passwordText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[2]");
        passwordText.sendKeys("123");
        WebElement identifyCodeText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/div[1]/div[1]/input");
        identifyCodeText.sendKeys("miyi");
        WebElement loginButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/button");
        loginButton.click();

        Thread.sleep(1000);

        WebElement gethotelMangageButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"side-menu\"]/li[2]/a/span[1]");
        gethotelMangageButton.click();
        Thread.sleep(1000);

        WebElement gethotelLayoutButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"side-menu\"]/li[2]/ul/li[3]/a");
        gethotelLayoutButton.click();

        Thread.sleep(1000);
        driver.switchTo().frame("iframe3");
        Thread.sleep(1000);
        // driver.switchTo().frame(driver.findElementByXPath("//iframe[contains(@src,'myframe')]"));

        WebElement hotelNameSVGClick = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.layout-3QX0W > div > div > span > i > svg");
        hotelNameSVGClick.click();

        Thread.sleep(1000);
        WebElement hotelNameText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.layout-3QX0W > div > div > div > div.ant-select-search.ant-select-search--inline > div > input");
        hotelNameText.sendKeys("测试");
        Thread.sleep(1000);

        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);
        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement clickAddLayoutButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[2]/button");
        clickAddLayoutButton.click();
        Thread.sleep(1000);


        WebElement layoutNameText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(1) > div:nth-child(1) > div.flex1 > input");
        layoutNameText.sendKeys("大床房");

        WebElement layoutFloorText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(1) > div:nth-child(2) > div.flex1 > input");
        layoutFloorText.sendKeys("5-9");

        WebElement layoutPlaceHolderText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(2) > div:nth-child(1) > div.flex1 > input");
        layoutPlaceHolderText.sendKeys("20-35");

        WebElement layoutPersonNumberText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(2) > div:nth-child(2) > div.flex1 > div > div.ant-input-number-input-wrap > input");
        layoutPersonNumberText.sendKeys("5");
        Thread.sleep(1000);

        WebElement layoutSmokeRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(3) > div:nth-child(1) > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutSmokeRadio.click();

        WebElement layoutWindowsRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(3) > div:nth-child(2) > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutWindowsRadio.click();

        WebElement layoutNetworkRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(4) > div:nth-child(1) > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutNetworkRadio.click();

        WebElement layoutWIFIRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(4) > div:nth-child(2) > div.flex1 > div > label:nth-child(3) > span.ant-radio > input");
        layoutWIFIRadio.click();

        WebElement layoutAddBedRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(5) > div > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutAddBedRadio.click();
        Thread.sleep(1000);
        WebElement layoutBedSizeChooseClick = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(6) > div > div.flex1 > div > div.ant-select.ant-select-enabled > div > span > i > svg");
        layoutBedSizeChooseClick.click();

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        WebElement layoutBedSizeClick = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(6) > div > div.flex1 > div > div.flexbox.fdc > div > div.ant-select.ant-select-enabled > div > span > i > svg");
        layoutBedSizeClick.click();

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);


        StringSelection layoutImageURL = new StringSelection("C:\\Users\\Administrator\\Desktop\\hotel\\40.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(layoutImageURL, null);
        System.out.println("selection" + layoutImageURL);
        WebElement layoutImageButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(7) > div > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        layoutImageButton.click();
        // 新建一个Robot类的对象
        // Robot robotTax = new Robot();s
        Thread.sleep(1000);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);
        // 按下 CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        // 释放 CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        WebElement toAssessorButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div:nth-child(2) > button.ant-btn.ant-btn-primary");
        toAssessorButton.click();



        //切换回主按钮
        driver.switchTo().defaultContent();
        WebElement quitButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/div/div[2]/a");
        // quitButton.click();

        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //关闭并退出浏览器
        // driver.quit();
    }

}
