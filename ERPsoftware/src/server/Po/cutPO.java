package po;
import java.io.Serializable;

public class cutPO implements Serializable{
	String NO;
	int level;
	double discount;
	double voucher;
	String packNO;
	public cutPO(String n,int l,double c,double v,String p){
		NO = n;
		level = l;
		discount = c;
		voucher = v;
		packNO = p;
	}
	public String getNO(){
		return NO;
	}
	public int getLevel(){
		return level;
	}
	public double getCut(){
		return discount;
		}
	public double getVoucher(){
		return voucher;
	}
	public String getpackNO(){
		return packNO;
	}
}
