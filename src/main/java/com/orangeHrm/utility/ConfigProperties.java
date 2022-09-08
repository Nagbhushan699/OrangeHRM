package com.orangeHrm.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
public static String rel_Xpath_Uat_Env="\\src\\main\\java\\com\\orangeHrm\\utility\\CongiProperties_Uat_Env.properties";
public static String rel_Xpath_System_Env="\\src\\main\\java\\com\\orangeHrm\\utility\\CongiProperties_SystemTest_Env.properties";
static Properties prop;
public static Properties loadProperties(String env) throws IOException {
	String projectPath=System.getProperty("user.dir");
	String filePath=" ";
	if(env.equals("Uat")) {
		filePath=projectPath+rel_Xpath_Uat_Env;
	}
	else if(env.equals("System")) {
		filePath=projectPath+rel_Xpath_System_Env;
	}
	FileReader file=new FileReader(new File(filePath));
	prop=new Properties();
	prop.load(file);
	return prop;
}

}

