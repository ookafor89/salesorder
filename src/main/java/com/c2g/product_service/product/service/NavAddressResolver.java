package com.c2g.product_service.product.service;

public class NavAddressResolver {
	private String userName;
	private String password;
	private String baseUrl="http://win-loalmmb2je9:7047/DynamicsNAV80/WS/CRONUS%20International%20Ltd./Page/salesorder";
	
	public void setBaseUrl(String baseUrl){
		this.baseUrl=baseUrl;
	}
	
	public String getUrl(){
		return baseUrl;
	}	
	
	public void setUsername(String userName){
		this.userName=userName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setPssword(String password){
		this.password=password;
	}
	
	public String getPssword(){
		return password;
	}
	
}
