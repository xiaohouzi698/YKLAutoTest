package HotelManagement.HotelManage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddHotelNewPageFirefox {

    public static void main(String[] args) {
        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");

        //初始化一个火狐浏览器实例，实例名称叫driver
        WebDriver driver = new FirefoxDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // get()打开一个站点
        driver.get("http://192.168.1.100:8281/upms-web/index");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： " + driver.getTitle());
        WebElement loginText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");
        loginText.sendKeys("业务员1");
        WebElement passwordText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[2]");
        passwordText.sendKeys("123");
        WebElement identifyCodeText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/div[1]/div[1]/input");
        identifyCodeText.sendKeys("miyi");
        WebElement loginButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/button");
        loginButton.click();

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement gethotelMangageButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/nav/div[2]/div[1]/ul/li[2]/a/span[2]");
        gethotelMangageButton.click();

        WebElement pagehotelMangageButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/nav/div[2]/div[1]/ul/li[2]/ul/li[1]/a");
        pagehotelMangageButton.click();

       /*
        WebElement addHotelButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/button[1]");
        driver.switchTo().frame("J_iframe");
        */

        driver.switchTo().frame("iframe1");

        // driver.switchTo().frame(driver.findElementByXPath("//iframe[contains(@src,'myframe')]"));

        WebElement addHotelButton = ((FirefoxDriver) driver).findElementByXPath("//*[@id=\"hotelTableToolbar\"]/button[1]");
        addHotelButton.click();

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //基本信息页面等待
        //*[@id="checkHotelName"]
        //WebElement hotelNameText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");
        WebElement hotelNameText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        Long newDateLong = System.currentTimeMillis();// new Date()为获取当前系统时间
        String newDateString = newDateLong.toString();
        String hotelNameAuto="测试酒店·ギAuto"+newDateString;
        //String hotelNameAuto = "测试酒店·ギAuto";
        hotelNameText.sendKeys(hotelNameAuto);

        WebElement hotelPhoneText = ((FirefoxDriver) driver).findElementByCssSelector(".basicInfo-1UGlm > div:nth-child(1) > input:nth-child(1)");
        hotelPhoneText.sendKeys("15757118217");




//
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame("iframe1");


//        WebElement hotelStar2Button = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/div/div");
//        hotelStar2Button.click();
//
//        WebElement hotelStar2Text =  ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)");
//        hotelStar2Text.click();



        WebElement hotelOpenDateText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
        hotelOpenDateText.click();

        WebElement hotelOpenDateButton = ((FirefoxDriver) driver).findElementByCssSelector(".ant-calendar-month-panel-tbody > tr:nth-child(1) > td:nth-child(1)");
        hotelOpenDateButton.click();

        WebElement hotelDecorateDateText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
        hotelDecorateDateText.click();

        WebElement hotelDecorateDateButton = ((FirefoxDriver) driver).findElementByCssSelector(".ant-calendar-month-panel-tbody > tr:nth-child(1) > td:nth-child(2)");
        hotelDecorateDateButton.click();



        WebElement hotelFloorText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelFloorText.sendKeys("30");

        WebElement hotelRoomsText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelRoomsText.sendKeys("20");

        WebElement hotelDescText = ((FirefoxDriver) driver).findElementByCssSelector("div.flexbox:nth-child(7) > div:nth-child(1) > div:nth-child(2) > textarea:nth-child(1)");
        hotelDescText.sendKeys(hotelNameAuto);

        WebElement hotelTrafficText = ((FirefoxDriver) driver).findElementByCssSelector("div.flexbox:nth-child(7) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)");
        hotelTrafficText.sendKeys("酒店交通·ギ");

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement hotelContactPeopleText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelContactPeopleText.sendKeys(hotelNameAuto);

        WebElement hotelContactPhoneText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        hotelContactPhoneText.sendKeys("15757118217");

        WebElement hotelContactEmailText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelContactEmailText.sendKeys("15757118217@qq.com");



//酒店设施页面

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebElement checkBoxIsCheck = ((FirefoxDriver) driver).findElementByCssSelector(".isCheck");
//        checkBoxIsCheck.click();



        WebElement clickHotelFacilityButton2 = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-_mnV3:nth-child(7) > a:nth-child(1)");
        clickHotelFacilityButton2.click();


        WebElement hotelBusinessImageButton = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(10) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > div:nth-child(2) > span:nth-child(1) > div:nth-child(2) > div:nth-child(2)");
        hotelBusinessImageButton.click();


//酒店资格证页面


//        WebElement saveHotelImagePageButton = ((FirefoxDriver) driver).findElementByCssSelector("#imageButton");
//        saveHotelImagePageButton.click();


        WebElement hotelCooperativeNameText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[14]/div[1]/div[1]/div[2]/input");
        hotelCooperativeNameText.sendKeys(hotelNameAuto);

        WebElement hotelCooperativeMoneyText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[14]/div[2]/div/div[2]/div/div[2]/div/div[2]/input");
        hotelCooperativeMoneyText.sendKeys("5");

        WebElement paymentRadio = ((FirefoxDriver) driver).findElementByCssSelector("label.ant-radio-wrapper:nth-child(3) > span:nth-child(1) > input:nth-child(1)");
        paymentRadio.click();

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement hotelCooperativeRadio = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelCooperativeRadio.sendKeys(hotelNameAuto);

        WebElement hotelCooperativeNumberText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        hotelCooperativeNumberText.sendKeys("1112233456877");

        WebElement hotelBankText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[16]/div[3]/div[1]/div[2]/input");
        hotelBankText.sendKeys("中国农业银行·ギ");

        WebElement bankNameText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
        bankNameText.sendKeys("中国农业银行西湖支行·ギ");

        WebElement bankNumberText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        bankNumberText.sendKeys("1112233456877");



        WebElement getCooperativeStartTimeText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
        getCooperativeStartTimeText.click();

        WebElement getCooperativeStartTimeTodayButton = ((FirefoxDriver) driver).findElementByCssSelector(".ant-calendar-footer-btn");
        getCooperativeStartTimeTodayButton.click();

        WebElement getCooperativeEndTimeText = ((FirefoxDriver) driver).findElementByCssSelector("div.hotelFill-1yLuC:nth-child(16) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
        getCooperativeEndTimeText.click();

        WebElement getCooperativeEndTimeTodayButton = ((FirefoxDriver) driver).findElementByCssSelector(".ant-calendar-footer-btn");
        getCooperativeEndTimeTodayButton.click();

        WebElement clickCooperativeIdButton = ((FirefoxDriver) driver).findElementByCssSelector("div.flexbox:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)");
        clickCooperativeIdButton.click();

        //切换回主按钮
        driver.switchTo().defaultContent();
        WebElement quitButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div[2]/a");
        // quitButton.click();


        //关闭并退出浏览器
        //driver.quit();
    }

}
