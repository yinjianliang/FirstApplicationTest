package com.cmcc.bean;

public class ClassesBean {
	private int PhotoDrawableId;
	private String studentName;


	public ClassesBean(){

	}

	public ClassesBean(int photoDrawableId, String stuName ) {
		super();
		PhotoDrawableId = photoDrawableId;
		studentName = stuName;
	}

	public int getPhotoDrawableId() {
		return PhotoDrawableId;
	}
	public void setPhotoDrawableId(int mPhotoDrawableId) {
		this.PhotoDrawableId = mPhotoDrawableId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String stuName) {
		studentName = stuName;
	}

	@Override
	public String toString() {
		return "ClassesBean [mPhotoDrawableId=" + PhotoDrawableId
				+ ", studentName=" + studentName + "]";
	}
	
	
	
}
