package po;

import java.io.Serializable;

public class goodsPO implements Serializable{
	String NO;
	String name;
	String model;
	int num;
	double inPrice;
	double outPrice;
	double receInPrice;
	String batch;
	int batchNO;
	String date;
	int kinds;
	public goodsPO(String n1,String n2,String m1,int n3,double i,double o,double r,String b1,int b2,String d,int k){
		NO = n1;
		name = n2;
		model = m1;
		num = n3;
		inPrice = i;
		outPrice = o;
		receInPrice = r;
		batch = b1;
		batchNO = b2;
		date = d;
		kinds = k;
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
	public double getinPrice(){
		return inPrice;
	}
	public double getoutPrice(){
		return outPrice;
	}
	public double getreceInPrice(){
		return receInPrice;
	}
	public String getBatch(){
		return batch;
	}
	public int getBatchNO(){
		return batchNO;
	}
	public String getDate(){
		return date;
	}
	public int getKinds(){
		return kinds;
	}
}
