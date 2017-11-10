package po;

import java.io.Serializable;

public class logPO implements Serializable{
	String NO;
	String date;
	String job;
	String userNO;
	String billNO;
	String operaterNO;
	String note;
	public logPO(String n1,String d,String j,String u,String b,String o,String n2){
		NO = n1;
		date = d;
		job = j;
		userNO = u;
		billNO = b;
		operaterNO = o;
		note = n2;
	}
	public String getNO(){
		return NO;
	}	
	public String getDate(){
		return date;
	}	
	public String getJob(){
		return job;
	}	
	public String getUserNO(){
		return userNO;
	}
	public String getBillNO(){
		return billNO;
	}
	public String getOperaterNO(){
		return operaterNO;
	}
	public String getNote(){
		return note;
	}
}
