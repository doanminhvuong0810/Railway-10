package com.vti.backend;

public class CongNhan extends CanBo {
	private int capBac;

	public CongNhan(String hoTen, int tuoi, Gender gender, String diaChi,int capBac) {
		super(hoTen, tuoi, gender, diaChi);
		this.capBac=capBac;
	}



	@Override
	public String toString() {
		return super.toString() + "Vị trí: Công Nhân [Cấp Bậc=" + capBac + "]";
	}
	
	
	
	
	
	
	
	
}
