package HotelManagement.PhotoMangage;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadBaiDuTest {

    public static void main(String[] args) throws Exception {

        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        //初始化Chrome浏览器实例

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.baidu.com");

        // 指定图片的路径，这里我放桌面上
        StringSelection sel = new StringSelection("C:\\Users\\Administrator\\Desktop\\selenium.jpg");

        // 把图片文件路径复制到剪贴板
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
        System.out.println("selection" +sel);

        // 点击照相机这个按钮
        driver.findElement(By.xpath("//*/span[@class='soutu-btn']")).click();

        // 点击本地上传图片
        driver.findElement(By.xpath("//*/input[@class='upload-pic']")).click();

        // 新建一个Robot类的对象
        Robot robot = new Robot();
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

    }

}
