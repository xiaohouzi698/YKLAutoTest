package HotelManagement.HotelManage;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class ExcelUpdateJobView {


    public static void main(String[] args) {


        String excelPath = "C:\\Users\\Administrator\\Desktop\\111111.xlsx";

        try {
            File excel = new File(excelPath);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在

                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
                //根据文件后缀（xls/xlsx）进行判断
                if ("xls".equals(split[1])) {
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                } else if ("xlsx".equals(split[1])) {
                    wb = new XSSFWorkbook(excel);
                } else {
                    System.out.println("文件类型错误!");
                    return;
                }

                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0

                int firstRowIndex = sheet.getFirstRowNum() + 1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
                System.out.println("firstRowIndex: " + firstRowIndex);
                System.out.println("lastRowIndex: " + lastRowIndex);


                for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行

                    Row row = sheet.getRow(rIndex);

                    if (row != null) {

                        XSSFCell cellX0 = (XSSFCell) row.getCell(0);
                        cellX0.setCellType(CellType.STRING);


                        cellX0.setCellType(CellType.STRING);

                        String url = cellX0.getStringCellValue();


                        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");

                        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");

                        //初始化一个火狐浏览器实例，实例名称叫driver
                        WebDriver driver = new FirefoxDriver();
                        //最大化窗口
                        driver.manage().window().maximize();
                        //设置隐性等待时间
                        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


                        driver.get("http://www.51miyi.com:8281/upms-web/index");
                        //getTitle()获取当前页面title的值
                        System.out.println("当前打开页面的标题是： " + driver.getTitle());
                        WebElement loginText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[1]");
                        loginText.sendKeys("root");
                        WebElement passwordText = ((FirefoxDriver) driver).findElementByXPath("/html/body/div/div[1]/div[2]/form/input[2]");
                        passwordText.sendKeys("ykl123456");
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

                        System.out.println(url);
                        // get()打开一个站点
                        driver.get(url);
                        //getTitle()获取当前页面title的值

                        System.out.println("当前打开页面的标题是： " + driver.getTitle());


                        try {
                            //页面等待
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        try {
                            WebElement button = ((FirefoxDriver) driver).findElementByXPath("//*[@id=\"root\"]/div/div[2]/div[19]/button[2]");
                            button.click();
                            driver.quit();

                        } catch (Exception e) {
                            driver.quit();
                            continue;
                        }


                    }
                }
                // 创建文件流


            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //关闭并退出浏览器
        //driver.quit();
    }

}
