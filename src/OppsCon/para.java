package OppsCon;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class para {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\JavaProg\\TestData\\Book1.xlsx");
	   
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = excel.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
	}

}
