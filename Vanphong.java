package nhanvien;

import java.util.Scanner;

public class VanPhong extends Nhanvien {
	float hsluong;
	float phucap;
	public VanPhong() {
		super();
		this.hsluong=2;
		this.phucap=100000;
	}
		public VanPhong (String hoten, String manv, float sogio, float hsluong, float phucap){
		super (manv, hoten, sogio);
		this.hsluong=hsluong;
		this.phucap=phucap;
	}
	public void NhapTT()
	{
		super.NhapTT();
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap hs luong:  ");
		this.hsluong=Float.parseFloat(key.nextLine());
		System.out.println("Nhap phu cap: ");
		this.phucap=Float.parseFloat(key.nextLine());
	}
	public float TinhLuong()
	{
		return (this.hsluong*1500000+this.phucap);
	}
	public void InTT() 
	{
	super.InTT();
	System.out.println("Co tong luong la: "+this.TinhLuong());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VanPhong obj = new VanPhong();
			obj.NhapTT();
			obj.InTT();
	}

}
