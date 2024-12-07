package com.klef.jfsd.Labexam;

import javax.persistence.Entity;

@Entity
public class Tablet {
	public String screen;
	public String batter;
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getBatter() {
		return batter;
	}
	public void setBatter(String batter) {
		this.batter = batter;
	}
	

}
