package com.yc.travelWorld.bean;

import java.io.Serializable;

public class JsonObject implements Serializable{
	private static final long serialVersionUID = 8626164393873626223L;
	
	private int pageNo=1;
	private int PageSize=10;
	private int total=0;
	private Object rows=null;
	@Override
	public String toString() {
		return "JsonObject [pageNo=" + pageNo + ", PageSize=" + PageSize + ", total=" + total + ", rows=" + rows + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + PageSize;
		result = prime * result + pageNo;
		result = prime * result + total;
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
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
		JsonObject other = (JsonObject) obj;
		if (PageSize != other.PageSize)
			return false;
		if (pageNo != other.pageNo)
			return false;
		if (total != other.total)
			return false;
		if (rows == null) {
			if (other.rows != null)
				return false;
		} else if (!rows.equals(other.rows))
			return false;
		return true;
	}
	public int getpageNo() {
		return pageNo;
	}
	public void setpageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public int gettotal() {
		return total;
	}
	public void settotal(int total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public JsonObject() {
		super();
	}
	public JsonObject(int pageNo, int pageSize, int total, Object rows) {
		super();
		this.pageNo = pageNo;
		PageSize = pageSize;
		this.total = total;
		this.rows = rows;
	}
	public JsonObject(int pageNo,  Object rows) {
		super();
		this.pageNo = pageNo;
		this.rows = rows;
	}
	
	
	

}
