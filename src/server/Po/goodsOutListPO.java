package server.Po;

import java.io.Serializable;

public class goodsOutListPO implements Serializable{
	String NO;
	String name;
	String model;
	int num;
	double price;
	double sum;
	public goodsOutListPO(String n1,String n2,String m1,int n3,double p,double s){
		NO = n1;
		name = n2;
		model = m1;
		num = n3;
		price = p;
		sum = s;
	}
	public String getNO(){
		return NO;
	}
	public String getName(){
		return name;
	}
	public String getModel(){
		return model;
	}
	public int getNum(){
		return num;
	}	
	public double getPrice(){
		return price;
	}
	public double getSum(){
		return sum;
	}
}
