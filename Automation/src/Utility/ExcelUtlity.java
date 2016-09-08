package Utility;
import java.io.*;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
public class ExcelUtlity {
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
	
public static void setExcelFile(String Path, String SheetName){
	try
	{        
		/*File file = new File(SheetName);
	    FileInputStream fIP = new FileInputStream(file);
	      //Get the workbook instance for XLSX file 
	    XSSFWorkbook workbook = new XSSFWorkbook(Path);
	    XSSFSheet sheet=workbook.getSheetAt(0);*/
	    FileInputStream ExcelFile = new FileInputStream(Path);
	    ExcelWBook = new XSSFWorkbook(Path);
        ExcelWSheet = ExcelWBook.getSheetAt(0);
	    
	}
	catch(Exception ex)
	{
	
	}
}
public static String getCellData(int RowNum, int ColNum){
	Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
    String CellData = Cell.getStringCellValue();
    return CellData;
}
}

