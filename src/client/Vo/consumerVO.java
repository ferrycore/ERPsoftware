package client.Vo;

import java.io.Serializable;

public class consumerVO implements Serializable{
	String NO;
	int kind;
	int level;
	String name;
	String tel;
	String mail;
	String email;
	double capacity;
	double receive;
	double pay;
	String server;
	String account;
	public consumerVO(String n1,int k,int l,String n2,String t,String m,String e,double c,double r,double p,String s,String a){
		NO = n1;
		kind = k;
		level = l;
		name = n2;
		tel = t;
		mail = m;
		email = e;
		capacity = c;
		receive = r;
		pay = p;
		server = s;
		account = a;
	}
	public String getNO(){
		return NO;
	}
	public int getKind(){
		return kind;
	}
	public int getLevel(){
		return level;
	}
	public String getName(){
		return name;
	}
	public String getTel(){
		return tel;
	}
	public String getMail(){
		return mail;
	}
	public String getEmail(){
		return email;
	}
	public double getCapacity(){
		return capacity;
	}
	public double getReceive(){
		return receive;
	}
	public double getPay(){
		return pay;
	}
	public String getServer(){
		return server;
	}
	public String getAccout(){
		return account;
	}
}
