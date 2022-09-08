package com.orangeHrm.qa.page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.utility.ExcelReader;

public class Sample_Excel_Reader {
	@Test(dataProvider="dp")
	public void getDataFromOneColumn(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	@DataProvider(name ="dp")
	public Object[][] dp() throws IOException{
		String userDir=System.getProperty("user.dir");
		String path=userDir+"\\src\\main\\java\\com\\orangeHrm\\utility\\Test_Data.xlsx";
		String sheetName="Credentials";
		ExcelReader excel=new ExcelReader(path,sheetName);
		return excel.getDatafromAllRow(0);
	}
}
