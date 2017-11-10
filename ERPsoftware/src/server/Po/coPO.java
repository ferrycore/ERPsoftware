package po;
import java.io.Serializable;

public class coPO implements Serializable{
	String account;
	double money;
	public coPO(String a,double m){
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
