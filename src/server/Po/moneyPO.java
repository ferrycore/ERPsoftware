package server.Po;

import java.io.Serializable;

public class moneyPO implements Serializable{
	String consumer;
	moneyList moneylist;
	double sum;
	public moneyPO(String c,moneyList m,double s){
		consumer = c;
		moneylist = m;
		sum = s;
	}
	public String getConsumer(){
		return consumer;
	}
	public moneyList getMoneyList(){
		return moneylist;
	}
	public double getSum(){
		return sum;
	}
}
class moneyList{
	String coAccount;
	double money;
	public moneyList(String c,double m){
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
