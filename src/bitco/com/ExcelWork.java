package bitco.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWork {

	public static void main(String[] args) throws IOException {


		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo= new XSSFWorkbook(fis);
		XSSFSheet wsh=wbo.getSheet("Sheet2");
		
        	  Row r;
        	 int l=wsh.getLastRowNum();	
        	 System.out.println(l);
        	 
        	 for(int i=0;i<=l;i++) {
        		 r=wsh.getRow(i);
        		 String data=r.getCell(3).getStringCellValue();
        		 System.out.println(data);
        		 r.createCell(5).setCellValue(data);
        		 	
        		 FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
        		 wbo.write(fos);
		
        	 }
        }
}
