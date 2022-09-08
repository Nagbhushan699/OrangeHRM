package com.orangehrm.qa.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.utility.ExcelReader;

public class NewLoginPageTest {
@Test
public void getDataFromRow() throws IOException {
	String userDir=System.getProperty("user.dir");
	String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Demo1.xlsx";
	String sheetName="Sheet1";
	ExcelReader excel=new ExcelReader(path,sheetName);
	System.out.println(excel.getDataFromRow(1));
}
@Test(dataProvider = "data")
public void getData(String s1,String s2) {
	System.out.print(s1);
	System.out.print(s2);
}
@DataProvider()
public Object[][] data() throws IOException{
	String userDir=System.getProperty("user.dir");
	String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Demo1.xlsx";
	String sheetName="Sheet1";
	ExcelReader excel=new ExcelReader(path,sheetName);
	return excel.getAllData();
}
@Test
public void getDatabyMap() throws IOException {
	String userDir=System.getProperty("user.dir");
	String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Demo1.xlsx";
	String sheetName="Sheet1";
	ExcelReader excel=new ExcelReader(path,sheetName);
	System.out.println(excel.getDataViaMap());
}

}

