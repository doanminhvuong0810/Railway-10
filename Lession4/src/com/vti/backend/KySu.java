package com.vti.backend;

public class KySu extends CanBo{
	

	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public KySu(String hoTen, int tuoi, Gender gender, String diaChi,String nganhDaoTao) {
		super(hoTen, tuoi, gender, diaChi);
		this.nganhDaoTao = nganhDaoTao;
		
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Vị trí: Kỹ Sư [Ngành đào tạo = " + nganhDaoTao + "]";
	}
	
	
	
}
