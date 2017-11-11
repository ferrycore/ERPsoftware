package server.Po;

import java.io.Serializable;

public class userPO implements Serializable{
	String NO;
	String job;
	int level;
	String name;
	String tel;
	String mail;
	String email;
	String add;
	double year;
	double password;
	public userPO(String n1,String j,int l,String n2,String t,String m,String e,String a,double y,double p){
		NO = n1;
		job = j;
		level = l;
		name = n2;
		tel = t;
		mail = m;
		email = e;
		add = a;
		year = y;
		password = p;
	}
	public String getNO(){
		return NO;
	}
	public String getJob(){
		return job;
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
	public String getAdd(){
		return add;
	}
	public double getYear(){
		return year;
	}
	public double getPassword(){
		return password;
	}
}
