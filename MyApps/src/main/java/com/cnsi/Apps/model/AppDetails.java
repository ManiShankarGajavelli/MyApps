package com.cnsi.Apps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer AppId;
	private String AppName;
	private String AppShortName;
	private String AppType;
	private String AppDescription;
	private String AppURL;
	
	public String getAppName() {
		return AppName;
	}
	public void setAppName(String appName) {
		AppName = appName;
	}
	public String getAppShortName() {
		return AppShortName;
	}
	public void setAppShortName(String appShortName) {
		AppShortName = appShortName;
	}
	public String getAppType() {
		return AppType;
	}
	public void setAppType(String appType) {
		AppType = appType;
	}
	public String getAppDescription() {
		return AppDescription;
	}
	public void setAppDescription(String appDescription) {
		AppDescription = appDescription;
	}
	public String getAppURL() {
		return AppURL;
	}
	public void setAppURL(String appURL) {
		AppURL = appURL;
	}
	public AppDetails(Integer appId, String appName, String appShortName, String appType, String appDescription,
			String appURL) {
		super();
		AppId = appId;
		AppName = appName;
		AppShortName = appShortName;
		AppType = appType;
		AppDescription = appDescription;
		AppURL = appURL;
	}
	@Override
	public String toString() {
		return "AppDetails [AppId=" + AppId + ", AppName=" + AppName + ", AppShortName=" + AppShortName + ", AppType="
				+ AppType + ", AppDescription=" + AppDescription + ", AppURL=" + AppURL + "]";
	}
	
}
