package com.vti.backend;

public class NhanVien extends CanBo{
	
	private String congViec;
	
	
	
	public NhanVien(String hoTen, int tuoi, Gender gender, String diaChi,String congViec) {
		super(hoTen, tuoi, gender, diaChi);
		this.congViec=congViec;
	}




	@Override
	public String toString() {
		return super.toString() + "Vị trí: Nhân viên [Công việc:  " + congViec + "]";
	}
	
	
}
