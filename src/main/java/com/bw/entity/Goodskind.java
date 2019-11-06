package com.bw.entity;


public class Goodskind implements java.io.Serializable {

	//columns START
	private Integer gsid;
	private String gsname;
	//columns END
	public Goodskind(){
	}
	public Goodskind(Integer gsid,String gsname){
		this.gsid=gsid;		this.gsname=gsname;	}

	public void setGsid(Integer gsid){
		this.gsid=gsid;
	}
	public Integer getGsid(){
		return gsid;
	}

	public void setGsname(String gsname){
		this.gsname=gsname;
	}
	public String getGsname(){
		return gsname;
	}
}

