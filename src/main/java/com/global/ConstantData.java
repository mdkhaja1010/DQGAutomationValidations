package com.global;

public enum ConstantData {

	microsoftTitle("Sign in to your account"),
	DQGTitle("Data Quality Gateway");
	
	
	
	String data;
	ConstantData(String data) {
		this.data=data;
	}
	public String getdata()
	{
		return data;
	}
}
