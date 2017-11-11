package client.Vo;

import java.io.Serializable;

public class coVO implements Serializable{
	String account;
	double money;
	public coVO(String a,double m){
		account = a;
		money = m;
	}
	public String getAccount(){
		return account;
	}
	public double getMoney(){
		return money;
	}
}
