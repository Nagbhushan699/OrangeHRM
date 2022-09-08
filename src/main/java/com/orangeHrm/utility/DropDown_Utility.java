package com.orangeHrm.utility;

import com.orangeHrm.qa.Constans.Constants;

public class DropDown_Utility {
	String newXpath;
	public String getLeaveStatus(String xpath,String replaceWord) {
		newXpath=xpath.replace("status", replaceWord);
		return newXpath;
	}
	public String getUserRole(String xpath,String replaceword) {
		newXpath=xpath.replace("role",Constants.USER_ROLE[0]);
		return newXpath;
	}
	public String getAdminStatus(String xpath,String replaceword) {
		newXpath=xpath.replace("admin",Constants.USER_ROLE[0]);
		return newXpath;
	}
}
