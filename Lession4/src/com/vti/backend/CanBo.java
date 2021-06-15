package com.vti.backend;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private Gender gender;
	private String diaChi;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public CanBo(String hoTen, int tuoi, Gender gender, String diaChi) {
		
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gender = gender;
		this.diaChi = diaChi;
	}
	
	@Override
	public String toString() {
		return "CanBo [Họ tên: " + hoTen + ",Tuổi: " + tuoi + ",Địa chỉ: " + diaChi + ",Giới tính: " + gender + "]";
	}
	
	
	
	
	
	
	
	
}
