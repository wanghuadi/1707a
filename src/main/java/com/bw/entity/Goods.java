package com.bw.entity;


public class Goods implements java.io.Serializable {

	//columns START
	private Integer gid;
	private String gname;
	private String gname2;
	private Integer bid;
	private Integer gsid;
	private String size;
	private String price;
	private Integer num;
	private String label;
	private String gimg;
	
	
	private String bname;
	private String gsname;
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getGsname() {
		return gsname;
	}

	public void setGsname(String gsname) {
		this.gsname = gsname;
	}

	//columns END
	public Goods(){
	}
	public Goods(Integer gid,String gname,String gname2,Integer bid,Integer gsid,String size,String price,Integer num,String label,String gimg){
		this.gid=gid;		this.gname=gname;		this.gname2=gname2;		this.bid=bid;		this.gsid=gsid;		this.size=size;		this.price=price;		this.num=num;		this.label=label;		this.gimg=gimg;	}

	public void setGid(Integer gid){
		this.gid=gid;
	}
	public Integer getGid(){
		return gid;
	}

	public void setGname(String gname){
		this.gname=gname;
	}
	public String getGname(){
		return gname;
	}

	public void setGname2(String gname2){
		this.gname2=gname2;
	}
	public String getGname2(){
		return gname2;
	}

	public void setBid(Integer bid){
		this.bid=bid;
	}
	public Integer getBid(){
		return bid;
	}

	public void setGsid(Integer gsid){
		this.gsid=gsid;
	}
	public Integer getGsid(){
		return gsid;
	}

	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return size;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return price;
	}

	public void setNum(Integer num){
		this.num=num;
	}
	public Integer getNum(){
		return num;
	}

	public void setLabel(String label){
		this.label=label;
	}
	public String getLabel(){
		return label;
	}

	public void setGimg(String gimg){
		this.gimg=gimg;
	}
	public String getGimg(){
		return gimg;
	}
}

