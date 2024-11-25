package Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtile {
	Workbook wb;
	public ExcelFileUtile(String Excelpath) throws Throwable {
		FileInputStream fi=new FileInputStream(Excelpath);
		wb=WorkbookFactory.create(fi);
	}
	public int rowcount(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();

	}
	public String getcelldata(String sheetname,int row, int column) {
		String data;
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==CellType.NUMERIC) {
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data=String.valueOf(celldata);
		}else{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();


		}
		return data;

	}
	public void SetCelldata(String sheetname, int row,int coloum, String Status, String WriteExcelpath) {
		Sheet ws=wb.getSheet(sheetname);
		Row rownum=ws.getRow(row);
		
		
	}

}
