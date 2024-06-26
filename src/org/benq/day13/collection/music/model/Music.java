package org.benq.day13.collection.music.model;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	public Music() {}
	
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}


	@Override
	public int compareTo(Music o) {
		
		return this.title.compareTo(o.getTitle());
	}
	
	
}
