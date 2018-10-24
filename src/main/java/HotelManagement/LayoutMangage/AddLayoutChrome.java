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

    public static void main(String[] args) throws AWTException {
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

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement gethotelMangageButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"side-menu\"]/li[2]/a/span[1]");
        gethotelMangageButton.click();
        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement gethotelLayoutButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"side-menu\"]/li[2]/ul/li[3]/a");
        gethotelLayoutButton.click();

        driver.switchTo().frame("iframe3");

        // driver.switchTo().frame(driver.findElementByXPath("//iframe[contains(@src,'myframe')]"));
        Actions action=new Actions(driver);
        action.moveToElement(((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]")).perform();


        WebElement hotelNameText = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]");
        hotelNameText.sendKeys("测试");
        hotelNameText.click();

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



        WebElement getCooperativeStartTimeText = ((ChromeDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
        getCooperativeStartTimeText.click();

//        WebElement getCooperativeStartTimeTodayButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(12) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-footer > span");
//        getCooperativeStartTimeTodayButton.click();
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement getCooperativeEndTimeText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(16) > div:nth-child(5) > div:nth-child(2) > div.flex1 > span > div > input");
        getCooperativeEndTimeText.click();

//        WebElement getCooperativeEndTimeTodayButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[16]/div[5]/div[2]/div[2]/span/div/input");
//        getCooperativeEndTimeTodayButton.click();
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement clickCooperativeIdButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[16]/div[6]/div[1]/div[2]/div[1]/button");
        clickCooperativeIdButton.click();

        //合同扫描件上传
        StringSelection hotelCooperativeImageURL = new StringSelection("\"14.jpg\" \"15.jpg\" \"16.jpg\" \"17.jpg\" \"18.jpg\" \"19.jpg\" ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelCooperativeImageURL, null);
        System.out.println("selection" + hotelCooperativeImageURL);
        WebElement hotelCooperativeImageButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[16]/div[6]/div[2]/div[2]/span/div[2]/span");
        hotelCooperativeImageButton.click();
        // 新建一个Robot类的对象
        // Robot robotTax = new Robot();s
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




        //酒店封面照片上传
        StringSelection hotelImageURL = new StringSelection("\"20.jpg\" \"21.jpg\" \"22.jpg\" \"23.jpg\" \"24.jpg\" \"25.jpg\" ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelImageURL, null);
        System.out.println("selection" + hotelImageURL);
        WebElement hotelImageButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[18]/div/div/div[2]/span/div[2]/span");
        hotelImageButton.click();
        // 新建一个Robot类的对象
        // Robot robotTax = new Robot();s
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


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
