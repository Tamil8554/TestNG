package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\yuvaraj\\eclipse-workspace\\MavenProject\\Excel\\Sample.xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.createRow(3);
	Cell c = r.createCell(0);
	c.setCellValue("3");
	FileOutputStream fout =new FileOutputStream(f);
	w.write(fout);
	System.out.println("Done");
	
	}

}
