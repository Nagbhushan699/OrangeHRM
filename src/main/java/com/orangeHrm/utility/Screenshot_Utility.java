package com.orangeHrm.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot_Utility {
	public static void takesScreenshot(WebDriver driver,String screenshotName) throws IOException {
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"Screenshots"+File.separator+screenshotName+".jpg";
		File file=new File(fullpath);
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=	screenshot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
