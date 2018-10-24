package Index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//firefox浏览器
public class Login {


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
            driver.get("http://www.51miyi.com:8281/upms-web/index");
            //getTitle()获取当前页面title的值
            System.out.println("当前打开页面的标题是： "+ driver.getTitle());

            //关闭并退出浏览器
            //driver.quit();

        }



}
