package server.Po;

import java.io.Serializable;

public class buyinPO implements Serializable{
	String consumer;
	String base;
	goodsOutListPO goodslist;
	double sum;
	public buyinPO(String c,String b,goodsOutListPO g,double s){
		consumer = c;
		base = b;
		goodslist = g;
		sum = s;
	}
	public String getConsumer(){
		return consumer;
	}
	public String getBase(){
		return base;
	}
	public goodsOutListPO getGoodsList(){
		return goodslist;
	}
	public double getSum(){
		return sum;
	}
}
