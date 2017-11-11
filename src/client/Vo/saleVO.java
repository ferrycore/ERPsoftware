package client.Vo;

import java.io.Serializable;

public class saleVO implements Serializable{
	String NO;
	int kind;
	int level;
	String account;
	String base;
	goodsOutListVO goodslist;
	goodsOutListVO goodsoutlist;
	double sum;
	double cut;
	double voucher;
	double finalsum;
	public saleVO(String n1,int k,int l,String a,String b,goodsOutListVO g1,goodsOutListVO g2,double s,double c,double v,double f){
		NO = n1;
		kind = k;
		level = l;
		account = a;
		base = b;
		goodslist = g1;
		goodsoutlist = g2;
		sum = s;
		cut = c;
		voucher = v;
		finalsum = f;
	}
}
