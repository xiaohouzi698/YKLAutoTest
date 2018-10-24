package HotelManagement.HotelManage;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcelGetBusinessLicence {


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
                        Robot robot = new Robot();
                        XSSFCell cellX0 = (XSSFCell) row.getCell(0);
                        cellX0.setCellType(CellType.STRING);


                        cellX0.setCellType(CellType.STRING);

                        String url = cellX0.getStringCellValue();

                        try {
                           // System.out.println(url);

                            String outpath="F:\\businesslicence ";
                            String cmd = "cmd /c F:\\Software\\wget\\GnuWin32\\bin\\wget.exe -P " + outpath + url;
                            System.out.println(cmd);
                            System.out.println("\n当前位置："+rIndex);
                            Process process =Runtime.getRuntime().exec(cmd);

                            if(rIndex % 100 == 0) {
                                try {
                                    //页面等待
                                    Thread.sleep(2000);

                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                           // process.destroy();

                        } catch (IOException e) {
                            e.printStackTrace();
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
