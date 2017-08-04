package com.yc.travelWorld.bean;

public class Hotel {
	private int hid;
	private int aid;
	private String hpic;
	private String hname;
	private String htype;
	private Double fprice;
	private Double fdprice;
	private String hmark;
	private String hdate;
	private String hdeadline;
	private int hgivethethoumbsup;
	private int hbrowsernum;
	public Hotel() {
		super();
	}
	public Hotel(int hid, int aid, String hpic, String hname, String htype, Double fprice, Double fdprice, String hmark,
			String hdate, String hdeadline, int hgivethethoumbsup, int hbrowsernum) {
		super();
		this.hid = hid;
		this.aid = aid;
		this.hpic = hpic;
		this.hname = hname;
		this.htype = htype;
		this.fprice = fprice;
		this.fdprice = fdprice;
		this.hmark = hmark;
		this.hdate = hdate;
		this.hdeadline = hdeadline;
		this.hgivethethoumbsup = hgivethethoumbsup;
		this.hbrowsernum = hbrowsernum;
	}
	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", aid=" + aid + ", hpic=" + hpic + ", hname=" + hname + ", htype=" + htype
				+ ", fprice=" + fprice + ", fdprice=" + fdprice + ", hmark=" + hmark + ", hdate=" + hdate
				+ ", hdeadline=" + hdeadline + ", hgivethethoumbsup=" + hgivethethoumbsup + ", hbrowsernum="
				+ hbrowsernum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aid;
		result = prime * result + ((fdprice == null) ? 0 : fdprice.hashCode());
		result = prime * result + ((fprice == null) ? 0 : fprice.hashCode());
		result = prime * result + hbrowsernum;
		result = prime * result + ((hdate == null) ? 0 : hdate.hashCode());
		result = prime * result + ((hdeadline == null) ? 0 : hdeadline.hashCode());
		result = prime * result + hgivethethoumbsup;
		result = prime * result + hid;
		result = prime * result + ((hmark == null) ? 0 : hmark.hashCode());
		result = prime * result + ((hname == null) ? 0 : hname.hashCode());
		result = prime * result + ((hpic == null) ? 0 : hpic.hashCode());
		result = prime * result + ((htype == null) ? 0 : htype.hashCode());
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
		Hotel other = (Hotel) obj;
		if (aid != other.aid)
			return false;
		if (fdprice == null) {
			if (other.fdprice != null)
				return false;
		} else if (!fdprice.equals(other.fdprice))
			return false;
		if (fprice == null) {
			if (other.fprice != null)
				return false;
		} else if (!fprice.equals(other.fprice))
			return false;
		if (hbrowsernum != other.hbrowsernum)
			return false;
		if (hdate == null) {
			if (other.hdate != null)
				return false;
		} else if (!hdate.equals(other.hdate))
			return false;
		if (hdeadline == null) {
			if (other.hdeadline != null)
				return false;
		} else if (!hdeadline.equals(other.hdeadline))
			return false;
		if (hgivethethoumbsup != other.hgivethethoumbsup)
			return false;
		if (hid != other.hid)
			return false;
		if (hmark == null) {
			if (other.hmark != null)
				return false;
		} else if (!hmark.equals(other.hmark))
			return false;
		if (hname == null) {
			if (other.hname != null)
				return false;
		} else if (!hname.equals(other.hname))
			return false;
		if (hpic == null) {
			if (other.hpic != null)
				return false;
		} else if (!hpic.equals(other.hpic))
			return false;
		if (htype == null) {
			if (other.htype != null)
				return false;
		} else if (!htype.equals(other.htype))
			return false;
		return true;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getHpic() {
		return hpic;
	}
	public void setHpic(String hpic) {
		this.hpic = hpic;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	public Double getFprice() {
		return fprice;
	}
	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
	public Double getFdprice() {
		return fdprice;
	}
	public void setFdprice(Double fdprice) {
		this.fdprice = fdprice;
	}
	public String getHmark() {
		return hmark;
	}
	public void setHmark(String hmark) {
		this.hmark = hmark;
	}
	public String getHdate() {
		return hdate;
	}
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
	public String getHdeadline() {
		return hdeadline;
	}
	public void setHdeadline(String hdeadline) {
		this.hdeadline = hdeadline;
	}
	public int getHgivethethoumbsup() {
		return hgivethethoumbsup;
	}
	public void setHgivethethoumbsup(int hgivethethoumbsup) {
		this.hgivethethoumbsup = hgivethethoumbsup;
	}
	public int getHbrowsernum() {
		return hbrowsernum;
	}
	public void setHbrowsernum(int hbrowsernum) {
		this.hbrowsernum = hbrowsernum;
	}
}
