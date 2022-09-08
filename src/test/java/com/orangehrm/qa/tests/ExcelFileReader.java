package com.orangehrm.qa.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.utility.ExcelReader;

public class ExcelFileReader {
	@Test(dataProvider = "m1")
	public void m2(String s1,String s2,String s3) {
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	}
@DataProvider
public Object[][] m1() throws IOException {
		String projPath=System.getProperty("user.dir");
		String relpath="\\src\\main\\java\\com\\orangeHrm\\utility\\Demo1.xlsx";
		String fullpath=projPath+relpath;
		ExcelReader excel=new ExcelReader(fullpath,"Sheet1");
//		List<String>list=	excel.getDataFromRow(1);
//		for (String str : list) {
//			System.out.print(str+" ");
//		}
	Object[][] obj=excel.getAllData();
	return obj;
}
}
