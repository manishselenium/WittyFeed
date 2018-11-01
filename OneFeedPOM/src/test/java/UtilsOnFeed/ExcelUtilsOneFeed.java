package UtilsOnFeed;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilsOneFeed {
	
	public static final String SAMPLE_XLSX_FILE_PATH = "./OnFeedData.xlsx";

	public static String GetCellData(int RowNum, int ColNum) throws Exception {

		Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

		Sheet sheet = workbook.getSheetAt(0);

		Cell hello = sheet.getRow(RowNum).getCell(ColNum);

		String CellData = hello.getStringCellValue();

		workbook.close();

		return CellData;

}
}