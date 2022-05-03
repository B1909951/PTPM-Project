package Buoi3;

import java.util.Scanner;

public class NhaQuanTri {

	public static int them1sv(int n,SinhVien ds[]){
		System.out.println("========================");
			ds[n] = new SinhVien();

			System.out.println("Nhap thong tin sinh vien:");
			ds[n].nhap();

		n+=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Them sinh vien thanh cong!!!");
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return n;
	}
	public static int inDssv(int n,SinhVien ds[]){
		System.out.println("========================");
		 System.out.println("Danh sach Sinh vien:");
		 for(int i=0; i<n;i++){
		 	System.out.println("-Sinh vien thu "+(i+1)+":");
		 	ds[i].in();
			 ds[i].inHP();
		 	System.out.println("+DTB: "+ds[i].diemtb());
		 }
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		 return 1;
	}
	public static int nhapDiemHP(int n,SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		String mssv = new String();
		System.out.println("Nhap diem cho sinh vien co ma so:");
		mssv=sc.nextLine();
		
		int i;
		int chiso=1;
		for(i=0; i<n;i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				chiso=i;
				break;		
			}
		}
		if (i==n) {
			System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");
		}else {
			ds[chiso].nhapdiem();
			
		}
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return 1;
	}
	public static int xoaSv(int n, SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		String mssv = new String();
		System.out.println("Xoa sinh vien co ma so:");
		mssv=sc.nextLine();
		int i;
		for( i =0;i<n;i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				break;
			}
			
		}
		if (i==n) {
			System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");
			System.out.println("Nhan enter de tiep tuc");
			sc.nextLine();
			return n;
		}else {
			for(int j=i;j<n-1;j++){
				ds[j].makeCoppy(ds[j+1]);
			}
		}
		
		n=n-1;
		System.out.println("Xoa sinh vien thanh cong!!!");
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return n;
	}
	public static int timSV(int n, SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		String mssv = new String();
		System.out.println("Tim sinh vien co ma so:");
		mssv=sc.nextLine();
		int i;
		for( i =0;i<n;i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				ds[i].in();
				break;
			}
			
		}
		if (i==n) System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return 1;


	}
	public static int xemDiem(int n, SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		String mssv = new String();
		System.out.println("Nhap ma so sinh vien:");
		mssv=sc.nextLine();
		int i;
		for( i =0;i<n;i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				ds[i].in();
				System.out.println("Diem tb:"+ds[i].diemtb());
				break;
			}
			
			
		}
		if (i==n) System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");

		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return 1;


	}
	public static void menu(int n,SinhVien ds[]){
		System.out.println("==========MENU==========");
		Scanner sc= new Scanner(System.in);
		String x = new String();	
		System.out.println("1. Admin");
			System.out.println("2. Sinh vien");
			System.out.println("3. Thoat");
			System.out.println("Moi chon:");
				x =sc.nextLine();
				if(x.charAt(0) == '1'){
					menuAdmin(n, ds);
				}
				else if(x.charAt(0) == '2'){
					menuSV(n,ds);
				}
				else if(x.charAt(0) == '3'){
					return;
				}
				else {
					System.out.println("Sai cu phap, Vui long nhap lai!");
					 menu(n, ds);
				}
				

	}
	public static void menuSV(int n,SinhVien ds[]){
		System.out.println("=========MENUSV=========");
		Scanner sc= new Scanner(System.in);
		String x = new String();	
	System.out.println("1. Them hoc phan");
		System.out.println("2. Xoa hoc phan");
		System.out.println("3. Xem diem hoc phan");
		System.out.println("4. Thoat");
		System.out.println("Moi chon");
			x=sc.nextLine();
			if(x.charAt(0) == '1'){
				NhaQuanTri.dkhp(n, ds);
				menuSV(n, ds);
			}
			else if(x.charAt(0) == '2'){
				
				NhaQuanTri.xoahp(n, ds);
				menuSV(n, ds);
			}
			else if(x.charAt(0) == '3'){
				NhaQuanTri.xemDiem(n, ds);
				menuSV(n, ds);
			}
			else if(x.charAt(0) == '4') {
			 menu(n, ds);
			}
			else{
				System.out.print("Sai cu phap, Vui long nhap lai!");
					 menuSV(n, ds);
			}
			

			
	}
	public static void menuAdmin(int n,SinhVien ds[]){
		System.out.println("========MENUADMIN=======");
		Scanner sc= new Scanner(System.in);
		String x = new String();
	System.out.println("1. Them sinh vien");
		System.out.println("2. Nhap diem sinh vien");
		System.out.println("3. Xem danh sach canh cao hoc vu");
		System.out.println("4. Tim sinh vien");
		System.out.println("5. Xoa sinh vien");
		System.out.println("6. hien thi danh sach sinh vien");
		System.out.println("7. Thoat");

		System.out.println("Moi chon");
			x=sc.nextLine();
		
			if(x.charAt(0) == '1'){
			n=NhaQuanTri.them1sv(n, ds);
			menuAdmin(n, ds);
			}
			else if(x.charAt(0) == '2'){
				NhaQuanTri.nhapDiemHP(n, ds);
				menuAdmin(n, ds);
			}
			else if(x.charAt(0) == '3'){
				NhaQuanTri.dscanhcaohocvu(n, ds);
				menuAdmin(n, ds);
			}
			else if(x.charAt(0) == '4') {
			 NhaQuanTri.timSV(n, ds);
			 menuAdmin(n, ds);

			}else if(x.charAt(0) == '5'){
				n=NhaQuanTri.xoaSv(n, ds);
				menuAdmin(n, ds);
			}else if(x.charAt(0) == '6') {

				inDssv(n, ds);
			
					menuAdmin(n, ds);
				
			
			}
			else if(x.charAt(0) == '7') {
				menu(n, ds);
			}
			else{
				System.out.print("Sai cu phap, Vui long nhap lai!");
					 menuAdmin(n, ds);
			}
			


	}
	public static int dscanhcaohocvu(int n,SinhVien ds[]){
		System.out.println("========================");
			System.out.println("Cac sinh vien bi canh cao hoc vu:");
			int check = 0;
			for(int i=0;i<n;i++){
			if(ds[i].diemtb()<1) {
				check = 1;
				ds[i].in();
				System.out.println("Diem tb:"+	ds[i].diemtb());
			}
			}
			if (check == 0) {
				System.out.println("Khong co sinh vien nao!!!");
			}
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return 1;
	}
	public static int xoahp(int n,SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		String mssv = new String();
		String hp = new String();
		System.out.println("Nhap ma so sinh vien:");
		mssv=sc.nextLine();
		int i;
		int check = 0;
		for( i =0;i<n;i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				check = 1;
				break;
			}
		}
		if (check != 1) {
			System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");
			System.out.println("Nhan enter de tiep tuc");
			sc.nextLine();
			return 1;
		}else {
			
			System.out.println("Nhap hoc phan can xoa:");
			hp=sc.nextLine();
		}
		
			ds[i].xoahp(hp);
		
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
		return 1;
	}
	public static void dkhp(int n,SinhVien ds[]){
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien");
		String mssv = new String();
		int check = 0;
			 mssv=sc.nextLine();
			 for (int i = 0; i< n; i++){
					if(ds[i].getmssv().equalsIgnoreCase(mssv)){
						check = 1;
					}
			 }
		if(check == 0) {
			System.out.println("Khong ton tai sinh vien co ma so " + mssv + " !!!");
			return;
		}
		System.out.println("Dang ki hoc phan cho sinh vien:");
		for (int i = 0; i< n; i++){
			if(ds[i].getmssv().equalsIgnoreCase(mssv)){
				System.out.println("-Nhap so mon can dang ki cua ma so "+mssv);
				 int x=sc.nextInt();
				sc.nextLine();
				for(int j=0;j<x;j++){
					System.out.println("+Nhap ten mon hoc thu "+(j+1)+" cua ma so "+mssv+":");
					String ten= sc.nextLine();
					ds[i].themhp(ten);
				}
				break;
			}
		
		}
		System.out.println("Dang ky hoc phan thanh cong!!!");
		System.out.println("Nhan enter de tiep tuc");
		sc.nextLine();
	}
	public static void main(String[] args) {
		SinhVien ds[];
		ds = new SinhVien[30];
		ds[0] = new SinhVien("b1909973","Nguyen Van Phuong",12,12,2001);
		ds[1] = new SinhVien("b1909951","Ha Chanh Nam",12,12,2001);
		ds[2] =  new SinhVien("b1909901","Thai Dai Nhan",12,12,2001);
		ds[3] =  new SinhVien("b1909911","Nguyen Duy Thanh",12,12,2001);
		 NhaQuanTri.menu(4, ds);


		
	}
}
