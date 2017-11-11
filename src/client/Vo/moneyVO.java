package client.Vo;

import java.io.Serializable;

public class moneyVO implements Serializable{
	String consumer;
	moneyList1 moneylist;
	double sum;
	public moneyVO(String c,moneyList1 m,double s){
		consumer = c;
		moneylist = m;
		sum = s;
	}
	public String getConsumer(){
		return consumer;
	}
	public moneyList1 getMoneyList(){
		return moneylist;
	}
	public double getSum(){
		return sum;
	}
}
class moneyList1{
	String coAccount;
	double money;
	public moneyList1(String c,double m){
		coAccount = c;
		money = m;
	}
	public String getCoAccount(){
		return coAccount;
	}
	public double getMoney(){
		return money;
	}
}
