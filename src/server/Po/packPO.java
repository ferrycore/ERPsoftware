package server.Po;
import java.io.Serializable;

public class packPO implements Serializable{
	String NO;
	double price;
	public packPO(String n,double p){
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
