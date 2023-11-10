package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	/**
	 * 
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Throwable
	 */
	//read data from property file
	public String readPropData(String propPath, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty( key, "Incorrect key");
		return propValue;
	}
	
	/**
	 * 
	 * @param excelPath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return excelValue
	 * @throws Throwable
	 */
	
//	//read data from excel file
//	public String readExcelData(String excelPath, String sheet, int row, int cell) throws Throwable
//	{
//		FileInputStream fis = new FileInputStream(excelPath);
//	    Workbook wb = WorkbookFactory.create(fis);
//	    String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
//	    return excelValue;
//	    }
//	
	/**
	 * 
	 * @param excelPath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
	
	//Write data into excel file
	public void setCellData(String excelPath, String sheet, int row, int cell,String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
	    Workbook wb = WorkbookFactory.create(fis);
	    wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
	    
	    FileOutputStream fos = new FileOutputStream(excelPath);
	     wb.write(fos);
	}
	
	/**
	 * 
	 * @param excelPath
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	//get last row number
	public int getRowCount(String excelPath, String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
	    Workbook wb = WorkbookFactory.create(fis);
	    int rowCount = wb.getSheet(sheet).getLastRowNum();
	    return rowCount;
		
	}


}
