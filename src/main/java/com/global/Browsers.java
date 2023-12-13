package com.global;

public enum Browsers {


	Browser("chrome"),
	URL("http://localhost:81/");
	

	
	public String data;
	Browsers(String data)
	{
		this.data=data;
	}
	public String getdata()
	{
		return data;
	}
	


}
