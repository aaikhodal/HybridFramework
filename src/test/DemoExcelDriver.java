package test;

import utility.ExcelDriver;

public class DemoExcelDriver {
	
	
	
	public static void main(String[] args) {
		try {
			ExcelDriver excel = new ExcelDriver();
			String filename = "C:\\Users\\Saurabh Dhingra\\workspace_qa\\ModularFramework\\output\\Test.xlsx";
			String sheetName = "TestData";
			
			excel.createExcelWorkbook(filename);
			
			excel.openExcelWorkbook(filename);
			
			excel.createSheet(sheetName);
			
			excel.setCellData(sheetName, 1, 1, "Saurabh");
			excel.setCellData(sheetName, 1, 2, "Rupesh");
			
			excel.setCellData(sheetName, 2, 1, "Arun");
			excel.setCellData(sheetName, 2, 2, "Jasmeet");
			
			excel.save();
			
			excel.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
