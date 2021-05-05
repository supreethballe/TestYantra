package assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args)throws IOexception, IOException {
		// TODO Auto-generated method stub
     File excelfile =new File("TimeSheet.xlsx");
	FileInputStream fis = new FileInputStream(excelfile);
	  XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	  XSSFSheet sheet = workbook.getSheetAt(0);
	Iterator<Row> rowIt = sheet.iterator();
	
	While(rowit.hasnext());
	{	
	
	Row row =rowIt.next();
	
	iterator<cell>celliterator = row.cellIterator();
	while(celliterator.hasnext()) {
		
		cell cell = celliterator.net();
		System.out.print(cell.toString()+";");
	}
	System.out.println();
	
	}
   workbook.close();
   fis.close();
	  }
	}

