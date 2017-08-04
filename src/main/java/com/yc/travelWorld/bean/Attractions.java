package com.yc.travelWorld.bean;

public class Attractions {
	private int aid;
	private String address;
	private String atype;
	private String apic;
	private String aname;
	
	private Double aprice;
	private Double adprice;
	private String amark;
	private String acomment;
	private String adate;
	private int atotaltime;
	private int agivethethoumbsup;
	private int abrowsernum;
	public Attractions() {
		super();
	}
	public Attractions(int aid, String address, String atype, String apic, String aname, Double aprice, Double adprice,
			String amark, String acomment, String adate, int atotaltime, int agivethethoumbsup, int abrowsernum) {
		super();
		this.aid = aid;
		this.address = address;
		this.atype = atype;
		this.apic = apic;
		this.aname = aname;
		this.aprice = aprice;
		this.adprice = adprice;
		this.amark = amark;
		this.acomment = acomment;
		this.adate = adate;
		this.atotaltime = atotaltime;
		this.agivethethoumbsup = agivethethoumbsup;
		this.abrowsernum = abrowsernum;
	}
	@Override
	public String toString() {
		return "Attractions [aid=" + aid + ", address=" + address + ", atype=" + atype + ", apic=" + apic + ", aname="
				+ aname + ", aprice=" + aprice + ", adprice=" + adprice + ", amark=" + amark + ", acomment=" + acomment
				+ ", adate=" + adate + ", atotaltime=" + atotaltime + ", agivethethoumbsup=" + agivethethoumbsup
				+ ", abrowsernum=" + abrowsernum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abrowsernum;
		result = prime * result + ((acomment == null) ? 0 : acomment.hashCode());
		result = prime * result + ((adate == null) ? 0 : adate.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((adprice == null) ? 0 : adprice.hashCode());
		result = prime * result + agivethethoumbsup;
		result = prime * result + aid;
		result = prime * result + ((amark == null) ? 0 : amark.hashCode());
		result = prime * result + ((aname == null) ? 0 : aname.hashCode());
		result = prime * result + ((apic == null) ? 0 : apic.hashCode());
		result = prime * result + ((aprice == null) ? 0 : aprice.hashCode());
		result = prime * result + atotaltime;
		result = prime * result + ((atype == null) ? 0 : atype.hashCode());
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
		Attractions other = (Attractions) obj;
		if (abrowsernum != other.abrowsernum)
			return false;
		if (acomment == null) {
			if (other.acomment != null)
				return false;
		} else if (!acomment.equals(other.acomment))
			return false;
		if (adate == null) {
			if (other.adate != null)
				return false;
		} else if (!adate.equals(other.adate))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (adprice == null) {
			if (other.adprice != null)
				return false;
		} else if (!adprice.equals(other.adprice))
			return false;
		if (agivethethoumbsup != other.agivethethoumbsup)
			return false;
		if (aid != other.aid)
			return false;
		if (amark == null) {
			if (other.amark != null)
				return false;
		} else if (!amark.equals(other.amark))
			return false;
		if (aname == null) {
			if (other.aname != null)
				return false;
		} else if (!aname.equals(other.aname))
			return false;
		if (apic == null) {
			if (other.apic != null)
				return false;
		} else if (!apic.equals(other.apic))
			return false;
		if (aprice == null) {
			if (other.aprice != null)
				return false;
		} else if (!aprice.equals(other.aprice))
			return false;
		if (atotaltime != other.atotaltime)
			return false;
		if (atype == null) {
			if (other.atype != null)
				return false;
		} else if (!atype.equals(other.atype))
			return false;
		return true;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getApic() {
		return apic;
	}
	public void setApic(String apic) {
		this.apic = apic;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Double getAprice() {
		return aprice;
	}
	public void setAprice(Double aprice) {
		this.aprice = aprice;
	}
	public Double getAdprice() {
		return adprice;
	}
	public void setAdprice(Double adprice) {
		this.adprice = adprice;
	}
	public String getAmark() {
		return amark;
	}
	public void setAmark(String amark) {
		this.amark = amark;
	}
	public String getAcomment() {
		return acomment;
	}
	public void setAcomment(String acomment) {
		this.acomment = acomment;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public int getAtotaltime() {
		return atotaltime;
	}
	public void setAtotaltime(int atotaltime) {
		this.atotaltime = atotaltime;
	}
	public int getAgivethethoumbsup() {
		return agivethethoumbsup;
	}
	public void setAgivethethoumbsup(int agivethethoumbsup) {
		this.agivethethoumbsup = agivethethoumbsup;
	}
	public int getAbrowsernum() {
		return abrowsernum;
	}
	public void setAbrowsernum(int abrowsernum) {
		this.abrowsernum = abrowsernum;
	}
	
}
