package po;

import java.io.Serializable;

public class goodskindsPO implements Serializable{
	String NO;
	String name;
	int father;
	public goodskindsPO(String n1,String n2,int f){
		NO = n1;
		name = n2;
		father = f;
	}
	public String getNO(){
		return NO;
	}
	public String getName(){
		return name;
	}
	public int getFather(){
		return father;
	}
}
