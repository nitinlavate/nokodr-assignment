package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel 
{
	public static String fetchData(String s,int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ForgetPassData(Email).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(s).getRow(0).getCell(0).toString();
		//String data = sheet.getRow(row).getCell(col).toString();
		return data;
	}
}
