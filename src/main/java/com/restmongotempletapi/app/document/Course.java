package com.restmongotempletapi.app.document;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Indexed(unique = true)
	private String courseName;
	private String courseType;
	private String courseDescription;
	private int cStatus = 0;

/*	public ObjectId getcId() {
		return cId;
	}

	public void setcId(ObjectId cId) {
		this.cId = cId;
	}
*/
	public String getCourseName() {
		return courseName;
	}



	@Override
	public String toString() {
		return "Course [ courseName=" + courseName + ", courseType=" + courseType
				+ ", courseDescription=" + courseDescription + ", cStatus=" + cStatus + "]";
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getcStatus() {
		return cStatus;
	}

	public void setcStatus(int cStatus) {
		this.cStatus = cStatus;
	}



}
