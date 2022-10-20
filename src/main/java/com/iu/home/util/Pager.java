package com.iu.home.util;

import lombok.Data;

@Data
public class Pager {
	
	private Long page;
	private Long startRow;
	private Long perPage;
	
	public Pager() {
		this.perPage=10L;
	}
	
	public void getRowNum()throws Exception{
		this.startRow = (this.getPage()-1)*this.getPerPage();
	}
	
	public Long getPage() {
		if(this.page==null || this.page<1) {
			this.page=1L;
		}
		return page;
	}
	

}
