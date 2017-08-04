package com.yc.travelWorld.bean;

public class Hotelorder {
	private int hoid;
	private int aid;
	private int usid;
	private String hodate;
	private int honum;
	private int hoprice;
	private int hostatus;
	private int hototal;
	private String hodescr;
	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
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
	public String getHodate() {
		return hodate;
	}
	public void setHodate(String hodate) {
		this.hodate = hodate;
	}
	public int getHonum() {
		return honum;
	}
	public void setHonum(int honum) {
		this.honum = honum;
	}
	public int getHoprice() {
		return hoprice;
	}
	public void setHoprice(int hoprice) {
		this.hoprice = hoprice;
	}
	public int getHostatus() {
		return hostatus;
	}
	public void setHostatus(int hostatus) {
		this.hostatus = hostatus;
	}
	public int getHototal() {
		return hototal;
	}
	public void setHototal(int hototal) {
		this.hototal = hototal;
	}
	public String getHodescr() {
		return hodescr;
	}
	public void setHodescr(String hodescr) {
		this.hodescr = hodescr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aid;
		result = prime * result + ((hodate == null) ? 0 : hodate.hashCode());
		result = prime * result + ((hodescr == null) ? 0 : hodescr.hashCode());
		result = prime * result + hoid;
		result = prime * result + honum;
		result = prime * result + hoprice;
		result = prime * result + hostatus;
		result = prime * result + hototal;
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
		Hotelorder other = (Hotelorder) obj;
		if (aid != other.aid)
			return false;
		if (hodate == null) {
			if (other.hodate != null)
				return false;
		} else if (!hodate.equals(other.hodate))
			return false;
		if (hodescr == null) {
			if (other.hodescr != null)
				return false;
		} else if (!hodescr.equals(other.hodescr))
			return false;
		if (hoid != other.hoid)
			return false;
		if (honum != other.honum)
			return false;
		if (hoprice != other.hoprice)
			return false;
		if (hostatus != other.hostatus)
			return false;
		if (hototal != other.hototal)
			return false;
		if (usid != other.usid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hotelorder [hoid=" + hoid + ", aid=" + aid + ", usid=" + usid + ", hodate=" + hodate + ", honum="
				+ honum + ", hoprice=" + hoprice + ", hostatus=" + hostatus + ", hototal=" + hototal + ", hodescr="
				+ hodescr + "]";
	}
	public Hotelorder(int hoid, int aid, int usid, String hodate, int honum, int hoprice, int hostatus, int hototal,
			String hodescr) {
		super();
		this.hoid = hoid;
		this.aid = aid;
		this.usid = usid;
		this.hodate = hodate;
		this.honum = honum;
		this.hoprice = hoprice;
		this.hostatus = hostatus;
		this.hototal = hototal;
		this.hodescr = hodescr;
	}
	public Hotelorder() {
		super();
	}
	
}
