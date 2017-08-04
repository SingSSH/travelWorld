package com.yc.travelWorld.bean;

public class Food {
	private int fid;
	private int aid;
	private String fpic;
	
	private String fname;
	private Double fprice;
	private Double fdprice;
	private String fmark;
	private String fdate;
	private String fdeadline;
	public Food(int fid, int aid, String fpic, String fname, Double fprice, Double fdprice, String fmark, String fdate,
			String fdeadline) {
		super();
		this.fid = fid;
		this.aid = aid;
		this.fpic = fpic;
		this.fname = fname;
		this.fprice = fprice;
		this.fdprice = fdprice;
		this.fmark = fmark;
		this.fdate = fdate;
		this.fdeadline = fdeadline;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", aid=" + aid + ", fpic=" + fpic + ", fname=" + fname + ", fprice=" + fprice
				+ ", fdprice=" + fdprice + ", fmark=" + fmark + ", fdate=" + fdate + ", fdeadline=" + fdeadline + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aid;
		result = prime * result + ((fdate == null) ? 0 : fdate.hashCode());
		result = prime * result + ((fdeadline == null) ? 0 : fdeadline.hashCode());
		result = prime * result + ((fdprice == null) ? 0 : fdprice.hashCode());
		result = prime * result + fid;
		result = prime * result + ((fmark == null) ? 0 : fmark.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((fpic == null) ? 0 : fpic.hashCode());
		result = prime * result + ((fprice == null) ? 0 : fprice.hashCode());
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
		Food other = (Food) obj;
		if (aid != other.aid)
			return false;
		if (fdate == null) {
			if (other.fdate != null)
				return false;
		} else if (!fdate.equals(other.fdate))
			return false;
		if (fdeadline == null) {
			if (other.fdeadline != null)
				return false;
		} else if (!fdeadline.equals(other.fdeadline))
			return false;
		if (fdprice == null) {
			if (other.fdprice != null)
				return false;
		} else if (!fdprice.equals(other.fdprice))
			return false;
		if (fid != other.fid)
			return false;
		if (fmark == null) {
			if (other.fmark != null)
				return false;
		} else if (!fmark.equals(other.fmark))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (fpic == null) {
			if (other.fpic != null)
				return false;
		} else if (!fpic.equals(other.fpic))
			return false;
		if (fprice == null) {
			if (other.fprice != null)
				return false;
		} else if (!fprice.equals(other.fprice))
			return false;
		return true;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFpic() {
		return fpic;
	}
	public void setFpic(String fpic) {
		this.fpic = fpic;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getFmark() {
		return fmark;
	}
	public void setFmark(String fmark) {
		this.fmark = fmark;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getFdeadline() {
		return fdeadline;
	}
	public void setFdeadline(String fdeadline) {
		this.fdeadline = fdeadline;
	}
	public Food() {
		super();
	}
}
