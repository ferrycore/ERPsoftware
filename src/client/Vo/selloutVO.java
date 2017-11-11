package client.Vo;

import java.io.Serializable;

public class selloutVO implements Serializable{
	String consumer;
	String server;
	String base;
	goodsOutListVO goodsoutlist;
	double sum;
	double cut;
	double voucher;
	double finalsum;
	public selloutVO(String c1,String s1,String b,goodsOutListVO g,double s2,double c,double v,double f){
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
	public goodsOutListVO getGoodsOutList(){
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
