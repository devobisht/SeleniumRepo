package bitco.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddSalary {

	public static void main(String[] args) throws IOException {

				FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
				XSSFWorkbook wbo= new XSSFWorkbook(fis);
				XSSFSheet wsh=wbo.getSheet("Sheet1");
				
		        	  Row r;
		        	 int len=wsh.getLastRowNum();	
		        	 System.out.println(len);
		        	 
		        	 for(int i=0;i<=len;i++) {
		        		 r=wsh.getRow(i);
		        		 String d1=r.getCell(2).getStringCellValue();
		        		 String d2=r.getCell(3).getStringCellValue();
		        		 
		        		
		        		 System.out.println(d1);
		        		
		        		 	
		        		 FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		        		 wbo.write(fos);
				
		        	 }
		        }
		


	}


