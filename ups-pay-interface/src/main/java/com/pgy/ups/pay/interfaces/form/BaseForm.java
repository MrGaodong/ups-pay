package com.pgy.ups.pay.interfaces.form;

import com.pgy.ups.pay.interfaces.model.Model;

@SuppressWarnings("serial")
public abstract class BaseForm extends Model {

	private int pageNumber = 1;

	private int pageSize = 10;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
