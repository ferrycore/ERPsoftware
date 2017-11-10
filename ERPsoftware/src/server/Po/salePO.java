package po;

import java.io.Serializable;

public class salePO implements Serializable{
	String NO;
	int kind;
	int level;
	String account;
	String base;
	goodsOutListPO goodslist;
	goodsOutListPO goodsoutlist;
	double sum;
	double cut;
	double voucher;
	double finalsum;
	public salePO(String n1,int k,int l,String a,String b,goodsOutListPO g1,goodsOutListPO g2,double s,double c,double v,double f){
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
