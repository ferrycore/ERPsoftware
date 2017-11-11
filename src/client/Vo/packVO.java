package client.Vo;

import java.io.Serializable;

public class packVO implements Serializable{
	String NO;
	double price;
	public packVO(String n,double p){
		NO = n;
		price = p;
	}
	public String getNO(){
		return NO;
	}
	public double getPrice(){
		return price;
	}
}
