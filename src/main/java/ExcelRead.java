import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	XSSFSheet sheet;
	ExcelRead() throws IOException{
		FileInputStream inputfile =new FileInputStream("D:\\JavaSamples\\MyExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		sheet = workbook.getSheet("Sheet1");
	}
	public String readExcelData(int i,int j) {
		XSSFRow row = sheet.getRow(i);
		Cell cell = row.getCell(j);
	 
	return cell.getStringCellValue();

    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead ex = new ExcelRead();
		String s = ex.readExcelData(0, 0);
		System.out.println("EXCEL DATA:"+ s);
		System.out.println("HELLO");

	}
}


