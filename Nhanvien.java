package nhanvien;

import java.util.Scanner;

public class Nhanvien {
	String hoten;
	String manv;
	float sogio;
	
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public float getSogio() {
		return sogio;
	}
	public void setSogio(float sogio) {
		this.sogio = sogio;
	}
	public Nhanvien ()
	{
		this.hoten="ABC";
		this.manv="A101";
		this.sogio=28;
	}
	public Nhanvien(String hoten, String manv,float sogio) 
	{
		this.hoten=hoten;
		this.manv=manv;
		this.sogio=sogio;
	}
	public void NhapTT()
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap ho ten nhan vien: ");
		this.hoten=key.nextLine();
		System.out.println("Nhap ma nhan vien: ");
		this.manv=key.nextLine();
		System.out.println("Nhap so gio lam viec: ");
		this.sogio=Float.parseFloat(key.nextLine());
	}
	public void InTT()
	{
		System.out.println("Ten la: "+this.getHoten());
		System.out.println("Ma nhan vien la: "+this.getManv());
		System.out.println("So gio lam viec: "+this.getSogio());
	}
}
