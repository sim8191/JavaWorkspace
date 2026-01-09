package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {
	private String title;
	private String atrist;
	public Music() {
		
	}
	
	public Music(String title, String atrist) {
		this.title = title;
		this.atrist = atrist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAtrist() {
		return atrist;
	}

	public void setAtrist(String atrist) {
		this.atrist = atrist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", atrist=" + atrist + "]";
	}
	
	
}
