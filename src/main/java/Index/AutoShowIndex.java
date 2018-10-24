package Index;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//chrome浏览器
public class AutoShowIndex {
    public static void main(String[] args) {


        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        //初始化Chrome浏览器实例

            WebDriver driver = new ChromeDriver();
            driver.get("http://www.51miyi.com:8281/upms-web/index");
            try {
                //页面等待
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //关闭浏览器进程及驱动
            //driver.close();


    }



}
