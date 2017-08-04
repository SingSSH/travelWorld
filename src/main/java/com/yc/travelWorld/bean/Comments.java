package com.yc.travelWorld.bean;

import java.util.Date;

public class Comments {
	private int cid;
	private int usid;
	private String cdate;
	private String ctype;
	private String temp;
	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", usid=" + usid + ", cdate=" + cdate + ", ctype=" + ctype + ", temp=" + temp
				+ "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public Comments(int cid, int usid, String cdate, String ctype, String temp) {
		super();
		this.cid = cid;
		this.usid = usid;
		this.cdate = cdate;
		this.ctype = ctype;
		this.temp = temp;
	}
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdate == null) ? 0 : cdate.hashCode());
		result = prime * result + cid;
		result = prime * result + ((ctype == null) ? 0 : ctype.hashCode());
		result = prime * result + ((temp == null) ? 0 : temp.hashCode());
		result = prime * result + usid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comments other = (Comments) obj;
		if (cdate == null) {
			if (other.cdate != null)
				return false;
		} else if (!cdate.equals(other.cdate))
			return false;
		if (cid != other.cid)
			return false;
		if (ctype == null) {
			if (other.ctype != null)
				return false;
		} else if (!ctype.equals(other.ctype))
			return false;
		if (temp == null) {
			if (other.temp != null)
				return false;
		} else if (!temp.equals(other.temp))
			return false;
		if (usid != other.usid)
			return false;
		return true;
	}
	
}
