package com.SpringFramework;

public class StudentBean {
	 private int StdId;
	    private String Name;
	    private int rollno;
		public StudentBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StudentBean(int stdId, String name, int rollno) {
			super();
			StdId = stdId;
			Name = name;
			this.rollno = rollno;
		}
		public int getStdId() {
			return StdId;
		}
		public void setStdId(int stdId) {
			StdId = stdId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
	    
		
		public void display() {
			System.out.println("Student Record"+"\n"+"STudentId = "+ StdId +"\n" + "StudentName = "+ Name + "\n"+ "StudentRollNo = "+ rollno);
		}

}
