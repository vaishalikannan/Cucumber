package org.test;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws Throwable{
		File f = new File("C:\\Users\\Vinoth\\Desktop\\Vinoth\\TestID\\target\\ExcelWrite.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Data");
		
		Row r = s.createRow(0);
		
		Cell c = r.createCell(0);
		
		c.setCellValue("Vaishali");
		
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		System.out.println("Done");
	}
}
