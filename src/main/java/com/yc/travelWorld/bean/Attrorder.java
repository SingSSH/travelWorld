package com.yc.travelWorld.bean;

public class Attrorder {
	private int aoid;
	private int aid;
	private int usid;
	private String adate;
	private int aonum;
	private int aoprice;
	private int aostatus;
	public Attrorder() {
		super();
	}
	public Attrorder(int aoid, int aid, int usid, String adate, int aonum, int aoprice, int aostatus, String aodescr) {
		super();
		this.aoid = aoid;
		this.aid = aid;
		this.usid = usid;
		this.adate = adate;
		this.aonum = aonum;
		this.aoprice = aoprice;
		this.aostatus = aostatus;
		this.aodescr = aodescr;
	}
	@Override
	public String toString() {
		return "Attrorder [aoid=" + aoid + ", aid=" + aid + ", usid=" + usid + ", adate=" + adate + ", aonum=" + aonum
				+ ", aoprice=" + aoprice + ", aostatus=" + aostatus + ", aodescr=" + aodescr + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adate == null) ? 0 : adate.hashCode());
		result = prime * result + aid;
		result = prime * result + ((aodescr == null) ? 0 : aodescr.hashCode());
		result = prime * result + aoid;
		result = prime * result + aonum;
		result = prime * result + aoprice;
		result = prime * result + aostatus;
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
		Attrorder other = (Attrorder) obj;
		if (adate == null) {
			if (other.adate != null)
				return false;
		} else if (!adate.equals(other.adate))
			return false;
		if (aid != other.aid)
			return false;
		if (aodescr == null) {
			if (other.aodescr != null)
				return false;
		} else if (!aodescr.equals(other.aodescr))
			return false;
		if (aoid != other.aoid)
			return false;
		if (aonum != other.aonum)
			return false;
		if (aoprice != other.aoprice)
			return false;
		if (aostatus != other.aostatus)
			return false;
		if (usid != other.usid)
			return false;
		return true;
	}
	public int getAoid() {
		return aoid;
	}
	public void setAoid(int aoid) {
		this.aoid = aoid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public int getAonum() {
		return aonum;
	}
	public void setAonum(int aonum) {
		this.aonum = aonum;
	}
	public int getAoprice() {
		return aoprice;
	}
	public void setAoprice(int aoprice) {
		this.aoprice = aoprice;
	}
	public int getAostatus() {
		return aostatus;
	}
	public void setAostatus(int aostatus) {
		this.aostatus = aostatus;
	}
	public String getAodescr() {
		return aodescr;
	}
	public void setAodescr(String aodescr) {
		this.aodescr = aodescr;
	}
	private String aodescr;
}
