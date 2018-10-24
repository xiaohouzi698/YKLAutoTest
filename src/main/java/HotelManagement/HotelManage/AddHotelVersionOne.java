package HotelManagement.HotelManage;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AddHotelVersionOne {

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
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
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

        WebElement addHotelButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/button[1]");
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
        WebElement hotelNameText =((FirefoxDriver) driver).findElementByCssSelector("#checkHotelName");
        Long newDateLong=System.currentTimeMillis();// new Date()为获取当前系统时间
        String newDateString=newDateLong.toString();
        //String hotelNameAuto="测试酒店·ギAuto"+newDateString;
        String hotelNameAuto="测试酒店·ギAuto";
        hotelNameText.sendKeys(hotelNameAuto);

        WebElement hotelPhoneText =((FirefoxDriver) driver).findElementByCssSelector("#phone");
        hotelPhoneText.sendKeys("15757118217");

//        WebElement hotelAddressText =((FirefoxDriver) driver).findElementByCssSelector("#addr");
//        hotelAddressText.sendKeys("浙江省杭州市余杭区海曙路");


//        WebElement hotelChooseAddressButton = ((FirefoxDriver) driver).findElementByCssSelector("#select_addr");
//        hotelChooseAddressButton.click();
//
//        try {
//            //页面等待
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.switchTo().frame("layui-layer-iframe1");


        //WebElement makeButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div[1]/div/div[1]/div/div/div/img");
        //makeButton.click();

//
//        WebElement hotelKeyWordText =((FirefoxDriver) driver).findElementByCssSelector("#tipinput");
//        hotelKeyWordText.sendKeys("杭州师范大学仓前校区");
//        hotelKeyWordText.sendKeys(Keys.DOWN);
//        hotelKeyWordText.sendKeys(Keys.DOWN);
//        hotelKeyWordText.sendKeys(Keys.DOWN);
//        hotelKeyWordText.sendKeys(Keys.DOWN);
//        hotelKeyWordText.sendKeys(Keys.ENTER);
//
//        //WebElement makeSureAddressButton = ((FirefoxDriver) driver).findElementByCssSelector("#confirm");
//        //makeSureAddressButton.click();
//        WebElement makeButton = ((FirefoxDriver) driver).findElementByXPath("//*[@id=\"confirm\"]");
//        makeButton.click();
//
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame("iframe1");


        WebElement hotelLongText =((FirefoxDriver) driver).findElementByCssSelector("#longitude");
        hotelLongText.sendKeys("120.012299");

        WebElement hotelLatText =((FirefoxDriver) driver).findElementByCssSelector("#latitude");
        hotelLatText.sendKeys("30.29196");

        WebElement hotelOpenDateText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(15) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
        hotelOpenDateText.sendKeys("2018-01");

        WebElement hotelDecorateDateText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(16) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
        hotelDecorateDateText.sendKeys("2018-04");
        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement hotelFloorText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(17) > div:nth-child(2) > input:nth-child(1)");
        hotelFloorText.sendKeys("30");

        WebElement hotelRoomsText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(18) > div:nth-child(2) > input:nth-child(1)");
        hotelRoomsText.sendKeys("20");

        WebElement hotelDescText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(20) > div:nth-child(2) > textarea:nth-child(1)");
        hotelDescText.sendKeys("酒店介绍");

        WebElement hotelTrafficText =((FirefoxDriver) driver).findElementByCssSelector("div.form-group:nth-child(21) > div:nth-child(2) > textarea:nth-child(1)");
        hotelTrafficText.sendKeys("酒店交通");
        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement hotelContactPeopleText =((FirefoxDriver) driver).findElementByCssSelector("#hotelAddTable > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
        hotelContactPeopleText.sendKeys("洪涛");

        WebElement hotelContactPhoneText =((FirefoxDriver) driver).findElementByCssSelector("#checkContactPhone");
        hotelContactPhoneText.sendKeys("15757118217");

        WebElement hotelContactEmailText =((FirefoxDriver) driver).findElementByCssSelector("#hotelAddTable > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
        hotelContactEmailText.sendKeys("15757118217@qq.com");

        try {

            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement saveHotelBasicPageButton = ((FirefoxDriver) driver).findElementByCssSelector("#saveHotel");
        saveHotelBasicPageButton.click();


//酒店设施页面

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebElement checkBoxIsCheck = ((FirefoxDriver) driver).findElementByCssSelector(".isCheck");
//        checkBoxIsCheck.click();

        WebElement checkBox = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/span[3]/input");
        checkBox.click();
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement checkBoxGetPlane = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[1]/tbody/tr/td[1]/div[1]/label[1]");
        checkBoxGetPlane.click();

        WebElement checkBoxGetChineseRestaurant = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[1]/tbody/tr/td[2]/div[1]/label[1]");
        checkBoxGetChineseRestaurant.click();

        WebElement checkBoxBallroomDancing = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[1]/tbody/tr/td[3]/div[1]/label[1]");
        checkBoxBallroomDancing.click();

        WebElement checkBoxChinaPhone = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[1]/tbody/tr/td[4]/div[1]/label[1]");
        checkBoxChinaPhone.click();

        WebElement showHideButton = ((FirefoxDriver) driver).findElementByXPath("//*[@id=\"btn_td3\"]");
        showHideButton.click();

        WebElement radioBar = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[1]/tbody/tr/td[4]/div[2]/label[1]/label[2]");
        radioBar.click();

        WebElement livingHotelPolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[1]/div[2]/textarea");
        livingHotelPolicyText.sendKeys("住离店政策");

        WebElement childPolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[2]/div[2]/textarea");
        childPolicyText.sendKeys("儿童政策");

        WebElement hotelServicePolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[3]/div[2]/textarea");
        hotelServicePolicyText.sendKeys("酒店服务");

        WebElement animalPolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[4]/div[2]/textarea");
        animalPolicyText.sendKeys("宠物政策");

        WebElement payPolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[5]/div[2]/textarea");
        payPolicyText.sendKeys("可支付方式");

        WebElement memberPolicyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/table[2]/tbody/tr/td[6]/div[2]/textarea");
        memberPolicyText.sendKeys("会员政策");

        WebElement saveHotelFacilityPageButton = ((FirefoxDriver) driver).findElementByCssSelector("#facilitiesButton");
        saveHotelFacilityPageButton.click();



//酒店资格证页面

        try {

            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        WebElement saveHotelImagePageButton = ((FirefoxDriver) driver).findElementByCssSelector("#imageButton");
//        saveHotelImagePageButton.click();


        WebElement hotelCooperativeNameText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div[1]/div/input");
        hotelCooperativeNameText.sendKeys(hotelNameAuto);

        WebElement hotelCooperativeMoneyText =((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div[2]/div/input");
        hotelCooperativeMoneyText.sendKeys("5");

        WebElement hotelCooperativeRadio =((FirefoxDriver) driver).findElementByCssSelector("label.radio-inline:nth-child(3) > input:nth-child(1)");
        hotelCooperativeRadio.sendKeys(hotelNameAuto);



        //切换回主按钮
        driver.switchTo().defaultContent();
        WebElement quitButton = ((FirefoxDriver) driver).findElementByXPath("/html/body/div[2]/div/div[2]/a");
       // quitButton.click();


        //关闭并退出浏览器
        //driver.quit();

    }
}
