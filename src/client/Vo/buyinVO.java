package client.Vo;

import java.io.Serializable;

public class buyinVO implements Serializable{
	String consumer;
	String base;
	goodsOutListVO goodslist;
	double sum;
	public buyinVO(String c,String b,goodsOutListVO g,double s){
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
	public goodsOutListVO getGoodsList(){
		return goodslist;
	}
	public double getSum(){
		return sum;
	}
}
