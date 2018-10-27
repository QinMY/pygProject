package com.common;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long total;
	private List Result;
	public long getTotal() {
		return total;
	}
	public Result(long total, List result) {
		super();
		this.total = total;
		Result = result;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getResult() {
		return Result;
	}
	public void setResult(List result) {
		Result = result;
	}
	
	

}
