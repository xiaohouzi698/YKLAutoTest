package HotelManagement.HotelManage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class AddHotelNewPageChrome {

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

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement gethotelMangageButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/nav/div[2]/div[1]/ul/li[2]/a/span[2]");
        gethotelMangageButton.click();

        WebElement pagehotelMangageButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/nav/div[2]/div[1]/ul/li[2]/ul/li[1]/a");
        pagehotelMangageButton.click();

       /*
        WebElement addHotelButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/div/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/button[1]");
        driver.switchTo().frame("J_iframe");
        */

        driver.switchTo().frame("iframe1");

        // driver.switchTo().frame(driver.findElementByXPath("//iframe[contains(@src,'myframe')]"));

        WebElement addHotelButton = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"hotelTableToolbar\"]/button[1]");
        addHotelButton.click();

        try {
            //页面等待
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //基本信息页面等待
        //*[@id="checkHotelName"]
        //WebElement hotelNameText = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");
        WebElement hotelNameText = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/input");
        Long newDateLong = System.currentTimeMillis();// new Date()为获取当前系统时间
        String newDateString = newDateLong.toString();
        String hotelNameAuto = "测试酒店·ギAuto" + newDateString;
        //String hotelNameAuto = "测试酒店·ギAuto";
        hotelNameText.sendKeys(hotelNameAuto);

        WebElement hotelPhoneText = ((ChromeDriver) driver).findElementByCssSelector(".basicInfo-1UGlm > div:nth-child(1) > input:nth-child(1)");
        hotelPhoneText.sendKeys("15757118217");


        WebElement hotelAddressSVGClick = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div");
        Thread.sleep(1000);
        hotelAddressSVGClick.click();
        WebElement hotelAddressSVGText = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div[2]/div/input");
        Thread.sleep(1000);
        hotelAddressSVGText.sendKeys("杭州师范大学");
        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        // 按下回车
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

//
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame("iframe1");

        //酒店星级
        WebElement hotelStar2Button = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[3]/div[3]/div[1]/div[2]/div/div/div/div");
        hotelStar2Button.click();
        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);


        //酒店开业装修时间
        WebElement hotelOpenDateText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div.flex1 > span > div > input");
        hotelOpenDateText.click();

        WebElement hotelOpenDateButton = ((ChromeDriver) driver).findElementByCssSelector(".ant-calendar-month-panel-tbody > tr:nth-child(1) > td:nth-child(1)");
        hotelOpenDateButton.click();

        WebElement hotelDecorateDateText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div.flex1 > span > div > input");
        hotelDecorateDateText.click();

        WebElement hotelDecorateDateButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(12) > div > div > div > div > div > div > div.ant-calendar-month-panel > div > div.ant-calendar-month-panel-body > table > tbody > tr:nth-child(1) > td:nth-child(1)");
        hotelDecorateDateButton.click();


        WebElement hotelFloorText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(5) > div:nth-child(1) > div.flex1 > div > div.ant-input-number-input-wrap > input");
        hotelFloorText.sendKeys("30");

        WebElement hotelRoomsText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div.flex1 > div > div.ant-input-number-input-wrap > input");
        hotelRoomsText.sendKeys("20");

        WebElement hotelDescText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(7) > div:nth-child(1) > div.flex1 > textarea");
        hotelDescText.sendKeys(hotelNameAuto);

        WebElement hotelTrafficText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(3) > div:nth-child(7) > div:nth-child(2) > div.flex1 > textarea");
        hotelTrafficText.sendKeys("酒店交通·ギ");


        WebElement hotelContactPeopleText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div.flex1 > input");
        hotelContactPeopleText.sendKeys(hotelNameAuto);

        WebElement hotelContactPhoneText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div.flex1 > input");
        hotelContactPhoneText.sendKeys("15757118217");

        WebElement hotelContactEmailText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(5) > div:nth-child(2) > div > div.flex1 > input");
        hotelContactEmailText.sendKeys("15757118217@qq.com");


        //酒店设施页面
        Thread.sleep(1000);

        WebElement clickHotelFacilityButton2 = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(6) > a");
        clickHotelFacilityButton2.click();
        Thread.sleep(1000);
        WebElement facilityMakeSureButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(13) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div:nth-child(2) > button.ant-btn.ant-btn-primary");
        facilityMakeSureButton.click();

        Thread.sleep(1000);
        //酒店默认政策
        WebElement clickHotelPoilicyButton2 = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(8) > a");
        clickHotelPoilicyButton2.click();



        //酒店营业执照
        StringSelection hotelBusinessImageURL = new StringSelection("C:\\Users\\Administrator\\Desktop\\hotel\\1.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelBusinessImageURL, null);
        System.out.println("selection" + hotelBusinessImageURL);
        WebElement hotelBusinessImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(11) > div > div:nth-child(1) > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelBusinessImageButton.click();
        // 新建一个Robot类的对象

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


        //税务登记证
        StringSelection hotelTaxImageURL = new StringSelection("C:\\Users\\Administrator\\Desktop\\hotel\\2.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelTaxImageURL, null);
        System.out.println("selection" + hotelTaxImageURL);
        WebElement hotelTaxImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(13) > div > div:nth-child(1) > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelTaxImageButton.click();
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

        //卫生证
        StringSelection hotelCleanImageURL = new StringSelection("C:\\Users\\Administrator\\Desktop\\hotel\\3.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelCleanImageURL, null);
        System.out.println("selection" + hotelCleanImageURL);
        WebElement hotelCleanImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(13) > div > div:nth-child(2) > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelCleanImageButton.click();
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


        //消防证
        StringSelection hotelFireImageURL = new StringSelection("C:\\Users\\Administrator\\Desktop\\hotel\\11.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelFireImageURL, null);
        System.out.println("selection" + hotelCleanImageURL);
        WebElement hotelFireImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(13) > div > div:nth-child(3) > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelFireImageButton.click();
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



        //酒店合作信息页面
        WebElement hotelCooperativeNameText = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[15]/div[1]/div[1]/div[2]/input");
        hotelCooperativeNameText.sendKeys(hotelNameAuto);
        WebElement hotelCooperativeMoneyText = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[1]/div/div[15]/div[2]/div/div[2]/div/div[2]/div/div[2]/input");
        hotelCooperativeMoneyText.sendKeys("5");
        WebElement paymentRadio = ((ChromeDriver) driver).findElementByCssSelector("label.ant-radio-wrapper:nth-child(3) > span:nth-child(1) > input:nth-child(1)");
        paymentRadio.click();

        Thread.sleep(1000);

        WebElement hotelCooperativeRadio = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(2) > div:nth-child(1) > div.flex1 > input");
        hotelCooperativeRadio.sendKeys(hotelNameAuto);

        WebElement hotelCooperativeNumberText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(2) > div:nth-child(2) > div.flex1 > input");
        hotelCooperativeNumberText.sendKeys("1112233456877");

        WebElement hotelBankText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(3) > div:nth-child(1) > div.flex1 > input");
        hotelBankText.sendKeys("中国农业银行·ギ");

        WebElement bankNameText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(3) > div:nth-child(2) > div.flex1 > input");
        bankNameText.sendKeys("中国农业银行西湖支行·ギ");

        WebElement bankNumberText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(4) > div > div.flex1 > input");
        bankNumberText.sendKeys("1112233456877");


        WebElement getCooperativeStartTimeText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(5) > div:nth-child(1) > div.flex1 > span > div > input");
        getCooperativeStartTimeText.click();

//        WebElement getCooperativeStartTimeTodayButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(12) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-footer > span");
//        getCooperativeStartTimeTodayButton.click();
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);



        WebElement clickCooperativeIdButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(6) > div:nth-child(1) > div.flex1 > div.flexbox.aic > button");
        clickCooperativeIdButton.click();

        //合同扫描件上传
        StringSelection hotelCooperativeImageURL = new StringSelection("\"14.jpg\" \"15.jpg\" \"16.jpg\" \"17.jpg\" \"18.jpg\" \"19.jpg\" ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelCooperativeImageURL, null);
        System.out.println("selection" + hotelCooperativeImageURL);
        WebElement hotelCooperativeImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(6) > div:nth-child(2) > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelCooperativeImageButton.click();
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




        //酒店封面照片上传
        StringSelection hotelImageURL = new StringSelection("\"20.jpg\" \"21.jpg\" \"22.jpg\" \"23.jpg\" \"24.jpg\" \"25.jpg\" ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hotelImageURL, null);
        System.out.println("selection" + hotelImageURL);
        WebElement hotelImageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(19) > div > div > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
        hotelImageButton.click();
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

        Thread.sleep(1000);


        WebElement getCooperativeEndTimeText = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div:nth-child(17) > div:nth-child(5) > div:nth-child(2) > div.flex1 > span > div > input");
        getCooperativeEndTimeText.click();
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);
        //跳转到新增物理房型页面
        WebElement addLayoutPageButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div.flexbox.jcc > button");
        addLayoutPageButton.click();

        Thread.sleep(1000);


        WebElement addLayoutButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div.hotelFill-_mnV3 > button");
        addLayoutButton.click();

        Thread.sleep(1000);
        WebElement layoutNameText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(1) > div:nth-child(1) > div.flex1 > input");
        layoutNameText.sendKeys("大床房");

        WebElement layoutFloorText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(1) > div:nth-child(2) > div.flex1 > input");
        layoutFloorText.sendKeys("5-9");

        WebElement layoutPlaceHolderText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(2) > div:nth-child(1) > div.flex1 > input");
        layoutPlaceHolderText.sendKeys("20-35");

        WebElement layoutPersonNumberText = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(2) > div:nth-child(2) > div.flex1 > div > div.ant-input-number-input-wrap > input");
        layoutPersonNumberText.sendKeys("5");
        Thread.sleep(1000);

        WebElement layoutSmokeRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(3) > div:nth-child(1) > div.flex1 > div > label.ant-radio-wrapper.ant-radio-wrapper-checked > span.ant-radio.ant-radio-checked > input");
        layoutSmokeRadio.click();

        WebElement layoutWindowsRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(3) > div:nth-child(2) > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutWindowsRadio.click();

        WebElement layoutNetworkRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(4) > div:nth-child(1) > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutNetworkRadio.click();

        WebElement layoutWIFIRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(4) > div:nth-child(2) > div.flex1 > div > label:nth-child(3) > span.ant-radio > input");
        layoutWIFIRadio.click();

        WebElement layoutAddBedRadio = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(5) > div > div.flex1 > div > label:nth-child(2) > span.ant-radio > input");
        layoutAddBedRadio.click();
        Thread.sleep(1000);
        WebElement layoutBedSizeChooseClick = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(6) > div > div.flex1 > div > div.ant-select.ant-select-enabled > div > span > i > svg");
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

        WebElement layoutBedSizeClick = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(6) > div > div.flex1 > div > div.flexbox.fdc > div > div.ant-select.ant-select-enabled > div > span > i > svg");
        layoutBedSizeClick.click();

        // 按下下键
        robot.keyPress(KeyEvent.VK_DOWN);
        // 释放下键
        robot.keyRelease(KeyEvent.VK_DOWN);
        // 按下回车
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放回车
        robot.keyRelease(KeyEvent.VK_ENTER);


        StringSelection layoutImageURL = new StringSelection("\"40.jpg\" \"41.jpg\" \"42.jpg\" \"43.jpg\" \"44.jpg\" \"45.jpg\" ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(layoutImageURL, null);
        System.out.println("selection" + hotelImageURL);
        WebElement layoutImageButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div.layoutAdder-16ejT > div:nth-child(7) > div > div.flex1 > span > div.ant-upload.ant-upload-select.ant-upload-select-picture-card > span");
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

        WebElement toAssessorButton = ((ChromeDriver) driver).findElementByCssSelector("body > div:nth-child(17) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div:nth-child(2) > button.ant-btn.ant-btn-primary");
        toAssessorButton.click();

        Thread.sleep(5000);
        WebElement sendToAssessorButton = ((ChromeDriver) driver).findElementByCssSelector("#root > div > div.hotelFill-1R9R1 > div > div.ant-tabs-content.ant-tabs-content-animated > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div > div.flexbox.jcc > button.ant-btn.ant-btn-primary");
        sendToAssessorButton.click();
        //切换回主按钮
//        driver.switchTo().defaultContent();
//        WebElement quitButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div[2]/div/div[2]/a");
        // quitButton.click();

        //关闭并退出浏览器
       // driver.quit();
    }

}
