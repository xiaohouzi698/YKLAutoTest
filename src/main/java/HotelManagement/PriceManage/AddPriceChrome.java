package HotelManagement.PriceManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class AddPriceChrome {
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

        WebElement gethotelPriceButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"side-menu\"]/li[2]/ul/li[4]/a");
        gethotelPriceButton.click();

        Thread.sleep(1000);
        driver.switchTo().frame("iframe4");
        Thread.sleep(1000);

        //选择酒店

        WebElement hotelNameText = ((ChromeDriver) driver).findElementByCssSelector("#selectHotelName");
        hotelNameText.sendKeys("测试");
        Thread.sleep(1000);

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        // driver.switchTo().frame(driver.findElementByXPath("//iframe[contains(@src,'myframe')]"));

        WebElement hotelPriceAddPageClick = ((ChromeDriver) driver).findElementByCssSelector("#accordion > div.panel.panel-primary > div.panel-heading > h4 > a");
        hotelPriceAddPageClick.click();


        WebElement priceNameText = ((ChromeDriver) driver).findElementByCssSelector("#priceName");
        priceNameText.sendKeys("豪华大床房");

        WebElement priceStartTimeClick = ((ChromeDriver) driver).findElementByCssSelector("#fm > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div > span > span");
        priceStartTimeClick.click();
        Thread.sleep(1000);
        WebElement priceStartTime = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(8) > div.datetimepicker-days > table > tbody > tr:nth-child(4) > td.day.active");
        priceStartTime.click();
        Thread.sleep(1000);

        WebElement priceEndTimeClick = ((ChromeDriver) driver).findElementByCssSelector("#fm > div:nth-child(5) > div:nth-child(1) > div:nth-child(4) > div > span");
        priceEndTimeClick.click();
        Thread.sleep(1000);
        WebElement priceEndTime = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(9) > div.datetimepicker-days > table > tbody > tr:nth-child(6) > td:nth-child(4)");
        priceEndTime.click();
        Thread.sleep(1000);


        WebElement priceRoomNumberText = ((ChromeDriver) driver).findElementByCssSelector("#fm > div:nth-child(6) > div:nth-child(1) > div:nth-child(4) > input");
        priceRoomNumberText.sendKeys("5");
        Thread.sleep(1000);

        WebElement salePriceText = ((ChromeDriver) driver).findElementByCssSelector("#salePrice");
        salePriceText.sendKeys("220");

        WebElement lowPriceText = ((ChromeDriver) driver).findElementByCssSelector("#basePrice");
        lowPriceText.sendKeys("200");

        WebElement guaranteeClick = ((ChromeDriver) driver).findElementByCssSelector("#guarantee");
        guaranteeClick.click();

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        WebElement priceBreakfastClick = ((ChromeDriver) driver).findElementByCssSelector("#fm > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > select");
        priceBreakfastClick.click();

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10000);

        WebElement commitButton = ((ChromeDriver) driver).findElementByCssSelector("#fm > div:nth-child(11) > div > button.btn.btn-primary");
        commitButton.click();



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
