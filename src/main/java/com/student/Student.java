/**This class is the one that declare variables related to customer things.**/
package com.student;

public class Student {
	private int sid;
	private String sname;
	private String semail;
	private String sconno;
	private String snic;
	private String sdob;
	private String sgender;
	private String saddress;
	private String susername;
	private String spassword;
	private String proimage;
	
	
	public Student(int sid, String sname, String semail, String sconno, String snic, String sdob, String sgender,
			String saddress, String susername, String spassword, String proimage) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sconno = sconno;
		this.snic = snic;
		this.sdob = sdob;
		this.sgender = sgender;
		this.saddress = saddress;
		this.susername = susername;
		this.spassword = spassword;
		this.proimage = proimage;
	}


	public int getSid() {
		return sid;
	}


	public String getSname() {
		return sname;
	}


	public String getSemail() {
		return semail;
	}


	public String getSconno() {
		return sconno;
	}


	public String getSnic() {
		return snic;
	}


	public String getSdob() {
		return sdob;
	}


	public String getSgender() {
		return sgender;
	}


	public String getSaddress() {
		return saddress;
	}


	public String getSusername() {
		return susername;
	}


	public String getSpassword() {
		return spassword;
	}

	public String getProimage() {
		return proimage;
	}

	
  }
