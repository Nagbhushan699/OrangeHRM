package com.orangeHrm.utility;

public class Calendar_Utility {
	String newXpath;
public String calendarSel_Yr(String xpath,String replaceWord) {
	newXpath=xpath.replace("year", replaceWord);
	return newXpath;
}
public String calendarSel_Mon(String xpath,String replaceWord) {
	newXpath=xpath.replace("month", replaceWord);
	return newXpath;
}
public String calendarSel_Date(String xpath,String replaceWord) {
	newXpath=xpath.replace("day", replaceWord);
	return newXpath;
}

}
