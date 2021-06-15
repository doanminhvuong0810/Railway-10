package com.vti.backend;

public class Student {
    private int id;
    private String name;
    private String homeTow;
    private float score;
    
    
    
    
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getHomeTow() {
		return homeTow;
	}



	public void setHomeTow(String homeTow) {
		this.homeTow = homeTow;
	}



	



	public float getScore() {
		return score;
	}



	public void setScore(float score) {
		this.score = score;
	}



	public Student(String name,String homeTow ) {
		this.setName(name) ;
		this.setHomeTow(homeTow);
		this.setScore(0);
	}
     
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public void PlusScore (float score) {
		this.score = this.score + score ;
	}
	
	
@Override
	public String toString() {
		
		String rank = null;
		if (this.score < 4.0) {
		rank = "Yếu";
		} else if (this.score < 6.0) {
		rank = "Trung Bình";
		} else if (this.score < 8.0) {
		rank = "Khá";
		}else {
		rank = "Giỏi";
		}
		
		return "Student [id=" + id + ", name=" + name + ", hometown=" +
		homeTow + ", score=" + score + ", Xếp loại=" + rank + "]";
		
		
	}
	
	
	
	
	
   
}
