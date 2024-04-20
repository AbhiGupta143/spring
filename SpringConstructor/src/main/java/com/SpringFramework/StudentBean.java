package com.SpringFramework;

public class StudentBean {
	private int sid;
	private String name;
	private AddressBean addr;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int sid, String name, AddressBean addr) {
		super();
		this.sid = sid;
		this.name = name;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressBean getAddr() {
		return addr;
	}
	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", name=" + name + ", addr=" + addr + "]";
	}
	
}