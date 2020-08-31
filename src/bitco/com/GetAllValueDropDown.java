package bitco.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllValueDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
          driver=new ChromeDriver();
           driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
	
     WebElement ele= driver.findElement(By.id("blog-cat-dropdown"));
        Select sel= new Select(ele);
       List<WebElement> select      =sel.getOptions();
          for(WebElement word:select) {
        	
     	System.out.println(word.getText());
      }
	
	
	

		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\WFX_Test.xlsx");
		XSSFWorkbook wbo= new XSSFWorkbook(fis);
		XSSFSheet wsh=wbo.getSheet("wfx");
		
        	  Row r;
        	 int rowc=wsh.getLastRowNum();		
        	 for(int i=0;i<rowc;i++) {
        		 r=wsh.getRow(i);
        		 String data=r.getCell(0).getStringCellValue();
        		 System.out.println(data);
        		 FileOutputStream fos=new FileOutputStream("C:\\Users\\\\HP\\Downloads\\WFX_Test.xlsx");
        		 wbo.write(fos);
        	 }
        
	}
}


