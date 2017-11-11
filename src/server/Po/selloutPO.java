package server.Po;

import java.io.Serializable;

public class selloutPO implements Serializable{
	String consumer;
	String server;
	String base;
	goodsOutListPO goodsoutlist;
	double sum;
	double cut;
	double voucher;
	double finalsum;
	public selloutPO(String c1,String s1,String b,goodsOutListPO g,double s2,double c,double v,double f){
		consumer = c1;
		server = s1;
		base = b;
		goodsoutlist = g;
		sum = s2;
		cut = c;
		voucher = v;
		finalsum = f;
	}
	public String getConsumer(){
		return consumer;
	}
	public String getServer(){
		return server;
	}
	public String getBase(){
		return base;
	}
	public goodsOutListPO getGoodsOutList(){
		return goodsoutlist;
	}
	public double getSum(){
		return sum;
	}
	public double getCut(){
		return cut;
	}
	public double getVoucher(){
		return voucher;
	}
	public double getFinalSum(){
		return finalsum;
	}
}
