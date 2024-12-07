package com.klef.jfsd.Labexam;

import javax.persistence.Entity;

@Entity
public class SmartPhone extends Device{
	public String os;
	public String camera;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}

}
